package com.alonespring.aloneproject.controller;

import com.alonespring.aloneproject.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;



/*
@RestController : 컨트롤러를 json을 반환하는 컨트롤러로 만들어줌
예전에는 @ResponseBody를 각 메소드마다 선언했던 것을 한번에 사용할 수 있게 해준다고 생각하면 된다.
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello(){
        return "hello";
    }
    
    @GetMapping("/hello/dto") // @RequestParam은 외부에서 name이란 이름 으로 넘긴 파라미터를 String name에 저장
    public HelloResponseDto helloDto(@RequestParam("name") String name, 
                                     @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }
}
