package com.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.User;
import com.service.UserService;

@Controller
public class UserController1 extends HttpServlet {
 
	private static final long serialVersionUID = 1L;

	@RequestMapping(value="/helloo.do")
	@ResponseBody
    public String find(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
                List<String> userNames=Arrays.asList("AAA","BBB","CCC");
				 String  userName=request.getParameter("userName");
				 String result=null;
				 if(userNames.contains(userName)){
				     result="<font color='red'>该用户名已存在</font>";
				 }else{
				     result="<font color='green'>该用户名可以使用</font>";
				 }
				 //response.getWriter().print(result);
				 return result;
			    }
}