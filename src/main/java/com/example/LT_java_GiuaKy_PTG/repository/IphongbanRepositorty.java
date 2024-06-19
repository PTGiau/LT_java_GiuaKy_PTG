package com.example.LT_java_GiuaKy_PTG.repository;

import com.example.LT_java_GiuaKy_PTG.model.phongban;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IphongbanRepositorty extends JpaRepository<phongban, Long> {
}
