package konovalovdnd.controller;

import konovalovdnd.dao.SkillsRepo;
import konovalovdnd.dao.etc.DiceRepo;
import konovalovdnd.model.Skill;
import konovalovdnd.model.etc.Dices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class SkiilsController {
    @Autowired
    private SkillsRepo skillsRepo;
    @Autowired
    private DiceRepo diceRepo;

    @GetMapping("/skill")
    public String editorSkill(Map<String, Object> model) {
        Iterable<Skill> skills = skillsRepo.findAll();
        Iterable<Dices> dices = diceRepo.findAll();
        model.put("dices", dices);
        model.put("skills", skills);
        return "editor_skill";
    }

    @PostMapping("/addSkill")
    public String addSkill(@RequestParam String name, @RequestParam String description, @RequestParam Integer dice,
                           @RequestParam Integer multi, Map<String, Object> model) {
        if (name == null || description == null)
            return "redirect:error";

        if (multi == 0) {
            dice = 0;
            multi = 0;
        }
        Skill skills = new Skill();

        skills.setName(name);
        skills.setDescription(description);
        skills.setDamageDice(dice);
        skills.setDamageMultiplier(multi);

        skillsRepo.save(skills);

        return "redirect:skill";
    }
}
