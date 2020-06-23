package konovalovdnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @Column(name = "name", unique = true, nullable = false)
    private String name;
    @Column(name = "description", length = 1024)
    private String description;
    @Column(name = "price")
    private Integer price;
    @Column(name = "weight")
    private Integer weight;

    public Item() {
    }

    public Item(String name, String description, Integer price, Integer weight) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.weight = weight;
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
