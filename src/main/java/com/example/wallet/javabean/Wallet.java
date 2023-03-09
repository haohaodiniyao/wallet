package com.example.wallet.javabean;

import java.math.BigDecimal;

public class Wallet {
    private Long id;
    private BigDecimal money;

    public Wallet(Long id, BigDecimal money) {
        this.id = id;
        this.money = money;
    }

    public Wallet() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

}
