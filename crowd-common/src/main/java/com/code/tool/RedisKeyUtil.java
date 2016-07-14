package com.code.tool;

import java.util.UUID;


public abstract class RedisKeyUtil {

    public static final String CACHE_ROOT_NAME = "code";
	public static final String CACHE_KEY_SEPARATOR = ":";
	public static final String CACHE_CPY="800";
	public static final String USER_ID="userId";
	
	
    /**
     * 拼接tqh key
     * @param keys
     * @return
     */
    public static String getKey(String... keys) {	
        StringBuilder sb = new StringBuilder("");
        sb.append(CACHE_ROOT_NAME).append(CACHE_KEY_SEPARATOR);
        int i = 0;
        for (String key : keys) {
            sb.append(key);
            if(i < keys.length - 1 ){
                 sb.append(CACHE_KEY_SEPARATOR);
            }
            i++;
        }
        return  sb.toString();
    }
   
    /**
     * 获取key
     * @param userId
     * @return
     */
    public static String getUUID(Long userId){
    	UUID uuid = UUID.randomUUID();
    	StringBuffer buffer = new StringBuffer();
    	buffer.append(uuid);
    	buffer.append(userId);
    	return buffer.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(getUUID(1l));
	}
	
}
