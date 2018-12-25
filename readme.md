


# create package
## src/test/java
* testcases
* utilities
* base
* rough - draft
* listeners
*
 
 ## test/resource - create some folder
 * excel/testdata.xsl
 * runner
 * logs/Application.log, Selenium.log
 * properties/OR.properties, Config.properties
 * executables - browser selenium drivers
 
 
 ## dependencies
 
 * selenium-java 2.5
 * extentreports 2.41.2
 * reportng
 * mysql-connecter-java
 * poi
 * poi-ooxml
 * dom4j
 * xmlbeans
 * poi-ooxml-schemas
 
 * testng
 *maven-surefire-plugin 
 
 
 ## creating base class
 * TestBase - init : WebDriver, Properties, Logs, ExtentReports, DB, Excel, Mail
 * setUp() - @BeforeSuite
 * tearDown() - @AfterSuite
 
 