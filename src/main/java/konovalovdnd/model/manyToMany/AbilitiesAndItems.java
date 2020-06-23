package konovalovdnd.model.manyToMany;

import javax.persistence.*;

@Entity
@Table(name = "from_abilities_to_items")
public class AbilitiesAndItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "ability")
    private String ability;
    @Column(name = "item")
    private String item;

    public AbilitiesAndItems() {
    }

    public AbilitiesAndItems(String ability, String item) {
        this.ability = ability;
        this.item = item;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
