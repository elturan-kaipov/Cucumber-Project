package utilities;
import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// this is a utility for reading from writing to excel files
// it works with xls and xlsx files

public class ExcelUtil {

    private Sheet workSheet;
    private Workbook workBook;
    private String path;   // <=== path to Excel file

    public ExcelUtil(String path, String sheetName) {   // <=== constructor
        this.path = path;
        try {
            // open the Excel file
            FileInputStream ExcelFile = new FileInputStream(path);
            // access the required test data sheet
            workBook = WorkbookFactory.create(ExcelFile); // <=== actually opening the file and assigning to workBook object
            workSheet = workBook.getSheet(sheetName);
            Assert.assertNotNull("Sheet: \"" + sheetName + "\" does not exist\n", workSheet);
        } catch (Exception e) {
            throw new RuntimeException(e); // <=== code will compile but, if there is anything wrong you will see Exception and your code will stop
        }
    }

    public String getCellData(int rowNum, int colNum) {
        Cell cell;
        try {
            cell = workSheet.getRow(rowNum).getCell(colNum);
            String cellData = cell.toString();
            return cellData;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String [][] getDataArray() {
        String [][] data = new String[rowCount()][columnCount()];

        for(int i = 1; i < rowCount(); i++) {
            for(int j = 0; j < columnCount(); j++) {
                String value = getCellData(i , j);
                data[i][j] = value;
            }
        }
        return data;
    }

    public List<Map<String, String>> getDataList() {
        // get all columns
        List<String> columns = getColumnsNames();
        // this will be returned
        List<Map<String, String>> data = new ArrayList<>();

        for (int i = 1; i <=rowCount(); i++) {
            // get each row
            Row row = workSheet.getRow(i);
            // create map pf the row using the column and value
            // column map key, cell value -> map value
            Map<String, String> rowMap = new HashMap<String, String>();
            for (Cell cell : row) {
                int columnIndex = cell.getColumnIndex();
                rowMap.put(columns.get(columnIndex), cell.toString());
            }

            data.add(rowMap);
        }
        return data;
    }

    public List<String> getColumnsNames(){
        List<String> columns = new ArrayList<>();

        for (Cell cell: workSheet.getRow(0)){
            columns.add(cell.toString());
        }
        return columns;
    }

    public void setCellData(String value, int rowNum, int colNum) {
        Cell cell;
        Row row;

        try {
            row = workSheet.getRow(rowNum);
            cell = row.getCell(colNum);

            if (cell == null) {
                cell = row.createCell(colNum);
                cell.setCellValue(value);
            } else {
                cell.setCellValue(value);
            }
            FileOutputStream fileOut = new FileOutputStream(path);
            workBook.write(fileOut);

            fileOut.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setCellData (String value, String columnName, int row) {
        int column = getColumnsNames().indexOf(columnName);
        setCellData(value, row, column);
    }

    public int columnCount() {
        return workSheet.getRow(0).getLastCellNum();
    }

    public int rowCount() {
        return workSheet.getLastRowNum();
    }
}