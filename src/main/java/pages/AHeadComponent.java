package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class AHeadComponent {

    protected WebDriver driver;

    @FindBy(css = "#category-3")
    private WebElement clothesButton;

    @FindBy(css = "#category-4")
    private WebElement menClothesButton;

    @FindBy(css = "#category-6")
    private WebElement accessoriesButton;

    @FindBy(css = "#category-7")
    private WebElement stationeryAccessoriesButton;

    @FindBy(css = "#category-9")
    private WebElement artButton;

    private DropdownOptions dropdownOptions;

    protected AHeadComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private class DropdownOptions {

        private List<WebElement> listOptions;

        public DropdownOptions(By searchLocator) {
            initListOptions(searchLocator);
        }

        private void initListOptions(By searchLocator) {
            listOptions = driver.findElements(searchLocator);
        }
    }

    //PageObject Atomic Operation

    // menuTop

    public CategoryPage clickClothesButton() {
        clothesButton.click();
        return new CategoryPage(driver);
    }

    public CategoryPage clickMenClothesButton() {
        menClothesButton.click();
        return new CategoryPage(driver);
    }

    public void hoverClothesButton() {
        Actions builder = new Actions(driver);
        builder.moveToElement(clothesButton).perform();
    }

    public CategoryPage clickAccessoriesButton() {
        accessoriesButton.click();
        return new CategoryPage(driver);
    }

    public CategoryPage clickStationeryAccessoriesButton() {
        stationeryAccessoriesButton.click();
        return new CategoryPage(driver);
    }

    public void hoverAccessoriesButton() {
        Actions builder = new Actions(driver);
        builder.moveToElement(accessoriesButton).perform();
    }

    public CategoryPage clickArtButton() {
        artButton.click();
        return new CategoryPage(driver);
    }
}
