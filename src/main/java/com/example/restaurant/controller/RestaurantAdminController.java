package com.example.restaurant.controller;

import java.net.http.HttpClient.Redirect;

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
import com.example.restaurant.model.Restaurant;
import com.example.restaurant.model.RestaurantAdmin;


@Controller
public class RestaurantAdminController {
	
	RestaurantAdminDao restaurantAdminDao = new RestaurantAdminDaoImpl();

  @RequestMapping(value = "/register", method = RequestMethod.GET)
  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("restaurantAdminRegister");
    mav.addObject("user", new RestaurantAdmin());

    return mav;
  }
  

  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("user") RestaurantAdmin restaurantAdmin) {
	  
  restaurantAdminDao.register(restaurantAdmin);
//  restaurantAdminDao.setCurrentAdmin(restaurantAdmin);

  return new ModelAndView("welcome", "firstname", restaurantAdmin);
  }
  
  @RequestMapping(value = "/edit/admin", method = RequestMethod.GET)
  public ModelAndView editAdmin(HttpServletRequest request, HttpServletResponse response) {
	  
	RestaurantAdmin restaurantAdmin = restaurantAdminDao.getCurrentAdmin();
    ModelAndView mav = new ModelAndView("AdminEditForm");
    mav.addObject("command", restaurantAdmin);

    return mav;
  }
  
  @RequestMapping(value = "/edit/admin", method = RequestMethod.POST)
  public ModelAndView editAdminSuccess(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("user") RestaurantAdmin restaurantAdmin) {
	
	System.out.println("Printing" + restaurantAdmin.getId() + " " + restaurantAdminDao.getCurrentAdmin().getId());
	Restaurant restaurant = restaurantAdminDao.getCurrentAdmin().getRestaurant();
	System.out.println("restaurant id : " + restaurant.getName());
    restaurantAdmin.setRestaurant(restaurant);
	restaurantAdminDao.merge(restaurantAdmin);
    return new ModelAndView("redirect:/homepage");
  }
  
  @RequestMapping(value = "/delete/admin", method = RequestMethod.GET)
  public ModelAndView deleteAdmin(HttpServletRequest request, HttpServletResponse response) {
	  
	RestaurantAdmin restaurantAdmin = restaurantAdminDao.getCurrentAdmin();
	restaurantAdminDao.delete(restaurantAdmin);
	return new ModelAndView("redirect:/login");
  }
  
}