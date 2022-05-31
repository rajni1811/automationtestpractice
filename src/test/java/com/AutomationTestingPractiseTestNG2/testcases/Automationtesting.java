package com.AutomationTestingPractiseTestNG2.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationtesting  {
 WebDriver driver;
 @BeforeTest
 public void browseropen() {
	 System.setProperty("webdriver.chrome.driver", "D:\\testing\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		System.out.println("Enter url");
	
}
 @AfterTest
 public void Browserclose()
 {
	driver.close();	 
 }
 @Test (priority=2,description="First pannel")
 public void newwindow() throws Exception {
	 System.out.println("CODE FOR NEW WINDOW PANNEL");
	 
	 WebElement NewHeading=driver.findElement(By.xpath("//div[@id='Wikipedia1']//h2"));
		String WindowHeading= NewHeading.getText();
		System.out.println(WindowHeading);
		WebElement wikipedia=driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		 wikipedia.sendKeys("Software Testing");
		 WebElement searchbtn=driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
		 searchbtn.click(); 
		 Thread.sleep(3000);
		 WebElement Alert_title=driver.findElement(By.xpath("//div[@class='widget-content']"));
			@SuppressWarnings("unused")
			String Alerttitle= Alert_title.getText();
			System.out.println("Alerttitle");
			WebElement clickme=driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
			clickme.click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			clickme.click();
			driver.switchTo().alert().dismiss();
			Thread.sleep(3000);
			WebElement titleDate_pickrt=driver.findElement(By.xpath("//h2[@class='title']"));
			@SuppressWarnings("unused")
			String DatePricker=titleDate_pickrt.getText();
			System.out.println("DatePricker");
			Thread.sleep(3000);
			WebElement  Date=driver.findElement(By.xpath("//input[@id='datepicker']"));
			Date.sendKeys("04/20/2022",Keys.ENTER);
			System.out.println("Select Date");
			Thread.sleep(3000);	
			WebElement title_Select_Menu=driver.findElement(By.xpath("//h2[@class='title']"));
			@SuppressWarnings("unused")
			String Menu=title_Select_Menu.getText();
			System.out.println("Menu");
			Thread.sleep(3000);
			Select Spd=new Select(driver.findElement(By.xpath("//select[@name='speed']")));
			List<WebElement>S=Spd.getOptions();
			for(int i=0;i<S.size();i++) 
			{
				String speed=S.get(i).getText();
				System.out.println(speed);
			}
				 
			Select file=new Select(driver.findElement(By.xpath("//select[@name='files']")));
			List<WebElement>F=file.getOptions();
			for( int i=0;i<F.size();i++)
 			{
			String file1=F.get(i).getText();
			System.out.println(file1);
 			}
			Select num=new Select(driver.findElement(By.xpath("//select[@name='number']")));
			List<WebElement>NUM=num.getOptions();
			for(int i=0;i<NUM.size();i++)
			{
				String NUMBER=NUM.get(i).getText();
				System.out.println(NUMBER);
			
			}
				
			Select product=new Select(driver.findElement(By.xpath("//select[@id='products']")));
			List<WebElement>P=product.getOptions();
			for(int i=0;i<P.size();i++) {
				String Product=P.get(i).getText();
				System.out.println(Product);
			}
			Select Animal=new Select(driver.findElement(By.xpath("//select[@id='animals']")));
			List<WebElement>A=Animal.getOptions();
			for(int i=0;i<A.size();i++)
		{
				String animal=A.get(i).getText();
				System.out.println(animal);
			}
			WebElement title_Text_Lable=driver.findElement(By.xpath("//h2[@class='title']"));
			@SuppressWarnings("unused")
			String  lable=title_Text_Lable.getText();
			System.out.println("TEXT LABLE");
			WebElement TextLable=driver.findElement(By.xpath("//div[@id='Text1']"));
			Thread.sleep(1000);
			String msg=TextLable.getText();
			System.out.println(msg);
			 WebElement tooltip=driver.findElement(By.xpath("//td[@class='first columns-cell']"));
			 String ToolTIP=tooltip.getText();
			 System.out.println(ToolTIP);
						
 }
       @Test (priority=1,description="Second pannel")
        public void Volunteer() throws Exception
       {
    	 System.out.println("CODE FOR VOLUNTEER PANNEL");  
    	 driver.switchTo().frame("frame-one1434677811");
 		WebElement first_name=driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']"));
 		first_name.sendKeys("rajni");
 		Thread.sleep(1000);
 		WebElement last_name=driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']"));
 		last_name.sendKeys("maheta");
 		WebElement phone_no=driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']"));
 		phone_no.sendKeys("1548972251");
 		Thread.sleep(1000);
 		WebElement country=driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']"));
 		country.sendKeys("India");
 		WebElement city=driver.findElement(By.xpath("//input[@id='RESULT_TextField-5']"));
 		city.sendKeys("Nagpur");
 		WebElement email=driver.findElement(By.xpath("//input[@id='RESULT_TextField-6']"));
 		email.sendKeys("rajnimydarling@gmail.com");
 		WebElement Gender=driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_1']"));
 		Gender.click();
 		WebElement checkbox=driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_1']"));
 		checkbox.click();
 		Thread.sleep(2000);
 		driver.switchTo().defaultContent();
 		Thread.sleep(3000);
		 driver.switchTo().frame("frame-one1434677811");

		WebElement title=driver.findElement(By.xpath("//label[@class='question top_question']"));
		String best_time_to_contact=title.getText();
		System.out.println(best_time_to_contact);
		Select dropdwn=new Select(driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']")));
		dropdwn.selectByIndex(1);
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-one1434677811");
		 WebElement title1=driver.findElement(By.xpath("//label[@class='question left_question_first']"));
		 String upload_file=title1.getText();
		 System.out.println(upload_file);
		 driver.switchTo().defaultContent();
		    
       }
       
 @Test(priority=3,description="Third Pannel")
public void DoubleClick() throws Exception {
	 System.out.println("CODE FOR DOUBLECLICK");
	 WebElement titleofDoubleclick=driver.findElement(By.xpath("//div[@id='HTML10']//h2"));
	 String Doubleclick= titleofDoubleclick.getText();
	System.out.println(Doubleclick );
    Actions act=new Actions(driver);
    Thread.sleep(1000);
    WebElement doubleclick=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
    act.doubleClick(doubleclick).build().perform();
    WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
    WebElement dragdown=driver.findElement(By.xpath("//div[@id='droppable']"));
    act.dragAndDrop(drag, dragdown).build().perform();
    Thread.sleep(1000);
    WebElement john=driver.findElement(By.xpath("//img[@alt='the peaks of high tatras']"));
    WebElement merry=driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
    WebElement  trash=driver.findElement(By.xpath("//div[@id='trash']"));
    act.dragAndDrop(merry, trash).build().perform();
    act.dragAndDrop(john, trash).build().perform();
    WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
    //command for slider
    act.moveToElement(slider).clickAndHold().moveByOffset(0,40).build().perform();
   //s act.dragAndDropBy(slider, 0, 30).build().perform();
    
    
}

}

 
 
 
 
