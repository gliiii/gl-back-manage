package com.glii.glbackmanage.service;

import com.glii.glbackmanage.vo.DataVO;
import com.glii.glbackmanage.vo.ProductVO;

public interface ProductService {

    public DataVO<ProductVO> findData(Integer page, Integer limit);
}
