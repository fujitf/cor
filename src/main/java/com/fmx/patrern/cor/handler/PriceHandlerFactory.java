package com.fmx.patrern.cor.handler;

/**
 * @Author：fangmeixiu
 * @Description:
 * @Date :create in 下午10:43 2019/3/14
 */
public class PriceHandlerFactory {

    //创建PriceHandler的工厂方法
    public  static  PriceHandler createPriceHandler(){
        PriceHandler sales = new Sales();
        Lead lead = new Lead();
        PriceHandler manager = new Manager();
        PriceHandler director = new Director();
        PriceHandler vicePresident = new VicePresident();
        PriceHandler ceo = new CEO();


        sales.setSuccessor(lead);
        lead.setSuccessor(manager);
        manager.setSuccessor(director);
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(ceo);
        return sales;

    }
}
