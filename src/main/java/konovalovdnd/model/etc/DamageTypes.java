package konovalovdnd.model.etc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "damage_types")
public class DamageTypes {
    @Id
    @Column(name = "name")
    private String name;

    public DamageTypes() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
