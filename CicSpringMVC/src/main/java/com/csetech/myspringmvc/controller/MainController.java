package com.csetech.myspringmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.csetech.myspringmvc.dao.DiachinhDAO;
import com.csetech.myspringmvc.entity.Car;
import com.csetech.myspringmvc.entity.Diachinh;
import com.csetech.myspringmvc.entity.RequestCicWrapper;
import com.csetech.myspringmvc.entity.RequestWrapper;


@Controller
public class MainController {
		
	@Autowired 
	private DiachinhDAO diachinhDAO; 
	
	@RequestMapping({"/dcList"})
	public String dcList(Model model)
	{
		List<Diachinh> list = diachinhDAO.listDiachinh();
	     for (Diachinh dc : list) {
	         System.out.println("Ma dia chinh: " + dc.getDcMa());
	     }
	     model.addAttribute("diachinhs", list);
	     return "dcList";
		
	}
	
	@RequestMapping(value ="/dcListJson", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public @ResponseBody List<Diachinh> dcListJson()
	{
		try {
            return  diachinhDAO.listDiachinh();
            //return "true";
        } catch (Exception e) {
        	System.out.println(e.getMessage());
            return null;
        }
		
//	     for (Diachinh dc : list) {
//	         System.out.println("Ma dia chinh: " + dc.getDcMa());
//	     }
	    // model.addAttribute("diachinhs", list);
	    // return "dcList";
		
	}
	@RequestMapping({ "/", "/home", "/index" })
	public String home(Model model) {
		return "home";
	}
	@RequestMapping(value="/getObjectJson", method = RequestMethod.POST)
	public ResponseEntity<RequestCicWrapper> getMultiObjectDataJson(
			@RequestBody RequestCicWrapper wrapper){
        
		return new ResponseEntity<RequestCicWrapper>(wrapper,HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value = "/car", method = RequestMethod.POST)
	public ResponseEntity<Car> update(@RequestBody Car car) {	    
//		if (car != null) {
//	        car.setMiles(car.getMiles() + 100);
//	    }
	    // TODO: call persistence layer to update
	    return new ResponseEntity<Car>(car, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/carsandtrucks", method = RequestMethod.POST)
	public ResponseEntity<RequestWrapper> updateWithMultipleObjects(
	        @RequestBody RequestWrapper requestWrapper) {	    

	    // TODO: call persistence layer to update
	    return new ResponseEntity<RequestWrapper>(requestWrapper, HttpStatus.OK);
	}

}
