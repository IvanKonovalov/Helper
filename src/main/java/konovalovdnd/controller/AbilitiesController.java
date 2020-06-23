package konovalovdnd.controller;

import konovalovdnd.dao.AbilitiesRepo;
import konovalovdnd.dao.ItemRepo;
import konovalovdnd.dao.etc.ArmorsTypesRepo;
import konovalovdnd.dao.etc.WeaponsCategoryRepo;
import konovalovdnd.dao.manyToMany.AbilitiesAndArmorTypesRepo;
import konovalovdnd.dao.manyToMany.AbilitiesAndItemsRepo;
import konovalovdnd.dao.manyToMany.AbilitiesAndWeaponsCategoriesRepo;
import konovalovdnd.model.Ability;
import konovalovdnd.model.Item;
import konovalovdnd.model.etc.ArmorTypes;
import konovalovdnd.model.etc.WeaponsCategories;
import konovalovdnd.model.manyToMany.AbilitiesAndArmorsTypes;
import konovalovdnd.model.manyToMany.AbilitiesAndItems;
import konovalovdnd.model.manyToMany.AbilitiesAndWeaponsCategories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class AbilitiesController {

    @Autowired
    private AbilitiesRepo abilitiesRepo;
    @Autowired
    private ItemRepo itemRepo;
    @Autowired
    private WeaponsCategoryRepo weaponsCategoryRepo;
    @Autowired
    private ArmorsTypesRepo armorsTypesRepo;
    @Autowired
    private AbilitiesAndItemsRepo abilitiesAndItemsRepo;
    @Autowired
    private AbilitiesAndArmorTypesRepo abilitiesAndArmorTypesRepo;
    @Autowired
    private AbilitiesAndWeaponsCategoriesRepo abilitiesAndWeaponsCategoriesRepo;

    @GetMapping("/ability")
    public String editorAbility(Map<String, Object> model) {
        Iterable<Ability> abilities = abilitiesRepo.findAll();
        model.put("abilities", abilities);
        Iterable<Item> items = itemRepo.findAll();
        model.put("items", items);
        Iterable<WeaponsCategories> weaponsCategories = weaponsCategoryRepo.findAll();
        model.put("weaponsCategories", weaponsCategories);
        Iterable<ArmorTypes> armorTypes = armorsTypesRepo.findAll();
        model.put("armorTypes", armorTypes);

        return "editor_ability";
    }

    @PostMapping("/addAbility")
    public String addAbility(@RequestParam String name, @RequestParam String description,
                             @RequestParam(defaultValue = "") String[] categories, @RequestParam(defaultValue = "") String[] armortype,
                             @RequestParam(defaultValue = "") String[] item, Map<String, Object> model) {

        if (name == null || description == null)
            return "redirect:error";

        if (categories == null && armortype == null && item == null ||
                categories.length == 0 && armortype.length == 0 && item.length == 0)
            return "redirect:error";

        StringBuilder it = new StringBuilder();
        StringBuilder at = new StringBuilder();
        StringBuilder wc = new StringBuilder();

        for (String i : categories) {
            wc.append(i + ":  " + weaponsCategoryRepo.findByName(i).getDescription());
        }

        for (String i : armortype) {
            at.append(i + " ");
        }

        for (String i : item) {
            it.append(i + ":  " + itemRepo.findByName(i).getDescription());
        }


        Ability ability = new Ability(name, description, it.toString(), at.toString(), wc.toString());
        abilitiesRepo.save(ability);

        return "redirect:ability";
    }
}
