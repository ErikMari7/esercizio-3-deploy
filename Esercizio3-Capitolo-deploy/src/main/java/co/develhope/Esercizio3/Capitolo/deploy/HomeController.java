package co.develhope.Esercizio3.Capitolo.deploy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private Environment environment;
    @Value("${myCustomVarTree.authCode}")
    String authCode;
    @Value("${myCustomVarTree.devName}")
    String devName;
    @GetMapping
    public String getMessage(){
        return "Welcome " + devName + " with code " + authCode;
    }
}
