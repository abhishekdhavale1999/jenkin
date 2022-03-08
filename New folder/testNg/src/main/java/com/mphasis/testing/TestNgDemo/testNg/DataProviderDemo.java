package com.mphasis.testing.TestNgDemo.testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class DataProviderDemo {
  @Test(dataProvider="credentials")
  @Parameters({"v1","v2"})
  public void validateLogin(String username,String password) {
	  System.out.println(username+" "+password);
	  
  }
  @DataProvider(name="credentials")
  
  public Object[] [] credentialprovider (){
	  return new Object[] []{
		  
		  {"name1","password1"},
		  {"name2","password2"},
		  {"name3","password3"},
		  {"name4","password4"}
		  
  };
  }
}
