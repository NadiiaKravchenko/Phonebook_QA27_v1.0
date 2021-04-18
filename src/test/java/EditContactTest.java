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
        fillByLocator(By.xpath("//input[@placeholder='Name']"), text2+"*");

        


    }


    @AfterMethod
    public void postconditions() {
        //     wd.findElement(By.cssSelector("button")).click();

    }
}
