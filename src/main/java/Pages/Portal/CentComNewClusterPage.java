package Pages.Portal;

import Applications.SeleniumBrowser;
import Pages.GenericPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



   public  class CentComNewClusterPage extends GenericPage {


       //clusters tab

       private static final String ClickOnClusterTab = "//div[contains(text(),'Clusters')]";
       public static final By ClickOnClusterTabBy = By.xpath(ClickOnClusterTab);
       @FindBy(how = How.XPATH, using = ClickOnClusterTab)
       public WebElement clustersTab_element;


       //click on plus sign
       //private static final String ClickOnPlusSign = "//twa-button[@icon='tw-plus']/material-button)";
       private static final String ClickOnPlusSign = "//twa-button[@icon='tw-plus']";
       public static final By ClickOnPlusSignBy = By.xpath(ClickOnPlusSign);
       @FindBy(how = How.XPATH, using = ClickOnPlusSign)
       public WebElement ClickOnPlusSign_element;


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
private static  final  String ClickOnContinue="//div[@class='pane modal visible']//twa-button[@aria-label='Continue']";
public  static  final By ContinueBy=By.xpath(ClickOnContinue);
       @FindBy(how = How.XPATH, using =ClickOnContinue )
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



       //Click on Binocular's button :

       @FindBy(how= How.XPATH,using="//twa-button[@icon='tw-binoculars']/material-button")
       public WebElement binocularsButton_element;


//Search for value in Binocular's button:
       private static final String valueToSearchXpath ="//twa-form-item[@label='Value']//input";
       public static final By valueToSearchBy = By.xpath(valueToSearchXpath);
       @FindBy(how= How.XPATH,using=valueToSearchXpath)
       public WebElement valueToSearch_element;



    //Click on checkbox next to added end point

       private static final String ClickOnEndPointCheckBox = "//twa-table-checkbox//div";
       public static final By ClickOnEndPointCheckBoxBy = By.xpath(ClickOnEndPointCheckBox);
       @FindBy(how = How.XPATH, using = ClickOnEndPointCheckBox)
       public WebElement EndPointCheckBox;







       //Assign Button

       private static final String ClickOnAssignButton = "//div[@class='pane modal visible']//twa-button[@aria-label='Assign']";
       public static final By ClickOnAssignButtonBy = By.xpath(ClickOnAssignButton);
       @FindBy(how = How.XPATH, using = ClickOnAssignButton)
       public WebElement Assign_Button;


// Click on Close button in a case if end point is already exists on the cluster

       private static final String ClickOnCloseButton = "//div[@class='pane modal visible']//twa-button[@aria-label='Close']";
       public static final By ClickOnCloseButtonBy = By.xpath(ClickOnCloseButton);
       @FindBy(how = How.XPATH, using = ClickOnCloseButton)
       public WebElement Close_Button;

       // Details button


       private static final String ClickOnDetailsButton = "//twa-table-action-details";
       public static final By ClickOnDetailsButtonBy = By.xpath(ClickOnDetailsButton);
       @FindBy(how = How.XPATH, using = ClickOnDetailsButton)
       public WebElement Details_Button;

//// End points tab

       private static final String ClickOnEndPointTab = "//div[normalize-space(text())='Endpoints']";
       public static final By ClickOnEndPointTabBy = By.xpath(ClickOnEndPointTab);
       @FindBy(how = How.XPATH, using = ClickOnEndPointTab)
       public WebElement endPointTab_element;

       //View Customer Details button


       private static final String ClickOnCustomerDetails = "//span[contains(text(),'Customer Details')]";
       public static final By ClickOnCustomerDetailsBy = By.xpath(ClickOnCustomerDetails);
       @FindBy(how = How.XPATH, using = ClickOnCustomerDetails)
       public WebElement Customer_Details;




       //View details button - after first configuration of new cluster:

       private static final String ClickOnViewDetails = "//span[contains(text(),'view details')]";
       public static final By ClickOnViewDetailsBy = By.xpath(ClickOnViewDetails);
       @FindBy(how = How.XPATH, using = ClickOnViewDetails)
       public WebElement ViewDetails;


       //Click on Action Item to open Action item dialog box.

       private static final String ClickOnActionItem = "//twa-menu[@twatooltip=\"Actions\"]";
       public static final By ClickOnActionItemBy = By.xpath(ClickOnActionItem);
       @FindBy(how = How.XPATH, using = ClickOnActionItem)
       public WebElement ActionItem;


       //Click on Remove cluster if  exists.

       private static final String ClickOnRemoveCluster = "//span[contains(text(),'Remove from Cluster')]";
       public static final By ClickOnRemoveClusterBy = By.xpath(ClickOnRemoveCluster);
       @FindBy(how = How.XPATH, using = ClickOnRemoveCluster)
       public WebElement RemoveCluster;




   }

//e