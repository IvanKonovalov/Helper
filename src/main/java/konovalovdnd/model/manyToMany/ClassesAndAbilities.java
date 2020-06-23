package konovalovdnd.model.manyToMany;


import javax.persistence.*;

@Entity
@Table(name = "from_classes_to_abilities")
public class ClassesAndAbilities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "class")
    private String heroclass;
    @Column(name = "ability")
    private String ability;

    public ClassesAndAbilities() {
    }

    public ClassesAndAbilities(String heroclass, String ability) {
        this.heroclass = heroclass;
        this.ability = ability;
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

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
}
