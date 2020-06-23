package konovalovdnd.model.manyToMany;

import javax.persistence.*;

@Entity
@Table(name = "from_classes_to_magic_skill")
public class ClassesAndMagicSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "class")
    private String heroclass;
    @Column(name = "magic_skill")
    private String magicSkill;

    public ClassesAndMagicSkills() {
    }

    public ClassesAndMagicSkills(String heroclass, String magicSkill) {
        this.heroclass = heroclass;
        this.magicSkill = magicSkill;
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

    public String getMagicSkill() {
        return magicSkill;
    }

    public void setMagicSkill(String magicSkill) {
        this.magicSkill = magicSkill;
    }
}
