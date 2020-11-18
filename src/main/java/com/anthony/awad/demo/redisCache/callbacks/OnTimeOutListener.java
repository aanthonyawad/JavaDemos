package com.anthony.awad.demo.redisCache.callbacks;

import com.anthony.awad.demo.redisCache.exceptions.CacheTimeOutException;

public interface OnTimeOutListener {
    void onTimeOut(String key) throws CacheTimeOutException;
}
