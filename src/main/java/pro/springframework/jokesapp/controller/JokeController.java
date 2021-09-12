package pro.springframework.jokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pro.springframework.jokesapp.services.JokesService;

@Controller
public class JokeController {
    private final JokesService jokesService;

    public JokeController(JokesService jokesService) {
        this.jokesService = jokesService;
    }
    @RequestMapping({"/",""})
    public String getJokes(Model m)
    {
        m.addAttribute("joke",jokesService.getJoke());
        return "index";
    }
}
