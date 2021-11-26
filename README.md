A Visual Studio Code Project prepared for some TDD fun


This was set up as described at https://wiki.wdf.sap.corp/wiki/display/prodandtech/TDD+and+Pair+Programming+Workshop

To run tests:
- mvn test, or 
- java -jar junit-platform-console-standalone-1.8.0-M1.jar -cp target/test-classes -cp target/classes --scan-classpath

To see Test coverage:
- Click "Watch" in Visual Studio Code's Bottom blue bar, to see test coverage gutter marks, or 
- see target/site/jacoco/index.html 

# Test Driven Development Practice..

Test Driven Development claims to : 
* **Reduce Hacking** & going down **Rabbit Holes**
* Give Clear guidelines for **"What should I do next"**
* Give Clear **status report for the Team**
* Reducte **debug time**
* Give very high **test coverage** ~90%
* Give Complete, reliable, feature/API-level **documentation**
* Give Improved decoupled testable **design**
* Give Code that is always **working a minute ago**
* Allow **fearless refactoring** of code to **avoid code rot**

In short it is important stuff, that should be in your skill set :)

Want to learn more?  See the TDD Learning path @ [CrowdSourcedUpskillingApp](https://crowdsourced.upskilling.only.sap/)

Or ping ken.lomax@sap.com to join one of our TDD/Pair Programming workshops.

More @ [TDD Dojos](https://wiki.wdf.sap.corp/wiki/display/prodandtech/TDD+Dojos)

