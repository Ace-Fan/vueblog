package com.wufan.vueblog.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * 结果集封装
 */

@Data
public class Result implements Serializable {

    // 正常为200，异常为400
    private int code;
    private String msg;
    private Object data;

    /**
     * 成功
     * @param data
     * @return
     */
    public static Result success(Object data)   {
        return success(200,"操作成功",data);
    }

    public static Result success(int code,String msg,Object data)   {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    /**
     * 失败
     * @param msg
     * @return
     */
    public static Result fail(String msg)   {
        return fail(400,msg,null);
    }

    public static Result fail(String msg,Object data)   {
        return fail(400,msg,data);
    }

    public static Result fail(int code,String msg,Object data)   {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
