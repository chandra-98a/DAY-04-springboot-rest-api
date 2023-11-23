package controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    //http GET request http://localhost:8082/hello-world
    @RequestMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }
}
