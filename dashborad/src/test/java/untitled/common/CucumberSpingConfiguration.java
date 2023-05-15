package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.DashboradApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { DashboradApplication.class })
public class CucumberSpingConfiguration {}
