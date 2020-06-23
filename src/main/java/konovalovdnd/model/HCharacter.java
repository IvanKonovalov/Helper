package konovalovdnd.model;


import javax.persistence.*;

@Entity
@Table(name = "characters")
public class HCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "exp")
    private Integer exp;
    @Column(name = "race")
    private String race;
    @Column(name = "class")
    private String heroclass;
    @Column(name = "backstory")
    private String backstory;
    @Column(name = "armor")
    private String armor;
    @Column(name = "weapon")
    private String weapon;
    @Column(name = "str")
    private Integer str;
    @Column(name = "dex")
    private Integer dex;
    @Column(name = "con")
    private Integer con;
    @Column(name = "inl")
    private Integer itl;
    @Column(name = "wsd")
    private Integer wsd;
    @Column(name = "chr")
    private Integer chr;
    @Column(name = "player_name")
    private String player;
    @Column(name = "abilities")
    private String abilities;
    @Column(name = "skills")
    private String skills;
    @Column(name = "magics")
    private String magics;
    @Column(name = "items")
    private String items;
    @Column(name = "money")
    private Integer money;

    public HCharacter() {
    }

    public HCharacter(String name, Integer exp, String race, String heroclass,
                      String backstory, String armor, String weapon, Integer str,
                      Integer dex, Integer con, Integer itl, Integer wsd, Integer chr,
                      String player, String abilities, String skills, String magics,
                      String items, Integer money) {
        this.name = name;
        this.exp = exp;
        this.race = race;
        this.heroclass = heroclass;
        this.backstory = backstory;
        this.armor = armor;
        this.weapon = weapon;
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.itl = itl;
        this.wsd = wsd;
        this.chr = chr;
        this.player = player;
        this.abilities = abilities;
        this.skills = skills;
        this.magics = magics;
        this.items = items;
        this.money = money;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getHeroclass() {
        return heroclass;
    }

    public void setHeroclass(String heroclass) {
        this.heroclass = heroclass;
    }

    public String getBackstory() {
        return backstory;
    }

    public void setBackstory(String backstory) {
        this.backstory = backstory;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
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

    public Integer getItl() {
        return itl;
    }

    public void setItl(Integer itl) {
        this.itl = itl;
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

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
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

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}

