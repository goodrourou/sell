package com.imooc.dto;

import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @ClassName OrderDTO
 * @Description
 * @Author GOODRR
 * @Date 2019/9/5 15:34
 * @Version 1.0
 **/
@Data
public class OrderDTO
{
    /** 订单ID*/
    private String orderId;
    /** 买家名字*/
    private String buyerName;
    /** 买家手机号*/
    private String buyerPhone;
    /** 买家地址*/
    private String buyerAddress;
    /** 买家微信openId*/
    private String buyerOpenid;
    /** 订单总金额*/
    private BigDecimal orderAmount;
    /** 订单状态, 默认为0新下单*/
    private Integer orderStatus;
    /** 支付状态, 默认为0未支付*/
    private Integer payStatus;
    /** 创建时间*/
    private Date createTime;
    /** 更新时间*/
    private Date updateTime;

    private List<OrderDetail> orderDetailList;
}
