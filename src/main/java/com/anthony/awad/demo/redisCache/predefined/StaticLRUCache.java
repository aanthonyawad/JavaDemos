package com.anthony.awad.demo.redisCache.predefined;

import org.springframework.context.annotation.Configuration;

import com.anthony.awad.demo.redisCache.Constants;
import com.anthony.awad.demo.redisCache.ICache;
import com.anthony.awad.demo.redisCache.LRUCache;
@Configuration
public class StaticLRUCache implements ICache{
	public LRUCache lruCache;
	
	public StaticLRUCache() {
		this.lruCache = new LRUCache(Constants.STATIC_CACHE_SIZE);
	}

	@Override
	public LRUCache getCache() {
		return this.lruCache;
	}

	@Override
	public void setCache(LRUCache lruCache) {
		if(this.lruCache != null)
			return;
		this.lruCache = new LRUCache(Constants.STATIC_CACHE_SIZE);
		
	}

}
