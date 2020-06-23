package konovalovdnd.model.manyToMany;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class BackstoriesAndAbilities {
    @Column(name = "backstory")
    private String backstory;
    @Column(name = "ability")
    private String ability;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    public BackstoriesAndAbilities() {
    }

    public BackstoriesAndAbilities(String backstory, String ability) {
        this.backstory = backstory;
        this.ability = ability;
    }

    public String getBackstory() {
        return backstory;
    }

    public void setBackstory(String backstory) {
        this.backstory = backstory;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
