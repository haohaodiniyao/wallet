package com.example.wallet.javabean;

import java.math.BigDecimal;
import java.util.Date;

public class WalletDetail {
    private Long id;
    private Long walletId;
    private BigDecimal money;
    private Date createTime;

    public WalletDetail(Long id, Long walletId, BigDecimal money, Date createTime) {
        this.id = id;
        this.walletId = walletId;
        this.money = money;
        this.createTime = createTime;
    }

    public WalletDetail() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWalletId() {
        return walletId;
    }

    public void setWalletId(Long walletId) {
        this.walletId = walletId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "WalletDetail{" +
                "id=" + id +
                ", walletId=" + walletId +
                ", money=" + money +
                ", createTime=" + createTime +
                '}';
    }
}
