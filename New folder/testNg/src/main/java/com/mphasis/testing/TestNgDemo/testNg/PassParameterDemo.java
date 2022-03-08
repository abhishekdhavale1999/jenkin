package com.mphasis.testing.TestNgDemo.testNg;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassParameterDemo {
  @Test
  @Parameters({"v1","v2"})
  
  public void add(int v1,int v2) {
	  assertEquals(v1+v2,4);
		 
	  
  }
}
