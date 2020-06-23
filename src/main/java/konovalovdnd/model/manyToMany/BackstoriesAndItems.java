package konovalovdnd.model.manyToMany;

import javax.persistence.*;

@Entity
@Table(name = "from_backstories_to_items")
public class BackstoriesAndItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "backstory")
    private String backstory;
    @Column(name = "item")
    private String item;

    public BackstoriesAndItems() {
    }

    public BackstoriesAndItems(String backstory, String item) {
        this.backstory = backstory;
        this.item = item;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBackstory() {
        return backstory;
    }

    public void setBackstory(String backstory) {
        this.backstory = backstory;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
