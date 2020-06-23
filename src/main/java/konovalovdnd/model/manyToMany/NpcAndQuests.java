package konovalovdnd.model.manyToMany;

import javax.persistence.*;

@Entity
@Table(name = "npc_in_quest")
public class NpcAndQuests {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "npc")
    private Integer npc;
    @Column(name = "npc_role")
    private String npcRole;
    @Column(name = "quest")
    private Integer quest;
    @Column(name = "npc_number")
    private Integer npcNumber;

    public NpcAndQuests() {
    }

    public NpcAndQuests(Integer npc, String npcRole, Integer quest, Integer npcNumber) {
        this.npc = npc;
        this.npcRole = npcRole;
        this.quest = quest;
        this.npcNumber = npcNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNpc() {
        return npc;
    }

    public void setNpc(Integer npc) {
        this.npc = npc;
    }

    public String getNpcRole() {
        return npcRole;
    }

    public void setNpcRole(String npcRole) {
        this.npcRole = npcRole;
    }

    public Integer getQuest() {
        return quest;
    }

    public void setQuest(Integer quest) {
        this.quest = quest;
    }

    public Integer getNpcNumber() {
        return npcNumber;
    }

    public void setNpcNumber(Integer npcNumber) {
        this.npcNumber = npcNumber;
    }
}
