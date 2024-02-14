package com.mytestproject.testartifact.models;

public class OrderDetails {
    private String item;
    private int quantity;
    private double amount;

    public OrderDetails() {
    }

    public OrderDetails(String item, int quantity, double amount) {
        this.item = item;
        this.quantity = quantity;
        this.amount = amount;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "item='" + item + '\'' +
                ", quantity=" + quantity +
                ", amount=" + amount +
                '}';
    }
}
