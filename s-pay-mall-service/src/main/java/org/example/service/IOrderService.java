package org.example.service;

import org.example.domain.req.ShopCartReq;
import org.example.domain.res.PayOrderRes;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description 订单服务接口
 * @create 2024-09-29 09:43
 */
public interface IOrderService {

    PayOrderRes createOrder(ShopCartReq shopCartReq) throws Exception;

}
