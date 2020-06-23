package konovalovdnd.model;

import javax.persistence.*;

@Entity
@Table(name = "characteristics")
public class Characteristics {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "strengh")
    private Integer strengh;
    @Column(name = "dexterity")
    private Integer dexterity;
    @Column(name = "constitution")
    private Integer constitution;
    @Column(name = "intelligence")
    private Integer intelligence;
    @Column(name = "wisdom")
    private Integer wisdom;
    @Column(name = "charisma")
    private Integer charisma;

    public Characteristics() {
    }

    public Characteristics(Integer strengh, Integer dexterity, Integer constitution, Integer intelligence, Integer wisdom, Integer charisma) {
        this.strengh = strengh;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStrengh() {
        return strengh;
    }

    public void setStrengh(Integer strengh) {
        this.strengh = strengh;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getConstitution() {
        return constitution;
    }

    public void setConstitution(Integer constitution) {
        this.constitution = constitution;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getWisdom() {
        return wisdom;
    }

    public void setWisdom(Integer wisdom) {
        this.wisdom = wisdom;
    }

    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }
}
