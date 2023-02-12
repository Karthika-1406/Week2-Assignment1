package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthika");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Selvakumar");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Karthi");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Operations");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Associate");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("karthika14@gmail.com");
        WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        
        Select st=new Select(state);
        st.selectByVisibleText("New York");
        driver.findElement(By.className("smallSubmit")).click();
        String title=driver.getTitle(); 
        System.out.println(title);
        
	}

}
