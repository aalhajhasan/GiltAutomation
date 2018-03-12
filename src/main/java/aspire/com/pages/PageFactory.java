package aspire.com.pages;

import org.jbehave.web.selenium.WebDriverProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import jo.aspire.automation.logger.EnvirommentManager;

//import aspire.

/**
 * PageFactory that is used to instantiate desired page object
 */

public class PageFactory {
	

	private String browser;
	private String isMobile;
	
	private WebDriverProvider webDriverProvider;

	public PageFactory(WebDriverProvider webDriverProvider) {
		EnvirommentManager.setInitialClass(this.getClass());
		this.browser = EnvirommentManager.getInstance().getProperty(
				"RunBrowser");
		this.isMobile = EnvirommentManager.getInstance()
				.getProperty("isMobile");
		this.webDriverProvider = webDriverProvider;
	}

	public WebDriverProvider getDriverProvider() {
		return webDriverProvider;
	}
	// gilt
	public StepsPage newSteps() {
		if (isSafari()) {
			return new aspire.com.pages.safari.StepsPage(webDriverProvider);
		}
		if (isIE()) {
			return new aspire.com.pages.ie.StepsPage(webDriverProvider);
		}
		if(isEdge()){
			return new aspire.com.pages.edge.StepsPage(webDriverProvider);

		}
		
		return new StepsPage(webDriverProvider);
	}

	public CheckOutPage newCheckOutPage() {
		if (isSafari()) {
			return new aspire.com.pages.safari.CheckOutPage(webDriverProvider);
		}
		if (isIE()) {
			return new aspire.com.pages.ie.CheckOutPage(webDriverProvider);
		}
		if(isEdge()){
			return new aspire.com.pages.edge.CheckOutPage(webDriverProvider);

		}
		return new CheckOutPage(webDriverProvider);
	}

	public ProductDetailsPage newProductDetailsPage() {
		if (isSafari()) {
			return new aspire.com.pages.safari.ProductDetailsPage(
					webDriverProvider);
		}
		if (isIE()) {
			return new aspire.com.pages.ie.ProductDetailsPage(webDriverProvider);

		}
		if(isEdge()){
			return new aspire.com.pages.edge.ProductDetailsPage(webDriverProvider);

		}

		return new ProductDetailsPage(webDriverProvider);
	}

	public ProductsListPage newProductsListPage() {
		if (isSafari()) {
			return new aspire.com.pages.safari.ProductsListPage(
					webDriverProvider);
		}
		if (isIE()) {
			return new aspire.com.pages.ie.ProductsListPage(webDriverProvider);
		}
		if(isEdge()){
			return new aspire.com.pages.edge.ProductsListPage(webDriverProvider);

		}
		return new ProductsListPage(webDriverProvider);
	}

	public TopNavBarPage newTopNavBarPage() {
		if (isSafari()) {
			return new aspire.com.pages.safari.TopNavBarPage(webDriverProvider);
		}
		if (isIE()) {
			return new aspire.com.pages.ie.TopNavBarPage(webDriverProvider);
		}
		if(isEdge()){
			return new aspire.com.pages.edge.TopNavBarPage(webDriverProvider);

		}

		return new TopNavBarPage(webDriverProvider);
	}

	public GiltCityPage newGiltCityPage() {
		if (isSafari()) {
			return new aspire.com.pages.safari.GiltCityPage(webDriverProvider);
		}
		if (isIE()) {
			return new aspire.com.pages.ie.GiltCityPage(webDriverProvider);
		}
		if(isEdge()){
			return new aspire.com.pages.edge.GiltCityPage(webDriverProvider);

		}
		return new GiltCityPage(webDriverProvider);
	}

	private boolean isSafari() {
		return browser.equals("safari");
	}

	private boolean isIE() {
		return browser.equals("ie32");
	}

	private boolean isEdge() {
		return browser.equals("edge");
	}

	private boolean isAndroid() {
		return isMobile.equals("true");
	}

	
	
}
