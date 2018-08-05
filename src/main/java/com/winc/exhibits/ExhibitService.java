package com.winc.exhibits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExhibitService {
	
//	@Autowired
//	private ExhibitRepository exhibitRepository;
	
	private List<Exhibit> exhibits = new ArrayList<> (Arrays.asList(
			new Exhibit(1, 23),
			new Exhibit(2, 23),
			new Exhibit(3, 2),
			new Exhibit(4, 12),
			new Exhibit(5, 13),
			new Exhibit(6, 54)
			));
	
	public List<Exhibit> getExhibits() {
		return this.exhibits;
	}
	
	public Exhibit addExhibit(Exhibit exhibit) {
		exhibits.add(exhibit);
		return exhibit;
	}

	public Exhibit updateTopic(int id, Exhibit exhibit) {
		for (int i=0; i < exhibits.size(); i++) {
			if (exhibits.get(i).getId() == id) {
				exhibits.set(i, exhibit);
				return exhibit;
			}
		}
		return null;
	}

	public void deleteExhibit(int id) {
		for (int i=0; i < exhibits.size(); i++) {
			if (exhibits.get(i).getId() == id) {
				exhibits.remove(i);
			}
		}
	}

	// returns one exhibit by id
	public Exhibit getExhibit(int id) {
		return this.exhibits.stream().filter((e) -> e.getId() == id).findFirst().get();
	}

}
