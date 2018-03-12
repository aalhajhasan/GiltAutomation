package aspire.com.steps;

import java.io.IOException;

import org.hamcrest.Matchers;
import org.jbehave.core.annotations.*;
import org.jbehave.core.model.Narrative;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import aspire.com.pages.*;
import cucumber.api.java.Before;
import static org.hamcrest.MatcherAssert.assertThat;

public class CheckOutSteps extends BaseSteps {

	public CheckOutSteps() {
		super();
	}

	public CheckOutSteps(PageFactory pageFactory) {
		super(pageFactory);
	}

	
}
