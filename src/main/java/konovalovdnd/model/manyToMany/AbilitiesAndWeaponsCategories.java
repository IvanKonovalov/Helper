package konovalovdnd.model.manyToMany;

import javax.persistence.*;

@Entity
@Table(name = "from_abilities_to_weapon_categories")
public class AbilitiesAndWeaponsCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;
    @Column(name = "ability", nullable = false)
    private String ability;
    @Column(name = "weapon_category", nullable = false)
    private String weaponCategory;

    public AbilitiesAndWeaponsCategories() {
    }

    public AbilitiesAndWeaponsCategories(String ability, String weaponCategory) {
        this.ability = ability;
        this.weaponCategory = weaponCategory;
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

    public String getWeaponCategory() {
        return weaponCategory;
    }

    public void setWeaponCategory(String weaponCategory) {
        this.weaponCategory = weaponCategory;
    }
}
