package com.dao;

import com.entity.WeizhangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeizhangxinxiVO;
import com.entity.view.WeizhangxinxiView;


/**
 * 违章信息
 * 
 * @author 
 * @email 
 * @date 2023-05-04 16:54:23
 */
public interface WeizhangxinxiDao extends BaseMapper<WeizhangxinxiEntity> {
	
	List<WeizhangxinxiVO> selectListVO(@Param("ew") Wrapper<WeizhangxinxiEntity> wrapper);
	
	WeizhangxinxiVO selectVO(@Param("ew") Wrapper<WeizhangxinxiEntity> wrapper);
	
	List<WeizhangxinxiView> selectListView(@Param("ew") Wrapper<WeizhangxinxiEntity> wrapper);

	List<WeizhangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<WeizhangxinxiEntity> wrapper);
	
	WeizhangxinxiView selectView(@Param("ew") Wrapper<WeizhangxinxiEntity> wrapper);
	

}
