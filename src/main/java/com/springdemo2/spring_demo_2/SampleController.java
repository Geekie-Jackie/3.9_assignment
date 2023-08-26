package com.springdemo2.spring_demo_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    // Part 6: Separation of Controller file -> moved all the mappings over here
    // Part 5: Basic Routing
    // Basic Mapping

    @GetMapping("/hello") // this annotation tells Spring Boot that this hello() method will handle GET
                          // requests to the /hello route.
    public String hello() {
        return "Hello World 2!";
    }

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
    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "World") String name,
            @RequestParam(defaultValue = "unknown") String role) { // localhost:8081/greet?name=JL&role=coder
        return "Hello " + name + "! You are a " + role + "!";
    }

    // Basic Mapping with Path Variables
    @GetMapping("/users/{id}")
    public String getUser(@PathVariable int id) { // test with localhost:8081/users/1
        return "User ID: " + id;
    }

    // Activity
    // #1 Create an endpoint localhost:8080/products/ and returns the phrase "This
    // is the product page".

    // #3 Update the endpoint to allow for a search term using query parameters e.g.
    // localhost:8080/products?search=apple. Return the phrase "You have searched
    // for {searchTerm}". Replace {searchTerm} with the actual search term.
   
    @GetMapping("/products") // this code block is for Activity #1 and #3
    public String getPdtPage(@RequestParam String search) {
        if (search != null) {
            return "You have searched for " + search + ".";
        } else {
            return "This is the product page.";
        }

    }

    // #2 Create an endpoint localhost:8080/products/{id} and returns the phrase
    // "You have requested for product with id: {id}". Replace {id} with the actual
    // id.

    // @GetMapping("/products/{id}")
    // public String getPdtID(@PathVariable int id) {
    //     return "You have requested for product with id: " + id + ".";
    // }
    
    // Assignment 3.9
    @GetMapping("/products/{productid}")
    public String getPdtID(@PathVariable int productid) {
        if (productid == 1) {
            return "This is detail for ID: " + productid + "\nProduct Name: Apple";
        } else if (productid == 2) {
            return "This is detail for ID: " + productid + "\nProduct Name: Banana";
        } else if (productid == 3) {
            return "This is detail for ID: " + productid + "\nProduct Name: Carrot";
        } else {
            return "No product found.";
        }
    }

    // Part 7: application.properties -> get values with @value
    @Value("${server.port}") // use @Value annotation to access the properties in the file.
    private String port;

    @GetMapping("/port")
    public String getPort() {
        return "Server port: " + port;
    }

    // check dependency using command: mvn dependency:tree

    // Part 8: Dependency Injection through annotations
    
    // Instantiate a new SampleItem
    // SampleItem item = new SampleItem();

    // Use Autowired instead of new keyword
    @Autowired
    private SampleItem item;

    @GetMapping("/item")
    public SampleItem getItem() {
        item.setId(1);
        item.setName("Apple");
        item.setPrice(1.99);
        item.setDesc("A red apple");
        return item;
    }

}
