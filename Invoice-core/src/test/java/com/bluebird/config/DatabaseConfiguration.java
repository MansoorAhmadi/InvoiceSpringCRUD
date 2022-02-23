package com.bluebird.config;


import com.bluebird.service.impl.InvoiceDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.bluebird.service.api", "com.bluebird.service.impl"})
public class DatabaseConfiguration {


    @Bean(name="InvoiceDAO")
    public InvoiceDAO getInvoiceDAO(){
        return new InvoiceDAO();
    }
}
