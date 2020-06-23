package konovalovdnd.model.etc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schools_of_magic")
public class SchoolsOfMagic {
    @Id
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public SchoolsOfMagic() {
    }

    public void setName(String name) {
        this.name = name;
    }
}
