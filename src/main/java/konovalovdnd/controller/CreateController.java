package konovalovdnd.controller;

import konovalovdnd.dao.*;
import konovalovdnd.model.HCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class CreateController {
    @Autowired
    private RacesRepo racesRepo;
    @Autowired
    private HeroClassRepo classesRepo;
    @Autowired
    private BackstoriesRepo backstoriesRepo;
    @Autowired
    private AbilitiesRepo abilitiesRepo;
    @Autowired
    private ItemRepo itemRepo;
    @Autowired
    private MagicSkillsRepo magicSkillsRepo;
    @Autowired
    private SkillsRepo skillsRepo;
    @Autowired
    private CharactersRepo charactersRepo;
    @Autowired
    private ArmorsRepo armorsRepo;
    @Autowired
    private WeaponsRepo weaponsRepo;


    @GetMapping("/create_char")
    public String createCharPage(Map<String, Object> model) {

        model.put("race", racesRepo.findAll());
        model.put("class", classesRepo.findAll());
        model.put("backstory", backstoriesRepo.findAll());
        model.put("ability", abilitiesRepo.findAll());
        model.put("item", itemRepo.findAll());
        model.put("magic", magicSkillsRepo.findAll());
        model.put("skill", skillsRepo.findAll());
        model.put("armor", armorsRepo.findAll());
        model.put("weapon", weaponsRepo.findAll());

        return "createchar";
    }

    @PostMapping("/addChar")
    public String createChar(@RequestParam String name,
                             @RequestParam Integer level, @RequestParam String player,
                             @RequestParam Integer gold, @RequestParam String backstory,
                             @RequestParam String race, @RequestParam String heroclass,
                             @RequestParam(defaultValue = "") String armor,
                             @RequestParam(defaultValue = "") String weapon,
                             @RequestParam Integer[] chars,
                             @RequestParam(defaultValue = "") String[] abilities,
                             @RequestParam(defaultValue = "") String[] item,
                             @RequestParam String[] magics,
                             @RequestParam(defaultValue = "") String[] skill) {

        StringBuilder ab = new StringBuilder();
        StringBuilder it = new StringBuilder();
        StringBuilder mg = new StringBuilder();
        StringBuilder sk = new StringBuilder();

        if (abilities != null)
            for (String i : abilities) {
                ab.append(abilitiesRepo.findByName(i).getDescription() + ",   ");
            }
        if (item != null)
            for (String i : item) {
                it.append(i + ", ");
            }
        if (magics != null)
            for (String i : magics) {
                mg.append(i);
            }
        if (skill != null)
            for (String i : skill) {
                sk.append(skillsRepo.findByName(i).getDescription() + ",  ");
            }

        HCharacter newChar = new HCharacter();

        newChar.setName(name);
        newChar.setExp(level);
        newChar.setRace(race);
        newChar.setHeroclass(heroclass);
        newChar.setBackstory(backstory);
        newChar.setArmor(armor);
        newChar.setWeapon(weapon);
        newChar.setStr(chars[0]);
        newChar.setDex(chars[1]);
        newChar.setCon(chars[2]);
        newChar.setItl(chars[3]);
        newChar.setWsd(chars[4]);
        newChar.setChr(chars[5]);
        newChar.setPlayer(player);
        newChar.setAbilities(ab.toString());
        newChar.setSkills(sk.toString());
        newChar.setMagics(mg.toString());
        newChar.setItems(it.toString());
        newChar.setMoney(gold);

        charactersRepo.save(newChar);
        return "redirect:create_char";
    }

}
