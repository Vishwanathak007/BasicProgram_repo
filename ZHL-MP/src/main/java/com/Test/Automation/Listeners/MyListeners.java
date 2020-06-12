package com.Test.Automation.Listeners;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import com.Test.Automation.TestBase.Base_Class;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class MyListeners extends Base_Class implements ITestListener, IRetryAnalyzer, IAnnotationTransformer
{
	int Retry_Limit = 2;
	int Counter = 0;
	public MyListeners() throws Exception 
	{
		super();
	}

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) 
	{
		annotation.setRetryAnalyzer(com.Test.Automation.Listeners.MyListeners.class);
	}
	
	@Override
	public boolean retry(ITestResult result) 
	{
		if(Counter < Retry_Limit)
		{
			Counter++;
			return true;
		}
		return false;
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		try 
		{
			Object current_browser_instance = result.getInstance();
			driver = ((Base_Class)current_browser_instance).driver;
			String Path = Capture_Screenshot(driver,"Passed_Test_Cases", result.getName());
			test = reports.createTest(result.getName());
			logger.info("<<<<<<<<<<<<<<----------Integrating the image to Reports--------------->>>>>>>>>>>");
			test.pass(result.getName(), MediaEntityBuilder.createScreenCaptureFromPath(Path).build());
			logger.info("<<<<<<<<<<<<<<----------Making the text color in report to Green color--------------->>>>>>>>>>>");
			test.pass(MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		try 
		{
			Object current_browser_instance = result.getInstance();
			driver = ((Base_Class)current_browser_instance).driver;
			String Path = Capture_Screenshot(driver,"Failed_Test_Cases", result.getName());
			test = reports.createTest(result.getName());
			logger.info("<<<<<<<<<<<<<<----------Integrating the image to Reports--------------->>>>>>>>>>>");
			test.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(Path).build());
			logger.info("<<<<<<<<<<<<<<----------Making the text color in report to RED color--------------->>>>>>>>>>>");
			test.fail(MarkupHelper.createLabel(result.getThrowable().getMessage(), ExtentColor.RED));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}	
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		try 
		{
			Object current_browser_instance = result.getInstance();
			driver = ((Base_Class)current_browser_instance).driver;
			String Path = Capture_Screenshot(driver,"Skiped_Test_Cases", result.getName());
			test = reports.createTest(result.getName());
			logger.info("<<<<<<<<<<<<<<----------Integrating the image to Reports--------------->>>>>>>>>>>");
			test.skip(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(Path).build());
			logger.info("<<<<<<<<<<<<<<----------Making the text color in report to YELLOW color--------------->>>>>>>>>>>");
			test.skip(MarkupHelper.createLabel(result.getThrowable().getMessage(), ExtentColor.YELLOW));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
