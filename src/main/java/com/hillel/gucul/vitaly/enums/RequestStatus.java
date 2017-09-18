package com.hillel.gucul.vitaly.enums;

/**
 * Created by insomnia on 01.09.17.
 */
public class RequestStatus {

    private final int status;

    private RequestStatus(int aStatus){
        this.status = aStatus;
    }

    public static final RequestStatus STATUS_OPEN = new RequestStatus(0);
    public static final RequestStatus STATUS_STARTED = new RequestStatus(1);
    public static final RequestStatus STATUS_INPROGRESS = new RequestStatus(2);
    public static final RequestStatus STATUS_ONHOLD = new RequestStatus(3);
    public static final RequestStatus STATUS_COMPLETED = new RequestStatus(4);
    public static final RequestStatus STATUS_CLOSED = new RequestStatus(5);
}
