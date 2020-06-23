package konovalovdnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "armors")
public class Armor {
    @Id
    @Column(name = "name", unique = true, nullable = false)
    private String name;
    @Column(name = "description", length = 2048)
    private String description;
    @Column(name = "ac")
    private Integer ac;
    @Column(name = "required_str")
    private Integer requiredStr;
    @Column(name = "price")
    private Integer price;
    @Column(name = "weight")
    private Integer weight;
    @Column(name = "type")
    private String type;
    @Column(name = "is_hindrance")
    private boolean isHindrance = false;

    public Armor() {
    }

    public Armor(String name, String description, Integer ac, Integer requiredStr, Integer price,
                 Integer weight, String type, boolean isHindrance) {
        this.name = name;
        this.description = description;
        this.ac = ac;
        this.requiredStr = requiredStr;
        this.price = price;
        this.weight = weight;
        this.type = type;
        this.isHindrance = isHindrance;
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

    public Integer getAc() {
        return ac;
    }

    public void setAc(Integer ac) {
        this.ac = ac;
    }

    public Integer getRequiredStr() {
        return requiredStr;
    }

    public void setRequiredStr(Integer requiredStr) {
        this.requiredStr = requiredStr;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String isHindrance() {
        if (isHindrance)
            return "Помеха";
        return "";
    }

    public void setHindrance(boolean hindrance) {
        isHindrance = hindrance;
    }
}
