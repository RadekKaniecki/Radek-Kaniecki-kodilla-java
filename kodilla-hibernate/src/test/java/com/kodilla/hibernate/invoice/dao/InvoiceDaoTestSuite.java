package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Monitor");
        Product product2 = new Product("Laptop");

        Item item1 = new Item(new BigDecimal(500), 5);
        Item item2 = new Item(new BigDecimal(500), 3);
        Item item3 = new Item(new BigDecimal(1500), 2);

        Invoice invoice = new Invoice("12345");

        item1.setProduct(product1);
        item2.setProduct(product1);
        item3.setProduct(product2);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        productDao.save(product1);
        productDao.save(product2);
        int productId = product2.getId();

        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        int itemId = item3.getId();

        //Then
        Assert.assertEquals(1, invoiceId);
        Assert.assertEquals(3, itemId);
        Assert.assertEquals(2, productId);

        //CleanUp
        productDao.deleteAll();
        itemDao.deleteAll();
        invoiceDao.deleteAll();
    }
}
