package com.imooc.utils;

import java.util.Random;

/**
 * @ClassName KeyUtil
 * @Description
 * @Author GOODRR
 * @Date 2019/9/5 16:09
 * @Version 1.0
 **/
public class KeyUtil
{
    /**
     * 生成唯一的主键
     * 格式: 时间 + 随机数
     * @return
     */
    public static synchronized String genUniqueKey()
    {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
