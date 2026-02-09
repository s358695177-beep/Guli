package org.gulimarket.product.dao;

import org.gulimarket.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author SJT
 * @email s358695177@gmail.com
 * @date 2026-02-04 18:17:43
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
