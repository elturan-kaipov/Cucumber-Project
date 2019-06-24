package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {

              "html:target/default_cucumber_reports",
                "json:target/cucumber.json",
              //  "com.cucumber.listener.ExtentCucumberFormatter:output/report.html",

        },
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@wiki",
        dryRun = false

)


public class Runner {

//        ExtentCucumberFormatter rep;
//        @AfterClass
//        public static void writeExtentReport(){
//                Reporter.loadXMLConfig("extent-config.xml");
//        }
}
