package testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pom.GoogleLinPo;
import library.BaseTest;

public class TestLancApp extends BaseTest {
@Test(priority=2)
public void laocnFacebook()throws Exception {
	SoftAssert s=new SoftAssert();
	try {
		GoogleLinPo po=new GoogleLinPo(driver);
		po.searchTextBox().sendKeys("facebook.com");
		po.serchBtn().click();
		String aTitle = driver.getTitle();
		String eTitle = "facebook.com/device - Google Search";
		s.assertTrue(eTitle.equals(aTitle));
	} catch (Exception e) {
		e.printStackTrace();
		Reporter.log("generate Exception", true);
		s.fail();
	}
	Thread.sleep(3000);
}
@Test(priority=1)
public void laonchTwittet()throws Exception {
	SoftAssert s=new SoftAssert();
	try {
		GoogleLinPo po=new GoogleLinPo(driver);
		po.searchTextBox().sendKeys("Twitter.com");
		po.serchBtn().click();
		String aTitle = driver.getTitle();
		System.out.println(aTitle);
		String eTitle = "Twitter.com - Google Search";
		s.assertTrue(eTitle.equals(aTitle));
	} catch (Exception e) {
		e.printStackTrace();
		Reporter.log("generate Exception", true);
		s.fail();
	}
	Thread.sleep(3000);
}
@Test(priority=3)
public void launchInstagm()throws Exception {
	SoftAssert s=new SoftAssert();
	try {
		GoogleLinPo po=new GoogleLinPo(driver);
		po.searchTextBox().sendKeys("Instagarm.com");
		po.serchBtn().click();
		String aTitle = driver.getTitle();
		System.out.println(aTitle);
		String eTitle = "instagram download - Google Search";
		//SoftAssert s=new SoftAssert();
		s.assertTrue(eTitle.equals(aTitle));
	} catch (Exception e) {
		e.printStackTrace();
		Reporter.log("generate Exception", true);
		s.fail();
	}
	Thread.sleep(3000);	
}
}
