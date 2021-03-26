package com.example.restaurant.controller;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.restaurant.dao.CabAdminDao;
import com.example.restaurant.dao.CabDao;
import com.example.restaurant.model.Cab;
import com.example.restaurant.model.CabAdmin;



@Controller
public class CRUDController {
	private static final String[] types= {"HatchBack", "Seden", "SUV"};
	CabDao dao = new CabDao();
	CabAdminDao adao = new CabAdminDao();
	String username = "";
	
	@RequestMapping(value = "/registerform")
	public ModelAndView registerform() {
		ModelAndView mv = new ModelAndView("Register_page", "CabAdmin", new CabAdmin());
		return mv;
	}
	
	@RequestMapping(value = "/registerAdmin")
	public String register(CabAdmin admin) {
		adao.save(admin);
		return "redirect:/loginform.mvc";
	}

	@RequestMapping(value = "/loginform")
	public ModelAndView loginform() {
		ModelAndView mv = new ModelAndView("login_page");
		return mv;
	}
	
	@RequestMapping(value = "/authenticator")
	public String authenticate(String uname, String upwd) {
		boolean userfound = adao.authenticate(uname,upwd);
		if(userfound) {
			username = uname;
			return "redirect:/home.mvc";
		}
		return "redirect:/loginform.mvc";
	}
	
	
	@RequestMapping(value = "/home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home_page");
		mv.addObject("username", username);
		return mv;
	}
	
	@RequestMapping(value = "/view_admin")
	public ModelAndView view_admin() {
		ModelAndView mv = new ModelAndView();
		CabAdmin admin = adao.fetchByName(username);
		mv.addObject("Admin", admin);
		mv.setViewName("view_admin");
		return mv;
		
	}
	
	@RequestMapping(value ="/edit_admin")
	public ModelAndView edit_admin() {
		ModelAndView mv = new ModelAndView();
		CabAdmin admin = adao.fetchByName(username);
		mv.addObject("Admin", admin);
		mv.setViewName("edit_admin");
		
		return mv;
	}
	
	@RequestMapping(value = "/saveAdmin")
    public String save_admin(CabAdmin admin) {
		adao.update(admin);
		return "redirect:/home.mvc";
	}
	
	@RequestMapping(value = "/deleteAdmin")
    public String delete_admin() {
		CabAdmin admin = adao.fetchByName(username);
		adao.delete_acc(admin);
		return "redirect:/loginform.mvc";
	}
	
	@RequestMapping(value = "/createform")
	public ModelAndView addform() {
		ModelAndView mv = new ModelAndView("create_page", "Cab", new Cab());
		mv.addObject("types", types);
		return mv;
	}
	
//	@RequestMapping(value = "/submitForm")
//	 public String submit(@ModelAttribute("Cab") Cab cab)  
//	    {  
//	    		CabAdmin admin = adao.fetchByName(username);
//	    		admin.getCabs().add(cab);
//	    		adao.save(admin);
//	    		return "redirect:/view.mvc";
// 
//	    }
	
	@RequestMapping(value = "/submitForm")
	public String submit(@ModelAttribute("Cab") Cab cab)  
	{  
	  System.out.println("USERNAME" + username);
	  adao.save_cab(cab,username);
	  return "redirect:/view.mvc";
	}
	
	
	@RequestMapping(value = "/saveForm")
	 public String save(@ModelAttribute("Cab") Cab cab)  
	    {  	
	        	dao.save(cab);
	    		return "redirect:/view.mvc";
	    }  
	
	@RequestMapping(value ="/editform")
	public ModelAndView edit(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		Cab editCab = dao.fetchCabById(id);
		mv.addObject("cab", editCab);
		mv.addObject("types", types);
		mv.setViewName("edit_page");
		
		return mv;
	}

	@RequestMapping(value ="/delete")
	public String delete(@RequestParam int id) {
		adao.delete(id, username);
		return "redirect:/view.mvc";
	}
	
	@RequestMapping(value = "/view")
	public ModelAndView view() {
		ModelAndView mv = new ModelAndView();
		CabAdmin admin = adao.fetchByName(username);
		List<Cab> list = admin.getCabs();
		mv.addObject("cabs", list);
		mv.setViewName("view_page");
		
		return mv;
	}
	
//	@RequestMapping(value = "/search")
//	public ModelAndView search() {
//		ModelAndView mv = new ModelAndView();
//		
//		mv.setViewName("search_result");
//		return mv;
//		
//	}
	
/*	@RequestMapping(value = "/bookCab")
	public Cab book(@RequestParam int id,Request request) {
		Cab cab= dao.bookCab(id,request);

		return cab;
	}*/
	
	@ModelAttribute("Cab")
	public Cab generateCab() {
		Cab cab = new Cab();
		return cab;
	}
	
	@ModelAttribute("CabAdmin")
	public CabAdmin generateCabAdmin() {
		CabAdmin admin = new CabAdmin();
		return admin;
	}

}