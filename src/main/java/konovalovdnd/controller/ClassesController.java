package konovalovdnd.controller;

import konovalovdnd.dao.AbilitiesRepo;
import konovalovdnd.dao.HeroClassRepo;
import konovalovdnd.dao.MagicSkillsRepo;
import konovalovdnd.dao.SkillsRepo;
import konovalovdnd.model.Ability;
import konovalovdnd.model.HeroClass;
import konovalovdnd.model.MagicSkill;
import konovalovdnd.model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class ClassesController {
    @Autowired
    private AbilitiesRepo abilitiesRepo;
    @Autowired
    private MagicSkillsRepo magicSkillsRepo;
    @Autowired
    private SkillsRepo skillsRepo;
    @Autowired
    private HeroClassRepo heroClassRepo;


    @GetMapping("/class")
    public String editorClass(Map<String, Object> model) {
        Iterable<Ability> abilities = abilitiesRepo.findAll();
        Iterable<MagicSkill> magicSkills = magicSkillsRepo.findAll();
        Iterable<Skill> skills = skillsRepo.findAll();
        Iterable<HeroClass> heroClasses = heroClassRepo.findAll();
        model.put("ability", abilities);
        model.put("magic", magicSkills);
        model.put("skill", skills);
        model.put("class", heroClasses);
        return "editor_class";
    }

    @PostMapping("/addClass")
    public String addClass(@RequestParam String name,
                           @RequestParam String description,
                           @RequestParam(defaultValue = "") String[] ability,
                           @RequestParam(defaultValue = "") String[] magic,
                           @RequestParam(defaultValue = "") String[] skill) {
        StringBuilder skills = new StringBuilder();
        StringBuilder magics = new StringBuilder();
        StringBuilder abilities = new StringBuilder();

        if (skill != null)
            for (String i : skill) {
                skills.append(i + " ");
            }
        if (magic != null)
            for (String i : magic) {
                magics.append(i + " ");
            }
        if (ability != null)
            for (String i : ability) {
                abilities.append(i + " ");
            }

        heroClassRepo.save(new HeroClass(name, description, skills.toString(), magics.toString(),
                abilities.toString()));

        return "redirect:class";
    }
}
