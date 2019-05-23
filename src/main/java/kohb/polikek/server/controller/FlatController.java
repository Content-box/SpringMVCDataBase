package kohb.polikek.server.controller;

import kohb.polikek.server.entity.Flat;
import kohb.polikek.server.service.FlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("flat")
public class FlatController {

    @Autowired
    private FlatService flatService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAllFlat(Model model) {
        List<Flat> listFlats = flatService.getAll();
        model.addAttribute("listFlats", listFlats);
        return "flat/flatpage";
    }

    @RequestMapping(value = "add",method = RequestMethod.GET)
    public String addFlat(Model model) {

        return "flat/addflat";
    }



}
