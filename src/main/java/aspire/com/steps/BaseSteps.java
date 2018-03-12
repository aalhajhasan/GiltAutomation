package aspire.com.steps;


import aspire.com.pages.StepsPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import aspire.com.pages.PageFactory;
import aspire.com.pages.edge.CheckOutPage;
import aspire.com.pages.edge.GiltCityPage;
import aspire.com.pages.edge.ProductDetailsPage;
import aspire.com.pages.edge.ProductsListPage;
import aspire.com.pages.edge.TopNavBarPage;


@ContextConfiguration(
		//"classpath:/aspire/com/steps/cucumber.xml"
		  "file:cucumber.xml"
		)
public class BaseSteps {

	
	@Autowired  
	PageFactory pageFactory=null;
	private StepsPage steps;
	private aspire.com.pages.CheckOutPage checkout;
	private aspire.com.pages.ProductDetailsPage pdp;
	private aspire.com.pages.TopNavBarPage topNav;
	private aspire.com.pages.ProductsListPage plp;
	private aspire.com.pages.GiltCityPage city;
	public BaseSteps() {
	
	}
	public BaseSteps(PageFactory pageFactory) {
		this.pageFactory = pageFactory;
		System.out.println("hola2");

	}
	public StepsPage getStepsPage()
	{
		if(steps == null){
			steps = pageFactory.newSteps();
		}
		return steps;
		
	}
	
	public aspire.com.pages.CheckOutPage getCheckOutPage()
	{
		if(checkout == null){
			checkout = pageFactory.newCheckOutPage();
		}
		return checkout;
		
	}
	public aspire.com.pages.ProductDetailsPage getProductDetailsPage(){
		if(pdp == null){
			pdp = pageFactory.newProductDetailsPage();
		}
		return pdp;
	}
	public aspire.com.pages.ProductsListPage getProductsListPage(){
		if(plp == null){
			plp = pageFactory.newProductsListPage();
		}
		return plp;
	}
	
	public aspire.com.pages.TopNavBarPage getTopNavBarPage(){
		if(topNav == null){
			topNav = pageFactory.newTopNavBarPage();
		}
		return topNav;
	}
	
	public aspire.com.pages.GiltCityPage getGiltCityPage(){
		if(city == null){
			city = pageFactory.newGiltCityPage();
		}
		return city;
	}

}
