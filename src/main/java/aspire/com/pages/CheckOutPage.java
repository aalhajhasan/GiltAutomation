package aspire.com.pages;

import static org.openqa.selenium.By.cssSelector;

import java.awt.CardLayout;
import java.util.List;

import jo.aspire.automation.logger.EnvirommentManager;

import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import aspire.com.steps.Selectors;

public class CheckOutPage extends StepsPage {

	public CheckOutPage(WebDriverProvider driverProvider) {
		super(driverProvider);
		// TODO Auto-generated constructor stub
	}

}
