import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EditContactTest extends TestBase {


    @BeforeMethod
    public void preconditions() {
        if (isElement(By.cssSelector("[href='/login']"))) {
            login("nabinkra@gmail.com", "1978Nadiia$");
        }
    }


    @Test
    public void EditTest() {
        wd.findElement(By.xpath("//a[text()='CONTACTS']")).click();
        wd.findElement(By.cssSelector(".contact-item_card__2SOIM")).click();
        wd.findElement(By.xpath("//button[text()='Edit']")).click();
        String text = wd.findElement(By.xpath("//input[@placeholder='Name']")).getText();

        String text2 = wd.findElement(By.xpath("//input[@placeholder='Name']")).getAttribute("value");

        System.out.println(text2);
        fillByLocator(By.xpath("//input[@placeholder='Name']"), text2 + "*");
        String text3 = wd.findElement(By.xpath("//input[@placeholder='Last Name']")).getAttribute("value");
        fillByLocator(By.xpath("//input[@placeholder='Last Name']"), text3 + "*");
        String text4 = wd.findElement(By.xpath("//input[@placeholder='Phone']")).getAttribute("value");
        fillByLocator(By.xpath("//input[@placeholder='Phone']"), text4 + "*");
        String text5 = wd.findElement(By.xpath("//input[@placeholder='email']")).getAttribute("value");
        fillByLocator(By.xpath("//input[@placeholder='email']"), text5 + "*");
        String text6 = wd.findElement(By.xpath("//input[@placeholder='Address']")).getAttribute("value");
        fillByLocator(By.xpath("//input[@placeholder='Address']"), text6 + "*");
        String text7 = wd.findElement(By.xpath("//input[@placeholder='desc']")).getAttribute("value");
        fillByLocator(By.xpath("//input[@placeholder='desc']"), text7 + "*");
         wd.findElement(By.xpath("//button[normalize-space()='Save']")).click();


    }


    @AfterMethod
    public void postconditions() {
        //     wd.findElement(By.cssSelector("button")).click();

    }
}
