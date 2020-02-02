package assignment_framework.project01;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.project01.GenericLib.BaseClass;
import com.project01.ObjectRepo.HomePage;

public class PostMsgStatusTest extends BaseClass {
	
	@Test
	public void postStatus() throws Throwable {
		
	String msg=flib.getExcelData("Sheet1", 1, 1);
	HomePage hp=PageFactory.initElements(driver, HomePage.class);
	hp.enterMsg(msg);
		
	}

}
