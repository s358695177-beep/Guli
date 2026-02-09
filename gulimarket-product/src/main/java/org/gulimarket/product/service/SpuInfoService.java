package org.gulimarket.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.common.utils.PageUtils;
import org.gulimarket.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author SJT
 * @email s358695177@gmail.com
 * @date 2026-02-04 18:17:43
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

