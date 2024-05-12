package x_path_and_css_selector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathandcssselector {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		//1. basic formate of xpath
		WebElement fn =driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fn.sendKeys("amit");
		
		//2. starts-with
		WebElement ln =driver.findElement(By.xpath("//input[starts-with(@placeholder,'Last')]"));
		ln.sendKeys("saini");
		
		

		//3. contains     with self node
		WebElement add =driver.findElement(By.xpath("//textarea[contains(@ng-model,'Adre')]//self::textarea[@rows='3']"));
        add.sendKeys("tijaraphatak alwar rajasthan");
		
		//4.and   operator
    	WebElement ea =driver.findElement(By.xpath("//input[@type='email'  and @ng-model='EmailAdress']"));
		ea.sendKeys("amitsaini87570@gmail.com");
		
		//input[@type='tel'or@ng-model="Phne"]
		
		//4.or   operator
    	WebElement pn =driver.findElement(By.xpath("//input[@type='tel'or@ng-model='Phne']"));
		pn.sendKeys("9057388979");
		
		//5. gender
		WebElement g =driver.findElement(By.xpath("//input[@name='radiooptions']//self::input[@value='Male']"));
        g.click();		
		//input[@type='radio' & @value='male']
		
        //6. input#id    method         using * substring id = checkbox1
    	   WebElement h = driver.findElement(By.cssSelector("input[id*=\"ckbox1\""));
    	//  WebElement h = driver.findElement(By.xpath("//input[@id='checkbox1']"));
            h.click();	
            
            
            
          //7. select class    dropdown    method  
          //  WebElement lan =driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
        //    Select s = new Select(lan); 
      //     s.selectByIndex(0);
       //    s.selectByIndex(1);
           
           
           //8. select class    dropdown    method  
           WebElement skill =driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
           Select ss = new Select(skill); 
           ss.selectByIndex(0);
          ss.selectByIndex(1);
          
          // select using without select class  in skill option
          WebElement skillmanag =driver.findElement(By.cssSelector("select#Skills>option[value='Backup Management']"));
          skillmanag.click();
          
          List<WebElement> allitemsskill = ss.getAllSelectedOptions();
          System.out.println(allitemsskill.size());

          //for scrooliong to year element
          WebElement yrell =driver.findElement(By.cssSelector("button[id$=\"mitbtn\"]"));
          Actions act =new Actions(driver);
          act.moveToElement(yrell);
          act.perform();
          
        		  
          
       /*   
          WebElement cntry =driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span"));
         cntry.click();
         WebElement aus =driver.findElement(By.xpath("*[@id=\"select2-country-container\"]"));

         Actions act1 =new Actions(driver);
         act1.moveToElement(aus);
         cntry.sendKeys("aus");
         act.sendKeys(Keys.ARROW_DOWN);
         act.sendKeys(Keys.ENTER);
         act1.perform();
     
          Select sc = new Select(cntry); 
         sc.selectByIndex(2);
         sc.selectByIndex(3);
         
         List<WebElement> allitemscntry = sc.getAllSelectedOptions();
         System.out.println(allitemscntry.size());

*/
//9. year select     multiple css selector
          WebElement yr =driver.findElement(By.cssSelector("select#yearbox[placeholder='Year'][type='text']"));
          Select sy = new Select(yr); 
          sy.selectByIndex(2);
          sy.selectByIndex(3);
          
      //10. password
          //1. prefix using ^
          
          WebElement pass =driver.findElement(By.cssSelector("input[type^='pass']"));
           pass.sendKeys("amitilove");
          
       //11. confirmpassword using suffix
           
           WebElement conpass =driver.findElement(By.cssSelector("input[id$=\"condpassword\"]"));
           conpass.sendKeys("amit");
           
          
       //12.submit button
      //     WebElement yrell =driver.findElement(By.cssSelector("button[id$=\"mitbtn\"]"));
yrell.click();
          
          
          
          
         
           
           
           
           
           
           

}}