package pl.yourganizer.logowanie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class LoginController {

        @GetMapping({"/","/index"})
        public String index(){
            return "index1";
        }

        @GetMapping({"/login"})
        public String login(){
            return "login";
        }

        @GetMapping({"/menu"})
        public String menu(){
            return "menu";
        }
//
//        @GetMapping({"/user"})
//        public String user(){
//            return "user";
//        }
    }
