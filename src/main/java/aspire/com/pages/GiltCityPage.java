package aspire.com.pages;

import aspire.com.pages.*;

import org.apache.commons.lang.RandomStringUtils;
import org.bouncycastle.jce.provider.X509LDAPCertStoreSpi;
//import org.apache.xalan.templates.ElemSort;
import org.jbehave.core.annotations.When;
import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.mockito.internal.matchers.Find;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.selenium.fluent.FluentWebElement;
import org.zaproxy.clientapi.gen.Selenium;

import aspire.com.steps.BaseSteps;
import aspire.com.steps.LifecycleSteps;
import aspire.com.steps.Selectors;

import com.gargoylesoftware.htmlunit.javascript.host.Element;
//import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.sun.mail.iap.Argument;
import com.thoughtworks.selenium.webdriven.commands.GetText;
import com.thoughtworks.xstream.io.binary.Token.Value;









//import giltjsonAPI.HttpReq;
//import giltjsonAPI.Main;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.channels.Selector;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.cssSelector;
import static org.seleniumhq.selenium.fluent.Period.secs;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.nio.channels.Selector;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import jo.aspire.automation.logger.EnvirommentManager;
import jo.aspire.mobile.automationUtil.DriverProvider;

import java.util.Random;
import java.util.ArrayList;

/**
 * Page object defining the home page
 */
public class GiltCityPage extends FluentWebDriverPage {

	public GiltCityPage(WebDriverProvider driverProvider) {
		super(driverProvider);

		// TODO Auto-generated constructor stub
	}

	ExecutorService exec;
	public static String inviteFriendLink;
	public static String sharedString;
	public static String elementText;
	WebDriverWait wait;
	/**
	 * Default Selector within the class
	 */
	private By Version = cssSelector("td.mh22-text a");
	private final int CONST_WAIT_LOWER_VALUE = 30;
	private Consumer<? super WebElement> ref;

	public FluentWebElement getWorkSmartVersion() 
	{
		return within(secs(CONST_WAIT_LOWER_VALUE)).link(Version);
	}

	public String checkVersinoTextFromHeader() 
	{
		return getWorkSmartVersion().getText().toString();
	}


	public static void sleep(long timeOutInMS) 
	{
		try {
			Thread.sleep(timeOutInMS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void GoToURL(String URL) //navigate to specific URL
	{
		getDriverProvider().get().manage().deleteAllCookies();
		get(EnvirommentManager.getInstance().getProperty(URL));
		getDriverProvider().get().manage().window().maximize();

	}

	
	
}