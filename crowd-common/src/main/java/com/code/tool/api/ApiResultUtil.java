package com.code.tool.api;



/**
 * Created by 高雄辉 on 17/05/2016.17:14
 *
 * @description
 */
public class ApiResultUtil {
    public static ApiResult successResult(String msg){
        return new ApiResult(true,0,msg);
    }
    public static  ApiResult failResult(String msg){
        return new ApiResult(false,-1,msg);
    }

    public static ApiResult exceptionResult(String msg){
        return new ApiResult(false,-2,msg);
    }
}
