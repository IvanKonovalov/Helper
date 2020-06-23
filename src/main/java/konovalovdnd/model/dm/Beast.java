package konovalovdnd.model.dm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beasts")
public class Beast {
    @Id
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @Column(name = "description", length = 4096)
    private String description;
    @Column(name = "characteristics")
    private Integer characteristics;
    @Column(name = "ac")
    private Integer ac;
    @Column(name = "danger")
    private Double danger;

    public Beast() {
    }

    public Beast(String name, String description, Integer characteristics, Integer ac, Double danger) {
        this.name = name;
        this.description = description;
        this.characteristics = characteristics;
        this.ac = ac;
        this.danger = danger;
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

    public Integer getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Integer characteristics) {
        this.characteristics = characteristics;
    }

    public Integer getAc() {
        return ac;
    }

    public void setAc(Integer ac) {
        this.ac = ac;
    }

    public Double getDanger() {
        return danger;
    }

    public void setDanger(Double danger) {
        this.danger = danger;
    }
}
