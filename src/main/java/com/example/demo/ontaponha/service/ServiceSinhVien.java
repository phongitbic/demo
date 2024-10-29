package com.example.demo.ontaponha.service;

import com.example.demo.ontaponha.model.SinhVien;

import java.util.ArrayList;

public class ServiceSinhVien {

    ArrayList<SinhVien> list = new ArrayList<>();

    public ServiceSinhVien(){
        list.add(new SinhVien("ID01","Phong",25,true,"Bac Ninh"));
        list.add(new SinhVien("ID02","Hien",22,true,"Ha Nam"));
        list.add(new SinhVien("ID03","Dung",21,false,"Hai Duong"));
        list.add(new SinhVien("ID04","Phu",65,true,"Nam Dinh"));
        list.add(new SinhVien("ID05","Ha",15,false,"Tuyen Quang"));
    }

    public ArrayList<SinhVien> getList(){
        return list;
    }



}
