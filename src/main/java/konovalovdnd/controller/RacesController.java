package konovalovdnd.controller;

import konovalovdnd.dao.*;
import konovalovdnd.dao.etc.SizeRepo;
import konovalovdnd.dao.etc.SpeedRepo;
import konovalovdnd.model.*;
import konovalovdnd.model.etc.Sizes;
import konovalovdnd.model.etc.Speeds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class RacesController {
    @Autowired
    private SizeRepo sizeRepo;
    @Autowired
    private SpeedRepo speedRepo;
    @Autowired
    private AbilitiesRepo abilitiesRepo;
    @Autowired
    private MagicSkillsRepo magicSkillsRepo;
    @Autowired
    private SkillsRepo skillsRepo;
    @Autowired
    private CharacteristicsRepo characteristicsRepo;
    @Autowired
    private RacesRepo racesRepo;

    @GetMapping("/race")
    public String editorRace(Map<String, Object> model) {
        Iterable<Sizes> sizes = sizeRepo.findAll();
        model.put("size", sizes);
        Iterable<Speeds> speedRepoAll = speedRepo.findAll();
        model.put("speed", speedRepoAll);
        Iterable<Ability> abilities = abilitiesRepo.findAll();
        model.put("ability", abilities);
        Iterable<Skill> skills = skillsRepo.findAll();
        model.put("skill", skills);
        Iterable<MagicSkill> magicSkills = magicSkillsRepo.findAll();
        model.put("magic", magicSkills);
        Iterable<Race> races = racesRepo.findAll();
        model.put("race", races);
        return "editor_race";
    }

    @PostMapping("/addRace")
    public String addRace(@RequestParam String name, @RequestParam String description, @RequestParam String size,
                          @RequestParam Integer speed, @RequestParam Integer[] chars, @RequestParam String[] ability,
                          @RequestParam String[] magic, @RequestParam String[] skill) {

        StringBuilder abilities = new StringBuilder();
        if (ability != null)
            for (String i : ability) {
                abilities.append(i + " ");
            }

        StringBuilder magics = new StringBuilder();
        if (magic != null)
            for (String i : magic) {
                magics.append(i + " ");
            }
        StringBuilder skills = new StringBuilder();
        if (skill != null)
            for (String i : skill) {
                skills.append(i + " ");
            }

        racesRepo.save(new Race(name, description, size, speed, chars, abilities.toString(), magics
                .toString(), skills.toString()));


        return "redirect:race";
    }
}
