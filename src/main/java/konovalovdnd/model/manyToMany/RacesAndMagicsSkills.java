package konovalovdnd.model.manyToMany;

import javax.persistence.*;

@Entity
@Table(name = "from_race_to_magic_skills")
public class RacesAndMagicsSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;
    @Column(name = "race")
    private String race;
    @Column(name = "magic_skill")
    private String magic_skill;

    public RacesAndMagicsSkills() {
    }

    public RacesAndMagicsSkills(String race, String magic_skill) {
        this.race = race;
        this.magic_skill = magic_skill;
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

    public String getMagic_skill() {
        return magic_skill;
    }

    public void setMagic_skill(String magic_skill) {
        this.magic_skill = magic_skill;
    }
}
