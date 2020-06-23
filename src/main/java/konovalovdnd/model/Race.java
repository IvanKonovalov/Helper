package konovalovdnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "races")
public class Race {
    @Id
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "size")
    private String size;
    @Column(name = "speed")
    private Integer speed;
    @Column(name = "abilities")
    private String abilities;
    @Column(name = "magics")
    private String magics;
    @Column(name = "skills")
    private String skills;
    @Column(name = "str")
    private Integer str;
    @Column(name = "dex")
    private Integer dex;
    @Column(name = "con")
    private Integer con;
    @Column(name = "inl")
    private Integer inl;
    @Column(name = "wsd")
    private Integer wsd;
    @Column(name = "chr")
    private Integer chr;

    public Race() {
    }

    public Race(String name, String description, String size, Integer speed, Integer[] chars, String abilities,
                String magics, String skills) {
        this.name = name;
        this.description = description;
        this.size = size;
        this.speed = speed;
        str = chars[0];
        dex = chars[1];
        con = chars[2];
        inl = chars[3];
        wsd = chars[4];
        chr = chars[5];
        this.abilities = abilities;
        this.magics = magics;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getStr() {
        return str;
    }

    public void setStr(Integer str) {
        this.str = str;
    }

    public Integer getDex() {
        return dex;
    }

    public void setDex(Integer dex) {
        this.dex = dex;
    }

    public Integer getCon() {
        return con;
    }

    public void setCon(Integer con) {
        this.con = con;
    }

    public Integer getInl() {
        return inl;
    }

    public void setInl(Integer inl) {
        this.inl = inl;
    }

    public Integer getWsd() {
        return wsd;
    }

    public void setWsd(Integer wsd) {
        this.wsd = wsd;
    }

    public Integer getChr() {
        return chr;
    }

    public void setChr(Integer chr) {
        this.chr = chr;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }


    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public String getMagics() {
        return magics;
    }

    public void setMagics(String magics) {
        this.magics = magics;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
