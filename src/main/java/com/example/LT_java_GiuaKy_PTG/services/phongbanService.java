package com.example.LT_java_GiuaKy_PTG.services;

import com.example.LT_java_GiuaKy_PTG.model.phongban;
import com.example.LT_java_GiuaKy_PTG.repository.IphongbanRepositorty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class phongbanService {
    @Autowired
    private IphongbanRepositorty phongBanRepositorty;

    public List<phongban> getAllphongBans() {
        return phongBanRepositorty.findAll();
    }

    public phongban getPhongBanById(Long id) {
        return phongBanRepositorty.findById(id).orElse(null);
    }

    public phongban savePhongBan(phongban phongBan) {
        return phongBanRepositorty.save(phongBan);
    }

    public void deletePhongBan(Long id){
        phongBanRepositorty.deleteById(id);
    }
}
