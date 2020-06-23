package konovalovdnd.model.etc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "weapons_categories")
public class WeaponsCategories {
    @Id
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "description", length = 1024)
    private String description;

    public WeaponsCategories() {
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
