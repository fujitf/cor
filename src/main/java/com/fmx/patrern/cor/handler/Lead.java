package com.fmx.patrern.cor.handler;

/**
 * @Author：fangmeixiu
 * @Description:
 * @Date :create in 下午10:18 2019/3/14
 */
public class Lead extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if(discount <=0.15){
            System.out.format("%s批准了折扣：%.2f%n",this.getClass().getName(),discount);
        }else{
            successor.processDiscount(discount);
        }
    }
}
