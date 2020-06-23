package konovalovdnd.model.etc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "armors_types")
public class ArmorTypes {
    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "max_bonus")
    private Integer maxBonus;

    public ArmorTypes() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaxBonus() {
        return maxBonus;
    }

    public void setMaxBonus(Integer maxBonus) {
        this.maxBonus = maxBonus;
    }
}
