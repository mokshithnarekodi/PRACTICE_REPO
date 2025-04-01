package pac1;

import org.testng.annotations.Test;

public class prac1Test {
	@Test
	public void test1() {
		String url=System.getProperty("url");
		String browser=System.getProperty("browser", "chrome");
		String username=System.getProperty("username");
		String password=System.getProperty("password");
		
		System.out.println(url);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		System.out.println("test3");
	}
	

}
