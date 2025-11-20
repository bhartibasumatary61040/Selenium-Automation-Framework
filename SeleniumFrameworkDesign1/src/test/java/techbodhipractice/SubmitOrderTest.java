package techbodhipractice;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import techbodhipractice.pageobject.CartPage;
import techbodhipractice.pageobject.CheckoutPage;
import techbodhipractice.pageobject.ConfirmationPage;
import techbodhipractice.pageobject.LandingPage;
import techbodhipractice.pageobject.ProductCatalouge;


public class SubmitOrderTest {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub
		 String productName = "ZARA COAT 3";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
		LandingPage landingPage = new LandingPage(driver);
		landingPage.goTo();
		ProductCatalouge productCatalouge= landingPage.loginApplication("bharatibasumatary61040@gmail.com", "Tary@61040");
		List<WebElement> products = productCatalouge.getProductList();
		
		productCatalouge.addProductToCart(productName);
	CartPage cartPage = productCatalouge.goToCartPage();
		
		
		Boolean match = cartPage.VerifyProductDisplay(productName);
        Assert.assertTrue(match);
       CheckoutPage checkoutPage =  cartPage.goToCheckout();
       
       checkoutPage.selectCountry("india");
       
       ConfirmationPage confirmationPage =  checkoutPage.submitOrder();
     
     String confirmMessage = confirmationPage.getConfirmationMessage();
     
     Assert.assertTrue(confirmMessage.equalsIgnoreCase("Thankyou for the order."));
     driver.close();
	}
	}


