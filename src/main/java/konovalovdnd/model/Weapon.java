package konovalovdnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "weapons")
public class Weapon {
    @Id
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @Column(name = "description", length = 2048)
    private String description;
    @Column(name = "is_range_weapon")
    private boolean isRangerWeapon;
    @Column(name = "damage_type")
    private String damageType;
    @Column(name = "damage_multiplier")
    private Integer damageMultiplier;
    @Column(name = "damage_dice")
    private Integer damageDice;
    @Column(name = "price")
    private Integer price;
    @Column(name = "weight")
    private Integer weight;
    @Column(name = "weapon_category")
    private String category;
    @Column(name = "properties")
    private String properties;

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Weapon() {
    }

    public Weapon(String name, String description, boolean isRangerWeapon, String damageType, Integer damageMultiplier,
                  Integer damageDice, Integer price, Integer weight, String category, String properties) {
        this.name = name;
        this.description = description;
        this.isRangerWeapon = isRangerWeapon;
        this.damageType = damageType;
        this.damageMultiplier = damageMultiplier;
        this.damageDice = damageDice;
        this.price = price;
        this.weight = weight;
        this.category = category;
        this.properties = properties;
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

    public String isRangerWeapon() {
        if (isRangerWeapon)
            return "Дальнобойное";
        else return "Холодное";
    }

    public void setRangerWeapon(boolean rangerWeapon) {
        isRangerWeapon = rangerWeapon;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public Integer getDamageMultiplier() {
        return damageMultiplier;
    }

    public void setDamageMultiplier(Integer damageMultiplier) {
        this.damageMultiplier = damageMultiplier;
    }

    public Integer getDamageDice() {
        return damageDice;
    }

    public void setDamageDice(Integer damageDice) {
        this.damageDice = damageDice;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
