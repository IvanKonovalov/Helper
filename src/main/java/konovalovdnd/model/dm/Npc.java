package konovalovdnd.model.dm;

import javax.persistence.*;

@Entity
@Table(name = "npc")
public class Npc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "characteristics")
    private Integer characteristics;

    public Npc() {
    }

    public Npc(String name, String description, Integer characteristics) {
        this.name = name;
        this.description = description;
        this.characteristics = characteristics;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
