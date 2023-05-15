package googledrive.common;

import googledrive.DashboradApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DashboradApplication.class })
public class CucumberSpingConfiguration {}
