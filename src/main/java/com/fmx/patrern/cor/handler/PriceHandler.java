package com.fmx.patrern.cor.handler;

/**
 * @Author：fangmeixiu
 * @Description:
 * @Date :create in 下午9:57 2019/3/10
 */

/**
 * 价格处理人，负责处理客户折扣申请
 *
 *
 * */
public abstract class PriceHandler {
    /**
     *
     * 直接后递，用于传递请求，这里使用protected访问权限，是需要所有的子类都能访问到successor
     * */

    protected PriceHandler successor;

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    /**处理折扣申请*/

    public abstract  void  processDiscount(float  discount);

}
