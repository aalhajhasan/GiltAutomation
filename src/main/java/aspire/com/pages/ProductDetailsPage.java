package aspire.com.pages;

import java.util.Iterator;
import java.util.List;
import jo.aspire.automation.logger.EnvirommentManager;

import org.jbehave.core.annotations.When;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import aspire.com.steps.Selectors;

public class ProductDetailsPage extends StepsPage {

	public ProductDetailsPage(WebDriverProvider driverProvider) {
		super(driverProvider);
		// TODO Auto-generated constructor stub
	}

	int saleCount = 1;

}