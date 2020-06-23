package konovalovdnd.model.manyToMany;

import javax.persistence.*;

@Entity
@Table(name = "npcs_on_location")
public class NpcOnLocations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "location")
    private Integer location;
    @Column(name = "npc")
    private Integer npc;
    @Column(name = "number")
    private Integer number;

    public NpcOnLocations() {
    }

    public NpcOnLocations(Integer location, Integer npc, Integer number) {
        this.location = location;
        this.npc = npc;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public Integer getNpc() {
        return npc;
    }

    public void setNpc(Integer npc) {
        this.npc = npc;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
