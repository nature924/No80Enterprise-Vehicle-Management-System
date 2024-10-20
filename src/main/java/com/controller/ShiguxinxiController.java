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

import com.entity.ShiguxinxiEntity;
import com.entity.view.ShiguxinxiView;

import com.service.ShiguxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 事故信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-04 16:54:22
 */
@RestController
@RequestMapping("/shiguxinxi")
public class ShiguxinxiController {
    @Autowired
    private ShiguxinxiService shiguxinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiguxinxiEntity shiguxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiashiyuan")) {
			shiguxinxi.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShiguxinxiEntity> ew = new EntityWrapper<ShiguxinxiEntity>();

		PageUtils page = shiguxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiguxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShiguxinxiEntity shiguxinxi, 
		HttpServletRequest request){
        EntityWrapper<ShiguxinxiEntity> ew = new EntityWrapper<ShiguxinxiEntity>();

		PageUtils page = shiguxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiguxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiguxinxiEntity shiguxinxi){
       	EntityWrapper<ShiguxinxiEntity> ew = new EntityWrapper<ShiguxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiguxinxi, "shiguxinxi")); 
        return R.ok().put("data", shiguxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiguxinxiEntity shiguxinxi){
        EntityWrapper< ShiguxinxiEntity> ew = new EntityWrapper< ShiguxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiguxinxi, "shiguxinxi")); 
		ShiguxinxiView shiguxinxiView =  shiguxinxiService.selectView(ew);
		return R.ok("查询事故信息成功").put("data", shiguxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiguxinxiEntity shiguxinxi = shiguxinxiService.selectById(id);
        return R.ok().put("data", shiguxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiguxinxiEntity shiguxinxi = shiguxinxiService.selectById(id);
        return R.ok().put("data", shiguxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShiguxinxiEntity shiguxinxi, HttpServletRequest request){
    	shiguxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiguxinxi);
        shiguxinxiService.insert(shiguxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShiguxinxiEntity shiguxinxi, HttpServletRequest request){
    	shiguxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiguxinxi);
        shiguxinxiService.insert(shiguxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShiguxinxiEntity shiguxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiguxinxi);
        shiguxinxiService.updateById(shiguxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shiguxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
