package org.opendevup.service;

import java.util.List;
import org.opendevup.doa.*;
import org.opendevup.entities.Athlete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Helper {
	@Autowired
	private AthleteRepository ar;
	/*public List<String> getnames(){
		
		return ar.findByNom() ;
	}*/

}
