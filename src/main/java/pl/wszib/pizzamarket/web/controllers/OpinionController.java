package pl.wszib.pizzamarket.web.controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.wszib.pizzamarket.services.OpinionService;
import pl.wszib.pizzamarket.web.models.OpinionModel;

import java.util.List;

@Controller
public class OpinionController {
    private final OpinionService opinionService;

    public OpinionController(OpinionService opinionService) {
        this.opinionService = opinionService;
    }

    @GetMapping("/opinion")
    public String opinionPage (Model model) {
        List<OpinionModel> opinions = opinionService.getAllOpinions();
/*        model.addAttribute("opinion", new OpinionModel());
        model.addAttribute("opinions", opinions);*/
        return "redirect:/opinion";
    }

    @PostMapping("/opinion")
    public String opinionSubmit (@ModelAttribute OpinionModel opinionModel, Model model) {
        opinionService.saveOpinion(opinionModel);

/*        model.addAttribute("opinion", opinionModel);*/
        return "redirect:/opinion";
    }
}
