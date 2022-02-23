package com.bluebird.datamodel;

import com.bluebird.JPA_Repository.InvoiceRepository;
import com.bluebird.model.Invoice;
import com.bluebird.service.api.IInvoice;
import com.bluebird.service.impl.InvoiceDAO;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class InvoiceTest {

    private static final Logger LOGGER = LogManager.getLogger(InvoiceTest.class);

    @Inject
    @Named("dao")
    InvoiceDAO dao;

    private IInvoice repository;

    @Inject
    @Named("dataSource")
    DataSource dataSource;

    @Test
    public void saveTest(){
        //given
        Invoice invoice = new Invoice();

        //when
//        SELECT ID, NAME, AMOUNT, FINAL_AMOUNT, NUMBER, RECEIVED_DATE, TYPE, VENDOR, COMMENTS FROM Invoice
        invoice.setId("1");
        invoice.setName("Mark");
        invoice.setAmount(1000);
        invoice.setFinalAmount(15000);
        invoice.setNumber("0033768787878");
        invoice.setReceivedDate("22-02-2022-MM-16-50");
        invoice.setType("February");
        invoice.setVendor("ForestHill");
        invoice.setComments("MArk always pays on time !");


        repository.create(invoice);
        LOGGER.info(invoice);

        //then
        Assert.assertNotNull(invoice);
    }

    @Test
    public void connectionTest() throws SQLException {
        //given
        Connection connection = dataSource.getConnection();

        //when
        String schema = connection.getSchema();

        //then
        Assert.assertEquals("PUBLIC", schema);
    }

}
