package konovalovdnd.controller;

import konovalovdnd.dao.ArmorsRepo;
import konovalovdnd.dao.etc.ArmorsTypesRepo;
import konovalovdnd.model.Armor;
import konovalovdnd.model.etc.ArmorTypes;
import konovalovdnd.model.etc.WeaponsCategories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class ArmorsController {

    @Autowired
    private ArmorsRepo armorsRepo;
    @Autowired
    private ArmorsTypesRepo armorsTypesRepo;


    @GetMapping("/armor")
    public String editorArmor(Map<String, Object> model) {

        Iterable<Armor> armors = armorsRepo.findAll();
        Iterable<ArmorTypes> armorTypes = armorsTypesRepo.findAll();

        model.put("armors", armors);
        model.put("armorTypes", armorTypes);
        return "editor_armor";
    }

    @PostMapping("/addArmor")
    public String addItem(@RequestParam String name, @RequestParam String description, @RequestParam String type,
                          @RequestParam Integer requiredStr, @RequestParam Integer ac, @RequestParam Integer price,
                          @RequestParam Integer weight, @RequestParam(defaultValue = "false") boolean isHindrance,
                          Map<String, Object> model) {
        if (name == null || description == null || ac == null || price == null || weight == null)
            return "redirect:error";
        if (requiredStr == null)
            requiredStr = 0;

        Armor armor = new Armor(name, description, ac, requiredStr, price, weight, type, isHindrance);

        armorsRepo.save(armor);
        return "redirect:armor";
    }

}
