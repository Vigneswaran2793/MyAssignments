package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ICICI");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vigneswaran");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Viswanathan");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vignesh");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Management");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Create Lead");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("v.vignesh.vignesh1@gmail.com");
	    driver.findElement(By.name("submitButton")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.findElement(By.linkText("Duplicate Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).clear();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Axis");
	    driver.findElement(By.id("createLeadForm_firstName")).clear();
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vignesh");
	    driver.findElement(By.name("submitButton")).click();
	    String title2 = driver.getTitle();
	    System.out.println(title2);
}
}