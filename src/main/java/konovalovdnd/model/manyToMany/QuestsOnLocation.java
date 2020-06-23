package konovalovdnd.model.manyToMany;

import javax.persistence.*;

@Entity
@Table(name = "quests_on_location")
public class QuestsOnLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "quest")
    private Integer quest;
    @Column(name = "location")
    private Integer location;

    public QuestsOnLocation() {
    }

    public QuestsOnLocation(Integer quest, Integer location) {
        this.quest = quest;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuest() {
        return quest;
    }

    public void setQuest(Integer quest) {
        this.quest = quest;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }
}
