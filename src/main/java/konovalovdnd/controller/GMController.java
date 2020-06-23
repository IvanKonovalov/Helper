package konovalovdnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GMController {

    @GetMapping("/choose")
    public String choose() {
        return "choose";
    }


    @GetMapping("/GM")
    public String gm() {
        return "gm_room";
    }

    @GetMapping("/beasts")
    public String beasts() {
        return "GM_beasts";
    }

    @GetMapping("/locations")
    public String locations() {
        return "GM_locations";
    }

    @GetMapping("/npcs")
    public String npcs() {
        return "GM_npcs";
    }

    @GetMapping("/quests")
    public String quests() {
        return "GM_quests";
    }


}
