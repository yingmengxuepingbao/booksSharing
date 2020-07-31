package com.zyx.books.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zyx.books.model.Users;
import com.zyx.books.service.UsersService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Resource
	private UsersService usersService;
    @RequestMapping(value = "/userLogin",method = RequestMethod.GET)
    public String login(Users users) {
        ModelAndView mv = new ModelAndView();
        Users userLogin = usersService.LoginVerification(users);
        if (userLogin!=null){
            mv.addObject("user", userLogin);
            return "view/book/childrensbooks/cBooksAdd";
        }
        return "view/login/login";
    }

}
