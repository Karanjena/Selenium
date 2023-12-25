package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoWebShopExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
		//Create Obj Of FIS/FS
		FileInputStream fis=new FileInputStream("./textData/DemoWebShop.xlsx");
		//Create an Object
		Workbook workbook=WorkbookFactory.create(fis);
		//call Method
		String url = workbook.getSheet("sheet1").getRow(0).getCell(0).toString();
		String firstname = workbook.getSheet("sheet1").getRow(1).getCell(0).toString();
		String lastname = workbook.getSheet("sheet1").getRow(2).getCell(0).toString();
		String email = workbook.getSheet("sheet1").getRow(3).getCell(0).toString();
		String password = workbook.getSheet("sheet1").getRow(4).getCell(0).toString();
		String Confirmpassword = workbook.getSheet("sheet1").getRow(5).getCell(0).toString();
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(Confirmpassword);
	}

}
