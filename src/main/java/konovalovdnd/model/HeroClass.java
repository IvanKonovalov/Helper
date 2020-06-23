package konovalovdnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "classes")
public class HeroClass {
    @Id
    @Column(name = "name", unique = true, nullable = false)
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "skills")
    private String skills;
    @Column(name = "magics")
    private String magics;
    @Column(name = "abilities")
    private String abilities;

    public HeroClass() {
    }

    public HeroClass(String name, String description, String skills, String magics, String abilities) {
        this.name = name;
        this.description = description;
        this.skills = skills;
        this.magics = magics;
        this.abilities = abilities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDesciption(String desciption) {
        this.description = desciption;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getMagics() {
        return magics;
    }

    public void setMagics(String magics) {
        this.magics = magics;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }
}
