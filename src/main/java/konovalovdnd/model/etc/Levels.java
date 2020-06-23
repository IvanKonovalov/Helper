package konovalovdnd.model.etc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "levels")
public class Levels {
    @Id
    @Column(name = "number", unique = true, nullable = false)
    private int number;

    @Column(name = "required_exp")
    private int required_exp;

    @Column(name = "bonus")
    private int bonus;

    public Levels() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRequired_exp() {
        return required_exp;
    }

    public void setRequired_exp(int required_exp) {
        this.required_exp = required_exp;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
