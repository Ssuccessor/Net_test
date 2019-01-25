import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

abstract public class ParentPage   {
        WebDriver webDriver;
        ActionsWithElements actionsWithElements;



        public ParentPage (WebDriver webDriver) {
            PageFactory.initElements(webDriver,this);
            this.webDriver = webDriver;
            actionsWithElements = new ActionsWithElements(webDriver);




        }
    }
