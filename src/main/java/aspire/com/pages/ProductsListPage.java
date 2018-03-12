package aspire.com.pages;

//import giltjsonAPI.HttpReq;
//import giltjsonAPI.Main;
//import giltjsonAPI.Sale;

import static org.openqa.selenium.By.cssSelector;
import static org.seleniumhq.selenium.fluent.Period.secs;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import jo.aspire.automation.logger.EnvirommentManager;

import org.jbehave.web.selenium.WebDriverProvider;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.selenium.fluent.FluentWebElement;

import aspire.com.steps.Selectors;

public class ProductsListPage extends StepsPage {

	public String URL;

	public ProductsListPage(WebDriverProvider driverProvider) {
		super(driverProvider);
		// TODO Auto-generated constructor stub
	}
	
}