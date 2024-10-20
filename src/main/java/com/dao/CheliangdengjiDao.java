package com.dao;

import com.entity.CheliangdengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheliangdengjiVO;
import com.entity.view.CheliangdengjiView;


/**
 * 车辆登记
 * 
 * @author 
 * @email 
 * @date 2023-05-04 16:54:22
 */
public interface CheliangdengjiDao extends BaseMapper<CheliangdengjiEntity> {
	
	List<CheliangdengjiVO> selectListVO(@Param("ew") Wrapper<CheliangdengjiEntity> wrapper);
	
	CheliangdengjiVO selectVO(@Param("ew") Wrapper<CheliangdengjiEntity> wrapper);
	
	List<CheliangdengjiView> selectListView(@Param("ew") Wrapper<CheliangdengjiEntity> wrapper);

	List<CheliangdengjiView> selectListView(Pagination page,@Param("ew") Wrapper<CheliangdengjiEntity> wrapper);
	
	CheliangdengjiView selectView(@Param("ew") Wrapper<CheliangdengjiEntity> wrapper);
	

}
