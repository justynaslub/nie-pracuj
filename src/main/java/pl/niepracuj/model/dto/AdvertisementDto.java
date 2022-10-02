package pl.niepracuj.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.niepracuj.model.entity.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

public class AdvertisementDto {

    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;

    @ManyToOne
    private Technology technology;

    @ManyToOne
    private Seniority seniority;

    private Instant publish_date;

    private Instant expire_date;

    private Long salary_from;

    private Long salary_to;

    private String description;

    @ManyToOne
    private City city;


    @ManyToMany
    @JoinTable(
            name = "adv_skills",
            joinColumns = @JoinColumn(name = "skill_id"),
            inverseJoinColumns = @JoinColumn(name = "adv_id")
    )
    Set<Skill> skills;


}

