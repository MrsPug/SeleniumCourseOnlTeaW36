package pl.coderslab.seleniumcourseonlteaw36.Zaliczenie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



    public class Zadanie1 {
        public static void main(String[] args) {
            // Konfiguracja ścieżki do sterownika przeglądarki Chrome
//            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ania\\Downloads\\chromedriver_win32\\chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

            // Tworzenie instancji przeglądarki Chrome
            WebDriver driver = new ChromeDriver();

            // Otwarcie strony zalogowania
            driver.get("https://mystore-testlab.coderslab.pl/");

            // Wyszukanie elementu e-mail i wpisanie wartości
            WebElement authentication = driver.findElement(By.id("_desktop_user_info"));
            authentication.click();

            WebElement email = driver.findElement(By.name("email"));
            email.sendKeys("pnvqehrzgixtwtlzkc@bbitq.com");

            // Wyszukanie elementu hasło i wpisanie wartości
            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("Password");

            // Kliknięcie przycisku logowania
            WebElement loginButton = driver.findElement(By.id("submit-login"));
            loginButton.click();

            // Zamknięcie przeglądarki
//            driver.quit();

            driver.findElement(By.cssSelector("a[title='Addresses']")).click();

            driver.findElement(By.partialLinkText("address")).click();

        }
    }

