package com.hillel.gucul.vitaly.inner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by insomnia on 09.07.17.
 */
public class Cache {

    private Map<String, CacheEntry> cacheMap = new HashMap<>();


    private class CacheEntry{

        public Long timeInsered = 0l;
        public Object value = null;
    }

    public void store(String key, Object value){
        CacheEntry entry = new CacheEntry();
        entry.value = value;
        entry.timeInsered = System.currentTimeMillis();
        this.cacheMap.put(key, entry);
    }

    public Object get (String key) {
        CacheEntry entry = this.cacheMap.get(key);
        if (entry == null) return null;
        return entry.value;
    }

    public String getData(String key){
        CacheEntry entry = this.cacheMap.get(key);
        if (entry == null) return null;
        return entry.value.toString().concat(" ").concat(entry.timeInsered.toString());
    }

}
