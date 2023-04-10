package edu.iu.c322.demo.invoicingservice.model;

import java.util.Date;
import java.util.List;

public class InvoiceItem {
    private String status;
    private Date on;

    private Address address;

    private List<OrderItem> items;
}
