package com.dao;

import com.entity.ShiguxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiguxinxiVO;
import com.entity.view.ShiguxinxiView;


/**
 * 事故信息
 * 
 * @author 
 * @email 
 * @date 2023-05-04 16:54:22
 */
public interface ShiguxinxiDao extends BaseMapper<ShiguxinxiEntity> {
	
	List<ShiguxinxiVO> selectListVO(@Param("ew") Wrapper<ShiguxinxiEntity> wrapper);
	
	ShiguxinxiVO selectVO(@Param("ew") Wrapper<ShiguxinxiEntity> wrapper);
	
	List<ShiguxinxiView> selectListView(@Param("ew") Wrapper<ShiguxinxiEntity> wrapper);

	List<ShiguxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShiguxinxiEntity> wrapper);
	
	ShiguxinxiView selectView(@Param("ew") Wrapper<ShiguxinxiEntity> wrapper);
	

}
