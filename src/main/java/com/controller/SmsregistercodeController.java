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

import com.entity.SmsregistercodeEntity;
import com.entity.view.SmsregistercodeView;

import com.service.SmsregistercodeService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 短信验证码
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-04 16:54:23
 */
@RestController
@RequestMapping("/smsregistercode")
public class SmsregistercodeController {
    @Autowired
    private SmsregistercodeService smsregistercodeService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SmsregistercodeEntity smsregistercode,
		HttpServletRequest request){
        EntityWrapper<SmsregistercodeEntity> ew = new EntityWrapper<SmsregistercodeEntity>();

		PageUtils page = smsregistercodeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, smsregistercode), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SmsregistercodeEntity smsregistercode, 
		HttpServletRequest request){
        EntityWrapper<SmsregistercodeEntity> ew = new EntityWrapper<SmsregistercodeEntity>();

		PageUtils page = smsregistercodeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, smsregistercode), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SmsregistercodeEntity smsregistercode){
       	EntityWrapper<SmsregistercodeEntity> ew = new EntityWrapper<SmsregistercodeEntity>();
      	ew.allEq(MPUtil.allEQMapPre( smsregistercode, "smsregistercode")); 
        return R.ok().put("data", smsregistercodeService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SmsregistercodeEntity smsregistercode){
        EntityWrapper< SmsregistercodeEntity> ew = new EntityWrapper< SmsregistercodeEntity>();
 		ew.allEq(MPUtil.allEQMapPre( smsregistercode, "smsregistercode")); 
		SmsregistercodeView smsregistercodeView =  smsregistercodeService.selectView(ew);
		return R.ok("查询短信验证码成功").put("data", smsregistercodeView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        SmsregistercodeEntity smsregistercode = smsregistercodeService.selectById(id);
        return R.ok().put("data", smsregistercode);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        SmsregistercodeEntity smsregistercode = smsregistercodeService.selectById(id);
        return R.ok().put("data", smsregistercode);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SmsregistercodeEntity smsregistercode, HttpServletRequest request){
    	smsregistercode.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(smsregistercode);
        smsregistercodeService.insert(smsregistercode);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SmsregistercodeEntity smsregistercode, HttpServletRequest request){
    	smsregistercode.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(smsregistercode);
        smsregistercodeService.insert(smsregistercode);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody SmsregistercodeEntity smsregistercode, HttpServletRequest request){
        //ValidatorUtils.validateEntity(smsregistercode);
        smsregistercodeService.updateById(smsregistercode);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        smsregistercodeService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
