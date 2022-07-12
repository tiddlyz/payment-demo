package com.atguigu.paymentdemo.vo;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 封装需要传递给前端的value object
 */
@Data
public class R {
    private Integer code;       // response code
    private String message;     // response message
    private Map<String, Object> data = new HashMap<>();

    public static R ok(){
        R r = new R();
        r.setCode(0);
        r.setMessage("成功");
        return r;
    }

    public static R error(){
        R r = new R();
        r.setCode(-1);
        r.setMessage("失败");
        return r;
    }

    /**
     * 可使用此方法采用链式调用的方式给data赋值
     * @param key
     * @param value
     * @return
     */
    public R data(String key, Object value){
        this.data.put(key, value);
        return this;
    }
}
