package com.example.demo.ontaponha.controller;

import com.example.demo.ontaponha.service.ServiceSinhVien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ontap")
public class SinhVienController {

    ServiceSinhVien serviceSinhVien = new ServiceSinhVien();


    @GetMapping("hien-thi")
    public String HienThi(Model model){
        model.addAttribute("danhSach",serviceSinhVien.getList());
        return "/ontap/hien-thi";
    }


}
