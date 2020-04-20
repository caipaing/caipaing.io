/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author daciros
 */
@Controller
public class Error {
    @RequestMapping (value = "/error")
    public ModelAndView error (){
     return new ModelAndView();
    }
}
