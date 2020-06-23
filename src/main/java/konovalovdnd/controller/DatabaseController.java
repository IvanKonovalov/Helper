package konovalovdnd.controller;

import konovalovdnd.dao.CharactersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/")
public class DatabaseController {

    @GetMapping("/")
    public String index() {
        return "index";
    }


    @GetMapping("/database")
    public String database() {
        return "redirect:race";
    }

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @GetMapping("/char")
    public String myGame() {
        return "game";
    }


}
