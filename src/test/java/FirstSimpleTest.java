import app.pages.MainPage;
import org.junit.jupiter.api.Test;

public class FirstSimpleTest extends BaseTest {

    private static final String CITY = "Samara";

    MainPage mainPage = new MainPage();

    @Test
    void basicTest() {
        mainPage.loadPage(driver);
        mainPage.checkPreview();
        mainPage.searchingByText(CITY);
        mainPage.clickOnResult(CITY);
        mainPage.checkSaveButton();
        mainPage.switchContext();
        mainPage.printWordsWithLinks();
    }
}