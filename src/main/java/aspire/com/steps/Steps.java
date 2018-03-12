package aspire.com.steps;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.property.GetProperty;
import org.hamcrest.Matchers;
import org.jbehave.core.annotations.*;
import org.jbehave.core.model.Narrative;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.Assert;

import aspire.com.pages.*;
import cucumber.api.java.Before;
import static org.hamcrest.MatcherAssert.assertThat;

import java.sql.SQLException;

import jo.aspire.automation.logger.EnvirommentManager;

import org.hamcrest.Matchers;
import org.parosproxy.paros.network.HttpMessage;
import org.zaproxy.zap.CustomProxyListener;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class Steps extends BaseSteps {

	public Steps() {
		super();
	}

	public Steps(PageFactory pageFactory) {
		super(pageFactory);
	}

	@Before
	public void beforeCucmberScenario() {
		System.out.println("ttt");
	}

	@Given("I am on $URL page")
	@When("I am on $URL page")
	public void GoToURL(@Named("URL") String URL) 
	{
		getStepsPage().GoToURL(URL);
	}

	@When("I navigate to URL $element")
	public void navigate_to_URL(@Named("URL") String URL) 
	{
		getStepsPage().NavigateToURL(URL);
	}
	
	@When("I click on $element")
	public void click(@Named("element") String elementname) 
	{
		getStepsPage().click(elementname);
	}

	@When("I Select $element")
	public void select (@Named("element") String elementname)
	{
		
		getStepsPage().selectoption(elementname);
	}
	
	@When("I choose $element")
	public void choose (@Named("element") String elementname)
	{
		
		getStepsPage().choose(elementname);
	}
	
	@When("I navigate to any City $value $element")
	public void navigatetoanycity(@Named("element") String elementname,@Named("value") String value) 
	{
		getStepsPage().navigate(value, elementname);
	}

	@When("I navigate to any Gilt $element")
	public void navigatetoanygilt(@Named("element") String elementname) 
	{
		getStepsPage().navigatetoPLP(elementname);
	}
	
	@When("I search about $element")
	public void Search_about(@Named("element") String elementname)
	{
		getStepsPage().Search_about(elementname);
	}
	
	@When("I fill $element:$value")
	public void fill(@Named("element") String elementname,@Named("value") String value) 
	{
		getStepsPage().fill(elementname, value);
	}

	@When("I cancel order")
	public void cancel() 
	{
		getStepsPage().cancel();
	}

	@When("I Fill new $value in $element")
	public void fillnewtext(@Named("element") String elementname,@Named("value") String value) 
	{
		getStepsPage().EnterNewEmail(value, elementname);
	}

	@When("I select $Option from $DDL")
	public void Choose_DDL_State(@Named("DDL") String State_DDL,@Named("Option") String State) throws IOException 
	{
		getStepsPage().Choose_DDL_State(State_DDL, State);
	}

	@When("I Fill new number $element")
	public void fillnewnumber(@Named("element") String elementname) 
	{
		getStepsPage().pass(elementname);
	}
	
	@When("I scroll page down")
	public void scroll()
	{
		getStepsPage().scroll();  
	}

    
	@When("I search for $element")
	public void search(@Named("element") String elementname) 
	{
		getStepsPage().search(elementname);
	}
	
	@When("I search to find $element")
	public void search_to(@Named("element") String elementname)
	{
		getStepsPage().search_to(elementname);
	}
	
	@When("I Scroll down till end page")
	public void scrolldown()
	{
		getStepsPage().scrolldown();
	}
	
	@When("I Hover on $element then click on $value")
	public void hover(@Named("element") String elementname,@Named("value") String value) 
	{
		getStepsPage().hovering(elementname,value);
	}
	
	
	@When("I Hover over $element then click on $value")
	public void hoverover(@Named("element") String elementname,@Named("value") String value) 
	{
		getStepsPage().hoverover(elementname,value);
	}
	
	
	@When("I hover at $element and choose $value")
	public void hover_at(@Named("element") String elementname,@Named("value") String value)
	{
		getStepsPage().hover_at(elementname,value);
	}
	
	@When("I click randomly on $element")
	public void click_randomly(@Named("element") String elementname)
	{
		getStepsPage().click_randomly(elementname);
	}
	
	@When("I randomly click on the displayed $element")
	public void randomly_click(@Named("element") String elementname)
	{
		getStepsPage().randomly_click(elementname);
	}
	
	@When("I Scroll down")
	public void scroll_Down()
	{
		getStepsPage().scroll_Down();
	}
	
	@When("I type random text in $element")
	public void random_type(@Named("element") String elementname)
	{
		getStepsPage().random_type(elementname);
	}
	
	@When("I fill random number in $element")
	public void random_fill(@Named("element") String elementname) throws ParseException
	{
		getStepsPage().random_fill(elementname);
	}
	
	@When("I Add 16 $value from different $element using $data button")
	public void add_test(@Named("element") String elementname,@Named("value") String value,@Named("data") String data)
	{
		getStepsPage().add_test(elementname,value,data);
	}
	
	@When("$element should match $value")
	public void match_changed(@Named("element") String elementname,@Named("value") String value) throws ParseException
	{
		getStepsPage().match_change(elementname,value);
	}
	
	@When("I Input into $element")
	public void input_into(@Named("element") String elementname) 
	{
		getStepsPage().input_into(elementname);
	}
	
	@Then("$element should display")
	public void CheckElement(@Named("element") String elementname) 
	{
		org.junit.Assert.assertEquals(true,getStepsPage().findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(elementname))).isDisplayed());
	}

	
	@Then("$element should disappear") 
	public void change(@Named ("element")String elementname) 
	{
	  org.junit.Assert.assertEquals(getStepsPage().pageURL , getStepsPage().getCurrentUrl(elementname) ); 
	}
	
	@Then("Additional products should be loaded") 
	public void additionalproduct() 
     {
         org.junit.Assert.assertEquals(getStepsPage().allproduct,getStepsPage().PLPproductlistafter.size());
     }
	  
	@Then("$element should change")
	public void change_result(@Named ("element")String elementname)
	{
		getStepsPage().change_result(elementname);
		org.junit.Assert.assertTrue(getStepsPage().match_change);
	}
	
	@Then("I should be redirected to sale's page")
	public void redirect_to_sale_page()
	{
		org.junit.Assert.assertNotEquals(getStepsPage().getCurrentUrl(),getStepsPage().PLP);
	}
	
	
	@Then("I should navigate to currect PDP")
	public void currectpdp() 
	{
	    org.junit.Assert.assertNotEquals(getStepsPage().getCurrentUrl(),getStepsPage().pageURL); 
	}
	
	@Then("I should navigate to the next search page")
	public void next_search_page()
	{
		org.junit.Assert.assertNotEquals(getStepsPage().getCurrentUrl(),getStepsPage().Search_Page);
	}
	
	@Then("$element Should match with breadcrumb")
	public void match(@Named("element") String elementname)
	{
		getStepsPage().match(elementname);
		org.junit.Assert.assertTrue(getStepsPage().match.toLowerCase().contains(getStepsPage().randomly_selected.toLowerCase())); 
	}
	
	@Then("I should be redirected to collection offer page") 
	public void currect_collection_offer() 
	{
	    org.junit.Assert.assertEquals(getStepsPage().getCurrentUrl(),getStepsPage().Offer_URL); 
	}

	@Then("I Should be redirected to PDP") 
	public void redirecttoPDP() 
	{
	      org.junit.Assert.assertEquals(getStepsPage().getCurrentUrl(),getStepsPage().pageURL); 
	}
	  
	@Then("Minimum and Maximum Values should be matched")
	public void mathced_value()
	{
		org.junit.Assert.assertEquals(getStepsPage().min,getStepsPage().max);
	}
	
	@Then("$element should be changed")
	public void changeproduct(@Named ("element")String elementname) throws ParseException 
	{
		getStepsPage().changeproduct(elementname);
		org.junit.Assert.assertEquals(true,getStepsPage().status);
	}
    
	@Then("$element should match $value")
	public void match_change(@Named("element") String elementname,@Named("value") String value) throws ParseException
	{
		getStepsPage().match_change(elementname,value);
		org.junit.Assert.assertEquals(true,getStepsPage().match_change);
	}
	
	@Then("I should be redirected to that City mosaic page")
	public void redirect()
	{
		getStepsPage().redirect();
		org.junit.Assert.assertEquals(getStepsPage().getCurrentUrl(),getStepsPage().ODPURL);
	}
	
	@Then("I should be redirected to City mosaic page")
	public void redirect_to()
	{
		getStepsPage().redirect_to();
		org.junit.Assert.assertEquals(getStepsPage().getCurrentUrl(),getStepsPage().ODPURL);
	}
	
	@Then("I should be redirected to City mosaic page for the $element")
	public void redirected(@Named ("element")String elementname)
	{
		getStepsPage().redirected(elementname);
		org.junit.Assert.assertTrue(getStepsPage().getCurrentUrl().contains(getStepsPage().selected_city));
	}
	
	@Then("Offers should be $element depends on selected Neighbourhood")
	public void filtered(@Named ("element")String elementname)
	{
		getStepsPage().filtered(elementname);
		org.junit.Assert.assertTrue(getStepsPage().filter);
	}
	
	@Then("Offers should be $element depends on selected Category")
	public void filter(@Named ("element")String elementname)
	{
		getStepsPage().filter(elementname);
		org.junit.Assert.assertTrue(getStepsPage().filter);
	}
	
	
	@Then("Total_Inventory should be change")
	public void total_inventory()
	{
		getStepsPage().total_inventorey();
		org.junit.Assert.assertTrue(getStepsPage().change);
		
	}
	
	@Then("I should be redirected to that offer's ODP page")
	public void ODP_page()
	{
		org.junit.Assert.assertEquals(getStepsPage().getCurrentUrl(),getStepsPage().Offer_URL);
	}
}