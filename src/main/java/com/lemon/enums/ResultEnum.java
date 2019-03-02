package com.lemon.enums;

/**
 * 异常枚举
 * @Author: yinft
 * @Date: 2018/12/16 23:10
 * @Version 1.0
 */
public enum ResultEnum {


    /**
     * 其他
     */
    SYS_ERROR(500, "服务异常"),
    FORBIDDEN(403,"Token令牌无效"),
    UNAUTHORIZED(401,"Token令牌已过期"),
    USER_DONT_EXISTS(1000000, "用户不存在"),
    PASSWORD_DONT_EXISTS(1000001, "密码错误"),
    REPEAD_ID(2000001,"重复的id"),
    NULL_ID(2000002,"id不能为空"),
    REPEAD_MENUNAME(3000001,"重复的菜单名"),
    URL_NOT_STARTWITHHTTP(3000002,"外链必须以http://或者https://开头"),
    REPEAD_ROLENAME(4000001,"重复的角色名");



    private Integer code;

    private String message;

    ResultEnum(Integer code, String message)
    {
        this.code = code;
        this.message = message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode()
    {
        return code;
    }

    public String getMessage()
    {
        return message;
    }

}
