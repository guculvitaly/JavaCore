package com.hillel.gucul.vitaly.exception;

/**
 * Created by insomnia on 16.07.17.
 */
public class CustomerSevice {

    public Customer findByName(String name) throws NameNotFundException {
        if ("".equals(name)) {
            throw new NameNotFundException(666, "Name is empty!");
        } return  new Customer(name);

    }
}
