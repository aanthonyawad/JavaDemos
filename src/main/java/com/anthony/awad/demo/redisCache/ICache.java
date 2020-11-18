package com.anthony.awad.demo.redisCache;

public interface ICache {
	LRUCache getCache();
	void setCache(LRUCache lruCache);
}
