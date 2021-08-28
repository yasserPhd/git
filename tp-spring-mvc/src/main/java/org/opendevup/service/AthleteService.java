package org.opendevup.service;
import java.util.Optional;

import org.opendevup.entities.Athlete;
public interface AthleteService {
	Optional<Athlete> findById(Long id);
}
