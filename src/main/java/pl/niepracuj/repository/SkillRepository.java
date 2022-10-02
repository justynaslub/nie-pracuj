package pl.niepracuj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.niepracuj.model.entity.Skill;
import pl.niepracuj.model.entity.Technology;

@Repository
public interface SkillRepository  extends JpaRepository<Skill,Long> {
}
