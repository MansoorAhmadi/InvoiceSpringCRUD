package com.bluebird.service.impl;

import com.bluebird.JPA_Repository.InvoiceRepository;
import com.bluebird.model.Invoice;
import com.bluebird.service.api.IInvoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Service
public class InvoiceDAO extends GenericInvoice<Invoice> implements IInvoice {

    @Inject
    DataSource dataSource;

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    private InvoiceRepository repository;

    public List<Invoice> select(Invoice invoice){
        return repository.findAll();
    }


//    public List<Invoice> findInvoiceById(String id){
//        return repository.findInvoiceById(id);
//    }

    public void save(Invoice invoice){
        repository.save(invoice);
    }


}
