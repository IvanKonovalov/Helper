package konovalovdnd.model.etc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "weapons_properties")
public class WeaponsProperties {
    @Id

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "description", length = 1024)
    private String description;

    @Column(name = "value", nullable = true)
    private int value;

    public WeaponsProperties() {
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
