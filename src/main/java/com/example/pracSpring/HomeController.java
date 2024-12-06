package com.example.pracSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/home/main")
    @ResponseBody
    public String showHome(){
        return "안녕하세요";
    }

    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "Hello World";
    }

    @GetMapping("/home/main2")
    @ResponseBody
    public String showHome2(){
        return "환영합니다";
    }

    @GetMapping("/home/main3")
    @ResponseBody
    public String showHome3(){
        return "획기적이네";
    }
    int result;

    public HomeController(){
        result = -1;
    }//생성자를 통해서 홈페이지 껏다켜면 다시 0으로 초기화


    @GetMapping("/home/increase")
    @ResponseBody
    public int increaseNum(){
        result++;



        return result;
    }

    @GetMapping("/home/plus")
    @ResponseBody
    public int showPlus(@RequestParam(defaultValue ="5") int a , @RequestParam(defaultValue = "10") int b){

        return a+b;
    }


}
