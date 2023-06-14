package techproed.day10_TestBase_Alert;

import org.junit.Assert;
import org.junit.Test;
import techproed.utilities.TestBase;

public class C01_TestBaseDemo extends TestBase {
    @Test
    public void name() {
        //Techproeducation sayfasına gidelim.
        driver.get("https://techproeducation.com");

        //üç saniye bekle
        bekle(3);

        //Başlığın bootcamp içerdiğini test edelim.
        String actualTitle = driver.getTitle();
        String expectedTitle = "Bootcamp";
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
}
