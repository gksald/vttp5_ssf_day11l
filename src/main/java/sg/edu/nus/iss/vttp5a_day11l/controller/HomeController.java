package sg.edu.nus.iss.vttp5a_day11l.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller // always need to @ it so for service is @Service to import the thingy
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class); // instantiate the logger, use to write to the console

    @ResponseBody    // need this to display the message on the webpage
    @RequestMapping(path="/log", method=RequestMethod.GET) // anyth u post on internet is a get method(when u press enter on the net)

    public String home() {
        
        logger.info("This is a info message");
        logger.warn("This is a warning message");
        logger.error("This is a error message");
        logger.debug("This is a debug message");
        logger.trace("This is a trace message");
        
        return "Log in HomeController called...";

    }
    @RequestMapping(path="/home", method=RequestMethod.GET)

    public String homePage() {
        return "home";
    }
}