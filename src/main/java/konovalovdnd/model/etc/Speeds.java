package konovalovdnd.model.etc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "speeds")
public class Speeds {

    @Id
    @Column(name = "speed", unique = true, nullable = false)
    private int speed;

    public Speeds() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
