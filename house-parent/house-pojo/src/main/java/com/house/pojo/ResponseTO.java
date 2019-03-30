package com.house.pojo;

import java.io.Serializable;

public class ResponseTO implements Serializable {
    private boolean success=true; //传输是否成功
    private Object result; //其他信息

    public ResponseTO(boolean success, Object result) {
        this.success = success;
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
