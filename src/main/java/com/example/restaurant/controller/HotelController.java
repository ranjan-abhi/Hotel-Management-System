package com.example.restaurant.controller;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.restaurant.dao.HotelDaoImplementation;
import com.example.restaurant.model.Hotel;




@Controller
public class HotelController {
	
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/com/example/restaurant/controller/beans.xml");
	private static final String[] options= {"true","false"};
	private HotelDaoImplementation hdao=(HotelDaoImplementation) context.getBean("hdao");
	
	@RequestMapping(value="/hotelresponse")
	public ModelAndView processUser(Hotel hotel) {
		ModelAndView modelandview=new ModelAndView();
		modelandview.setViewName("hotel_CreateResponse");
		modelandview.addObject("u",hotel);
		hdao.insert(hotel);
		
		return modelandview;	
	}
	
	@RequestMapping(value="/showDetails/{username}")
	public ModelAndView showDetails(@PathVariable String username) {
		ModelAndView modelandview=new ModelAndView();
		
		Hotel h=hdao.getHotel(username);
		modelandview.setViewName("hotel_DisplayDetails");
		modelandview.addObject("u",h);
		return modelandview;	
	}

	//_______________________________________________________________________________________________

	@RequestMapping(value="/deletehotel")
	public ModelAndView deleteAdmin(Hotel hotel) {
		return new ModelAndView("hotel_Delete","hotel",context.getBean("hotel"));			//Dependency Injection
	}
	
	@RequestMapping(value="/hoteldeleteresponse/{username}")
	public ModelAndView processdelete(Hotel hotel,@PathVariable String username) {
		ModelAndView modelandview=new ModelAndView();
		
		modelandview.setViewName("hotel_DeleteResponse");
		modelandview.addObject("u",hotel);
		
		return modelandview;
	}
	
	@RequestMapping("/updatehotel")
	public ModelAndView update() {
		ModelAndView modelandview = new ModelAndView("hotel_Create","hotel",context.getBean("hotel"));	//Dependency Injection
		modelandview.addObject("options",options);
		return modelandview;
	}
	
	@RequestMapping(value="hotelupdateresponse/{username}")
	public ModelAndView processupdate(Hotel hotel,@PathVariable String username) {
		ModelAndView modelandview=new ModelAndView();
		hdao.update(hotel,username);
		modelandview.setViewName("hotel_UpdateResponse");
		modelandview.addObject("u",hotel);		
		return modelandview;
	}
	
	@RequestMapping("/seeallhotels")
	public ModelAndView display() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("hotel_DisplayAll");
		List<Hotel> temp=hdao.getAll();
		modelandview.addObject("temp",temp);
		return modelandview;
	}
}
