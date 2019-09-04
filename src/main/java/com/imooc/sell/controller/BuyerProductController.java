package com.imooc.sell.controller;

import com.imooc.sell.VO.ProductInfoVO;
import com.imooc.sell.VO.ProductVO;
import com.imooc.sell.VO.ResultVO;
import com.imooc.sell.dataobject.ProductCategory;
import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.service.CategoryService;
import com.imooc.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName BuyerProductController
 * @Description 买家商品
 * @Author GOODRR
 * @Date 2019/9/4 15:24
 * @Version 1.0
 **/
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController
{
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO list()
    {
        /**
         * 1查询所有上架商品
         * 2查询类目(一次性查询
         * 3数据拼装
         */
        List<ProductInfo> productInfoList = productService.findUpAll();
//        List<Integer> categotyTypelist = new ArrayList<>();
//        for (ProductInfo productInfo : productInfoList)
//        {
//            categotyTypelist.add(productInfo.getCategoryType());
//        }
        List<Integer> collect = productInfoList.stream().map(x -> x.getCategoryType()).collect(Collectors.toList());
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(collect);

        ResultVO resultVO = new ResultVO();
        ProductVO productVO = new ProductVO();
        ProductInfoVO productInfoVO = new ProductInfoVO();
        resultVO.setMsg("0");
        resultVO.setMsg("成功");
        productVO.setProductInfoVOList(Arrays.asList(productInfoVO));
        resultVO.setData(Arrays.asList(productVO));

        return resultVO;
    }
}
