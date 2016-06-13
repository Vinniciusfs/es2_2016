package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.ActivitysDAO;
import model.Activity;

public class DefaultController {
	@Autowired
	private ActivitysDAO activitysDAO;
	
	@RequestMapping(value="/")
	public ModelAndView listActivitys(ModelAndView model) throws IOException{
	    List<Activity> listContact = activitysDAO.listAll();
	    model.addObject("listContact", listContact);
	    model.setViewName("home");
	    return model;
	}
	
	@RequestMapping(value="/search")
	public ModelAndView search(ModelAndView model, HttpServletRequest request) {
		String fullSearch = request.getParameter("search");
		List<String> tags = new ArrayList<String>();
		tags = Arrays.asList(fullSearch.split("\\s+"));
	    List<Activity> listContact = activitysDAO.listByTags(tags);
	    model.addObject("listContact", listContact);
	    model.setViewName("home");
	    return model;
	}
	
	@RequestMapping(value = "/addTag", method = RequestMethod.POST)
	public ModelAndView addTag(HttpServletRequest request) {
		int id_activity = Integer.parseInt(request.getParameter("id_activity"));
		String new_tag = request.getParameter("new_tag");
	    activitysDAO.insertTag(id_activity, new_tag);
	    return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/deleteTag", method = RequestMethod.GET)
	public ModelAndView deleteTag(HttpServletRequest request) {
		String name_tag = request.getParameter("name_tag");
		activitysDAO.deleteTag(name_tag);
		return new ModelAndView("redirect:/");
	}
	
}
	