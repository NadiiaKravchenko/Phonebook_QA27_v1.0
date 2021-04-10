import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTest extends TestBase {

    @Test
    public void loginTest() {
        wd.findElement(By.linkText("LOGIN")).click();
        List<WebElement> inputs = wd.findElements(By.tagName("input"));
        fillByElement(inputs.get(0), "nabinkra@gmail.com");
        fillByElement(inputs.get(1), "1978Nadiia$");

        List<WebElement> buttons = wd.findElements(By.tagName("button"));
        buttons.get(0).click();

        String text = wd.findElement(By.tagName("button")).getText();
        Assert.assertEquals(text, "Sign Out");


    }

    @Test
    public void loginTest2() {
        //wd.findElement(By.linkText("LOGIN")).click();
        wd.findElement(By.cssSelector("[href='/login']"));

        fillByLocator(By.cssSelector("[input[placeholder='Email']"), "nabinkra@gmail.com");
        fillByLocator(By.cssSelector("[placeholder='Password']"), "1978Nadiia$");



        List<WebElement> buttons = wd.findElements(By.tagName("button"));
        buttons.get(0).click();

        String text = wd.findElement(By.tagName("button")).getText();
        Assert.assertEquals(text, "Sign Out");

    }


}
