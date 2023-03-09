package com.example.wallet.controller;

import com.example.wallet.javabean.WalletDetail;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

/**
 * 钱包
 */
@RestController
@RequestMapping("/wallet")
public class WalletController {
    /**
     * 查询用户钱包余额
     * @param id 钱包id
     * @return
     */
    @RequestMapping("/money")
    public BigDecimal walletMoney(Long id){
        /**
         * 查询钱包表wallet，根据id
         */
        return null;
    }

    /**
     * 消费100元
     * @param id
     * @param money
     * @return
     */
    @RequestMapping("/consume")
    public BigDecimal consumeMoney(Long id,BigDecimal money){
        /**
         * 1、根据id查询钱包表wallet，获取钱包余额，和消费金额money比较，如果钱包余额小于消费金额，直接返回-1表示余额不足
         * 2、在钱包流水表wallet_detail添加记录
         * 3、钱包表wallet余额减去消费money，然后更新钱包表wallet的余额money字段
         */
        return null;
    }

    /**
     * 退款
     * @param id
     * @param money
     * @return
     */
    @RequestMapping("/drawback")
    public BigDecimal drawbackMoney(Long id,BigDecimal money){
        /**
         * 在钱包流水表wallet_detail添加记录
         * 根据id查询钱包表wallet，获取钱包余额
         * 钱包表wallet余额加消费money，然后更新钱包表wallet的余额money字段
         */
        return null;
    }

    /**
     * 钱包明细
     * @param id
     * @return
     */
    @RequestMapping("/detail")
    public List<WalletDetail> walletDetailList(Long id){
        /**
         * 根据钱包id查询表wallet_detail
         */
        return null;
    }
}
