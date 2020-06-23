package konovalovdnd.model;

import javax.persistence.*;

@Entity
@Table(name = "magic_sockets")
public class MagicSockets {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "level")
    private Integer level;
    @Column(name = "1")
    private Integer one;
    @Column(name = "2")
    private Integer two;
    @Column(name = "3")
    private Integer three;
    @Column(name = "4")
    private Integer four;
    @Column(name = "5")
    private Integer five;

    public MagicSockets() {
    }

    public MagicSockets(Integer level, Integer one, Integer two, Integer three, Integer four, Integer five) {
        this.level = level;
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getOne() {
        return one;
    }

    public void setOne(Integer one) {
        this.one = one;
    }

    public Integer getTwo() {
        return two;
    }

    public void setTwo(Integer two) {
        this.two = two;
    }

    public Integer getThree() {
        return three;
    }

    public void setThree(Integer three) {
        this.three = three;
    }

    public Integer getFour() {
        return four;
    }

    public void setFour(Integer four) {
        this.four = four;
    }

    public Integer getFive() {
        return five;
    }

    public void setFive(Integer five) {
        this.five = five;
    }
}
