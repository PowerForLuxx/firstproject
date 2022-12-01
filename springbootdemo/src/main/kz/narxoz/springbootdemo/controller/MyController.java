package springbootdemo.src.main.kz.narxoz.springbootdemo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
    @GetMapping ("hello")
    public String Hello(@RequestParam(name="name",required = false,defaultValue = "Adil")String name,
                        @RequestParam(name="surname",required = false,defaultValue = "Ozkoch")String surname,
                        @RequestParam(name="title",required = false,defaultValue = "My Title")String title, Model model){
        model.addAttribute("name", name);
        model.addAttribute("surname",surname);
        model.addAttribute("title",title);

        return "hello";
    }
}
