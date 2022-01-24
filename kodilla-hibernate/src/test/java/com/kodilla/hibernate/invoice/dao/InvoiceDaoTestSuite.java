package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given

        Product product1 = new Product("Jaja");
        Product product2 = new Product("Mleko");
        Product product3 = new Product("Masło");

        Item item1 = new Item(new BigDecimal(10),3);
        Item item2 = new Item(new BigDecimal(5.0),2);
        Item item3 = new Item(new BigDecimal(8.0),1);

        product1.getItem().add(item1);
        product2.getItem().add(item2);
        product3.getItem().add(item3);

        Invoice invoice = new Invoice("24012022");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0,id);

        //Cleanup
        invoiceDao.delete(id);


    }
}
