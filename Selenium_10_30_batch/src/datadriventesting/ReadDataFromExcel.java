package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// step1: create FileInputStream Object
		FileInputStream fis=new FileInputStream("./testdata/ExcelData.xlsx");
		
		//step2: create respective file type object
		Workbook workbook = WorkbookFactory.create(fis);
		
		//step3: call read methods
		String url = workbook.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String email = workbook.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		String password = workbook.getSheet("login").getRow(1).getCell(2).getStringCellValue();
		System.out.println(url);
		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//		driver.get(url);
		
		double price = workbook.getSheet("login").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(price);
		
		boolean status = workbook.getSheet("login").getRow(1).getCell(4).getBooleanCellValue();
		System.out.println(status);
		
		LocalDateTime date = workbook.getSheet("login").getRow(1).getCell(5).getLocalDateTimeCellValue();
		System.out.println(date);
		
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getYear());
	}

}
