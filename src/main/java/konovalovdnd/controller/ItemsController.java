package konovalovdnd.controller;

import konovalovdnd.dao.ItemRepo;
import konovalovdnd.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class ItemsController {

    @Autowired
    private ItemRepo itemRepo;

    @GetMapping("/item")
    public String item(Map<String, Object> model) {
        Iterable<Item> items = itemRepo.findAll();
        model.put("items", items);
        return "editor_item";
    }

    @PostMapping("/addItem")
    public String addItem(@RequestParam String name, @RequestParam String description, @RequestParam Integer price,
                          @RequestParam Integer weight, Map<String, Object> model) {
        if (name == null || description == null || price == null || weight == null)
            return "redirect:error";
        Item item = new Item(name, description, price, weight);
        itemRepo.save(item);
        return "redirect:item";

    }
}
