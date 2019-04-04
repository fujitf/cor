package com.fmx.patrern.cor.handler;

/**
 * @Author：fangmeixiu
 * @Description:
 * @Date :create in 下午10:06 2019/3/10
 */

/**
 * 经理，可以批准30%以内的折扣
 *
 * */
public class Manager extends  PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if(discount <=0.3){
            System.out.format("%s批准了折扣：%.2f%n",this.getClass().getName(),discount);
        }else{
            successor.processDiscount(discount);
        }
    }
}
