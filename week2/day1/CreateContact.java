package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();	    
	    driver.findElement(By.linkText("Contacts")).click();	    
	    driver.findElement(By.linkText("Create Contact")).click(); 
	    driver.findElement(By.id("firstNameField")).sendKeys("Vigneswaran");
	    driver.findElement(By.id("lastNameField")).sendKeys("Viswanathan");
	    driver.findElement(By.name("submitButton")).click();
	    String name = driver.findElement(By.id("viewContact_firstName_sp")).getText();
	    System.out.println(name);
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.close();
}
}
