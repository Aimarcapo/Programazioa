package model;

public class Account {
    private int balance = 0;
    private String name;
    private String id;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int credit(int amount) {
        return this.balance=this.balance + amount;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            this.balance = balance - amount;
        } else {
            System.out.println("amount exceeded");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            another.balance = amount + another.balance;
            this.balance=balance-amount;
        } else {
            System.out.println("amount excedded");
        }
        return balance;
    }

    public String toString() {
        return "Account [" + id + "," + name + "," + balance + "]";
    }
}
