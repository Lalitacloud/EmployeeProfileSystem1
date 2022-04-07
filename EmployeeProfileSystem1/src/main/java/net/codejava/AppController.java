
package net.codejava;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private EmpService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<EmployeeProfile> listEmployees = service.listAll();
        model.addAttribute("listEmployees", listEmployees);
        return "index";
    }

    @RequestMapping("/new")
    public String showNewEmployeePage(Model model) {
        EmployeeProfile employee = new EmployeeProfile();
        model.addAttribute("employee", employee);

        return "new_employee";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("employee") EmployeeProfile employee) {
        service.save(employee);

        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditEmployeePage(@PathVariable(name = "firstname") int firstname) {
        ModelAndView mav = new ModelAndView("edit_employee");
        EmployeeProfile employee = service.get(firstname);
        mav.addObject("employee", employee);

        return mav;
    }

    @RequestMapping("/delete/{Employee.code}")
    public String deleteEmployee(@PathVariable(name = "firstname") int firstname) {
        service.delete(firstname);
        return "redirect:/";
    }
}

