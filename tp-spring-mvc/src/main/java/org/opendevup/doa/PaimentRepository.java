package org.opendevup.doa;

import java.util.List;

import org.opendevup.entities.Athlete;
import org.opendevup.entities.Paiment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PaimentRepository extends JpaRepository<Paiment, Long> 
	{
		/*public List<String> findByNom();
		@Query("select e.nom from Athlete e")*/
		@Query("select p.nom from Paiment p")
		List<String> getAllNames();
		public Paiment findById(Long id);
		public List<Paiment> findByNom(String n, Pageable p); 
		@Query("select e from Athlete e where e.nom like :x")
		public Page<Paiment> findByMc(@Param("x")String mc, Pageable pageable);
	}

