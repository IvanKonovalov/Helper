package konovalovdnd.controller;

import konovalovdnd.dao.AbilitiesRepo;
import konovalovdnd.dao.BackstoriesRepo;
import konovalovdnd.dao.ItemRepo;
import konovalovdnd.model.Ability;
import konovalovdnd.model.Backstory;
import konovalovdnd.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class BackstoriesController {

    @Autowired
    private AbilitiesRepo abilitiesRepo;
    @Autowired
    private ItemRepo itemRepo;
    @Autowired
    private BackstoriesRepo backstoriesRepo;


    @GetMapping("/backstory")
    public String editorBackstory(Map<String, Object> model) {

        Iterable<Ability> abilities = abilitiesRepo.findAll();
        Iterable<Item> items = itemRepo.findAll();
        Iterable<Backstory> backstories = backstoriesRepo.findAll();
        model.put("abilities", abilities);
        model.put("items", items);
        model.put("backstories", backstories);

        return "editor_backstory";
    }

    @PostMapping("/addBackstory")
    public String addBackstory(@RequestParam String name, @RequestParam String description,
                               @RequestParam(defaultValue = "") String[] item,
                               @RequestParam(defaultValue = "") String[] abilities, Map<String, Object> model) {

        StringBuilder abi = new StringBuilder();
        StringBuilder it = new StringBuilder();
        if (abilities != null)
            for (String i : abilities) {
                abi.append(abilitiesRepo.findByName(i).getDescription() + "  ");
            }
        if (item != null)
            for (String i : item) {
                it.append(i + ":  " + itemRepo.findByName(i).getDescription());
            }

        backstoriesRepo.save(new Backstory(name, description, abi.toString(), it.toString()));


        return "redirect:backstory";
    }
}
