package com.spotinst.sdkjava.exception;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by aharontwizer on 8/26/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HttpError {

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "DalError{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
