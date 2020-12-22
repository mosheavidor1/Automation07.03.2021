package Pages.Portal;

import Pages.GenericPage;
import WebElements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



   public class CentComNewClusterPage extends GenericPage {


        //clusters tab
        @FindBy(how = How.XPATH, using = "//div[contains(text(),'Clusters')]")
        public WebElement clustersTab_element;

        //click on plus sign
        @FindBy(how = How.XPATH, using = "//twa-button[@icon='tw-plus']/material-button")
        public WebElement clustersPlusSign_element;


        //New cluster name
        private static final String setClusterName = "//twa-form-item[@label='Alias']//input ";
        public static final By setClusterNameBy = By.xpath(setClusterName);
        @FindBy(how = How.XPATH, using = setClusterName)
        public WebElement setClusterName_element;


        //ClusterOKButton:


        private static final String ClickTheOk = "//div[@class='pane modal visible']//twa-button[@aria-label='OK']";

        public static final By ClickTheOkBy = By.xpath(ClickTheOk);
        @FindBy(how = How.XPATH, using = ClickTheOk)
        public WebElement ClusterOKButton_element;



        //Locate the new created cluster
        private final static String ClusterNameXpath = "//twa-table-row//div[normalize-space(text())='XXX']";

        public  WebElement  GetClusterName(String ClusterName) {

            String xpath = ClusterNameXpath.replace("XXX", ClusterName);

            return driver.findElement(By.xpath(xpath));
        }

       public By GetClusterNameBy(String ClusterName){

           String xpath = ClusterNameXpath.replace("XXX", ClusterName);
           return By.xpath(xpath);

       }



   }






