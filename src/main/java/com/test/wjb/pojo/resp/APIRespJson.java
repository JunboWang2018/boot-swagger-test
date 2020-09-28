package com.test.wjb.pojo.resp;

import java.io.Serializable;

/**
 * @author Wang Junbo
 * @description
 * @date 2020/1/15
 */
public class APIRespJson implements Serializable {
    private static final long serialVersionUID = 6354540642744803586L;
    private final int code;
    private String messageKey;
    private Object[] messageParams;
    private String message;
    private final String systemTime;
    private Object data;

    public APIRespJson() {
        this(0);
    }

    public APIRespJson(int code) {
        this.messageKey = null;
        this.messageParams = null;
        this.message = "";
        this.code = code;
        this.systemTime = String.valueOf(System.currentTimeMillis());
    }

    public APIRespJson(int code, String message) {
        this(code);
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public APIRespJson setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getSystemTime() {
        return this.systemTime;
    }

    public Object getData() {
        return this.data == null ? null : this.data;
    }

    public APIRespJson setData(Object data) {
        this.data = data;
        return this;
    }

    public String getMessageKey() {
        return this.messageKey;
    }

    public APIRespJson setMessageKey(String messageKey) {
        this.messageKey = messageKey;
        return this;
    }

    public Object[] getMessageParams() {
        return this.messageParams;
    }

    public APIRespJson setMessageParams(Object[] messageParams) {
        this.messageParams = messageParams;
        return this;
    }
}
