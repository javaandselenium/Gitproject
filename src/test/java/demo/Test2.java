package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void sample() {
		Reporter.log("hello api",true);
		Reporter.log("hello java",true);
		Reporter.log("hello python",true);
	}

}
