package com.example.demo.controller;



import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.OutageDAOImpl;
import com.example.demo.entity.FisFuelOutageBO;
import com.example.demo.service.OutageService;


import lombok.experimental.NonFinal;

@RestController
public class OutageController {

	/*
	 * @Autowired OutageService outageService;
	 */
	
	@Autowired
	OutageDAOImpl outageDAOImpl;
	
	
    @RequestMapping("/Outage")
    public int greeting(@RequestParam(value="OutageRegion", defaultValue="US") String name) {
        return new Integer("3000");
    
    }

	
    @RequestMapping("/Outage10")
    public int greeting1(@RequestParam(value="OutageRegion", defaultValue="US") String name) {
       
    	
    	
    	return outageDAOImpl.getOutageCount1();
    
    }

	





}