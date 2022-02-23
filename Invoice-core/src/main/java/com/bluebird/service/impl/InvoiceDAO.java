package com.bluebird.service.impl;

import com.bluebird.JPA_Repository.InvoiceRepository;
import com.bluebird.model.Invoice;
import com.bluebird.service.api.IInvoice;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InvoiceDAO extends GenericInvoice<Invoice> implements IInvoice {

    private InvoiceRepository repository;

    public List<Invoice> select(Invoice invoice){
        return repository.findAll();
    }

    public List<Invoice> findInvoiceById(String id){
        return repository.findInvoiceById(id);
    }


}
