package org.gulimarket.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.common.utils.PageUtils;
import org.gulimarket.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author SJT
 * @email s358695177@gmail.com
 * @date 2026-02-04 18:17:43
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

