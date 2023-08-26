package com.springdemo2.spring_demo_2;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication // This instruments the class to be the entry point for the Spring Boot
						// application.
@RestController // this tells Spring Boot that this is a controller class that handles web
				// requests.
// any object you return from this class will be serialized i.e., converted to
// JSON and returned to the client.
public class SpringDemo2Application {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(SpringDemo2Application.class); // Name this according to your class name

	public static void main(String[] args) {
		logger.info("🟢 Starting MySpringbootProjectApplication");
		logger.warn("🟠 Test Warning");
		logger.error("🔴 Error Warning");
		SpringApplication.run(SpringDemo2Application.class, args);
	}

	// Part 5: Basic Routing
	// Basic Mapping

	// @GetMapping("/hello") // this annotation tells Spring Boot that this hello() method will handle GET
	// 						// requests to the /hello route.
	// public String hello() {
	// 	return "Hello World 2!";
	// }

	// Basic Mapping with Query Parameters
	// @GetMapping("/greet")
	// public String greet(@RequestParam String name) { // test using
	// localhost:8081/greet?name=Jackie
	// return "Hello " + name + "!";
	// }

	// Basic Mapping with Query Parameters with default value
	// @GetMapping("/greet")
	// public String greet(@RequestParam(defaultValue = "World") String name) { //
	// test using localhost:8081/greet?name=
	// return "Hello " + name + "!";
	// }

	// Basic Mapping with Query Parameters with default value and multiple query
	// parameters
	// @GetMapping("/greet")
	// public String greet(@RequestParam(defaultValue = "World") String name,
	// 		@RequestParam(defaultValue = "unknown") String role) { // localhost:8081/greet?name=JL&role=coder
	// 	return "Hello " + name + "! You are a " + role + "!";
	// }

	// Basic Mapping with Path Variables
	// @GetMapping("/users/{id}")
	// public String getUser(@PathVariable int id) { // test with localhost:8081/users/1
	// 	return "User ID: " + id;
	// }

	// Activity
	// #1 Create an endpoint localhost:8080/products/ and returns the phrase "This
	// is the product page".
	// @GetMapping("/products")
	// public String getPdtPage(@RequestParam String search) {
	// 	if (search != null) {
	// 		return "You have searched for " + search + ".";
	// 	} else {
	// 		return "This is the product page.";
	// 	}

	// }

	// #2 Create an endpoint localhost:8080/products/{id} and returns the phrase
	// "You have requested for product with id: {id}". Replace {id} with the actual
	// id.

	// @GetMapping("/products/{id}")
	// public String getPdtID(@PathVariable int id) {
	// 	return "You have requested for product with id: " + id + ".";
	// }

	// #3 Update the endpoint to allow for a search term using query parameters e.g.
	// localhost:8080/products?search=apple. Return the phrase "You have searched
	// for {searchTerm}". Replace {searchTerm} with the actual search term.

}
