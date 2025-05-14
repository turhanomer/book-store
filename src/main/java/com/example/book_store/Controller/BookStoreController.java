package com.example.book_store.Controller;
//import spring frameworks
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//HTTP requests and methods return JSON or text
@RestController
//base url
@RequestMapping("/v1/bookstore")
public class BookStoreController {
    //HTTP GET request
    @GetMapping
    public ResponseEntity<String> helloWorld(){
        //Response = 200 OK
        return ResponseEntity.ok("Hello World!");
    }
}
