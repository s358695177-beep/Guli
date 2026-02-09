package org.gulimarket.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.common.utils.PageUtils;
import org.gulimarket.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author SJT
 * @email s358695177@gmail.com
 * @date 2026-02-04 18:17:43
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

