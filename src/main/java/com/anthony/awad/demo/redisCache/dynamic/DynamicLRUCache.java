package com.anthony.awad.demo.redisCache.dynamic;

import org.springframework.context.annotation.Configuration;

import com.anthony.awad.demo.redisCache.Constants;
import com.anthony.awad.demo.redisCache.ICache;
import com.anthony.awad.demo.redisCache.LRUCache;
@Configuration
public class DynamicLRUCache implements ICache {
	public LRUCache lruCache;
	
	public DynamicLRUCache() {
		this.lruCache = new LRUCache(Constants.DYNAMIC_CACHE_SIZE);
	}

	@Override
	public LRUCache getCache() {
		return this.lruCache;
	}

	@Override
	public void setCache(LRUCache lruCache) {
		if(this.lruCache != null)
			return;
		this.lruCache = new LRUCache(Constants.DYNAMIC_CACHE_SIZE);
		
	}
	

}
