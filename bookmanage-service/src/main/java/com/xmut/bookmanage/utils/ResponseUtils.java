package com.xmut.bookmanage.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 返回数据工具类
 * @author: whf
 * @date: 2019-8-24 22:02:27
 */
public class ResponseUtils {
    public static Object ok() {
        Map<String, Object> obj = new HashMap<String, Object>();
        obj.put("errno", 200);
        obj.put("msg", "成功");
        return obj;
    }

    public static Object ok(Object data) {
        Map<String, Object> obj = new HashMap<String, Object>();
        obj.put("errno", 200);
        obj.put("msg", "成功");
        obj.put("data", data);
        return obj;
    }

    public static Object ok(String msg, Object data) {
        Map<String, Object> obj = new HashMap<String, Object>();
        obj.put("errno", 200);
        obj.put("msg", msg);
        obj.put("data", data);
        return obj;
    }

    public static Object fail() {
        Map<String, Object> obj = new HashMap<String, Object>();
        obj.put("errno", 400);
        obj.put("msg", "错误");
        return obj;
    }

    public static Object fail(int errno, Object data) {
        Map<String, Object> obj = new HashMap<String, Object>();
        obj.put("errno", errno);
        obj.put("msg", data);
        return obj;
    }

    public static Object loginFail() {
        return fail(401, "账号密码错误，登录失败");
    }
}
