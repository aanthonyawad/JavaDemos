package com.anthony.awad.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anthony.awad.demo.redisCache.ICacheable;
import com.anthony.awad.demo.redisCache.dynamic.DynamicLRUCache;
import com.anthony.awad.demo.redisCache.exceptions.CacheTimeOutException;

@RestController
@RequestMapping(path="ultimate")
public class TestRestUltimate {

	@Autowired
	DynamicLRUCache dynamicLRUCache;
	@GetMapping(path="get")
	public ResponseEntity<String> testset(){
		
		try {
			ICacheable result1 = dynamicLRUCache.getCache().get("a");
			ICacheable result2 = dynamicLRUCache.getCache().get("b");
			ICacheable result3 = dynamicLRUCache.getCache().get("c");
			ICacheable result4 = dynamicLRUCache.getCache().get("d");
		} catch (CacheTimeOutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ResponseEntity<String>("worng credentials" ,HttpStatus.OK);
	}
		
}
