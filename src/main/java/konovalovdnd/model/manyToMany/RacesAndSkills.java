package konovalovdnd.model.manyToMany;

import javax.persistence.*;

@Entity
@Table(name = "from_races_to_skills")
public class RacesAndSkills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;
    @Column(name = "race")
    private String race;
    @Column(name = "skill")
    private String skill;

    public RacesAndSkills() {
    }

    public RacesAndSkills(String race, String skill) {
        this.race = race;
        this.skill = skill;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
