package com.example.restaurant.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.example.restaurant.dao.DishDao;
import com.example.restaurant.dao.DishDaoImpl;
import com.example.restaurant.dao.RestaurantAdminDao;
import com.example.restaurant.dao.RestaurantAdminDaoImpl;
import com.example.restaurant.dao.RestaurantDao;
import com.example.restaurant.dao.RestaurantDaoImpl;
import com.example.restaurant.model.Dish;
import com.example.restaurant.model.Restaurant;
import com.example.restaurant.model.RestaurantAdmin;
import com.sun.tools.javac.code.Source;

@Controller
public class RestaurantController
{
	  
	RestaurantAdminDao restaurantAdminDao = new RestaurantAdminDaoImpl();
	 RestaurantDao restaurantDaoImpl = new RestaurantDaoImpl();
	 int restaurantId = 0;
	 DishDao dishDao = new DishDaoImpl();
	 
	 
    @RequestMapping(value = "create/dish",method = RequestMethod.GET)
    public String addDishSetupForm(Model model)
    {
         Dish dish = new Dish();
         model.addAttribute("Dish", dish);
         return "addDish";
    }
    
    @RequestMapping(value = "create/dish",method = RequestMethod.POST)
    public String addDishSubmitForm(@ModelAttribute("dish") Dish dish)
    {
//         dishDao.create(dish);
    	 Restaurant restaurant = restaurantDaoImpl.getRestaurantById(restaurantId);
    	 restaurant.getDishes().add(dish);
    	 restaurantDaoImpl.update(restaurant);
         return "redirect:/homepage";
    }
    
    @RequestMapping(value = "/view/dish")
    public String success(Model model1)
    {
    	List<Dish> list = restaurantDaoImpl.getDishesFromRestaurant(restaurantId);
        model1.addAttribute("list", list);
    	return "view";
    }
    
    @RequestMapping(value="/edit/dish/{id}")    
    public String editDish(@PathVariable int id, Model m){  
    	Dish dish = dishDao.getDishById(id);    
        m.addAttribute("command",dish);  
        return "dishEditForm";    
    }
    
    @RequestMapping(value="/edit/dish",method = RequestMethod.POST)    
    public String editsaveDish(@ModelAttribute("dish") Dish dish){ 
    	
    	dishDao.update(dish);
        return "redirect:/view/dish";    
    }
    
    @RequestMapping(value="/delete/dish/{id}")    
    public String delete(@PathVariable int id){
    	
    	dishDao.delete(restaurantId, id); 
        return "redirect:/view/dish";    
    }
    
    @RequestMapping(value = "/create/restaurant", method = RequestMethod.GET)
    public String restaurantForm(Model model)
    {
    	Restaurant restaurant = new Restaurant();
        model.addAttribute("restaurant", restaurant);
        model.addAttribute("restaurantAdmin", restaurantAdminDao.getCurrentAdmin());
        return "addRestaurant";
    }
    
    @RequestMapping(value = "/homepage", method = RequestMethod.GET)
    public String restaurantHomepage(Model model)
    {
    
    	RestaurantAdmin restaurantAdmin = restaurantAdminDao.getCurrentAdmin();
    	
    	Restaurant restaurant = restaurantAdmin.getRestaurant();
//    	
    	if (restaurant == null) {
    		return "redirect:/create/restaurant";
		}
    	restaurantId = restaurant.getId();
    	restaurant = restaurantDaoImpl.getRestaurantById(restaurantId);
    	
    	model.addAttribute("restaurantAdmin", restaurantAdmin);
    	model.addAttribute("restaurant", restaurant);
        return "addSuccess";
    }
    
    @RequestMapping(value = "/homepage", method = RequestMethod.POST)
    public String restaurantForm(@ModelAttribute("restaurant") Restaurant restaurant)
    {
    	
//    	restaurantId = restaurantDaoImpl.create(restaurant);
    	RestaurantAdmin restaurantAdmin = restaurantAdminDao.getCurrentAdmin();
    	restaurantAdmin.setRestaurant(restaurant);
    	restaurantAdminDao.update(restaurantAdmin);
        return "redirect:/homepage";
    }
    
    @RequestMapping(value="/editRestaurant/{id}")    
    public String edit(@PathVariable int id, Model m){  
    	Restaurant restaurant = restaurantDaoImpl.getRestaurantById(restaurantId);    
        m.addAttribute("command",restaurant);  
        return "restaurantEditForm";    
    } 
    

    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("restaurant") Restaurant restaurant){ 
    	
    	restaurant.setDishes(restaurantDaoImpl.getDishesFromRestaurant(restaurantId));
    	System.out.println("resturant name update " + restaurant.getName());
    	restaurantDaoImpl.update(restaurant);
    	RestaurantAdmin restaurantAdmin = restaurantAdminDao.getCurrentAdmin();
    	restaurantAdmin.setRestaurant(restaurant);
    	restaurantAdminDao.update(restaurantAdmin);
    	
    	
        return "redirect:/homepage";    
    }
       
    
     
}