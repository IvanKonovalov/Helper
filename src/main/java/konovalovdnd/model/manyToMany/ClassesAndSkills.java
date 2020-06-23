package konovalovdnd.model.manyToMany;


import javax.persistence.*;

@Entity
@Table(name = "from_classes_to_skills")
public class ClassesAndSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "class")
    private String heroclass;
    @Column(name = "skill")
    private String skill;
    @Column(name = "required_level")
    private Integer requiredLevel;

    public ClassesAndSkills() {
    }

    public ClassesAndSkills(String heroclass, String skill, Integer requiredLevel) {
        this.heroclass = heroclass;
        this.skill = skill;
        this.requiredLevel = requiredLevel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeroclass() {
        return heroclass;
    }

    public void setHeroclass(String heroclass) {
        this.heroclass = heroclass;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Integer getRequiredLevel() {
        return requiredLevel;
    }

    public void setRequiredLevel(Integer requiredLevel) {
        this.requiredLevel = requiredLevel;
    }
}
