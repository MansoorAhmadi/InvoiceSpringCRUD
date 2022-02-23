package com.bluebird.service.impl;

import com.bluebird.model.Invoice;
import com.bluebird.service.api.IInvoice;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class GenericInvoice<T> implements IInvoice {

    @Inject
    SessionFactory factory;

    @Override
    public void create(Invoice invoice){
        Session session = factory.openSession();
        session.save(invoice);
        session.close();
    }

    @Override
    public void update(Invoice invoice){
        Session session = factory.openSession();
        session.update(invoice);
        session.close();
    }

    @Override
    public void delete(Invoice invoice){
        Session session = factory.openSession();
        session.delete(invoice);
        session.close();
    }
}
