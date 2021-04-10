import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class StartCssLocators extends TestBase {
    @Test
    public void testCss() {
        //by tagName
        wd.findElement(By.tagName("h1"));
        wd.findElement(By.cssSelector("h1"));

        wd.findElement(By.cssSelector("[href='/login']")).click();
        wd.findElement(By.cssSelector("input"));
        wd.findElement(By.cssSelector("button"));


        //By id
        wd.findElement(By.id("root"));
        wd.findElement(By.cssSelector("#root"));

        //By class
        wd.findElement(By.className("container"));
        wd.findElement(By.cssSelector(".container"));
        wd.findElement(By.cssSelector("div#root.container"));

        //By name [atribute = 'value']
        //  wd.findElement(By.name("user"));
        // wd.findElement(By.cssSelector("[name='user']"));
        wd.findElement(By.cssSelector("[placeholder='Email']"));

    }
}


