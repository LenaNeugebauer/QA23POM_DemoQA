package com.telran.demoqa.pages;

import com.telran.demoqa.pages.bookStorePages.BookStorePage;
import com.telran.demoqa.pages.bookStorePages.ProfilePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends PageBase {

    public SidePanel(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='header-wrapper']/*[.='Book Store Application']")
    WebElement bookStoreAppBtn;

    public BookStorePage getBookStorePage() {
        clickWithJSExecutor(bookStoreAppBtn, 0, 500);
        return new BookStorePage(driver);
    }

    @FindBy(css = ".show #item-2")
    WebElement bookStoreBtn;

    public BookStorePage getBookStore() {
        clickWithJSExecutor(bookStoreBtn, 0, 500);
        return new BookStorePage(driver);
    }

    @FindBy(css = ".show #item-3")
    WebElement profileBtn;

    public ProfilePage getProfile() {
        clickWithJSExecutor(profileBtn,0,300);
        return new ProfilePage(driver);
    }

    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;

    public AlertPage selectAlert() {
        clickWithJSExecutor(alerts,0,300);
        return new AlertPage(driver);
    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindows;

    public BrowserWindowsPage selectWindows() {
        clickWithJSExecutor(browserWindows,0,300);
        return new BrowserWindowsPage(driver);
    }

    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement selectMenu;

    public SelectMenuPage selectSelectMenu() {
        clickWithJSExecutor(selectMenu,0,500);
        return new SelectMenuPage(driver);
    }

    @FindBy(xpath = "//span[.='Buttons']")
    WebElement selectButtons;

    public ButtonsPage selectButtons() {
        clickWithJSExecutor(selectButtons,0,500);
        return new ButtonsPage(driver);
    }

    @FindBy(xpath = "//span[.='Frames']")
    WebElement selectFrames;

    public FramesPage selectFrames() {
        clickWithJSExecutor(selectFrames,0,500);
        return new FramesPage(driver);
    }
    @FindBy(xpath = "//span[.='Nested Frames']")
    WebElement selectNestedFrames;

    public NestedFramesPage selectNestedFrames() {
        clickWithJSExecutor(selectNestedFrames,0,500);
        return new NestedFramesPage(driver);
    }

    @FindBy(xpath = "//span[.='Droppable']")
    WebElement selectDroppable;

    public DroppablePage selectDroppable() {
        clickWithJSExecutor(selectDroppable,0,500);
        return new DroppablePage(driver);
    }

    @FindBy(xpath = "//span[.='Dragabble']")
    WebElement selectDragabble;

    public DragabblePage selectDragabble() {
        clickWithJSExecutor(selectDragabble,0,600);
        return new DragabblePage(driver);
    }

    @FindBy(xpath = "//span[.='Practice Form']")
    WebElement selectPracticeForm;

    public PracticeFormPage selectPracticeForm() {
        clickWithJSExecutor(selectPracticeForm,0,200);
        return new PracticeFormPage(driver);
    }

    @FindBy(xpath = "//span[.='Menu']")
    WebElement selectMenuTab;

    public MenuPage selectMenuPage() {
        clickWithJSExecutor(selectMenuTab,0,500);
        return new MenuPage(driver);
    }

    @FindBy(xpath = "//span[.='Slider']")
    WebElement selectSlider;

    public SliderPage selectSlider() {
        clickWithJSExecutor(selectSlider,0,500);
        return new SliderPage(driver);
    }

    @FindBy(xpath = "//span[.='Text Box']")
    WebElement selectTextBox;

    public TextBoxPage selectTextBox() {
        clickWithJSExecutor(selectTextBox,0,100);
        return new TextBoxPage(driver);
    }

    @FindBy(xpath = "//span[.='Upload and Download']")
    WebElement selectUploadAndDownload;

    public UploadAndDownloadPage selectUploadAndDownload() {
        clickWithJSExecutor(selectUploadAndDownload,0,500);
        return new UploadAndDownloadPage(driver);
    }

    @FindBy(xpath = "//span[.='Auto Complete']")
    WebElement selectAutoComplete;

    public AutoCompletePage selectAutoComplete() {
        clickWithJSExecutor(selectAutoComplete,0,400);
        return new AutoCompletePage(driver);
    }
}