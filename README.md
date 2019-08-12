Readme version 1.0

1. 


The key for this project is to show the creator's skill in creating a test automation framework, identifying core features of the tested application and writing tests for it.

2.

General info

This project was designed to test the core features of twitter.com using automated tests.

Included technologies

Java SE Development Kit - version: 12.0.2 
(https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html)
Java SE Runtime Environment - version: 8u221 
(https://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html)
IntelliJ IDEA Community Edition for Windows - version: 2019.2 
(https://www.jetbrains.com/idea/download/#section=windows)

Technology

The project was created with Java and Selenium framework with Maven build process, test is run by TestNG framework.

Java programming language(described above) - version used in project: 1.8
Selenium test automation framwork - version: 4.0.0-alpha-2
(https://search.maven.org/classic/#artifactdetails%7Corg.seleniumhq.selenium%7Cselenium-java%7C4.0.0-alpha-2%7Cjar)
ChromeDriver - version: 76.0.3809.68
(https://chromedriver.chromium.org/)
Apache Maven - version: 3.6.1 
(https://maven.apache.org/download.cgi)
TestNG framework - version: 7.0.0-beta3
(https://testng.org/doc/)


Getting started

To run Project, IDE is needed to open the project. Link to preferred IDE is provided above (IntelliJ IDEA IDE). 
After opening an IDE select File and then Open (file or Project) and select Project files from its destination.
Next step is to provide Chromedriver path. After opening a Project navigate to twitter-selenium\src\test\java\com.twitter\tests\BaseSeleniumTests.java. In this file, there's class "BaseSeleniumTests" and a method "setUp". Inside this method, there's a String called "driverPath". Local ChromeDriver path needs to be copied there in between quotation marks (" ").
Example for Windows: "C:\\Users\\micha\\IdeaProjects\\Selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe"
No other frameworks are necessery to run Project, they're stored in POM.xml file inside the project.

Testing procedures

What is tested:

There are 7 tests checking the core features of twitter.com:
"twitterLoginTest"
The point of this test is to check whether the site is available and the project has been set up correctly.
It's logging the user, checking whether the site is set to Home Page and logs out.
"sendTweetPrimary"
This test checks whether it is possible to send a tweet via the Primary Column section of the site.
"sendTweetSidebar"
This test checks whether it is possible to send a tweet via "Add Tweet" button in Sidebar of a site.
"deleteTweetFromPrimaryColumn"
This test checks whether it is possible to delete a Tweet on Primary Column in Home Page.
"deleteTweetFromProfileSite"
This test checks whether it is possible to delete a Tweet from Profile site.
"followFromSearchBoxTest"
This test checks whether it is possible to follow someone on Twitter using the main search bar.
"unfollowFromSearchBoxTest"
This test checks whether it is possible to Unfollow someone.

How to run tests:
Tests can be run via terminal using "mvn test" command or manually running them from their class files.

Access to project

Project is stored in GitHub.

Acknowledgements

Kudos for:
- Bartek from Tester Automatyczny profile in Udemy for his course.
- seleniumseasy.com for answering some of my questions
- NetGuru for this awesome article: https://www.netguru.com/blog/how-to-write-a-perfect-readme
