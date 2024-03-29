package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import com.imooc.repository.ProductCategoryRepository;
import com.imooc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @ClassName CategoryServiceImpl
 * @Description
 * @Author GOODRR
 * @Date 2019/9/4 9:45
 * @Version 1.0
 **/
@Service
public class CategoryServiceImpl implements CategoryService
{
    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public Optional<ProductCategory> findOne(Integer categoryId)
    {
        return repository.findById(categoryId);
    }

    @Override
    public List<ProductCategory> findAll()
    {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList)
    {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory)
    {
        return repository.save(productCategory);
    }
}
