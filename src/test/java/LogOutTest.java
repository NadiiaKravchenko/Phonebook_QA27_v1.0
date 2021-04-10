import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutTest extends TestBase{

    @BeforeMethod
    public void preconditions(){
        if(!isElement(By.cssSelector("[href='/login']"))){


            //login
        }

    }

    @Test
    public void logoutTest(){

    }
}
