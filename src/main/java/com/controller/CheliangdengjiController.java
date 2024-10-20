package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.CheliangdengjiEntity;
import com.entity.view.CheliangdengjiView;

import com.service.CheliangdengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 车辆登记
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-04 16:54:22
 */
@RestController
@RequestMapping("/cheliangdengji")
public class CheliangdengjiController {
    @Autowired
    private CheliangdengjiService cheliangdengjiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CheliangdengjiEntity cheliangdengji,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiashiyuan")) {
			cheliangdengji.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<CheliangdengjiEntity> ew = new EntityWrapper<CheliangdengjiEntity>();

		PageUtils page = cheliangdengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, cheliangdengji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CheliangdengjiEntity cheliangdengji, 
		HttpServletRequest request){
        EntityWrapper<CheliangdengjiEntity> ew = new EntityWrapper<CheliangdengjiEntity>();

		PageUtils page = cheliangdengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, cheliangdengji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CheliangdengjiEntity cheliangdengji){
       	EntityWrapper<CheliangdengjiEntity> ew = new EntityWrapper<CheliangdengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( cheliangdengji, "cheliangdengji")); 
        return R.ok().put("data", cheliangdengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CheliangdengjiEntity cheliangdengji){
        EntityWrapper< CheliangdengjiEntity> ew = new EntityWrapper< CheliangdengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( cheliangdengji, "cheliangdengji")); 
		CheliangdengjiView cheliangdengjiView =  cheliangdengjiService.selectView(ew);
		return R.ok("查询车辆登记成功").put("data", cheliangdengjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        CheliangdengjiEntity cheliangdengji = cheliangdengjiService.selectById(id);
        return R.ok().put("data", cheliangdengji);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        CheliangdengjiEntity cheliangdengji = cheliangdengjiService.selectById(id);
        return R.ok().put("data", cheliangdengji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CheliangdengjiEntity cheliangdengji, HttpServletRequest request){
    	cheliangdengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(cheliangdengji);
        cheliangdengjiService.insert(cheliangdengji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CheliangdengjiEntity cheliangdengji, HttpServletRequest request){
    	cheliangdengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(cheliangdengji);
        cheliangdengjiService.insert(cheliangdengji);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody CheliangdengjiEntity cheliangdengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(cheliangdengji);
        cheliangdengjiService.updateById(cheliangdengji);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        cheliangdengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
