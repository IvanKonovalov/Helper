package konovalovdnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "magic_skills")
public class MagicSkill {
    @Id
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "school")
    private String school;
    @Column(name = "target")
    private String target;
    @Column(name = "casting")
    private Integer casting;
    @Column(name = "duration")
    private Integer duration;
    @Column(name = "is_ritual")
    private boolean is_ritual;
    @Column(name = "distance")
    private Integer distance;
    @Column(name = "level")
    private Integer level;
    @Column(name = "damage_dice")
    private Integer damageDice;
    @Column(name = "damage_multiplier")
    private Integer damageMultiplier;
    @Column(name = "component")
    private String component;
    @Column(name = "items")
    private String items;

    public MagicSkill() {
    }

    public MagicSkill(String name, String description, String school, String target, Integer casting, Integer duration,
                      boolean is_ritual, Integer distance, Integer level, Integer damageDice, Integer damageMultiplier,
                      String component, String items) {
        this.name = name;
        this.description = description;
        this.school = school;
        this.target = target;
        this.casting = casting;
        this.duration = duration;
        this.is_ritual = is_ritual;
        this.distance = distance;
        this.level = level;
        this.damageDice = damageDice;
        this.damageMultiplier = damageMultiplier;
        this.component = component;
        this.items = items;
    }


    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Integer getCasting() {
        return casting;
    }

    public void setCasting(Integer casting) {
        this.casting = casting;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public boolean isIs_ritual() {
        return is_ritual;
    }

    public void setIs_ritual(boolean is_ritual) {
        this.is_ritual = is_ritual;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }
}

