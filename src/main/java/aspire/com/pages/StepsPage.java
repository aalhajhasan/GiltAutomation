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
import java.text.NumberFormat;
import java.text.ParseException;
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
public class StepsPage extends FluentWebDriverPage {

	public StepsPage(WebDriverProvider driverProvider) {
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

	public static void sleep(long timeOutInMS) // Sleep
	{
		try 
		{
			Thread.sleep(timeOutInMS);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	public void wait(String element) // Wait the element to display
	{
		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))));

	}

	
	
	
	public void GoToURL(String URL) // navigate to specific URL
	{
		getDriverProvider().get().manage().deleteAllCookies();
		get(EnvirommentManager.getInstance().getProperty(URL));
		getDriverProvider().get().manage().window().maximize();
        
	}

	
	
	
	public void NavigateToURL(String URL)
	{
		get(EnvirommentManager.getInstance().getProperty(URL));
		sleep(1000);
	}
	
	
	public String pageURL="",Search_Page="";
	public void click(String element) // Click on specific element
	{
		Search_Page = getDriverProvider().get().getCurrentUrl();
		ODPURL = getDriverProvider().get().getCurrentUrl();
		sleep(1000);
		//wait(element);
		if (element.equals("sign_in_submit_button"))
		{
			sleep(1000);
			findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).click();
			sleep(4000);
		}
		else if(element.equals("Login_sign_in_Button"))
		{
			sleep(1000);
			findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).click();
			sleep(4000);
		}
		else if (element.equals("Add_to_Cart") || element.equals("Buy_Now_button") || element.equals("Add_to_wait_list_button"))
		{   sleep(1000);
			item.findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).click();
			sleep(2000);
		}
		else
		{
			sleep(1000);
			executeScript("arguments[0].click();",findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))));
			sleep(3000);
		}
		
		pageURL = getDriverProvider().get().getCurrentUrl();
	}

	
	
	
	
	
	public int countercity = 0;
	public List<WebElement> Offer_list;
	public String Offer_URL;
	public String data;
	public void navigate(String value, String element) // Navigate to random city offer
	{
		sleep(1000);
		data = value;
		Offer_list = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)));
		if (countercity >= Offer_list.size())
		{
			countercity = 0;
		}
		sleep(1000);
		while (countercity != Offer_list.size()) 
		{
			if (Offer_list.get(countercity).getAttribute("href").contains("collection") || Offer_list.get(countercity).getAttribute("href").endsWith("jw") ) 
			{
				System.out.println("Unvalid Offer URL: " + Offer_list.get(countercity).getAttribute("href").toString());
				countercity++;
				continue;

			}

			else

			{
				Offer_URL = Offer_list.get(countercity).getAttribute("href").toString().toString();
				System.out.println("Valid Offer URL: "+ Offer_list.get(countercity).getAttribute("href").toString());
				System.out.println("Request Offer status : " + data);
				sleep(500);
				executeScript("arguments[0].click();", Offer_list.get(countercity));
				sleep(1000);
			}

			sleep(7000);
            break;
		}
		
	}

	
	

	
	public int countergilt = 0;
	public List<WebElement> list;
	public String PLP;
	public void navigatetoPLP(String element)  // Navigate to any PLP
	{
		
		sleep(5000);
		list = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)));
		sleep(1000);
		while (countergilt != list.size()) 
		{
			if (element.compareTo("mosaic_Sale")!=0)
			{
			if (list.get(countergilt).getAttribute("href").contains("mm") || list.get(countergilt).getAttribute("href").contains("city") || list.get(countergilt).getAttribute("href").contains("company")) 
			{
				System.out.println("Unvalid Sale URL: " + list.get(countergilt).getAttribute("href").toString());
				countergilt++;
				continue;

			}
			else 
			{
				PLP = list.get(countergilt).getAttribute("href").toString();
				System.out.println("Valid Sale URL: "+ list.get(countergilt).getAttribute("href").toString());
				sleep(500);
				executeScript("arguments[0].click();", list.get(countergilt));
				sleep(1000);
				try 
				{
					if (findElement(By.cssSelector("form.pane.reg-form.form")).isDisplayed())
					{
						findElement(By.cssSelector(".dom-dialog-close-button")).click();
						sleep(1000);
						executeScript("arguments[0].click();", list.get(countergilt));
						sleep(1000);
					}
				}
				catch (NoSuchElementException e) 
				{
					System.out.println("No RegWall");
				}
				break;
			}
			}
			else

			{
				executeScript("arguments[0].click();", list.get(countergilt));
				sleep(1000);
				try 
				{
					if (findElement(By.cssSelector("form.pane.reg-form.form")).isDisplayed())
					{
						findElement(By.cssSelector(".dom-dialog-close-button")).click();
						sleep(1000);
						executeScript("arguments[0].click();", list.get(countergilt));
						sleep(1000);
					}
				}
				catch (NoSuchElementException e) 
				{
					System.out.println("No RegWall");
				}
				break;
			}
          }
		
	}

	
	
	
	

	
	
	public void fill(String element, String data) // Fill the field by static data
	{
		sleep(1000);
		wait(element);
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).clear();
		sleep(1000);
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).sendKeys(EnvirommentManager.getInstance().getProperty(data));

	}

	
	
	
	
	
	public void cancel() // To Cancel order by change the value in URL
	{
		sleep(5000);
		String url = getDriverProvider().get().getCurrentUrl();
		url = url.replace("receipt", "cancel");
		navigate().to(url);
		sleep(1000);
	}

	
	
	
	
	
	
	public void pass(String element) // Return the generated password
	{
		sleep(1000);

		int data = 0;
		String pass = "";
		for (int i = 0; i <= 10; i++) 
		{
			data = i;
			pass += Integer.toString(data);
		}

		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).clear();
		sleep(1000);
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).sendKeys(pass);
	}

	
	
	
	
	
	
	
	public void EnterNewEmail(String value, String element) // Return the generated email
	{
		wait(element);
		String data = value + RandomStringUtils.randomAlphabetic(6) + "@gilttest.com";
		if (value.equalsIgnoreCase("empty") || value == null) 
		{
			findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).clear();
		} 
		else 
		{
			findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).sendKeys(data);
		}
	}

	
	
	
	
	
	
	
	public void Choose_DDL_State(String DDL, String Option) // Select an option from drop down list
	{
        sleep(1000);
		Select dropdown = new Select(getDriverProvider().get().findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(DDL))));
		dropdown.selectByValue(EnvirommentManager.getInstance().getProperty(Option));
        sleep(1000);
	}

	
	
	
	
	
	
	public String getCurrentUrl (String element)  //Return the current page URL
	{
		  return  getDriverProvider().get().getCurrentUrl();
	}
	
	
	
	
	
	
	public void scroll() //To scroll the page down
	{
       
        executeScript("window.scrollBy(0,250)", "");
		sleep(3000);
		
	}
	
	
	
	
	
	
	
	public List<WebElement> PLPproductlistafter;
	public int allproduct;
	public void scrolldown()   //To scroll till end of the page
	{
		sleep(1000);

		Actions actions = new Actions(getDriverProvider().get());
		@SuppressWarnings("unused")
		Keys theKey = null;
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		PLPproductlistafter = findElements(By.cssSelector("article.product-look"));
		String product = findElement(By.cssSelector(".listing-meta-wrapper .result-count .total-results")).getText().toString();
		allproduct =Integer.parseInt(product);
		while (PLPproductlistafter.size() != allproduct)
		{
			actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
			sleep(1000);
			PLPproductlistafter = findElements(By.cssSelector("article.product-look"));
		}
		
	}

	
	
	
	
	
	
	WebElement item;
	public List<WebElement> oldqt3, oldqt2, oldqt1, oldreserved; 
	Iterator<WebElement> Elements;
	Actions hoverOver;
	Actions builder;
	public void hovering(String element,String value)  //Hovering and click on specific element
	{
		Elements = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).iterator();
		oldqt1 = findElements(By.cssSelector("article.product-look.qty-1"));
		oldqt2 = findElements(By.cssSelector("article.product-look.qty-2"));
		oldqt3 = findElements(By.cssSelector("article.product-look.qty-3"));
		oldreserved = findElements(By.cssSelector("article.product-look.reserved"));
		while (Elements.hasNext())
		{
			sleep(1000);
			item = Elements.next();
			builder = new Actions(getDriverProvider().get());
			hoverOver = builder.moveToElement(item);
			hoverOver.perform();
            sleep(1000);
			try
			{
				if (item.findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(value))).isDisplayed())
				{
					sleep(2000);
					item.findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(value))).click();
					sleep(2000);
					break;
				}
				else 
				{
					System.out.println("Next Items");
				}
			}
			
			catch (NoSuchElementException e) 
			{
				System.out.println("Next Items");
				continue;
			}
			sleep(1000);
		}
		
	}

	
	
	
	public void hoverover(String element,String value)  //Hovering and click on specific element
	{
		    Iterator<WebElement> Elements = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).iterator();
			sleep(1000);
			item = Elements.next();
			Actions builder = new Actions(getDriverProvider().get());
			Actions hoverOver = builder.moveToElement(item);
			hoverOver.perform();
            sleep(2000);
			try
			{
				if (findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(value))).isDisplayed())
				{
					sleep(2000);
					findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(value))).click();
					sleep(2000);
				}
			}
			
			catch (NoSuchElementException e) 
			{
				System.out.println("Not Found");
				
			}
			sleep(1000);
		}
		
	
	
	
	
	public String[] mosaic = new String[5];
	public String request,total_result;
	public void hover_at(String element, String value)
	{
		sleep(2000);
		Iterator<WebElement> Elements = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).iterator();
        sleep(1000);
        mosaic[0] = "[data-store-name='women-shoes-handbags'] ";
        mosaic[1] = "[data-store-name='women-jewelry-access'] ";
        mosaic[2] = "[data-store-name='men'] ";
        mosaic[3] = "[data-store-name='children'] ";
        mosaic[4] = "[data-store-name='home'] ";
     		   
        Random random = new Random();
		int store = random.nextInt(mosaic.length-1);
        if ( value.equals("Live_Sale"))
        {
   		   request = mosaic[store].concat("div:nth-child(6) article .subnav-link.subnav-link--column-item");
        }
        else if (value.equals("Category_link"))
        {
        	if (store == 3)
        	{
        		request = mosaic[store].concat("div:nth-child(3) article.subnav-column .subnav-link.subnav-link--column-item");
        	}
        	else
        	{
        	   request = mosaic[store].concat("article.subnav-column .subnav-link.subnav-link--column-item-child");
        	}
        }
        else if (value.equals("shop_by_age_link"))
        {
        	request = "[data-store-name='children'] div:nth-child(5) article .subnav-link.subnav-link--column-item";
        }
        else if (value.equals("View_All_Link"))
        {
        	request = "[data-store-name='city'] .subnav-link__cta";
        }
        else if (value.equals("Dresses_Category"))
        {
        	request = "[data-store-name='women-apparel'] div:nth-child(3) article:nth-child(1) > a:nth-child(1)";
        }
        else 
        {
        	System.out.println("Invalid request");
        }
        
        while (Elements.hasNext())
		{
		item = Elements.next();
		Actions builder = new Actions(getDriverProvider().get());
		Actions hoverOver = builder.moveToElement(item);
		hoverOver.perform();
        sleep(1000);
        try
		{
        	sleep(1000);
			if (findElement(By.cssSelector(request)).isDisplayed())
			{
				sleep(1000);
				list = findElements(By.cssSelector(request));
				Random rand = new Random();
				int credit = rand.nextInt(list.size());
				executeScript("arguments[0].click();", list.get(credit));
				sleep(2000);
				total_result = findElement(By.cssSelector(".total-results")).getText().toString();
				break;
			}
			else 
			{
				System.out.println("Next Store Mosaic");
			}
		}
		
		catch (NoSuchElementException e) 
		{
			System.out.println("Next Store");
			continue;
		}
		sleep(1000);
		}
	}
	
	
	
	public void search(String element)  //Search for a specific Gilt element 
	{
		
		sleep(1000);
		try
		{
			if (findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).isDisplayed())
			{
				System.out.println("valid PLP");
			}
		}
		
		catch (NoSuchElementException e) 
		{
			System.out.println("Invalid PLP");
			countergilt++;
			navigate().back();
			sleep(1000);
			list = findElements(By.cssSelector("article.sale .sale-link"));
			sleep(1000);
			while (countergilt != list.size()) 
			{
				if (list.get(countergilt).getAttribute("href").contains("mm") || list.get(countergilt).getAttribute("href").contains("city") || list.get(countergilt).getAttribute("href").contains("company")) 
				{
					System.out.println("Unvalid Sale URL: " + list.get(countergilt).getAttribute("href").toString());
					countergilt++;
					continue;

				}

				else

				{
					System.out.println("Valid Sale URL: "+ list.get(countergilt).getAttribute("href").toString());
					sleep(500);
					executeScript("arguments[0].click();", list.get(countergilt));
					break;
				}
	          }
			
			search(element);
		}
		
	}
	
	
	
	public void search_to(String element)
	{
		boolean status = true;
		sleep(1000);
		if (element.equals("ODP_Addtowaitlist_Button"))
		{
			try 
			{
				if (findElement(By.cssSelector(".package-tab.sold-out")).isDisplayed()) 
				{
					
					executeScript("arguments[0].click();",findElement(By.cssSelector(".package-tab.sold-out")));
				}
			} 
			catch (NoSuchElementException e) 
			{
				System.out.println("Not Soldout offer"); 
				Live_ODP(element);
			}
		}
		
		String button = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).getText().toString();
		System.out.println("button = "+ button);
		
		try
		{
			
			if (findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).isDisplayed() && (button.compareTo("RSVP")!=0 && button.compareTo("Book Now")!=0))
			{
				System.out.println("valid ODP " + status);
				
			}
			else 
			{
				Live_ODP(element);
			}
			
		}
		
		catch (NoSuchElementException e) 
		{
			System.out.println("Catch");
			search_to(element);
		}
		
	}
	
	
	
	
	
	public boolean status;
	public void changeproduct(String element) throws ParseException
	{
		sleep(1000);
		String sort_by_option;
		try
		{
			sort_by_option = findElement(By.cssSelector(".search-sort-select .selected-entry .current-sort")).getText().toString();
			System.out.println("sort by option " + sort_by_option);
		}
		catch (NoSuchElementException e)
		{
			sort_by_option = findElement(By.cssSelector("select.styled-select")).getText().toString();
			System.out.println("catch sort by option" + sort_by_option);
		}
		
		
		sleep(1000);
		list = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)));
		String firstvalue = "";
		String secondvalue = "";
		double value1,value2;
		Number number1,number2;
		NumberFormat format = NumberFormat.getCurrencyInstance(); 
		for (int item=0; item < list.size()-1; item++)   
		{
			if(list.get(0).getText().toString().contains("$"))
			{
			    firstvalue = list.get(item).getText();
			    System.out.println("firstvalue = " + firstvalue);
			    if (firstvalue.contains("-"))
			    {
			    	 number1 = format.parse(firstvalue.substring(firstvalue.indexOf("?", 2) + 1, firstvalue.indexOf("-")));
			    	 System.out.println("value1 = " + number1);
			    	 value1= number1.doubleValue();
			    }
			    else 
			    {
			    	number1 = format.parse(firstvalue.substring(firstvalue.indexOf("?", 2) + 1));
			    	System.out.println("value1 = " + number1);
			    	value1= number1.doubleValue();
			    }
			    
			    
			    
			    secondvalue = list.get(item+1).getText().toString();
			    System.out.println("secondvalue = " + secondvalue);
			    if (secondvalue.contains("-"))
			    {
			    	number2 = format.parse(secondvalue.substring(secondvalue.indexOf("?", 2) + 1, secondvalue.indexOf("-")));
			    	System.out.println("value2 = " + number2);
			    	value2= number2.doubleValue();
			    }
			    else 
			    {
			    	number2 = format.parse(secondvalue.substring(secondvalue.indexOf("?", 2) + 1));
			    	System.out.println("value2 = " + number2);
			    	value2= number2.doubleValue();
			    }
			}
			
			else
			{
				     firstvalue = list.get(item).getText();
			         System.out.println("firstvalue = " + firstvalue);
					if (firstvalue.contains("-"))
					{
						value1 = Double.parseDouble(firstvalue.substring(3,firstvalue.indexOf("-")));
						System.out.println("value1 = " + value1 );
					}
					else
					{
						value1  = Double.parseDouble(firstvalue.substring(3));
						System.out.println("value1 = " + value1 );
					}
					
					
					
					secondvalue = list.get(item+1).getText().toString();
				    System.out.println("secondvalue = " + secondvalue);
					if (secondvalue.contains("-"))
					{
						value2 = Double.parseDouble(secondvalue.substring(3,secondvalue.indexOf("-")));
						System.out.println("value2 = " + value2);
					}
					else
					{
						value2 = Double.parseDouble(secondvalue.substring(3));
						System.out.println("value2 = " + value2);
					}
			}
			
			 if (sort_by_option.endsWith("High") )
			 {
				if ( value2 >= value1)
				{
					status = true;
				}
				else 
				{
					status = false;
					
				}
			 }
			 else 
			 {
				 if ( value2 <= value1)
					{
						status = true;
					}
					else 
					{
						status = false;
						
					}
			 }
		}
	}
	
	
	
	
	public String ODPURL;
	public void redirect()
	{
		
		System.out.println("ODPURL befor = " + ODPURL);
		ODPURL = ODPURL.substring(0, ODPURL.indexOf("offer")-1);
		System.out.println("ODPURL After = " + ODPURL);
	}
	
	
	
	
	public void redirect_to()
	{
		
		System.out.println("ODPURL befor = " + ODPURL);
		ODPURL = ODPURL.substring(0, ODPURL.indexOf("collection")-1);
		System.out.println("ODPURL After = " + ODPURL);
	}
	
	
	
	
	
	public String selected_city;
	public void redirected(String element)
	{
		selected_city = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).getText().toString().toLowerCase();
		System.out.println("selected_city = " + selected_city);
	}
	
	
	
	
	public void selectoption(String element)
	{
		sleep(1000);
		wait(element);
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).sendKeys(Keys.ENTER);
	}
	
	
	
	
	public void choose(String element)
	{
		sleep(1000);
		wait(element);
		list = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)));
		Random rand = new Random();
		int credit = rand.nextInt(list.size());
		executeScript("arguments[0].click();", list.get(credit));
	}
	
	
	public void Search_about(String element)
	{
		sleep(1000);
		Offer_list = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)));
		sleep(1000);
		while (countercity != Offer_list.size()) 
		{
			if (Offer_list.get(countercity).getAttribute("href").contains("collection")) 
			{
				
				System.out.println("Valid Offer URL: " + Offer_list.get(countercity).getAttribute("href").toString());
				sleep(500);
				Offer_URL = Offer_list.get(countercity).getAttribute("href").toString().toString();
				executeScript("arguments[0].click();", Offer_list.get(countercity));
				sleep(1000);
				break;

			}

			else

			{
				System.out.println("unvalid Offer URL: "+ Offer_list.get(countercity).getAttribute("href").toString());
				sleep(500);
				countercity++;
			    continue;
			}

	}
	}
	
	
	
	
	public void Live_ODP(String element)
	{
		System.out.println("Invalid ODP");
		countercity++;
		navigate().back();
		sleep(1000);
		Offer_list = findElements(By.cssSelector("article.sale.offer .sale-link"));
		sleep(1000);
		while (countercity != Offer_list.size()) 
		{
			if (Offer_list.get(countercity).getAttribute("href").contains("collection") || Offer_list.get(countercity).getAttribute("href").endsWith("jw") ) 
			{
				System.out.println("Unvalid Offer URL: " + Offer_list.get(countercity).getAttribute("href").toString());
				countercity++;
				continue;

			}
			else

			{
				Offer_URL = Offer_list.get(countercity).getAttribute("href").toString();
				System.out.println("Valid Offer URL: "+ Offer_list.get(countercity).getAttribute("href").toString());
				System.out.println("Request Offer status : " + data);
				sleep(500);
				executeScript("arguments[0].click();", Offer_list.get(countercity));
				sleep(1000);
				break;
			}
		}
		search_to(element);
		
	}
	
	
	public boolean filter;
	public void filtered(String element)
	{
		sleep(1000);
		String City_selected = findElement(By.cssSelector(".dropdown-city-selection .selection-title")).getText().toString();
		System.out.println("City_Name : " + City_selected);
		sleep(500);
		Offer_list = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)));
		Random rand = new Random();
		int offer = rand.nextInt(Offer_list.size());
		executeScript("arguments[0].click();", Offer_list.get(offer));
		sleep(500);
		String ODP_Cityname = findElement(By.cssSelector("#breadcrumbs li:nth-child(2)")).getText().toString();
		sleep(500);
		if (ODP_Cityname.contains(City_selected.toUpperCase()))
		  {
			filter = true;
		  }
		else 
		{
			filter = false;
		}
	}
		

	public void filter(String element)
	{
		sleep(1000);
		System.out.println("City_Name : " + selected);
		sleep(500);
		Offer_list = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)));
		Random rand = new Random();
		int offer = rand.nextInt(Offer_list.size());
		executeScript("arguments[0].click();", Offer_list.get(offer));
		sleep(500);
		String ODP_Categoryname = findElement(By.cssSelector(".offer-category")).getText().toString();
		sleep(500);
		if (ODP_Categoryname.contains(selected.toUpperCase()))
		  {
			filter = true;
		  }
		else 
		{
			filter = false;
		}
	}
	
	
	public String selected;
	public void click_randomly(String element)
	{
		List<WebElement> city_options = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)));
		Random rand = new Random();
		int options = rand.nextInt(city_options.size());
		String Offers_text_befor = findElement(By.cssSelector(".offer-count .selected-count")).getText().toString();
		int Offers_number_befor = Integer.parseInt(Offers_text_befor.substring(0,Offers_text_befor.indexOf(" ")));
		System.out.println("Offers_number_befor : " + Offers_text_befor);
		executeScript("arguments[0].click();", city_options.get(options));
		sleep(2000);
		String Offers_text_after = findElement(By.cssSelector(".offer-count .selected-count")).getText().toString();
		int Offers_number_after = Integer.parseInt(Offers_text_after.substring(0,Offers_text_after.indexOf(" ")));
		System.out.println("Offers_number_after : " + Offers_text_after);
		if (Offers_number_after < Offers_number_befor)
		{
			System.out.println("Passed");
			selected = city_options.get(options).getText().toString();
			System.out.println("Selected Option = " + city_options.get(options).getText().toString());
		}
		else 
		{
			System.out.println("non Selected Option = " + city_options.get(options).getText().toString());
			System.out.println("Selected: "+ city_options.remove(options).getText().toString());
			city_options.remove(options);
			click_randomly(element);
		}
		
	  sleep(1000);
	}
	
    public boolean change;
	public void total_inventorey()
	{   
		navigate().refresh();
		sleep(2000);
		List<WebElement> qt3 = findElements(By.cssSelector("article.product-look.qty-3"));
		List<WebElement> qt2 = findElements(By.cssSelector("article.product-look.qty-2"));
		List<WebElement> qt1 = findElements(By.cssSelector("article.product-look.qty-1"));
		List<WebElement> reserved = findElements(By.cssSelector("article.product-look.reserved"));
		System.out.println("qt3 : " + qt3.size());
		System.out.println("qt2 : " + qt2.size());
		System.out.println("qt1 : " + qt1.size());
		System.out.println("reserved : " + reserved.size());
		System.out.println("oldqt3 : " + oldqt3.size());
		System.out.println("oldqt2 : " + oldqt2.size());
		System.out.println("oldqt1 : " + oldqt1.size());
		System.out.println("oldreserved : " + oldreserved.size());
		sleep(1000);
		if (qt3.size()<=oldqt3.size() || qt2.size()<=oldqt2.size() || qt1.size()<=oldqt1.size() || reserved.size()<=oldreserved.size())
		{
			change = true;
		}
		else 
		{
			change = false;
		}
	}
	
	
	public String randomly_selected;
	public void randomly_click(String element)
	{
		sleep(1000);
		List<WebElement> category_list = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)));
		Random rand = new Random();
		int options = rand.nextInt(category_list.size());
		if (element.equals("Search_autosuggest") || element.equals("Profile_Size") || element.equals("Brands"))
		{
			sleep(1000);
			randomly_selected = category_list.get(options).getText().toString();
			System.out.println("Randomly Selected Option : " + randomly_selected);
			sleep(1000);
			category_list.get(options).click();
			sleep(1000);
		}
		else
		{
			if (element.equals("Store_tab") && options >= 3)
			{
				randomly_click(element);
			}
			else
			{
			sleep(1000);
		    executeScript("arguments[0].click();", category_list.get(options));
		    sleep(1000);
		    randomly_selected = category_list.get(options).getText().toString();
			System.out.println("Randomly Selected Option : " + randomly_selected);
			}
		}
		
		sleep(2000);
	}
	
	
	public String match;
	public void match(String element)
	{
		sleep(3000);
		match = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).getText().toString();
		System.out.println("Match Selected Option : " + match);
		sleep(1000);
	}
	
	
	public boolean match_change,min,max;
	public void match_change(String element,String value) throws ParseException
	{
		sleep(1000);
		NumberFormat format = NumberFormat.getCurrencyInstance(); 
		Number number1,number2;
		double value1,value2;
		String data = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).getAttribute("placeholder").toString();
		if (data.contains("$"))
		{
			number1 = format.parse(data);
		    value1 = number1.doubleValue();
		}
		else
		{
			value1 = Double.parseDouble(data.substring(3));
		}
		
		System.out.println("placeholder value : " + value1);
		sleep(1000);
		List<WebElement> category_list = findElements(By.cssSelector("article.product-look .pricing .price"));
		String item = category_list.get(0).getText().toString();
		if (item.contains("$"))
		{
			if (item.contains("-"))
		    {
		    	 number2 = format.parse(item.substring(item.indexOf("?", 2) + 1, item.indexOf("-")));
		    	 System.out.println("value2 = " + number2);
		    	 value2= number2.doubleValue();
		    }
		    else 
		    {
		    	number2 = format.parse(item.substring(item.indexOf("?", 2) + 1));
		    	System.out.println("value2 = " + number2);
		    	value2= number2.doubleValue();
		    }
			
		}
		else
		{
			if (item.contains("-"))
			{
				value2 = Double.parseDouble(item.substring(3,item.indexOf("-")));
				System.out.println("value2 = " + value2 );
			}
			else
			{
				value2  = Double.parseDouble(item.substring(3));
				System.out.println("value2 = " + value2);
			}
		}
		
		System.out.println("first item value : " + value2);
		sleep(1000);
		if (element.contains("Min"))
		{
		  if (value1 <= value2)
		  {
		 	match_change = true;
		 	min = true;
		  }
		  else
		  {
			match_change = false;
			min = false;
		  }
		}
		else 
		{
			if (value1 >= value2)
			  {
			 	match_change = true;
			 	max = true;
			  }
			  else
			  {
				match_change = false;
				max = false;
			  }
		}
	}
	
	
	
	
	public void random_fill(String element) throws ParseException
	{
		sleep(1000);
		NumberFormat format = NumberFormat.getCurrencyInstance(); 
		Number number1;
		int value1;
		int options;
		String data = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).getAttribute("placeholder").toString();
		if (data.contains("$"))
		{ 
			number1 = format.parse(data);
			value1 = number1.intValue();
		}
		else
		{
			value1 = Integer.parseInt(data.substring(3));
		}
		
		System.out.println("placeholder value : " + value1);
		Random rand = new Random();
		if (element.contains("Min"))
		{
			options = rand.nextInt(value1*2) + value1;
		}
		else
		{
			options = rand.nextInt(value1/2) + value1;
		}
		String fill_data = Integer.toString(options);
		randomly_selected = Integer.toString(options);
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).sendKeys(fill_data);
		Actions actions = new Actions(getDriverProvider().get());
		@SuppressWarnings("unused")
		Keys theKey = null;
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).perform();
	}
	
	
	
	public void change_result(String element)
	{
		sleep(1000);
		String new_result = findElement(By.cssSelector(".total-results")).getText().toString();
		int old_value = Integer.parseInt(total_result);
		int new_value = Integer.parseInt(new_result);
		
		if ( new_value >= old_value )
		{
			match_change = true;
		}
		else 
		{
			match_change = false;
		}
		sleep(1000);
	}
	
	
	
	
	public void scroll_Down()
	{
		sleep(1000);

		Actions actions = new Actions(getDriverProvider().get());
		@SuppressWarnings("unused")
		Keys theKey = null;
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	}
	
	
	public void random_type(String element)
	{
		sleep(2000);
		wait(element);
		String data = RandomStringUtils.randomAlphabetic(10);
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).clear();
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).sendKeys(data);
		sleep(1000);
		Actions actions = new Actions(getDriverProvider().get());
		@SuppressWarnings("unused")
		Keys theKey = null;
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).perform();
		
	}
	
	
	public void input_into(String element)
	{
		sleep(1000);
		String data = RandomStringUtils.randomAlphabetic(1);
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).clear();
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).sendKeys(data);
		sleep(2000);
	}
	
	
	
	public int counter = 0;
	public void add_test(String element, String value, String data)
	{
		Elements = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).iterator();
		while (counter <16)
		{   
	      
		  while (Elements.hasNext())
		  {
			sleep(1000);
			item = Elements.next();
			builder = new Actions(getDriverProvider().get());
			hoverOver = builder.moveToElement(item);
			hoverOver.perform();
            sleep(1000);
			try
			{
				if (item.findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(value))).isDisplayed())
				{
					sleep(2000);
					executeScript("arguments[0].click();",item.findElement(By.cssSelector("article.product-look .quick-add .sku-selection .sku-attribute .sku-attribute-values .for_sale .primary")));
					sleep(2000);
					break;
				}
				else 
				{
					System.out.println("Next Items");
				}
			}
			
			catch (NoSuchElementException e) 
			{
				System.out.println("Next Items");
				continue;
			}
			sleep(1000);
		   }
		  
		    click(data);
			sleep(1000);
			if (counter != 16)
			{
				executeScript("arguments[0].click();",findElement(By.cssSelector(".dom-dialog .dom-dialog-close-button")));
			}
			sleep(1000);
			counter++;
		}
		executeScript("arguments[0].click();",findElement(By.cssSelector(".nav-cart")));
		
	}
	
	
	
	
	
}