import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest {
@Test
    public void testMenuStartTitle() throws InterruptedException {

    String chromeDriver = "webdriver.chrome.driver";
    String driverPath = "C:\\пашабахче\\ИТ\\chromedriver.exe";
    String url = "https://www.99-bottles-of-beer.net/";
    String expectedResult = "Welcome to 99 Bottles of Beer";

    System.setProperty(chromeDriver, driverPath);
    WebDriver driver = new ChromeDriver();

    driver.get(url);

    WebElement menuBrowseLanguages = driver.findElement(
            By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']"));

    menuBrowseLanguages.click();
    //Thread.sleep(1000);

    WebElement menuStart = driver.findElement(
            By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/']"));

    menuStart.click();
    //Thread.sleep(1000);

    WebElement h2 = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/h2"));

    String actualResult = h2.getText();

    Assert.assertEquals(actualResult,expectedResult);

    //driver.quit();
    }
    @Test
    public void testHeaderOnTheTop(){

    String chromeDriver = "webdriver.chrome.driver";
    String driverPath = "C:\\пашабахче\\ИТ\\chromedriver.exe";
    String url = "https://www.99-bottles-of-beer.net/";
    String expectedResult = "99 Bottles of Beer";

    System.setProperty(chromeDriver,driverPath);
    WebDriver driver = new ChromeDriver();

    driver.get(url);

    WebElement headerOnTheTop = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='header']/h1"));

    String actualResult = headerOnTheTop.getText();

    Assert.assertEquals(actualResult,expectedResult);
    driver.quit();
    }
    @Test
    public void testMenuSubmitNewLanguage(){
    String chromeDriver = "webdriver.chrome.driver";
    String driverPath = "C:\\пашабахче\\ИТ\\chromedriver.exe";
    String url = "https://www.99-bottles-of-beer.net/";
    String expectedResult = "Submit new Language";

    System.setProperty(chromeDriver,driverPath);
    WebDriver driver = new ChromeDriver();

    driver.get(url);

    WebElement menuSubmitNewLanguage = driver.findElement(By.xpath(
            "//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/submitnewlanguage.html']")
    );

    String actualResult = menuSubmitNewLanguage.getText();

    Assert.assertEquals(actualResult,expectedResult.toUpperCase());
    driver.quit();
    }
    @Test
    public void testSubmenuSubmitNewLanguage(){

    String chromeDriver = "webdriver.chrome.driver";
    String driverPath = "C:\\пашабахче\\ИТ\\chromedriver.exe";
    String url = "https://www.99-bottles-of-beer.net/";
    String expectedResult = "Submit New Language";

    System.setProperty(chromeDriver,driverPath);
    WebDriver driver = new ChromeDriver();

    driver.get(url);


    WebElement menuSubmitNewLanguage = driver.findElement(By.xpath(
            "//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/submitnewlanguage.html']"));

    menuSubmitNewLanguage.click();

    WebElement submenuSubmitNewLanguage = driver.findElement(By.xpath(
            "//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']/li/a[@href='./submitnewlanguage.html']"));


    String actualResult = submenuSubmitNewLanguage.getText();

    Assert.assertEquals(actualResult,expectedResult);
    driver.quit();
    }

    @Test
    public void testFirstPointSubmenu0_9(){

    String chromeDriver = "webdriver.chrome.driver";
    String driverPath = "C:\\пашабахче\\ИТ\\chromedriver.exe";
    String url = "http://www.99-bottles-of-beer.net/abc.html";
    String expectedResult = "0-9";

    System.setProperty(chromeDriver,driverPath);
    WebDriver driver = new ChromeDriver();

    driver.get(url);

    WebElement submenu = driver.findElement(By.xpath(
            "//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']/li/a[@href='0.html']"));

    String actualResult = submenu.getText();

    Assert.assertEquals(actualResult,expectedResult);
    }

/*TC_11_06 Подтвердите, что имена создателей сайта:
    1. Открыть веб-сайт: http://www.99-bottles-of-beer.net/abc.html
    2. Нажать на пункт меню TEAM
    3. Считать имена создателей сайта
    4. Подтвердить, что имена соответствуют ожидаемым:

    Oliver Schade
    Gregor Scheithauer
    Stefan Scheler
    5. Закрыть браузер
*/
    @Test
    public void testSubmenuTeamCheckNames(){

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\пашабахче\\ИТ\\chromedriver.exe";
        String url = "https://www.99-bottles-of-beer.net/";
        String expectedResult1 = "Oliver Schade";
        String expectedResult2 = "Gregor Scheithauer";
        String expectedResult3 = "Stefan Scheler";

        System.setProperty(chromeDriver,driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement submenuTeam = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']/li/a[@href='team.html']")
        );
        submenuTeam.click();

        WebElement subMenuTeamOliver = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='main']/h3[contains(text(), 'Oliver Schade')]"));
        WebElement subMenuTeamGregor = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='main']/h3[text()= 'Gregor Scheithauer']"));
        WebElement subMenuTeamStefan = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='main']/h3[contains(text(), 'Stefan Scheler')]"));

        String actualResult1 = subMenuTeamOliver.getText();
        String actualResult2 = subMenuTeamGregor.getText();
        String actualResult3 = subMenuTeamStefan.getText();

        Assert.assertEquals(actualResult1,expectedResult1);
        Assert.assertEquals(actualResult2,expectedResult2);
        Assert.assertEquals(actualResult3,expectedResult3);
    }
    @Test
    public void testSubmitLanguageButtonErrorControl(){

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\пашабахче\\ИТ\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult = "Error: Precondition failed - Incomplete Input.";

        System.setProperty(chromeDriver,driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuSubmitNewLanguageSubmitLanguageButton = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='main']/form[@id='addlanguage']/p/input[@type='submit']"));

        menuSubmitNewLanguageSubmitLanguageButton.click();

        WebElement menuSubmitNewLanguageSubmitLanguageButtonError = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='main']/p[@style='border: 1px solid red; background-color: #ffe0e0; " +
                        "padding: 5px; margin: 5px 10px 5px 10px;']")
        );

        String actualResult = menuSubmitNewLanguageSubmitLanguageButtonError.getText();

        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testSubmitLanguageButtonErrorExpressionCheck(){

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\пашабахче\\ИТ\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult1 = "Error: Precondition failed - Incomplete Input.";
        String expectedResult2 = expectedResult1.toUpperCase().substring(0,1);
        String expectedResult3 = expectedResult1.toUpperCase().substring(expectedResult1.indexOf("Precondition"),
                expectedResult1.indexOf("Precondition") + 1);
        String expectedResult4 = expectedResult1.toUpperCase().substring(expectedResult1.indexOf("Incomplete"),
                expectedResult1.indexOf("Incomplete") + 1);
        String expectedResult5 = expectedResult1.toUpperCase().substring(expectedResult1.indexOf("Input"),
                expectedResult1.indexOf("Input") + 1);
        String expectedResult6 = expectedResult1.toLowerCase().substring(expectedResult1.indexOf("failed"),
                expectedResult1.indexOf("failed") + 1);
        boolean expectedResult7 = expectedResult1.contains(":");
        boolean expectedResult8 = expectedResult1.contains("-");
        boolean expectedResult9 = expectedResult1.contains(".");

        System.setProperty(chromeDriver,driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuSubmitNewLanguageSubmitLanguageButton = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='main']/form[@id='addlanguage']/p/input[@type='submit']"));

        menuSubmitNewLanguageSubmitLanguageButton.click();

//        WebElement menuSubmitNewLanguageSubmitLanguageButtonError = driver.findElement(By.xpath(
//                "//body/div[@id='wrap']/div[@id='main']/p[@style='border: 1px solid red; background-color: #ffe0e0; " +
//                        "padding: 5px; margin: 5px 10px 5px 10px;']/b/u")
//        );

        WebElement menuSubmitNewLanguageSubmitLanguageButtonErrorText = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='main']/p[@style='border: 1px solid red; background-color: #ffe0e0; " +
                        "padding: 5px; margin: 5px 10px 5px 10px;']")
        );

        String actualResult1 = menuSubmitNewLanguageSubmitLanguageButtonErrorText.getText();
        String tmp = actualResult1;
        String[] array = tmp.split(" ");
        String actualResult2 = array[0].substring(0,1);
        String actualResult3 = array[1].substring(0,1);
        String actualResult4 = array[4].substring(0,1);
        String actualResult5 = array[5].substring(0,1);
        String actualResult6 = array[2].substring(0,1);
        boolean actualResult7 = array[0].contains(":");
        boolean actualResult8 = array[3].contains("-");
        boolean actualResult9 = array[5].contains(".");
        //"Error: Precondition failed - Incomplete Input."

        Assert.assertEquals(actualResult1,expectedResult1);
        Assert.assertEquals(actualResult2,expectedResult2);
        Assert.assertEquals(actualResult3,expectedResult3);
        Assert.assertEquals(actualResult4,expectedResult4);
        Assert.assertEquals(actualResult5,expectedResult5);
        Assert.assertEquals(actualResult6,expectedResult6);
        Assert.assertEquals(actualResult7,expectedResult7);
        Assert.assertEquals(actualResult8,expectedResult8);
        Assert.assertEquals(actualResult9,expectedResult9);
        driver.quit();
    }
    @Test
    public void testSubmitLanguageButtonErrorInfoText(){

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\пашабахче\\ИТ\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult = "IMPORTANT: Take your time! The more carefully you fill out this form (especially"
                + "the language name and description), the easier it will be for us and the faster your language" +
                " will show up on this page. We don't have the time to mess around with fixing your descriptions etc."
                + " Thanks for your understanding.";

        System.setProperty(chromeDriver,driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        //находим слово IMPORTANT
        WebElement menuSubmitNewLanguageFirstPointImportant = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='main']/ul/li/span/b"));
//        WebElement menuSubmitNewLanguageFirstPointText = driver.findElement(By.xpath(
//                "//body/div[@id='wrap']/div[@id='main']/ul/li /text()"));

//        String actualResult = menuSubmitNewLanguageFirstPointImportant.getText()
//                .concat(menuSubmitNewLanguageFirstPointText.getText());

        //Assert.assertEquals(actualResult,expectedResult);

    }
    @Test
    public void testMenuBrowseLanguagesFirstTwoColomnsNames() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\пашабахче\\ИТ\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult1 = "Language";
        String expectedResult2 = "Author";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuBrowseLanguageButton = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']"));

        menuBrowseLanguageButton.click();

        WebElement menuBrowseLanguageButtonLanguageColomn = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='main']/table[@id='category']/tbody/tr/th[@style='width: 40%;']"));
        WebElement menuBrowseLanguageButtonAuthorColomn = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='main']/table[@id='category']/tbody/tr/th[@style='width: 30%;']"));

        String actualResult1 = menuBrowseLanguageButtonLanguageColomn.getText();
        String actualResult2 = menuBrowseLanguageButtonAuthorColomn.getText();

        Assert.assertEquals(actualResult1,expectedResult1);
        Assert.assertEquals(actualResult2,expectedResult2);
    }
    @Test
    public void testMenuTopListNewCommentsNoComments() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\пашабахче\\ИТ\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult1 = "Language";
        String expectedResult2 = "Author";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuBrowseLanguageButton = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']"));

        menuBrowseLanguageButton.click();

        WebElement menuBrowseLanguageButtonLanguageColomn = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='main']/table[@id='category']/tbody/tr/th[@style='width: 40%;']"));
        WebElement menuBrowseLanguageButtonAuthorColomn = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='main']/table[@id='category']/tbody/tr/th[@style='width: 30%;']"));

        String actualResult1 = menuBrowseLanguageButtonLanguageColomn.getText();
        String actualResult2 = menuBrowseLanguageButtonAuthorColomn.getText();

        Assert.assertEquals(actualResult1,expectedResult1);
        Assert.assertEquals(actualResult2,expectedResult2);
    }

}

