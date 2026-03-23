package org.example.csrfdemo;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class userController {
    private Map<String,String> userData = new HashMap<String,String>();
    @GetMapping("/public")
    public String publicMethod(){
        return "publicMethod";
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody Map<String,String> data){
        userData.put(data.get("username"),userData.get("password"));
        return "user Saved in memory";
    }
}
