package com.bluebird.service.api;

import com.bluebird.JPA_Repository.InvoiceRepository;
import com.bluebird.model.Invoice;

import java.util.List;

public interface IInvoice {
    void create(Invoice invoice);
    void update(Invoice invoice);
    void delete(Invoice invoice);

}
