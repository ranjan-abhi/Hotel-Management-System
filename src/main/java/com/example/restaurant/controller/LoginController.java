package com.example.restaurant.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.restaurant.dao.RestaurantAdminDao;
import com.example.restaurant.dao.RestaurantAdminDaoImpl;
import com.example.restaurant.model.Login;
import com.example.restaurant.model.RestaurantAdmin;


@Controller
public class LoginController {

	RestaurantAdminDao restaurantAdminDao = new RestaurantAdminDaoImpl();
	
  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("restaurantAdminLogin");
    mav.addObject("login", new Login());

    return mav;
  }

  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("login") Login login) {
    ModelAndView mav = null;

    RestaurantAdmin restaurantAdmin = restaurantAdminDao.validateUser(login);
   
    
    if (null != restaurantAdmin) {
    	 restaurantAdminDao.setCurrentAdmin(restaurantAdmin);
    	 mav = new ModelAndView("redirect:/homepage");
//    mav.addObject("firstname", restaurantAdmin.getFirstname());
    } else {
    mav = new ModelAndView("restaurantAdminLogin");
    mav.addObject("message", "Username or Password is wrong!!");
    }

    return mav;
  }

}