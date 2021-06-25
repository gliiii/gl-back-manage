package com.glii.glbackmanage.controller;

import com.glii.glbackmanage.vo.DataVO;
import com.glii.glbackmanage.vo.ProductVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("list")
    public DataVO<ProductVO> list() {
        return null;
    }
}
