package com.fmx.patrern.cor.handler;

/**
 * @Author：fangmeixiu
 * @Description:
 * @Date :create in 下午10:03 2019/3/10
 */

/**
 * 销售，可以批准5%以内的折扣
 *
 * */
public class Sales extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if(discount <=0.05){
            System.out.format("%s批准了折扣：%.2f%n",this.getClass().getName(),discount);
        }else{
            successor.processDiscount(discount);
        }
    }
}
