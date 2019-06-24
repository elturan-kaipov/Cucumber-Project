package utilities;

import java.util.List;
import java.util.Map;

public class ExcelExercise {
    public static void main(String[] args) {

        String path="./src/test/resources/testData/light-side-test-data.xlsx";
        String userSheet="light-side-users";

        ExcelUtil userData=new ExcelUtil(path, userSheet);

//        System.out.println("userData.rowCount() = " + userData.rowCount());
//        System.out.println("userData.columnCount() = " + userData.columnCount());
//
//        //System.out.println(userData.getDataList());
//        System.out.println(userData.getColumnsNames());

        List<Map<String, String>> userList=userData.getDataList();

        System.out.println(userList.size());

        System.out.println(userList.get(0));// first user in the excel sheet

        System.out.println(userList.get(24).get("name"));

        // get the same info using 2d array

        String [][] userArray=userData.getDataArray();
        System.out.println(userArray[24][0]);

    }
}
