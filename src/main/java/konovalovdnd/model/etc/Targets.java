package konovalovdnd.model.etc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "targets")
public class Targets {

    @Id
    @Column(name = "target", unique = true, nullable = false)
    private String target;

    @Column(name = "radius")
    private int radius;

    public Targets() {
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
