package konovalovdnd.controller;

import konovalovdnd.dao.etc.*;
import konovalovdnd.model.etc.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class OtherController {
    @Autowired
    private DiceRepo diceRepo;
    @Autowired
    private LevelRepo levelRepo;
    @Autowired
    private SchoolOfMagicRepo schoolOfMagicRepo;
    @Autowired
    private SizeRepo sizeRepo;
    @Autowired
    private SpeedRepo speedRepo;
    @Autowired
    private TargetRepo targetRepo;
    @Autowired
    private WeaponsCategoryRepo weaponsCategory;
    @Autowired
    private WeaponsPropertyRepo weaponsPropertyRepo;
    @Autowired
    private ArmorsTypesRepo armorsTypesRepo;
    @Autowired
    private DamagesTypesRepo damagesTypesRepo;

    @GetMapping("/other")
    public String other(Map<String, Object> model) {
        Iterable<Dices> dices = diceRepo.findAll();
        model.put("dices", dices);
        Iterable<Levels> levels = levelRepo.findAll();
        model.put("levels", levels);
        Iterable<SchoolsOfMagic> schoolsOfMagics = schoolOfMagicRepo.findAll();
        model.put("schoolsOfMagics", schoolsOfMagics);
        Iterable<Sizes> sizes = sizeRepo.findAll();
        model.put("sizes", sizes);
        Iterable<Speeds> speeds = speedRepo.findAll();
        model.put("speeds", speeds);
        Iterable<Targets> targets = targetRepo.findAll();
        model.put("targets", targets);
        Iterable<WeaponsCategories> weaponsCategories = weaponsCategory.findAll();
        model.put("weaponsCategories", weaponsCategories);
        Iterable<WeaponsProperties> weaponsProperties = weaponsPropertyRepo.findAll();
        model.put("weaponsProperties", weaponsProperties);
        Iterable<ArmorTypes> armorTypes = armorsTypesRepo.findAll();
        model.put("armorsTypes", armorTypes);
        Iterable<DamageTypes> damageTypes = damagesTypesRepo.findAll();
        model.put("damagesTypes", damageTypes);


        return "editor_other";
    }

    @PostMapping("addDice")
    public String addDice(@RequestParam Integer value, Map<String, Object> model) {
        Dices dice = new Dices();
        dice.setValue(value);
        diceRepo.save(dice);
        return "redirect:other";
    }

    @PostMapping("addSize")
    public String addSize(@RequestParam String chara, @RequestParam Integer height,
                          @RequestParam Integer width, Map<String, Object> model) {
        Sizes size = new Sizes();
        size.setCharacter(chara);
        size.setHeight(height);
        size.setWidth(width);
        sizeRepo.save(size);
        return "redirect:other";
    }

    @PostMapping("addSpeed")
    public String addSpeed(@RequestParam Integer speed, Map<String, Object> model) {
        Speeds speeds = new Speeds();
        speeds.setSpeed(speed);
        speedRepo.save(speeds);
        return "redirect:other";
    }

    @PostMapping("addTarget")
    public String addTarget(@RequestParam String target, @RequestParam Integer radius,
                            Map<String, Object> model) {
        Targets targets = new Targets();
        targets.setTarget(target);
        targets.setRadius(radius);
        targetRepo.save(targets);
        return "redirect:other";
    }

    @PostMapping("addWeaponCategory")
    public String addWeaponCategory(@RequestParam String name, @RequestParam String description,
                                    Map<String, Object> model) {
        WeaponsCategories weaponsCategory1 = new WeaponsCategories();
        weaponsCategory1.setName(name);
        weaponsCategory1.setDescription(description);
        weaponsCategory.save(weaponsCategory1);
        return "redirect:other";
    }

    @PostMapping("addArmorType")
    public String addArmorType(@RequestParam String name, @RequestParam Integer bonus,
                               Map<String, Object> model) {
        ArmorTypes armorType = new ArmorTypes();
        armorType.setName(name);
        armorType.setMaxBonus(bonus);
        armorsTypesRepo.save(armorType);
        return "redirect:other";
    }

    @PostMapping("addDamageType")
    public String addDamageType(@RequestParam String name, Map<String, Object> model) {
        DamageTypes damageType = new DamageTypes();
        damageType.setName(name);
        damagesTypesRepo.save(damageType);
        return "redirect:other";
    }


    @PostMapping("addLevel")
    public String addLevel(@RequestParam Integer number, @RequestParam Integer bonus,
                           @RequestParam Integer required_exp, Map<String, Object> model) {
        Levels level = new Levels();
        level.setNumber(number);
        level.setBonus(bonus);
        level.setRequired_exp(required_exp);
        levelRepo.save(level);
        return "redirect:other";
    }

    @PostMapping("addMagicSchool")
    public String addMagicSchool(@RequestParam String name, Map<String, Object> model) {
        SchoolsOfMagic schoolOfMagic = new SchoolsOfMagic();
        schoolOfMagic.setName(name);
        schoolOfMagicRepo.save(schoolOfMagic);
        return "redirect:other";
    }


    @PostMapping("addPropertyWeapon")
    public String addPropertyWeapon(@RequestParam String name, @RequestParam String description,
                                    @RequestParam Integer value, Map<String, Object> model) {
        WeaponsProperties weaponsProperty = new WeaponsProperties();
        weaponsProperty.setDescription(description);
        weaponsProperty.setName(name);
        if (value == null) {
            value = 0;
        }
        weaponsProperty.setValue(value);
        weaponsPropertyRepo.save(weaponsProperty);
        return "redirect:other";
    }
}
