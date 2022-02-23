package com.bluebird.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INVOICE")
public class Invoice {

    @Id
    @Column(name="ID")
    private String id;

    @Column(name="NAME")
    private String name;

    @Column(name="AMOUNT")
    private int amount;

    @Column(name="FINAL_AMOUNT")
    private int finalAmount;

    @Column(name="NUMBER")
    private String number;

    @Column(name="RECEIVED_DATE")
    private String receivedDate;

    @Column(name="TYPE")
    private String type;

    @Column(name="VENDOR")
    private String vendor;

    @Column(name="COMMENTS")
    private String comments;

    public Invoice() {
    }

    /**
     * @constructor
     * @param id
     * @param name
     * @param amount
     * @param finalAmount
     * @param number
     * @param receivedDate
     * @param type
     * @param vendor
     * @param comments
     */
    public Invoice(String id, String name, int amount, int finalAmount, String number, String receivedDate,
                   String type, String vendor, String comments) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.finalAmount = finalAmount;
        this.number = number;
        this.receivedDate = receivedDate;
        this.type = type;
        this.vendor = vendor;
        this.comments = comments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(int finalAmount) {
        this.finalAmount = finalAmount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(String receivedDate) {
        this.receivedDate = receivedDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", finalAmount=" + finalAmount +
                ", number='" + number + '\'' +
                ", receivedDate=" + receivedDate +
                ", type='" + type + '\'' +
                ", vendor='" + vendor + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
