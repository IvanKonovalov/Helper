package konovalovdnd.model.manyToMany;

import javax.persistence.*;

@Entity
@Table(name = "from_magic_skills_to_items")
public class MagicsSkillsAndItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;
    @Column(name = "item")
    private String item;
    @Column(name = "magic_skill")
    private String magicSkill;
    @Column(name = "number_of_item")
    private Integer numberOfItem;

    public MagicsSkillsAndItems() {
    }

    public MagicsSkillsAndItems(String item, String magicSkill, Integer numberOfItem) {
        this.item = item;
        this.magicSkill = magicSkill;
        this.numberOfItem = numberOfItem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getMagicSkill() {
        return magicSkill;
    }

    public void setMagicSkill(String magicSkill) {
        this.magicSkill = magicSkill;
    }

    public Integer getNumberOfItem() {
        return numberOfItem;
    }

    public void setNumberOfItem(Integer numberOfItem) {
        this.numberOfItem = numberOfItem;
    }
}
