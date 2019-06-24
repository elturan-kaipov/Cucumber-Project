package test;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelWrite {
    public static void main(String[] args) throws Exception {

        XSSFWorkbook workbook;
        XSSFSheet worksheet;
        XSSFRow row;
        XSSFCell cell;


        String path="src/SampleData.xlsx";
        File file=new File(path);

        FileInputStream inputStream=new FileInputStream(file);

        workbook=new XSSFWorkbook(inputStream);
        worksheet=workbook.getSheet("Employees");

        row=worksheet.getRow(4);
        cell=row.getCell(0);

        System.out.println(cell.toString());

        XSSFCell adamCell=worksheet.getRow(5).getCell(0);
        System.out.println("Before "+adamCell);

        adamCell.setCellValue(Boolean.parseBoolean("Elturan"));

        FileOutputStream outputStream=new FileOutputStream(path);



        System.out.println("After "+adamCell);
        int usedRows=worksheet.getPhysicalNumberOfRows();

        String target="Elturan";

        for(int i=0; i<=usedRows; i++){
            if(worksheet.getRow(i).getCell(0).toString().equals("Elturan")){
               worksheet.getRow(i).getCell(2).setCellValue(Boolean.parseBoolean("Developer"));

                System.out.println(target+" Job-ID is "+worksheet.getRow(5).getCell(2));

                break;
            }

        }

        workbook.write(outputStream);

        //System.out.println(target+" Job-ID is "+worksheet.getRow(5).getCell(2));


        outputStream.close();
        inputStream.close();
        workbook.close();

    }
}
