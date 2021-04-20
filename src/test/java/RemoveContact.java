import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class RemoveContact extends TestBase {

    @BeforeMethod
    public void preconditions() {
        if (isElement(By.cssSelector("[href='/login']"))) {
            login("nabinkra@gmail.com", "1978Nadiia$");
        }
    }


    @Test
    public void removeOneContact() {
        wd.findElement(By.cssSelector("[href='/contacts']")).click();
        WebElement contact = wd.findElement(By.cssSelector(".contact-item_card__2SOIM"));
        contact.click();
        pause(500);
        WebElement removeBtn = wd.findElement(By.cssSelector(".contact-item-detailed_card__50dTS button:last-of-type"));
        removeBtn.click();


    }

    @Test
    public void removeAllContact() {
        wd.findElement(By.cssSelector("[href='/contacts']")).click();
        List<WebElement> contacts = wd.findElements(By.cssSelector(".contact-item_card__2SOIM"));
//        System.out.println(contacts.size());
//        for(WebElement el:contacts){
//            el.click();
//            WebElement removeBtn = wd.findElement(By.cssSelector(".contact-item-detailed_card__50dTS button:last-of-type"));}


        int size = contacts.size();
        for (int i = 0; i < size; i++) {
            WebElement contact = wd.findElement(By.cssSelector(".contact-item_card__2SOIM"));
            contact.click();
            pause(1500);
            WebElement removeBtn = wd.findElement(By.cssSelector(".contact-item-detailed_card__50dTS button:last-of-type"));
            removeBtn.click();
            pause(500);

        }
    }


//        do {
//            wd.findElement(By.cssSelector("[href='/contacts']")).click();
//            if (isElement(By.cssSelector(".contact-item_card__2SOIM"))) {
//                WebElement contact = wd.findElement(By.cssSelector(".contact-item_card__2SOIM"));
//                contact.click();
//            }
//            pause(1500);
//            WebElement removeBtn = wd.findElement(By.cssSelector(".contact-item-detailed_card__50dTS button:last-of-type"));
//            removeBtn.click();
//            pause(1500);
//        }
//
//        while (isElement(By.cssSelector("contact-page_message__2qafk")));


    @Test
    public void removeAllContacts() {
        wd.findElement(By.cssSelector("[href='/contacts']")).click();
        while (wd.findElements(By.cssSelector(".contact-item_card__2SOIM")).size() != 0) {
            wd.findElement(By.cssSelector(".contact-item_card__2SOIM")).click();
            pause(500);
            wd.findElement(By.xpath("//button[.='Remove']")).click();
            pause(500);
        }


    }


    @AfterMethod
    public void postconditions() {
        wd.findElement(By.cssSelector("button")).click();

    }
}
