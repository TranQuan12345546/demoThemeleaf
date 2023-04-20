package vn.techmaster.jobhunt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.techmaster.jobhunt.model.Employer;
import vn.techmaster.jobhunt.repository.EmployerRepository;

@Controller()
@RequestMapping("/addJob")
public class EmployerController {
    @Autowired private EmployerRepository employerRepository;
    @GetMapping()
    public String addJob(Model model) {
        model.addAttribute("employer", new Employer());
        return "employee";
    }

    @PostMapping()
    public String handleAddJob(@ModelAttribute Employer employer) {
        System.out.println(employer.toString());
        employerRepository.addEmployer(employer);
        return "employee";
    }

}
