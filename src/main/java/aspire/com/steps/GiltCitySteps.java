package aspire.com.steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.property.GetProperty;
import org.hamcrest.Matchers;
import org.jbehave.core.annotations.*;
import org.jbehave.core.model.Narrative;
import org.openqa.selenium.By;
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

public class GiltCitySteps extends BaseSteps {

	public GiltCitySteps() 
	{
		super();
	}

	public GiltCitySteps(PageFactory pageFactory) 
	{
		super(pageFactory);
	}

	@Before
	public void beforeCucmberScenario() 
	{
		System.out.println("ttt");
	}
	
	
	
	
	
}
