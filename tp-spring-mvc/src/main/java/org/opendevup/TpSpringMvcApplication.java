package org.opendevup;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.opendevup.doa.AthleteRepository;
//import org.opendevup.entities;
//import org.opendevup.doa.EtudiantRepository;
import org.opendevup.entities.Athlete;
//import org.opendevup.entities.Etudiant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TpSpringMvcApplication {
	 
	public static void main(String[] args) throws ParseException  {
		ApplicationContext ctxt = SpringApplication.run(TpSpringMvcApplication.class, args);
		AthleteRepository e = ctxt.getBean(AthleteRepository.class);
		DateFormat d1 = new SimpleDateFormat("yyyy-MM-dd"); 
		//Athlete m3 = new Athlete("salah",d1.parse("2000-01-01"),"salah@gmail.com",500,d1.parse("2000-01-01"), d1.parse("2000-01-01"), new byte[] );
		/*Athlete m = new Athlete("yasser",d1.parse("1986-12-04"),"yasser@email", 200,"yasser.jpg") ;
		Athlete m2 = new Athlete("ahmed",d1.parse("1986-01-01"),"ahmed@gmail.com",300,"ahmed.jpg") ;
		Athlete m3 = new Athlete("salah",d1.parse("2000-01-01"),"salah@gmail.com",500,"salah.jpg") ;
		e.save(m);
		e.save(m2);
		e.save(m3);*/
		//e.save();
	}
	@Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
}
