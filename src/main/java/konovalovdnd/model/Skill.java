package konovalovdnd.model;

import konovalovdnd.model.etc.Dices;

import javax.persistence.*;

@Entity
@Table(name = "skills")
public class Skill {
    @Id
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @Column(name = "description", length = 2048)
    private String description;
    @Column(name = "damage_dice")
    private Integer damageDice;
    @Column(name = "damage_multiplier")
    private Integer damageMultiplier;

    public Skill() {
    }

    public Skill(String name, String description, Integer damageDice, Integer damageMultiplier) {
        this.name = name;
        this.description = description;
        this.damageDice = damageDice;
        this.damageMultiplier = damageMultiplier;
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

    public Integer getDamageDice() {
        return damageDice;
    }

    public void setDamageDice(Integer damageDice) {
        this.damageDice = damageDice;
    }

    public Integer getDamageMultiplier() {
        return damageMultiplier;
    }

    public void setDamageMultiplier(Integer damageMultiplier) {
        this.damageMultiplier = damageMultiplier;
    }
}
