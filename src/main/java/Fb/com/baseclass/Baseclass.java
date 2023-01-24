package Fb.com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;

	public static void browserlaunch(String value) {
//		if (value.equalsignorecase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "D:\\Ganesh_learning_java1\\Cucumber_concept\\Driver\\chromedriver.exe");
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//
//			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		} else if (value.equalsignorecase("firefox")) {
//			System.setProperty("webdriver.firefox.driver", "");
//			driver.manage().window().maximize();
//
//			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		} else if (value.equalsignorecase("edge")) {
//			WebDriverManager.edgedriver().setup();
//			driver.manage().window().maximize();
//
//			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		}
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println("invalid url:" + e.getMessage());
		}

	}

	public static void maximizeSize(int a, int b) {
		Dimension d = new Dimension(a, b);
		driver.manage().window().setSize(d);
	}

	public static void maximizePosition(int a, int b) {
		Point p = new Point(a, b);
		driver.manage().window().setPosition(p);
	}

	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {

			System.out.println("element not clicked:" + e.getMessage());
		}
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void navigate(String url) {
		driver.navigate().to(url);

	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigatebackward() {
		driver.navigate().back();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	public static String gettext(WebElement element) {
		String text = null;
		try {
			text = element.getText();
		} catch (Exception e) {
			System.out.println("gettext Error" + e.getMessage());
		}
		return text;
	}

	public static void getattribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}

	public static void getTitle() {
		driver.getTitle();
	}

	public static void getcurrenturl() {
		driver.getCurrentUrl();
	}

	public static void elementsendkeys(WebElement element, String string) {
		try {
			element.sendKeys(string);
		} catch (Exception e) {

			System.out.println("elementsendkeys not passed" + e.getMessage());
		}
	}

	public static void takesscreenshot(String image) throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("D:\\Ganesh_learning_java1\\Maven_Project\\Display//+image+.png");
			FileUtils.copyFile(source, destination);
		} catch (WebDriverException e) {
			System.out.println("screenshots not taken:" + e.getMessage());
		}

	}

	public static void scroll(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;// narrowing
		if (value.equalsIgnoreCase("elementClick")) {
			js.executeScript("arguments[0].click();", element);
		} else if (value.equalsIgnoreCase("elementView")) {
			js.executeScript("arguments[0].scrollIntoView();", element);
		} else if (value.equalsIgnoreCase("scrollUp")) {
			js.executeScript("window.scrollBy(0,0)");
		} else if (value.equalsIgnoreCase("scrollDown")) {
			js.executeScript("window.scrollBy(0,1000)");
		}
	}

	public static void windowhandles(String Exp_Title) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String id : windowHandles) {
			String Act_title = driver.switchTo().window(id).getTitle();
			if (Act_title.equalsIgnoreCase(Exp_Title)) {
				break;
			}
		}

	}

	public static void windowhandleslist(int a) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li = new ArrayList<String>(windowHandles);
		driver.switchTo().window(li.get(a));
	}

	public static void thread(int a) throws InterruptedException {
		Thread.sleep(a);
	}

	public static void threadsleepforseconds(int sec) throws InterruptedException {
		TimeUnit.SECONDS.sleep(sec);
	}

	public static void threadsleepforminutes(int sec) throws InterruptedException {
		TimeUnit.MINUTES.sleep(sec);
	}

	public static void dropdown(WebElement element, String option, String value) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("Value")) {
			s.selectByValue(value);

		} else if (option.equalsIgnoreCase("Text")) {
			s.selectByVisibleText(value);
		} else if (option.equalsIgnoreCase("Index")) {
			int a = Integer.parseInt(value);
			s.selectByIndex(a);
		}

	}

	public static void selectmultipleoptions(WebElement element) {
		Select s = new Select(element);
		s.isMultiple();
	}

	public static void selectmultiple(WebElement element) {
		Select s = new Select(element);
		s.getAllSelectedOptions();
	}

	public static void deselectedSingle(WebElement element, String value, int a) {
		Select s = new Select(element);
		if (value.equalsIgnoreCase("value")) {
			s.deselectByValue(value);
		} else if (value.equalsIgnoreCase("Text")) {
			s.deselectByVisibleText(value);
		} else if (value.equalsIgnoreCase("Index")) {
			s.deselectByIndex(a);
		}

	}

	public static void firstoption(WebElement element) {
		Select s = new Select(element);
		s.getFirstSelectedOption();
	}

	public static boolean is_displayed(WebElement element) {
		boolean displayed = false;
		try {
			displayed = element.isDisplayed();
			System.out.println(displayed);

		} catch (Exception e) {
			System.out.println("element is displayed:" + e.getMessage());
		}
		return displayed;
	}

	public static boolean is_enabled(WebElement element) {
		boolean enabled = false;
		try {
			element.isEnabled();

		} catch (Exception e) {
			System.out.println("element is enabled:" + e.getMessage());
		}
		return enabled;
	}

	public static void is_selected(WebElement element) {
		element.isSelected();
	}

	public static void simpleAlert(String value) {
		if (value.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (value.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
	}

	public static void promptAlert(String value) {
		driver.switchTo().alert().sendKeys(value);
	}

	public static void singleframe(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void multipleframe(int a) {
		driver.switchTo().frame(a);
	}

	public static void framebyid(String id) {
		driver.switchTo().frame(id);
	}

	public static void defaultcontent() {
		driver.switchTo().defaultContent();
	}

	public static void actions(WebElement element, String value) {
		Actions mouse = new Actions(driver);
		if (value.equalsIgnoreCase("click")) {
			mouse.click(element).build().perform();
		} else if (value.equalsIgnoreCase("rightclick")) {
			mouse.contextClick(element).build().perform();
		} else if (value.equalsIgnoreCase("doubleclick")) {
			mouse.doubleClick().build().perform();
		} else if (value.equalsIgnoreCase("movetoelement")) {
			mouse.moveToElement(element).build().perform();
		} else if (value.equalsIgnoreCase("draganddrop")) {
			mouse.dragAndDrop(element, element).build().perform();
		} else if (value.equalsIgnoreCase("clickandhold")) {
			mouse.clickAndHold(element).build().perform();
		}
	}

	public static void keyboard(WebElement element, String value) throws AWTException {
		Robot r = new Robot();
		if (value.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if (value.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		} else if (value.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
	}

}
