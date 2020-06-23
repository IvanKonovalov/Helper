package konovalovdnd.controller;

import konovalovdnd.dao.ItemRepo;
import konovalovdnd.dao.MagicSkillsRepo;
import konovalovdnd.dao.etc.DiceRepo;
import konovalovdnd.dao.etc.SchoolOfMagicRepo;
import konovalovdnd.dao.etc.TargetRepo;
import konovalovdnd.model.Item;
import konovalovdnd.model.MagicSkill;
import konovalovdnd.model.etc.Dices;
import konovalovdnd.model.etc.SchoolsOfMagic;
import konovalovdnd.model.etc.Targets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MagicsController {
    @Autowired
    private SchoolOfMagicRepo schoolOfMagicRepo;
    @Autowired
    private TargetRepo targetRepo;
    @Autowired
    private DiceRepo diceRepo;
    @Autowired
    private ItemRepo itemRepo;
    @Autowired
    private MagicSkillsRepo magicSkillsRepo;


    @GetMapping("/magic")
    public String editorMagic(Map<String, Object> model) {
        Iterable<SchoolsOfMagic> schoolsOfMagics = schoolOfMagicRepo.findAll();
        Iterable<Targets> targets = targetRepo.findAll();
        Iterable<Dices> dices = diceRepo.findAll();
        Iterable<Item> items = itemRepo.findAll();
        Iterable<MagicSkill> magicSkills = magicSkillsRepo.findAll();
        model.put("school", schoolsOfMagics);
        model.put("target", targets);
        model.put("dices", dices);
        model.put("item", items);
        model.put("magic", magicSkills);

        return "editor_magic";
    }

    @PostMapping("/addMagic")
    private String addMagic(@RequestParam String name, @RequestParam String description, @RequestParam String school,
                            @RequestParam Integer level, @RequestParam Integer cast, @RequestParam Integer duration,
                            @RequestParam Integer distance, @RequestParam String target, @RequestParam Integer multi,
                            @RequestParam Integer dice, @RequestParam String component,
                            @RequestParam(defaultValue = "") String[] items,
                            @RequestParam(defaultValue = "false") Boolean ritual) {

        StringBuilder it = new StringBuilder();
        if (items != null)
            for (String i : items) {
                it.append(i + "  ");
            }

        magicSkillsRepo.save(new MagicSkill(name, description, school, target, cast, duration, ritual, distance,
                level, dice, multi, component, it.toString()));

        return "redirect:magic";
    }


}
