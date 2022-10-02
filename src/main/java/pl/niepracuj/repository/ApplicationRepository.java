package pl.niepracuj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.niepracuj.model.entity.Application;
import pl.niepracuj.model.entity.Technology;

@Repository
public interface ApplicationRepository  extends JpaRepository<Application,Long> {
}
