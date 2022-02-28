package be.codekata;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class TestsShouldGoHere {

    @Test
    public void failingTest(){
        assertThat(false,equalTo(true));
    }

    @Test
    public void passingTest(){
        assertThat(true,equalTo(true));
    }

    @Test
    void searchTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mvalk\\Downloads\\chromedrivertest\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.hln.be");
        Thread.sleep(100);
        driver.switchTo().frame("sp_message_iframe_609148");
        Thread.sleep(100);
        WebElement klikAkkoord = driver.findElement(By.xpath("//*[@id=\"notice\"]/div[3]/button[1]"));
        klikAkkoord.click();
        Thread.sleep(100);
        driver.switchTo().defaultContent();


        Thread.sleep(500);

        WebElement klikNav = driver.findElement(By.xpath("/html/body/header/section[3]/div[1]/div/nav/div[1]/div/label/span"));
        Thread.sleep(100);
        klikNav.click();
        Thread.sleep(100);
        WebElement inputField = driver.findElement(By.xpath("/html/body/header/section[3]/div[2]/div[2]/div/form/input"));
        Thread.sleep(100);
        inputField.sendKeys("eurofins"); //dan geeft die "eurofins" in.
        WebElement klikZoek = driver.findElement(By.xpath("/html/body/header/section[3]/div[2]/div[2]/div/form/button"));
        Thread.sleep(100);
        klikZoek.click();
        Thread.sleep(100);
        WebElement klikArtikel = driver.findElement(By.xpath("//*[@id=\"page-main-content\"]/div[2]/div/div/div[1]/div/ul/li[1]/article"));
        klikArtikel.click();
        Thread.sleep(100);
        String text = driver.findElement(By.xpath("//*[@id=\"page-main-content\"]/div[2]/div[2]/div/div/div[1]/article/div/header/h1")).getText();
        assertThat(text, equalTo("Ondanks stijgende coronacijfers niet over de koppen lopen in Oostendse testcentra: “Zo’n 140 testen per dag, maar geen overlast omdat iedereen op afspraak komt”"));


    }

}
