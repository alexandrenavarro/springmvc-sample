package com.github.springmvc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/todo")
public class TodoController {

    
    private static final Logger LOGGER = LoggerFactory.getLogger(TodoController.class);

    
    @RequestMapping(method = RequestMethod.GET)
    public String findAll(ModelMap model) {
        model.addAttribute("message", "Spring 3 MVC Hello World");
        final List<Map<String, String>> list = new ArrayList<>();
        final Map<String, String> map = new HashMap<String, String>();
        map.put("1", "One");
        map.put("2", "Two");
        list.add(map);
        list.add(map);
        
        model.addAttribute("list", list);
        return "todo";
    }
    
    
    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@ModelAttribute Person person) {

        LOGGER.info("person=" + person);
        
        return "todo2";
    }
    
}
