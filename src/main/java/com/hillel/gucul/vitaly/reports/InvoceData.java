package com.hillel.gucul.vitaly.reports;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRAbstractBeanDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by insomnia on 21.07.17.
 */
public class InvoceData {

    private Invoice invoice;

    public InvoceData(){
        invoice = createInvoice();
    }

    private Item createItem(String description, Integer quantity, BigDecimal unitprice) {
        Item item = new Item();
        item.setDescription(description);
        item.setQuantity(quantity);
        item.setUnitprice(unitprice);
        return item;
    }

    private Customer createCustomer(String name, String address, String city, String email){
        Customer customer = new Customer();
        customer.setName(name);
        customer.setAddress(address);
        customer.setCity(city);
        customer.setEmail(email);
        return customer;
    }

    private Invoice createInvoice(){
        Invoice invoice = new Invoice();
        invoice.setId(5);
        invoice.setShipping(new BigDecimal(10));
        invoice.setTax(0.2);

        invoice.setBillTo(createCustomer("Mary Patterson", "151 Pomptom St.","Washington", "marypaterson@gmail.com"));
        invoice.setShipTo(createCustomer("Peter Marsh", "23 Baden Av.","New York", null));

        List<Item> items = new ArrayList<>();
        items.add(createItem("Notebook", 1, new BigDecimal(1000)));
        items.add(createItem("DVD", 5, new BigDecimal(40)));
        items.add(createItem("Book", 2, new BigDecimal(10)));
        items.add(createItem("Phone", 1, new BigDecimal(200)));
        invoice.setItems(items);

        return invoice;

    }

    public Invoice getInvoice(){
        return invoice;
    }

    public JRDataSource createDataSource(){
        return new JRBeanCollectionDataSource(invoice.getItems());

    }


}
