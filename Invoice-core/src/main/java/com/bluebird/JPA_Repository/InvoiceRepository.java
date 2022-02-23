package com.bluebird.JPA_Repository;

import com.bluebird.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, String> {
    List<Invoice> findAll();
    List<Invoice> findInvoiceById(String id);
//    List<Invoice> save(Invoice invoice);

}
