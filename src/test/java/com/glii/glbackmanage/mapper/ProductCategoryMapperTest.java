package com.glii.glbackmanage.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProductCategoryMapperTest {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Test
    void test() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id", 655);
        System.out.println(productCategoryMapper.selectOne(queryWrapper));
    }

}