package com.hillel.gucul.vitaly.enums;

/**
 * Created by insomnia on 01.09.17.
 */
public class StatusExampleSwitchCase {

    public enum Status{
        STATUS_OPEN (0, "open"),
        STATUS_STARTED (1, "started"),
        STATUS_INPROGRESS (2, "inprogress"),
        STATUS_ONHOLD (3, "onhold"),
        STATUS_COMPLETED (4, "completed"),
        STATUS_CLOSED (5, "closed");

        private final int status;
        private final String description;

        Status(int aStatus, String desc){
            this.status = aStatus;
            this.description = desc;
        }

    }

    private static void checkStatus(Status status){
        switch (status){
            case STATUS_OPEN:
                System.out.println("This is open status");
            case STATUS_STARTED:
                System.out.println("This is started status");
            case STATUS_INPROGRESS:
                System.out.println("This is inprogress status");
            case STATUS_ONHOLD:
                System.out.println("This is onhold status");
            case STATUS_COMPLETED:
                System.out.println("This is completed status");
            case STATUS_CLOSED:
                System.out.println("This is closed status");
        }
    }

    public static void main(String[] args) {
        checkStatus(Status.STATUS_CLOSED);
    }
}
