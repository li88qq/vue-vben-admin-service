package org.example.dto;

/**
 * 基本响应类
 */
public class BaseResponse {

    private int code;
    private String message;
    private Object result;

    public BaseResponse() {
    }

    public BaseResponse(int code, String message, Object result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    /**
     * 是否成功
     * @return
     */
    public boolean success(){
        return this.code == 0;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
