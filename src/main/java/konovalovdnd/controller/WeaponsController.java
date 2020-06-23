package konovalovdnd.controller;

import konovalovdnd.dao.WeaponsRepo;
import konovalovdnd.dao.etc.DamagesTypesRepo;
import konovalovdnd.dao.etc.DiceRepo;
import konovalovdnd.dao.etc.WeaponsCategoryRepo;
import konovalovdnd.dao.etc.WeaponsPropertyRepo;
import konovalovdnd.dao.manyToMany.WeaponsAndPropertiesRepo;
import konovalovdnd.model.Weapon;
import konovalovdnd.model.etc.DamageTypes;
import konovalovdnd.model.etc.Dices;
import konovalovdnd.model.etc.WeaponsCategories;
import konovalovdnd.model.etc.WeaponsProperties;
import konovalovdnd.model.manyToMany.WeaponsAndProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class WeaponsController {
    @Autowired
    private WeaponsCategoryRepo weaponsCategoryRepo;
    @Autowired
    private DamagesTypesRepo damagesTypesRepo;
    @Autowired
    private DiceRepo diceRepo;
    @Autowired
    private WeaponsRepo weaponsRepo;
    @Autowired
    private WeaponsPropertyRepo weaponsPropertyRepo;
    @Autowired
    private WeaponsAndPropertiesRepo weaponsAndPropertiesRepo;

    @GetMapping("/weapon")
    public String editorWeapon(Map<String, Object> model) {
        Iterable<WeaponsCategories> weaponsCategories = weaponsCategoryRepo.findAll();
        model.put("weaponsCategories", weaponsCategories);
        Iterable<DamageTypes> damageTypes = damagesTypesRepo.findAll();
        model.put("damageTypes", damageTypes);
        Iterable<Dices> dices = diceRepo.findAll();
        model.put("dices", dices);
        Iterable<Weapon> weapons = weaponsRepo.findAll();
        model.put("weapons", weapons);
        Iterable<WeaponsProperties> weaponsProperties = weaponsPropertyRepo.findAll();
        model.put("weaponsProperties", weaponsProperties);

        return "editor_weapon";
    }

    @PostMapping("/addWeapon")
    public String addWeapon(@RequestParam String name, @RequestParam String description, @RequestParam String category,
                            @RequestParam(defaultValue = "false") boolean ranger, @RequestParam String type, @RequestParam Integer multi,
                            @RequestParam Integer dice, @RequestParam Integer price, @RequestParam Integer weight,
                            @RequestParam String[] property, Map<String, Object> model) {


        StringBuilder prop = new StringBuilder();

        for (String p : property) {
            prop.append(weaponsPropertyRepo.findByName(p).getDescription() + '\n');
        }


        Weapon weapon = new Weapon(name, description, ranger, type, multi, dice, price, weight, category, prop.toString());
        weaponsRepo.save(weapon);
        return "redirect:weapon";
    }
}
