package runThrghTestNG;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;
import java.util.logging.Level;
import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

@Listeners({ runThrghTestNG.TestNGCustomReport.class })
public class BaseClass {

	public static WebDriver driver;
	public static String environment;
	public static String browser;
	public static String test;
	public static String url;
	public static String os;
	public static String currentURL;
	public static File directory = new File(".");
	// public IsPresent ip = new IsPresent();
	public static Map<String, Integer> browsers = null;
	public static Map<String, Integer> oss = null;
	public static Properties CONFIGOBJ = null;
	public static Properties CONFIGPROP = null;

	public void initMaps() {
		if (this.browsers == null) {
			this.browsers = new HashMap<String, Integer>();
			this.browsers.put("chrome", 1);
			this.browsers.put("ie", 2);
			this.browsers.put("ff", 3);
			this.browsers.put("htmlunit", 4);

		}

		if (this.oss == null) {
			this.oss = new HashMap<String, Integer>();
			this.oss.put("linux32", 1);
			this.oss.put("linux64", 1);
			this.oss.put("mac", 1);
			this.oss.put("win", 2);

		}
	}

	/**
	 * @param url
	 * @param program
	 * @param environment
	 * @param browser
	 * @param test
	 * @throws Exception
	 */
	@BeforeTest(groups = { "prerequisite" })
	@Parameters({ "url", "environment", "browser", "test" })
	public void setUp(String url, String environment, String browser,
			String test) throws Exception {

		this.environment = environment;
		this.browser = browser;
		this.test = test;
		this.url = url;
		// this.os = os;
		String os = null;

		if (SystemUtils.IS_OS_WINDOWS)
			os = "win";

		if (SystemUtils.IS_OS_MAC)
			os = "mac";

		if (SystemUtils.IS_OS_LINUX) {

			if (System.getProperty("sun.arch.data.model")
					.equalsIgnoreCase("32")) {
				os = "linux32";

			} else {
				if (System.getProperty("sun.arch.data.model").equalsIgnoreCase(
						"64"))
					os = "linux64";

			}
		}

		System.out.println("Detecting your OS, please wait...");
		System.out.println("---------------------------------");
		System.out.println("OS:" + " " + System.getProperty("os.name") + "||"
				+ System.getProperty("sun.arch.data.model") + " " + "bits");

		if (os == "linux32" || os == "linux64") {
			System.out.println("browser: " + "Chromium");
		} else {
			System.out.println("browser: " + this.browser);
		}

		System.out.println("---------------------------------");

		System.out.println("url: " + url);
		// System.out.println("environment: " + this.environment);

		System.out.println("test: " + this.test);

		this.initMaps();
		int browserId = this.browsers.get(browser);

		int osId = this.oss.get(os);

		switch (browserId) {
		case 1:

		{
			String chromDrvrPath;
			chromDrvrPath = directory.getCanonicalPath() + File.separator
					+ "lib" + File.separator;

			os: switch (osId) {
			case 1:
				System.out.println("Initializing Chrome on: "
						+ System.getProperty("os.name"));

				System.setProperty("webdriver.chrome.driver", chromDrvrPath
						+ "chromedriver_" + os + File.separator
						+ "chromedriver");
				break os;
			case 2:
				System.out.println("Initializing Chrome on: "
						+ System.getProperty("os.name"));
				System.setProperty("webdriver.chrome.driver", chromDrvrPath
						+ "chromedriver_" + os + File.separator
						+ "chromedriver.exe");
				break os;
			default:
				// Utility.illegalStateException("Invalid OS paramter, expected values 'linux32||linux64||mac||win'");
			}

			// ChromeOptions feature does not work on 'MAC' OS
			if (os.equalsIgnoreCase("mac")) {
				System.out.println("Opening chrome on MAC");
				driver = new ChromeDriver();
				((JavascriptExecutor) driver)
						.executeScript("window.open('','chromeBrowser','width=1280,height=800,top=0,left=0')");
				driver.close();
				driver.switchTo().window("chromeBrowser");
			} else {
				System.out.println("Opening chrome");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized");
				options.addArguments("--disable-extensions");
				driver = new ChromeDriver(options);
			}
			Reporter.log("Browser: " + browser);
			Reporter.log("OS: " + os);
			break;

		}
		case 2:

		{
			String IEDrvrPath;
			IEDrvrPath = directory.getCanonicalPath() + File.separator + "lib"
					+ File.separator;

			os: switch (osId) {
			case 1:
				System.out.println("Initializing IE on: "
						+ System.getProperty("os.name"));
				System.setProperty("webdriver.ie.driver", IEDrvrPath
						+ "IEDriverServer_" + os + File.separator
						+ "IEDriverServer");
				break os;
			case 2:
				System.out.println("initializing IE on: "
						+ System.getProperty("os.name"));
				System.setProperty("webdriver.ie.driver", IEDrvrPath
						+ "IEDriverServer_" + os + File.separator
						+ "IEDriverServer.exe");
				break os;
			default:
				// Utility.illegalStateException("Invalid OS paramter, expected values 'linux32||linux64||mac||win'");
			}
			if (os.equalsIgnoreCase("mac")) {
				System.out.println("IE not supported on MAC");
			} else {
				System.out.println("Opening IE on windows");
				DesiredCapabilities caps = DesiredCapabilities
						.internetExplorer();
				caps.setCapability("nativeEvents", false);
				driver = new InternetExplorerDriver(caps);
				driver.manage().window().maximize();
			}
			break;
		}

		case 3: {
			os: switch (osId) {
			case 1:
				System.out.println("Initializing Firefox on: "
						+ System.getProperty("os.name"));
				break os;
			case 2:
				System.out.println("Initializing Firefox on: "
						+ System.getProperty("os.name"));
				break os;
			default:
				// Utility.illegalStateException("Invalid OS paramter, expected values 'linux32||linux64||mac||win'");
			}
			System.out.println("Opening firefox");
			driver = new FirefoxDriver();
			Reporter.log("Browser: firefox");
			driver.manage().window().maximize();

			break;
		}

		case 4: {
			os: switch (osId) {
			case 1:
				System.out.println("Initializing HTMLUnit on: "
						+ System.getProperty("os.name"));
				break os;
			case 2:
				System.out.println("Initializing HTMLUnit on: "
						+ System.getProperty("os.name"));
				break os;
			default:
				// Utility.illegalStateException("Invalid OS paramter, expected values 'linux32||linux64||mac||win'");
			}
			System.out.println("Opening HTMLUnit...");
			driver = new HtmlUnitDriver();
                      
                        java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(Level.OFF); 
			Reporter.log("Browser: HTMLUnit");
			driver.manage().window().maximize();

			break;
		}

		default: {
			System.out.println("Bad choice of Browser-OS comatibility");
		}

		}

		driver.get(this.url);
	}

	/**
	 * The annotated method will be run after all the test methods belonging to
	 * the classes inside the <test> tag have run.
	 * 
	 * @throws Exception
	 */
	@BeforeTest
	public void initObjects() {
		if (CONFIGOBJ == null) {

			CONFIGOBJ = new Properties();
			try {
				FileInputStream fs = new FileInputStream(
						System.getProperty("user.dir")
								+ "//src//Configuration//object.properties");
				CONFIGOBJ.load(fs);

			} catch (Exception e) {
			}
		}
	}

	@BeforeTest
	public void initConfigurations() {

		if (CONFIGPROP == null) {

			CONFIGPROP = new Properties();
			try {
				FileInputStream fs = new FileInputStream(
						System.getProperty("user.dir")
								+ "//src//Configuration//config.properties");
				CONFIGPROP.load(fs);

			} catch (Exception e) {
			}
		}
	}

	@AfterTest(alwaysRun = true, groups = { "prerequisite" })
	public void tearDown() throws Exception {
		driver.quit();
	}
}
