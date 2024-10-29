package com.example.demo.buoi2;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/buoi2")
public class loginController {
    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String showLogin() {
        return "buoi2/login";
    }

//    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
//    public String login(HttpServletRequest request) {
//        // viết nghiệp vụ để nhận vào username và password được gửi từ cilent
//        // so sánh, nếu username == 123 và password == abc thì chuyển về trang info.jsp
//        //nếu thông tin không đúng thì quay lại trang chủ login và báo lỗi
//        String usr = request.getParameter("username");
//        String prd = request.getParameter("password");
//        if (usr.equals("123") && prd.equals("abc")) {
//            request.setAttribute("username", usr);
//            request.setAttribute("password", prd);
//            return "buoi2/info";
//        }
//        request.setAttribute("error", "thông tin đăng nhập sai");
//        return "buoi2/login";
//    }


    //su dung @RequestParams de viet controller post
//    @PostMapping("/login")
//    public String login(@RequestParam("username") String username,
//                        @RequestParam("password") String password,
//                        Model model){
//        if(username.equals("123") && password.equals("abc")){
//            model.addAttribute("username", username);
//            model.addAttribute("password",password);
//            return "buoi2/info";
//        }
//        model.addAttribute("error","Thong tin dang nhap sai");
//        return "buoi2/login";
//    }

    // sử dụng java beans để viết controller
    @PostMapping("/login")
    public String login(LoginRequest loginRequest, Model model){
        if(loginRequest.getUsername().equals("123") && loginRequest.getPassword().equals("abc")){
            model.addAttribute("username", loginRequest.getUsername());
            model.addAttribute("password", loginRequest.getPassword());
            return "buoi2/info";
        }

        model.addAttribute("error","thong tin dang nhap sai");
        return "buoi2/login";
    }

}
