package com.mphasis.testing.TestNgDemo.testNg;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class priorityTestDemo {
  @Test(priority=1,enabled=false)
  
  public void f() {
	  assertEquals(2,2);
	  
  }
  @Test(priority=2)
  public void a() {
	  assertEquals(2,2);
  }
}
