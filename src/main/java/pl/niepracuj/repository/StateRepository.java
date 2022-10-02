package pl.niepracuj.repository;

import jdk.jfr.StackTrace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.niepracuj.model.entity.State;
import pl.niepracuj.model.entity.Technology;

@Repository
public interface StateRepository  extends JpaRepository<State,Long> {
}
