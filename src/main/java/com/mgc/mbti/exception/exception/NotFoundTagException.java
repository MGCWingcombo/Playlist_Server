package com.mgc.mbti.exception.exception;

public class NotFoundTagException extends RuntimeException {
    public NotFoundTagException(String msg, Throwable t) {
        super(msg, t);
    }

    public NotFoundTagException(String msg) {
        super(msg);
    }

    public NotFoundTagException() {
        super();
    }
}