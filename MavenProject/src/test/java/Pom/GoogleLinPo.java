package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class GoogleLinPo extends BasePage {

	public GoogleLinPo(WebDriver driver) {
		super(driver);
	}
@FindBy(name="q")
private WebElement seachTextBox;
public WebElement searchTextBox() {
	return seachTextBox;
}
@FindBy(xpath="//input[@type='submit']")
private WebElement seachBtn;
public WebElement serchBtn() {
	return seachBtn;
}
}
