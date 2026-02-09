package org.gulimarket.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.common.utils.PageUtils;
import org.gulimarket.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author SJT
 * @email s358695177@gmail.com
 * @date 2026-02-04 18:17:43
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

