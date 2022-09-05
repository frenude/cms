package com.huohuaadx.api.common.enums;


import com.huohuaadx.api.common.IErrorCode;

/**
 * @author: Frenude
 * @mail: frenude@gmail.com
 * @date: created in 07 12,2021
 * @desc: //todo
 */
public enum ResultCode implements IErrorCode {
    SUCCESS(200, "operation success"),
    FAILED(500, "operation failed"),
    VALIDATE_FAILED(404, "parameter verification failed"),
    UNAUTHORIZED(401, "not logged in yet or token has expired"),
    FORBIDDEN(403, "no permission");
    private long code;
    private String message;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
