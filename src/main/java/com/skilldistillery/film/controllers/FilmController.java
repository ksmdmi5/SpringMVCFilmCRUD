package com.skilldistillery.film.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.film.dao.FilmDAO;
import com.skilldistillery.film.entities.Film;

@Controller
public class FilmController {

	@Autowired
	private FilmDAO filmDAO;
	
	@RequestMapping(path="GetFilmById.do",
			params="filmId",
			method= RequestMethod.GET)
	
	public ModelAndView getFilmId(@RequestParam("filmId") String n) {
		int filmId = Integer.parseInt(n);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("WEB-INF/main.jsp");
		mv.addObject("film", filmDAO.getFilmById(filmId));
		
		return mv;
	}
	
	@RequestMapping(path="AddFilm.do",
			method= RequestMethod.GET)
	public ModelAndView addNewFilm() {
		ModelAndView mv = new ModelAndView();
		Film f = new Film();
		mv.addObject("newFilm", f);
		mv.setViewName("WEB-INF/update.jsp");
		return mv;
	}
	@RequestMapping(path="AddFilm.do", method=RequestMethod.POST)
	public ModelAndView create (Film f) {
		filmDAO.addNewFilm(f);
		ModelAndView mv = new ModelAndView();
		mv.addObject("newFilm", f);
		mv.setViewName("WEB-INF/view-update.jsp");
	    return mv;
	  }
	
	
}
