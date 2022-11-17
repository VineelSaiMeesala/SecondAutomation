package excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class excelreader {
    FileInputStream fis;

    {
        try {
            fis = new FileInputStream("C:\\Users\\MeesalaVineelSai\\eclipse-workspace\\DataEntryDBMS\\src\\test\\java\\excel\\dbdata.xlsx");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    XSSFWorkbook workbook;

    {
        try {
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    XSSFSheet sheet = workbook.getSheetAt(0);
    Sheet guru99Sheet = workbook.getSheet("dbdata");



    public String PolicyHoldername(int i) throws IOException {
        Row row = sheet.getRow(i);
        Cell cell = row.getCell(0);
        String cellval = cell.getStringCellValue();
        return cellval;

    }
    public String PolicyNum(int i) throws IOException {

        Row row = sheet.getRow(i);
        Cell cell = row.getCell(1);
        String cellval = cell.getStringCellValue();
        return cellval;

    }
    public double InsuranceAmount(int i) throws IOException {

        Row row = sheet.getRow(i);
        Cell cell = row.getCell(2);
        double cellval =  cell.getNumericCellValue();
        return cellval;

    }
    public String Address(int i) throws IOException {

        Row row = sheet.getRow(i);
        Cell cell = row.getCell(3);
        String cellval = cell.getStringCellValue();
        return cellval;

    }
    public int totalCell(){
        int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();
        return rowCount;

    }
}
