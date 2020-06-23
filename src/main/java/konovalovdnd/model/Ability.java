package konovalovdnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "abilities")
public class Ability {
    @Id
    @Column(name = "name", unique = true, nullable = false)
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "items")
    private String items;
    @Column(name = "armortypes")
    private String armortypes;
    @Column(name = "weaponcategories")
    private String weaponscategories;

    public Ability() {
    }

    public Ability(String name, String description, String items, String armortypes, String weaponscategories) {
        this.name = name;
        this.description = description;
        this.items = items;
        this.armortypes = armortypes;
        this.weaponscategories = weaponscategories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getArmortypes() {
        return armortypes;
    }

    public void setArmortypes(String armortypes) {
        this.armortypes = armortypes;
    }

    public String getWeaponscategories() {
        return weaponscategories;
    }

    public void setWeaponscategories(String weaponscategories) {
        this.weaponscategories = weaponscategories;
    }
}
