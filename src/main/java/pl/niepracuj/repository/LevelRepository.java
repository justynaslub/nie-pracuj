package pl.niepracuj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.niepracuj.model.entity.Level;
import pl.niepracuj.model.entity.Technology;

@Repository
public interface LevelRepository  extends JpaRepository<Level,Long> {
}
