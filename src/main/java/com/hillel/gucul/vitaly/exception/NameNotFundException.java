package com.hillel.gucul.vitaly.exception;

/**
 * Created by insomnia on 16.07.17.
 */
public class NameNotFundException extends Exception {

    private int errCode;

    public NameNotFundException(int errCode, String message) {
        super(message);
        this.errCode=errCode;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }


}

