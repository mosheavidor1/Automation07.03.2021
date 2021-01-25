package Pages.Portal;

import Applications.SeleniumBrowser;
import Pages.GenericPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



   public  class CentComNewClusterPage extends GenericPage {


       //clusters tab
       @FindBy(how = How.XPATH, using = "//div[contains(text(),'Clusters')]")
       public WebElement clustersTab_element;

       //click on plus sign
       @FindBy(how = How.XPATH, using = "//twa-button[@icon='tw-plus']/material-button")
       //@FindBy(how = How.XPATH, using = "//twa-button[@tooltip='Open Configuration']/material-button")
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


//Click on configuration Gear:

       private static final String ClickOnConfGear = "//twa-button[@tooltip='Open Configuration']/material-button";

       public static final By ClickTheGearBy = By.xpath(ClickOnConfGear);
       @FindBy(how = How.XPATH, using = ClickOnConfGear)
       public WebElement ClusterGearButton;


       //Click on Assign new cluster :

       private static final String ClickOnAssign = "//twa-button[@tooltip='Assign Endpoints']/material-button";

       public static final By ClickTheAssignBy = By.xpath(ClickOnAssign);
       @FindBy(how = How.XPATH, using = ClickOnAssign)
       public WebElement AssignEPToClusterButton;


       //Click on Publish

       private static final String publishXpath = "//twa-button[@aria-label='Publish']";
       public static final By publishBy = By.xpath(publishXpath);
       @FindBy(how = How.XPATH, using = publishXpath)
       public WebElement publishButton_element;

       //Click on Continue

       @FindBy(how = How.XPATH, using = "//div[@class='pane modal visible']//twa-button[@aria-label='Continue']")
       public WebElement continueButton_element;


       //Locate the new created cluster
       private final static String ClusterNameXpath = "//twa-table-row//div[normalize-space(text())='XXX']";

       public WebElement GetClusterName(String ClusterName) {

           String xpath = ClusterNameXpath.replace("XXX", ClusterName);

           return driver.findElement(By.xpath(xpath));
       }

       public By GetClusterNameBy(String ClusterName) {

           String xpath = ClusterNameXpath.replace("XXX", ClusterName);
           return By.xpath(xpath);

       }

       //Choose end point to add to cluster

       private static final String rowXpath = "//twa-table-row[not(contains(@class,'hidden'))]";
       public static final By rowBy = By.xpath(rowXpath);
       private static final String hostNameRowXpath = rowXpath + "//div[normalize-space(text())='XXX']";

       public static By GetHostNameRowBy(String hostName) {
           String xpath = hostNameRowXpath.replace("XXX", hostName);
           By host = By.xpath(xpath);
           return host;
       }

       public static WebElement GetHostNameRowWebElement(String hostName) {
           WebElement epRow = SeleniumBrowser.GetDriver().findElement(GetHostNameRowBy(hostName));
           return epRow;
       }


    //Click on checkbox next to added end point
       @FindBy(how = How.XPATH, using = "//*[@id=\"default-acx-overlay-container\"]/div[52]/material-dialog/focus-trap/div[2]/div/main/div/div/twa-table/div[3]/twa-table-row[4]/div[1]/twa-table-checkbox/div/span[1]")
       public WebElement EndPointCheckBox;

       //Assign Button
       @FindBy(how = How.XPATH, using = "//div[@class='pane modal visible']//twa-button[@aria-label='Assign']")
       public WebElement Assign_Button;


// Click on Close button in a case if end point is already exists on the cluster
       @FindBy(how = How.XPATH, using = "//div[@class='pane modal visible']//twa-button[@aria-label='Close']")
       public WebElement Close_Button;

       // Details button

       @FindBy(how = How.XPATH, using = "//twa-table-action-details")
       public WebElement Details_Button;

//// End points tab
       @FindBy(how= How.XPATH,using="//div[normalize-space(text())='Endpoints']")
       public WebElement endPointTab_element;

       //View Customer Details button

       @FindBy(how= How.XPATH,using="//span[contains(text(),'Customer Details')]")
       public WebElement Customer_Details;

       //View details button - after first configuration of new cluster:

       @FindBy(how= How.XPATH,using="//span[contains(text(),'view details')]")
       public WebElement ViewDetails;







   }

