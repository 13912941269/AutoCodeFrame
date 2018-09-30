package com.chemguan.modelcontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
* Created by  on Sun Sep 30 11:46:29 CST 2018.
*/
@Controller
@RequestMapping("/pc/chapter")
public class PcChapterModelController {


    @RequestMapping("findall")
    public ModelAndView findall() {
        return new ModelAndView("manager/pcchapterfindall");
    }


    @RequestMapping("modify")
    public ModelAndView add() {
        return new ModelAndView("manager/pcchaptermodify");
    }

}
