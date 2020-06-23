package konovalovdnd.model.manyToMany;

import javax.persistence.*;

@Entity
@Table(name = "from_abilities_to_armor_types")
public class AbilitiesAndArmorsTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private Integer id;
    @Column(name = "ability", nullable = false)
    private String ability;
    @Column(name = "armor_type", nullable = false)
    private String armorType;

    public AbilitiesAndArmorsTypes() {
    }

    public AbilitiesAndArmorsTypes(String ability, String armorType) {
        this.ability = ability;
        this.armorType = armorType;
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

    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }
}
