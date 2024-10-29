package com.example.demo.buoi4.service;

import com.example.demo.buoi4.model.SinhVien;

import java.util.ArrayList;

public class SinhVienService {
    ArrayList<SinhVien> list = new ArrayList<>();

    public SinhVienService(){
        list.add(new SinhVien("ID01","Trung Phong",25,"Bac Ninh", true));
        list.add(new SinhVien("ID02","Thi Hien",27,"Bac Ninh", false));
        list.add(new SinhVien("ID03","Quang Dung",21,"Hai Duong", true));
    }


    public ArrayList<SinhVien> getList (){
        return list;
    }

    public SinhVien findId(String id){
        for (SinhVien sv : list){
            if(sv.getId().equals(id)){
                return sv;
            }
        }
        return null;
    }

    public void add(SinhVien sv) {
        list.add(sv);
    }


    public void Update(SinhVien sv){
        for (int i = 0 ; i < list.size(); i ++){
            if(list.get(i).getId().equals(sv.getId())){
                list.set(i,sv);
            }
        }
    }


    public void deleteById(String id){
        SinhVien sv = null;
        for (int i = 0; i <list.size(); i ++){
            if(list.get(i).getId().equals(id)){
                sv = list.get(i);
            }
        }
        list.remove(sv);
    }
}
