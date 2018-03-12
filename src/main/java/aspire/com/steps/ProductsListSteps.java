package aspire.com.steps;

import java.io.IOException;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;

import cucumber.api.java.Before;
import aspire.com.pages.PageFactory;

public class ProductsListSteps extends BaseSteps {
	
	public ProductsListSteps(){
		super();
	}
	
	public ProductsListSteps(PageFactory pageFactory){
		super(pageFactory);
		
	}
	

}
