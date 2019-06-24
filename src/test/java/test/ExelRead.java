package test;

import cucumber.api.java.bs.A;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utilities.Config;

import java.io.File;
import java.io.FileInputStream;

public class ExelRead {

    public static void main(String[] args) throws Exception {
        File file=new File("src/SampleData.xlsx");

        System.out.println(file.exists());


        //Opening reading file
        FileInputStream inputStream=new FileInputStream(file);

        //Loading into the class
        XSSFWorkbook workbook=new XSSFWorkbook(inputStream);

        //Passing worksheet & name
        XSSFSheet worksheet=workbook.getSheet("Employees");

        System.out.println(worksheet.getRow(2).getCell(1));
        System.out.println(worksheet.getRow(3).getCell(1));

        int usedRows=worksheet.getPhysicalNumberOfRows();
        System.out.println(usedRows);
        int lastUsedRow=worksheet.getLastRowNum();
        System.out.println(lastUsedRow);


        //TODO: print out Nancy's Job_ID Dinamically



        for(int rowNum=0; rowNum<usedRows;rowNum++){
           if(worksheet.getRow(rowNum).getCell(0).getStringCellValue().contains("Nancy")){
               System.out.println("Nancy Job-ID-"+worksheet.getRow(rowNum).getCell(0+2));
               break;
           }
        }

        String lastName= Config.getProperty("lastname");


        for(int rowNum=0; rowNum<usedRows; rowNum++){
            if(worksheet.getRow(rowNum).getCell(1).toString().equals(lastName)){
                System.out.println("Information for employee: "+lastName+"==>"+worksheet.getRow(rowNum).getCell(0)+","+worksheet.getRow(rowNum).getCell(2));
                    break;
            }
        }


        workbook.close();
        inputStream.close();


    }
}
