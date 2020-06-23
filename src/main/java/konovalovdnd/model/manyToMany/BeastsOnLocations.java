package konovalovdnd.model.manyToMany;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beasts_on_location")
public class BeastsOnLocations {
    @Id
    @Column(name = "beast", unique = true, nullable = false)
    private String beast;
    @Column(name = "location")
    private Integer location;
    @Column(name = "number")
    private Integer number;

    public BeastsOnLocations() {
    }

    public BeastsOnLocations(String beast, Integer location, Integer number) {
        this.beast = beast;
        this.location = location;
        this.number = number;
    }

    public String getBeast() {
        return beast;
    }

    public void setBeast(String beast) {
        this.beast = beast;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
