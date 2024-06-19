package com.example.LT_java_GiuaKy_PTG.services;

import com.example.LT_java_GiuaKy_PTG.model.nhanvien;
import com.example.LT_java_GiuaKy_PTG.repository.InhanvienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class nhanvienService {
    @Autowired
    private InhanvienRepository nhanvienRepository;

    public List<nhanvien> getAllnhanvien() {
        return nhanvienRepository.findAll();
    }

    public nhanvien getnhanvienById(Long id) {
        return nhanvienRepository.findById(id).orElse(null);
    }

    public void addnhanvien(nhanvien nhanvien) {
        nhanvienRepository.save(nhanvien);
    }

    public void deletenhanvien(Long id) { nhanvienRepository.deleteById(id); }

    public void updatenhanvien(nhanvien nhanvien) { nhanvienRepository.save(nhanvien); }
}
