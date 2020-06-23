package konovalovdnd.model.manyToMany;


import javax.persistence.*;

@Entity
@Table(name = "from_weapons_to_properties")
public class WeaponsAndProperties {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "name_weapon")
    private String weapon;
    @Column(name = "name_property")
    private String property;

    public WeaponsAndProperties() {
    }

    public WeaponsAndProperties(String weapon, String property) {
        this.weapon = weapon;
        this.property = property;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
