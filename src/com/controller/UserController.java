package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.User;
import com.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/hello.do")
    public String find(HttpServletRequest request)
    {
        String age=userService.findAge("1");
        System.out.println(age);//���ʵ��ɹ����ڿ���̨���ӡ����25
        return "jsp/index";
    }
}