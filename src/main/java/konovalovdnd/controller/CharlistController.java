package konovalovdnd.controller;

import konovalovdnd.dao.CharactersRepo;
import konovalovdnd.model.HCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.Optional;

@Controller
public class CharlistController {
    @Autowired
    private CharactersRepo charactersRepo;

    private int myCharId = -1;

    @GetMapping("/charlist")
    public String game(Map<String, Object> model) {
        myCharId = 0;
        model.put("character", charactersRepo.findAll());
        return "charlist";
    }

    @PostMapping("/choosingChar")
    public String choosingChar(@RequestParam(defaultValue = "-1") Integer charId) {

        if (charId == -1) {
            return "redirect:error";
        }
        myCharId = 0;
        myCharId = charId;

        return "redirect:my-character";
    }

    @GetMapping("/my-character")
    public String myChar(Map<String, Object> model) {

        if (myCharId == -1) {
            return "redirect:error";
        }

        Optional<HCharacter> hCharacter = charactersRepo.findById(myCharId);
        if (!hCharacter.isPresent())
            return "redirect:error";

        model.put("character", hCharacter.get());

        return "my-char";
    }

    @PostMapping("/savechar")
    public String createChar(@RequestParam String name,
                             @RequestParam Integer level, @RequestParam String player,
                             @RequestParam Integer gold, @RequestParam String backstory,
                             @RequestParam String race, @RequestParam String heroclass,
                             @RequestParam(defaultValue = "") String armor,
                             @RequestParam(defaultValue = "") String weapon,
                             @RequestParam Integer[] chars,
                             @RequestParam(defaultValue = "") String abilities,
                             @RequestParam(defaultValue = "") String item,
                             @RequestParam(defaultValue = "") String magics,
                             @RequestParam(defaultValue = "") String skill) {

        HCharacter newChar = charactersRepo.findById(myCharId).get();

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
        newChar.setAbilities(abilities);
        newChar.setSkills(skill);
        newChar.setMagics(magics);
        newChar.setItems(item);
        newChar.setMoney(gold);

        charactersRepo.save(newChar);

        return "redirect:charlist";
    }


}
