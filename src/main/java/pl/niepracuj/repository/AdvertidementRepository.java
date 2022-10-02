package pl.niepracuj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.niepracuj.model.entity.Advertisement;
import pl.niepracuj.model.entity.Technology;

@Repository
public interface AdvertidementRepository  extends JpaRepository<Advertisement,Long> {
}
