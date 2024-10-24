package prac3_package;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class Test {

	static String driverpath = "D:\\SahilGupta\\tycs\\STQA\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe";

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", driverpath);
		FirefoxProfile fp = new FirefoxProfile();
		fp.setPreference(FirefoxProfile.PORT_PREFERENCE, "7055");
		FirefoxOptions opt = new FirefoxOptions();
		opt.setProfile(fp);
		WebDriver driver = new FirefoxDriver(opt);
		driver.get("file:///D:/SahilGupta/tycs/STQA/gcd.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("n1")).sendKeys("12");
		driver.findElement(By.name("n2")).sendKeys("8");
		driver.findElement(By.name("btn")).click();
		String res = driver.findElement(By.name("res")).getAttribute("value");
		System.out.println("GCD: " + res);
	}
}
