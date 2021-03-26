package com.example.restaurant.controller;

import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.restaurant.dao.RoomDaoImplementation;
import com.example.restaurant.model.Room;



@Controller
public class RoomController {
	
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/com/example/restaurant/controller/beans.xml");
	private RoomDaoImplementation rdao=(RoomDaoImplementation)context.getBean("rdao");
	
	@RequestMapping("/roomcreate")
	public ModelAndView createHotel() {
		return new ModelAndView("room_Create","room",context.getBean("room"));			//Dependency Injection
	}
	
	@RequestMapping(value="/roomresponse/{username}")
	public ModelAndView processUser(Room room,@PathVariable String username) {
		ModelAndView modelandview=new ModelAndView();
		modelandview.setViewName("room_CreateResponse");
		modelandview.addObject("u",room);
		rdao.insert(room,username);
		return modelandview;	
	}
	
	@RequestMapping(value="/deleteroom")
	public ModelAndView deleteAdmin(Room room) {
		return new ModelAndView("room_Delete","room",context.getBean("room"));			//Dependency Injection
	}
	
	@RequestMapping(value="/deleteresponse/{id}/{username}")
	public ModelAndView processdelete(@PathVariable("id") int id,@PathVariable("username") String username) {
		ModelAndView modelandview=new ModelAndView();
		rdao.delete(id,username);
		modelandview.setViewName("room_DeleteResponse");
		
		return modelandview;
	}
	
	@RequestMapping("/updateroom/{id}")
	public ModelAndView update(@PathVariable("id") int id) {
		ModelAndView modelandview = new ModelAndView("room_UpdateForm","room",context.getBean("room"));
		modelandview.addObject("id", id);//Dependency Injection
		return modelandview;
	}
	
	@RequestMapping(value="/roomupdateresponse/{id}")
	public ModelAndView processupdate(Room room, @PathVariable("id") int id) {
		ModelAndView modelandview=new ModelAndView();
		rdao.update(room,id);
		modelandview.setViewName("room_UpdateResponse");
		modelandview.addObject("u",room);
		
		return modelandview;
	}
	
	@RequestMapping("/seeallrooms/{username}")
	public ModelAndView display(@PathVariable String username) {
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("room_DisplayAll");
		List<Room> temp=rdao.getAll(username);
		modelandview.addObject("temp",temp);
		return modelandview;
	}
		
}