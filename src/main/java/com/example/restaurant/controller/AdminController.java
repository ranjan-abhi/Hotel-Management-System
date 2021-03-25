package com.example.restaurant.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.restaurant.dao.AdminDaoImplementation;
import com.example.restaurant.model.Admin;
import com.example.restaurant.model.Hotel;
import com.example.restaurant.model.Room;


@Controller
public class AdminController {
	
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/com/example/restaurant/controller/beans.xml");
	private static final String[] gender= {"male","female","other"};
	private AdminDaoImplementation adao=(AdminDaoImplementation) context.getBean("adao");	

	static SessionFactory sessionFactory=null;
	
	@RequestMapping("/login_signup")
	public ModelAndView loginSignup() {
		return new ModelAndView("login_signup");
	}

	@RequestMapping("/adminauth")
	public ModelAndView adminauth() {
		String admin="admin";
		return new ModelAndView("admin_login",admin,context.getBean(admin));
	}
	
	@RequestMapping("/adminauthresponse")
	public ModelAndView adminauthresponse(Admin admin) {
		ModelAndView modelandview=new ModelAndView();
		boolean b=adao.auth(admin.getUsername(),admin.getPassword());
		if(b) {
			modelandview.setViewName("adminsuccessresponse");
			modelandview.addObject("username", admin.getUsername());
			return modelandview;
		}
		else {
			modelandview.setViewName("adminfailiureresponse");
			modelandview.addObject("u", admin);
			return modelandview;
		}
	}
	
	@RequestMapping("/dashboard")
	public ModelAndView goToDashboard() {
		return new ModelAndView("dashboard");
	}

	
	@RequestMapping("/adminsignup")
	public ModelAndView signup() {
		String admin="admin";
		ModelAndView modelandview = new ModelAndView("admin_SignUpForm",admin,context.getBean(admin));	//Dependency Injection
		modelandview.addObject("genders",gender);
		return modelandview;
	}
	
	@RequestMapping(value="/adminresponse")
	public ModelAndView processUser(Admin admin) {
		ModelAndView modelandview=new ModelAndView();
		Hotel h=(Hotel)context.getBean("hotel");													//DI - Hotel
		h.setName("temporary Name");
		h.setDescription("sample description");
		List<Room> l=new ArrayList<>();
		h.setRooms(l);
		admin.setHotel(h);
		boolean b=adao.insert(admin);
		if(b) {
		modelandview.setViewName("admin_SignUpResponse");
		modelandview.addObject("u",admin); 
		modelandview.addObject("username",admin.getUsername());
		return modelandview;
		}
		modelandview.setViewName("userexists");
		modelandview.addObject("u",admin.getUsername()); 
		return modelandview;
	}
	
	@RequestMapping(value="/deleteadmin")
	public ModelAndView deleteAdmin(Admin admin) {
		return new ModelAndView("admin_Delete","admin",context.getBean("admin"));
	}
	
	@RequestMapping(value="/admindeleteresponse")
	public ModelAndView processdelete(Admin admin) {
		ModelAndView modelandview=new ModelAndView();
		adao.delete(admin.getUsername());
		modelandview.setViewName("admin_DeleteResponse");
		modelandview.addObject("u",admin);
		return modelandview;
	}
	
	@RequestMapping("/updateadminaccount")
	public ModelAndView update() {
		ModelAndView modelandview = new ModelAndView("admin_UpdateForm","admin",context.getBean("admin"));			//Dependency Injection
		modelandview.addObject("genders",gender);
		return modelandview;
	}
	
	@RequestMapping(value="/adminupdateresponse/{username}")
	public ModelAndView processupdate(Admin admin,@PathVariable("username") String username) {
		ModelAndView modelandview=new ModelAndView();
		admin.setUsername(username);
		adao.update(admin);
		modelandview.setViewName("admin_UpdateResponse");
		modelandview.addObject("u",admin);		
		return modelandview;
	}
	
	@RequestMapping(value="/displayAdminData/{username}")
	public ModelAndView displaydetails(@PathVariable("username") String username) {
		System.out.println(username);
		ModelAndView modelandview=new ModelAndView();
		Admin a=adao.getAdmin(username);
		modelandview.setViewName("admin_UpdateResponse");
		modelandview.addObject("u",a);		
		return modelandview;
	}

}
    