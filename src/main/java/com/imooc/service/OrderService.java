package com.imooc.service;

import com.imooc.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @ClassName OrderService
 * @Description
 * @Author GOODRR
 * @Date 2019/9/5 15:27
 * @Version 1.0
 **/
public interface OrderService
{
    /** 创建订单*/
    OrderDTO create(OrderDTO orderDTO);
    /** 查询单个订单*/
    OrderDTO findById(String orderId);
    /** 查询订单列表*/
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);
    /** 取消订单*/
    OrderDTO cancel(OrderDTO orderDTO);
    /** 完结订单*/
    OrderDTO finish(OrderDTO orderDTO);
    /** 支付订单*/
    OrderDTO paid(OrderDTO orderDTO);
}
