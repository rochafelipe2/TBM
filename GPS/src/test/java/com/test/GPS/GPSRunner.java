package com.test.GPS;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format ={"pretty","html:target/cucumber"},
		features={"src/test/resource"}
		)
public class GPSRunner {

}
