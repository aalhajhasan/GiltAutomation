package aspire.com.pages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jo.aspire.automation.logger.EnvirommentManager;

import org.apache.commons.lang.ArrayUtils;
import org.apache.tools.ant.property.GetProperty;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.EvictingQueue;

import aspire.com.steps.Selectors;

public class TopNavBarPage extends StepsPage {

	public TopNavBarPage(WebDriverProvider driverProvider) {
		super(driverProvider);
		// TODO Auto-generated constructor stub
	}



}
