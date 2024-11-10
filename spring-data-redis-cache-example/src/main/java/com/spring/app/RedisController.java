package com.spring.app;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

	
	@GetMapping("/nocache")
	public String semcache() {		
		System.out.println("No cache");
		return "Cache OFF";
	}
	
	@GetMapping("/cache")
	@Cacheable("hello")
	public String comcache() {		
		System.out.println("Cached");
		return "Cache ON";
	}
	
	
	@GetMapping("/cleancache")
	@CacheEvict("hello")
	public String cancel() {		
		System.out.println("Clean cache");
		return "Clean cache";
	}
	
}
