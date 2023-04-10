package edu.iu.c322.demo.invoicingservice.model;

import java.util.Date;
import java.util.List;

public class Invoice {
    private Date orderPlaced;

    private float total;

    private List<InvoiceItem> invoiceItems;

    private Payment payment;

}
