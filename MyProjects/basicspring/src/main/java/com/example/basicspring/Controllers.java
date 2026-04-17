package com.example.basicspring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/test")
public class Controllers {

    UserObj myuser = new UserObj();

    @GetMapping("/{id}")
    public String getHelloString(@PathVariable int id) {

        if (id == 1)
            return "EZ";
        else if (id == 0)
            return "GG";
        else
            return "Hello, Spring!";
    }

    @PostMapping("/adduser")
    public UserObj postUserObj(@RequestBody UserObj user) {

        myuser = user;
        return user;
    }

    @GetMapping("/getuser")
    public Object getUserObj(@RequestParam int id) {

        if (myuser.id == id) {
            return myuser;
        } else {
            return 0;
        }
    }

    @PutMapping("/edituser/{id}")
    public Object editUserObj(@PathVariable String id, @RequestBody UserObj data) {
        
        myuser = data;
        return data;
    }

    // public api
    @GetMapping("/getjokes")
    public JokeModel getJokes() {

        String jockUrl = "https://official-joke-api.appspot.com/random_joke";

        RestTemplate restTemplate = new RestTemplate();

        JokeModel joke = restTemplate.getForObject(jockUrl, JokeModel.class);

        return joke;
    }
    
}
