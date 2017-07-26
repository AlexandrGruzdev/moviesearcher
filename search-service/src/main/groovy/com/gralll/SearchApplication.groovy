package com.gralll

import groovy.util.logging.Slf4j
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.hystrix.EnableHystrix
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@Slf4j
@SpringBootApplication
@RestController
@EnableDiscoveryClient
@EnableHystrix
public class SearchApplication {
    public static final int DEFAULT_PADDING = 50

    public static void main(String[] args) {
        println 'Starting'.center(DEFAULT_PADDING, '=')
        SpringApplication.run SearchApplication, args
        println 'Started'.center(DEFAULT_PADDING, '=')
    }

    @RequestMapping(value = '/search', method = RequestMethod.GET)
    def search() {
        return UUID.randomUUID().toString()
    }
}