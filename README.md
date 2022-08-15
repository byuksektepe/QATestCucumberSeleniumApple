## QA Apple Automated Tests With Cucumber JVM and Maven Build
 ![Java](https://img.shields.io/badge/java-000000.svg?style=for-the-badge&logo=java&logoColor=white)
 ![JUnit](https://img.shields.io/badge/Junit5-000000?style=for-the-badge&logo=junit5&logoColor=white)
 ![Maven](https://img.shields.io/badge/Maven-000000?style=for-the-badge&logo=apachemaven&logoColor=white)
 ![Selenium](https://img.shields.io/badge/Selenium-000000?style=for-the-badge&logo=Selenium&logoColor=white)
 ![TeamCity](https://img.shields.io/badge/TeamCity-000000?style=for-the-badge&logo=TeamCity&logoColor=white)
 ![TEST-003-A](https://img.shields.io/badge/TEST%20003%20A-000000?style=for-the-badge&logo=null&logoColor=white)
<a href="https://github.com/Berkantyuks/QA-Project-Test-Classification-Mark" rel="tc-bb"><img width="79px" style="border-width: 0;" src="https://github.com/Berkantyuks/QA-Project-Test-Classification-Mark/blob/main/TCM-114x40-box/114x40-bb.png" alt="tc-bb" /></a>
<a href="https://github.com/Berkantyuks/QA-Project-Test-Classification-Mark#test-class-a" rel="tc-a"><img width="79px" style="border-width: 0;" src="https://github.com/Berkantyuks/QA-Project-Test-Classification-Mark/blob/main/TCM-114x40-light/114x40-tc-a.png" alt="tc-a" /></a>

<p>Software All-Encompassing QA Test Automation Project For Apple. Using Cucumber JVM BDD with Selenium and JUnit 5 Test Framework. TeamCity was used as CI/CD. Maven used as Runner and Builder. Automated tests are Designed for be Easy-To-Read, Easy-To-Maintain, Easy-To-Understand and Long-Use. OOP and Clean File Architecture used. Includes only smoke tests, regression, integration and ad-hoc tests will be added later. The tests will be perform 100% automation 0% manually. The tests are optimized for Chrome, Edge, Firefox and Safari browsers.</p>

The entire project is designed to be run and built with Maven. If you want to run and build with JUnit 5, you need to make some changes to the project.

<p>All Feature files located in <a href="https://github.com/Berkantyuks/QATestCucumberSeleniumApple/tree/main/src/test/resources/features">/resources/features</a></p>

<p>All Page Objects located in <a href="https://github.com/Berkantyuks/QATestCucumberSeleniumApple/tree/main/src/test/java/abstractions/pageObjects">/abstractions/pageObjects</a></p>

<p>All Step Definitions located in <a href="https://github.com/Berkantyuks/QATestCucumberSeleniumApple/tree/main/src/test/java/abstractions/stepDefinitions">/abstractions/stepDefinitions</a></p>

<p>All Utils located in <a href="https://github.com/Berkantyuks/QATestCucumberSeleniumApple/tree/main/src/test/java/abstractions/utils">/abstractions/utils</a></p>

<p>All Helpers located in <a href="https://github.com/Berkantyuks/QATestCucumberSeleniumApple/tree/main/src/test/java/abstractions/helpers">/abstractions/helpers</a></p>

### Test Environment Requirements
- TeamCity Pro 2022
- Java JDK 18
- IntelliJ IDE

### Test Runtime Requirements
- Cucumber Extension
- Cucumber+ Extension
- Gherkin Extension
- JUnit Extension
- Maven Builder

### Clone for TeamCity CI/CD
If you don't want to be Authentication, you can fork the project.

[Requires Authentication]
```
https://github.com/Berkantyuks/QATestCucumberSeleniumApple.git
```
[No Need Authentication] but you need generate own token key.
```
https://github.com/<your_username>/QATestCucumberSeleniumApple.git
```
### Test Automation WorkFlow
<img src="https://github.com/Berkantyuks/QATestCucumberSeleniumApple/blob/main/src/test/resources/workflow/images/apple-test-automation-workflow.png"/>

### Execute Tests Using Maven

Command Prompt/Power Shell (Windows OS) or Open terminal (for MAC OSX) or and navigate to the project directory type ```mvn clean test``` command to run features. With this command it will invoke the default Chrome and will execute the tests.

- To run features on specific browser use, ```mvn test "-Dbrowser=<browser_name>"``` browser_name can be one of following but make sure that browser’s driver file are present and specified in system variable. Like "chrome", "firefox", "edge" and "safari".

Note that the web drivers in this project are adjusted according to my agent browser version. For example, if you are using chrome, you should download a driver version compatible with your browser.

- To run specific feature if you want only search.feature, Run ```mvn test -Dcucumber.options="classpath:features/Search.feature"```

### Execute Tests Using TeamCity
![image](https://user-images.githubusercontent.com/61010367/182302114-fb97fe04-a0ad-4d02-b2e6-ccf534397a8d.png)

### Clean File Architecture [Last Updated: 8/12/2022]

```
Main
├─ .gitignore
├─ .idea
│  ├─ .gitignore
│  ├─ compiler.xml
│  ├─ jarRepositories.xml
│  ├─ misc.xml
│  ├─ uiDesigner.xml
│  └─ vcs.xml
├─ README.md
├─ pom.xml
└─ src
   └─ test
      ├─ java
      │  └─ abstractions
      │     ├─ RuntimeTest.java
      │     ├─ helpers
      │     │  ├─ AbstractHelper.java
      │     │  ├─ HelperInterface.java
      │     │  ├─ NavigateHelper.java
      │     │  └─ ProductHelper.java
      │     ├─ pageObjects
      │     │  ├─ Bag.java
      │     │  ├─ Footer.java
      │     │  ├─ Mac
      │     │  │  ├─ BuyMac
      │     │  │  │  ├─ BuyMac.java
      │     │  │  │  └─ CustomizeMac.java
      │     │  │  ├─ IMac
      │     │  │  │  ├─ IMac.java
      │     │  │  │  └─ Models
      │     │  │  │     └─ IMAC_24.java
      │     │  │  ├─ Mac.java
      │     │  │  ├─ MacInterface.java
      │     │  │  ├─ MacMini
      │     │  │  │  ├─ MacMini.java
      │     │  │  │  └─ Models
      │     │  │  │     └─ MacMini_M1.java
      │     │  │  ├─ MacPro
      │     │  │  │  └─ MacPro.java
      │     │  │  ├─ MacStudio
      │     │  │  │  ├─ MacStudio.java
      │     │  │  │  └─ Models
      │     │  │  │     └─ MacStudio_M1.java
      │     │  │  ├─ MacbookAir
      │     │  │  │  ├─ MBA.java
      │     │  │  │  └─ Models
      │     │  │  │     ├─ MBA_M1.java
      │     │  │  │     └─ MBA_M2.java
      │     │  │  └─ MacbookPro
      │     │  │     ├─ MBP.java
      │     │  │     └─ Models
      │     │  │        ├─ MBP_13.java
      │     │  │        ├─ MBP_14.java
      │     │  │        └─ MBP_16.java
      │     │  ├─ Navbar.java
      │     │  └─ SearchResults.java
      │     ├─ stepDefinitions
      │     │  ├─ Hook.java
      │     │  ├─ ProductStepDefinitions.java
      │     │  ├─ SearchStepDefinitions.java
      │     │  └─ StepDefinitionsInterface.java
      │     └─ utils
      │        ├─ AssertionMethods.java
      │        ├─ ClickElementMethods.java
      │        ├─ Constants
      │        │  ├─ Global.java
      │        │  ├─ ModelConfigurations.java
      │        │  └─ ProductFamily.java
      │        ├─ DriverManager.java
      │        ├─ DriverWaits.java
      │        ├─ Exceptions
      │        │  ├─ ConfigurationNotMatchByDefinedException.java
      │        │  ├─ MacFamilyNotMatchByGivenException.java
      │        │  ├─ ModelNotMatchByGivenException.java
      │        │  ├─ NavbarItemNotMatchByGivenException.java
      │        │  ├─ StringNotContainsByGivenException.java
      │        │  └─ StringNotMatchByGivenException.java
      │        ├─ InputMethods.java
      │        ├─ Locators.java
      │        ├─ NavigateMethods.java
      │        ├─ SelectElementByType.java
      │        ├─ Transformer.java
      │        ├─ UtilsInterface.java
      │        └─ expectedConditions
      │           ├─ ClickabilityOfElement.java
      │           ├─ ClickabilityOfElementByLocator.java
      │           ├─ InvisibilityOfElement.java
      │           ├─ InvisibilityOfElementByLocator.java
      │           ├─ VisibilityOfElement.java
      │           └─ VisibilityOfElementByLocator.java
      └─ resources
         ├─ drivers
         │  ├─ chromedriver.exe
         │  ├─ geckodriver.exe
         │  └─ msedgedriver.exe
         └─ features
            ├─ Product.feature
            └─ Search.feature
```


