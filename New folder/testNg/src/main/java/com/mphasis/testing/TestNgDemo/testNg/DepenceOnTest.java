package com.mphasis.testing.TestNgDemo.testNg;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DepenceOnTest {
  @Test
  public void  openBrowser() {
	  System.out.println("open the browser");
	  assertTrue(true);
  }
  @Test(dependsOnMethods= {"openBrowser"})
  public void siginIn()
  {
	  System.out.println("sign in");
  }
}
