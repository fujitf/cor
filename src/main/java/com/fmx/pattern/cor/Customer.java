package com.fmx.pattern.cor;

import com.fmx.patrern.cor.handler.PriceHandler;
import com.fmx.patrern.cor.handler.PriceHandlerFactory;

import java.util.Random;

/**
 * @Author：fangmeixiu
 * @Description:
 * @Date :create in 下午10:18 2019/3/10
 */
public class Customer {
    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public  void requestDiscount(float  discount){
        priceHandler.processDiscount(discount);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());
        Random random = new Random();
        for (int i=1;i<=100;i++){
            System.out.println(i+":");
            customer.requestDiscount(random.nextFloat());
        }


    }
}
