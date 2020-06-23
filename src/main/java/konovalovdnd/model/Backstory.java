package konovalovdnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "backstories")
public class Backstory {
    @Id
    @Column(name = "name", unique = true, nullable = false)
    private String name;
    @Column(name = "description", length = 4096)
    private String description;
    @Column(name = "abilities")
    private String abilities;
    @Column(name = "items")
    private String items;

    public Backstory() {
    }

    public Backstory(String name, String description, String abilities, String items) {
        this.name = name;
        this.description = description;
        this.abilities = abilities;
        this.items = items;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
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
}
