package com.hillel.gucul.vitaly.enums;

import java.io.IOException;

/**
 * Created by insomnia on 01.09.17.
 */
public class StatusExampleAbstract {

    public enum Status{

        STATUS_OPEN
                {
                    public String description(){
                        return "open";
                    }
                },
        STATUS_STARTED
                {
                    public String description(){
                        return "started";
                    }
                },
        STATUS_INPROGRESS
                {
                    public String description(){
                        return "inprogress";
                    }
                },
        STATUS_ONHOLD
                {
                    public String description(){
                        return "onhold";
                    }
                },
        STATUS_COMPLETED
                {
                    public String description(){
                        return "completed";
                    }
                },
        STATUS_CLOSED
                {
                    public String description(){
                        return "closed";
                    }
                };
        Status(){}

        public abstract String description();


    }

    public static void main(String[] args) throws IOException {
        for (Status stat: Status.values()) {
            System.out.println(stat + " desc is " + stat.description());
        }
    }

}
