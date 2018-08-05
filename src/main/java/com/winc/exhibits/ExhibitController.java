package com.winc.exhibits;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExhibitController {
	
	@Autowired
	private ExhibitService exhibitService;
	
	@RequestMapping("/getExhibits")
	public List<Exhibit> getExhibits() {
		return this.exhibitService.getExhibits();
	}
	
	@RequestMapping("/getExhibit/{id}")
	public Exhibit getExhibit(@PathVariable int id) {
		return this.exhibitService.getExhibit(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addExhibit")
	public Exhibit addExhibit(@RequestBody Exhibit exhibit) {
		return this.exhibitService.addExhibit(exhibit);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updateExhibit/{id}")
	public Exhibit updateExhibit(@PathVariable int id, @RequestBody Exhibit exhibit) {
		return this.exhibitService.updateTopic(id, exhibit);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/delete/{id}")
	public void delelteExhibit(@PathVariable int id) {
		this.exhibitService.deleteExhibit(id);
	}
}
