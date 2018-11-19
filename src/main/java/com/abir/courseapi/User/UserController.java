package com.abir.courseapi.User;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController

public class UserController {
    private ApplicationUserRepository applicationUserRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserController(ApplicationUserRepository applicationUserRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.applicationUserRepository = applicationUserRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @RequestMapping(value = "/users/sign-up", method = RequestMethod.POST)

    public void signUp(@RequestBody ApplicationUser user){
        System.out.println(user.getUsername());
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        applicationUserRepository.save(user);
    }


}
