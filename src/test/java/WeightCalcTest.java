import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeightCalcTest {
    @Test
    public void testFormWithEmptyValues() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By inputCalculateBy = By.xpath(inputCalculateXpath);
        WebElement inputCalculateWebElement = driver.findElement(inputCalculateBy);
        inputCalculateWebElement.click();

        String bTextMassageXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By bTextMassageBy = By.xpath(bTextMassageXpath);
        WebElement bTextMassageWebElement = driver.findElement(bTextMassageBy);
        String actualMassage = bTextMassageWebElement.getText();
        String expectedMassage = "Не указано имя.\n" + "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" + "Не указан пол.";
        Assertions.assertEquals(expectedMassage, actualMassage);
    }

}
