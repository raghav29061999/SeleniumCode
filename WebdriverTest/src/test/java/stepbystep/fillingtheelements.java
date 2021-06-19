package stepbystep;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class fillingtheelements {
	public void fill(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException {
		
		   FileInputStream fish = new FileInputStream("D:\\selenium\\book2.xlsx");
		   Workbook wb = WorkbookFactory.create(fish);
		  Sheet sh = wb.getSheet("Sheet1");
		  
		  for (int i =1 ; i<4;i++) {
			  Row rw = sh.getRow(i);
	
		  String fromport = rw.getCell(0).getStringCellValue();
		  String month = rw.getCell(2).getStringCellValue();
		  String toport = rw.getCell(1).getStringCellValue();
		  String airlines = rw.getCell(3).getStringCellValue();
			
		  driver.findElement(By.xpath("//input[contains(@value,'oneway')]")).click(); //trip side
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//select[@name='passCount']")).sendKeys("3");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//select[@name='fromPort']")).sendKeys(fromport);
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//select[@name='fromMonth']")).sendKeys(month);
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//select[@name='fromDay']")).sendKeys("2");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//select[@name='toPort']")).sendKeys(toport);
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@value='First']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//select[@name='airline']")).sendKeys(airlines);
		  Thread.sleep(1000);
		  
		  
		  }
		  
	}

}
