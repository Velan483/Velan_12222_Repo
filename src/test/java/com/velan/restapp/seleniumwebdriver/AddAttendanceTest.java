package com.velan.restapp.seleniumwebdriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AddAttendanceTest {
	
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@BeforeEach
	void setUp() {
		 driver = new ChromeDriver();
		 js = (JavascriptExecutor) driver;
		 vars = new HashMap<String, Object>();
		}
	
	@AfterEach
	void tearDown() {
	 driver.quit();
	}
	

	@Test
	void addAttendance() {
	 driver.get("http://localhost:3000/addAttend");
	 driver.findElement(By.name("date")).click();
	 driver.findElement(By.name("date")).sendKeys("2024-07-22");
	 driver.findElement(By.name("day")).click();
	 driver.findElement(By.name("day")).sendKeys("Monday");
	 driver.findElement(By.name("attend")).click();
	 driver.findElement(By.name("attend")).sendKeys("Absent");
	 driver.findElement(By.name("submit")).click();
	 assertEquals("Data added Successfully", "Data added Successfully");
	}

	@Test
    void addAttendanceFailure1() {
	 driver.get("http://localhost:3000/addAttend");
	 driver.manage().window().setSize(new Dimension(1536, 815));
	 driver.findElement(By.name("date")).click();
	 driver.findElement(By.name("date")).sendKeys("");
	 driver.findElement(By.name("day")).click();
	 driver.findElement(By.name("day")).sendKeys("Tuesday");
	 driver.findElement(By.name("attend")).click();
	 driver.findElement(By.name("attend")).sendKeys("Present");
	 driver.findElement(By.name("submit")).click();
	 assertEquals("Data Not Added", "Data Not Added");
	}

	@Test
	void addAttendanceFailure2() {
	 driver.get("http://localhost:3000/addAttend");
	 driver.manage().window().setSize(new Dimension(1536, 815));
	 driver.findElement(By.name("date")).click();
	 driver.findElement(By.name("date")).sendKeys("2024-07-22");
	 driver.findElement(By.name("day")).click();
	 driver.findElement(By.name("day")).sendKeys("");
	 driver.findElement(By.name("attend")).click();
	 driver.findElement(By.name("attend")).sendKeys("Present");
	 driver.findElement(By.name("submit")).click();
	 assertEquals("Data Not Added", "Data Not Added");
	}

	@Test
	void addAttendanceFailure3() {
	 driver.get("http://localhost:3000/addAttend");
	 driver.manage().window().setSize(new Dimension(1536, 815));
	 driver.findElement(By.name("date")).click();
	 driver.findElement(By.name("date")).sendKeys("2024-07-23");
	 driver.findElement(By.name("day")).click();
	 driver.findElement(By.name("day")).sendKeys("Tuesday");
	 driver.findElement(By.name("attend")).click();
	 driver.findElement(By.name("attend")).sendKeys("");
	 driver.findElement(By.name("submit")).click();
	 assertEquals("Data Not Added", "Data Not Added");
	}

}
