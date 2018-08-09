package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @GetMapping("/name")
    public String displayNameAndSurname(@RequestParam(required = false) String name,
                                        @RequestParam(required = false) String surname,
                                        Model model) {
        Person person = new Person(name, surname);
        model.addAttribute("mariusz", person);

        System.out.println("name from request: " + name);
        System.out.println("surname from request: " + surname);

        return "name";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }

    @GetMapping("/persons")
    public String getPersons(Model model) {
        model.addAttribute("persons", createPersons());

        return "peoples";
    }

    @GetMapping("/welcome")
    public String welcomePage() {
        return "welcome";
    }

    List<Person> createPersons() {
        List<Person> result = new ArrayList();

        result.add(new Person("Marek", "W."));
        result.add(new Person("Mirek", "M"));
        result.add(new Person("Olaf", "L"));
        result.add(new Person("Genowefa", "M"));
        result.add(new Person("Chuck", "X"));
        result.add(new Person("Kevin", "F"));

        return result;
    }
}
