package com.github.okcoder.sample.springvirtualthreaddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

@RestController
public class TestController {

    @GetMapping("/")
    public void test(@RequestParam Optional<Integer> sleep) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(sleep.orElse(100));
    }
}
