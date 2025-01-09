package com.vijay.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello from Dev Container!";
    }

    @GetMapping("/hw")
    public String hw(){
        return "Hello world !!!";
    }
    
    
    @GetMapping("/info")
    public Map<String, Object>  moreInfo(){
        Map<String, Object> systemInfo = new HashMap<>();
        
        // Get OS details
        systemInfo.put("os.name", System.getProperty("os.name"));
        systemInfo.put("os.version", System.getProperty("os.version"));
        systemInfo.put("os.arch", System.getProperty("os.arch"));

        // Get Java runtime info
        systemInfo.put("java.version", System.getProperty("java.version"));
        systemInfo.put("java.vendor", System.getProperty("java.vendor"));
        
        // Get memory details
        Runtime runtime = Runtime.getRuntime();
        systemInfo.put("available.processors", runtime.availableProcessors());
        systemInfo.put("free.memory", runtime.freeMemory());
        systemInfo.put("total.memory", runtime.totalMemory());
        systemInfo.put("max.memory", runtime.maxMemory());


        return systemInfo;
    }

}