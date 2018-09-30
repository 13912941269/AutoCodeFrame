package com.chemguan.modelcontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
* Created by  on Sun Sep 30 11:46:29 CST 2018.
*/
@Controller
@RequestMapping("/pc/book")
public class PcBookModelController {


    @RequestMapping("findall")
    public ModelAndView findall() {
        return new ModelAndView("manager/pcbookfindall");
    }


    @RequestMapping("modify")
    public ModelAndView add() {
        return new ModelAndView("manager/pcbookmodify");
    }

}
