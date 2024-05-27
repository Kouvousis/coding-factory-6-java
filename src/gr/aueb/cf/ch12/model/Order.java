package gr.aueb.cf.ch12.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Order {
    private int id;
    private String uuid;
    private double amount;
    private String description;
    private int state;
    private LocalDateTime timeStamp;
    private String formatedTimeStamp;

    public Order() {

    }

    public Order(int id, double amount, String description, int state) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        this.id = id;
        this.uuid = UUID.randomUUID().toString();
        this.amount = amount;
        this.description = description;
        this.state = state;
        this.timeStamp = LocalDateTime.now();
        this.formatedTimeStamp = this.timeStamp.format(formatter);
    }

    public int getId() {
        return id;
    }

    public String getUuid() {
        return uuid;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public int getState() {
        return state;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public String getFormatedTimeStamp() {
        return formatedTimeStamp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setFormatedTimeStamp(String formatedTimeStamp) {
        this.formatedTimeStamp = formatedTimeStamp;
    }
}
