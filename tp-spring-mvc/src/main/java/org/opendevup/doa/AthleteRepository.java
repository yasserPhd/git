package org.opendevup.doa;

import java.util.List;
import java.util.Optional;

import org.opendevup.entities.Athlete;
//import org.opendevup.entities.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AthleteRepository extends JpaRepository<Athlete, Long> 
{
	/*public List<String> findByNom();
	@Query("select e.nom from Athlete e")*/
	@Query("select e.nom from Athlete e")
	List<String> getAllNames();
	public Athlete findById(Long id);
	public List<Athlete> findByNom(String n, Pageable p); 
	@Query("select e from Athlete e where e.nom like :x")
	public Page<Athlete> findByMc(@Param("x")String mc, Pageable pageable);
}
