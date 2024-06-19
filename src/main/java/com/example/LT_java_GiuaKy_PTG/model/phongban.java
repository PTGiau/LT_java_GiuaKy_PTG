package com.example.LT_java_GiuaKy_PTG.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "phongbans")
public class phongban {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "Ma_Phong")
    private String Roomcode;
    @Column(name = "Ten_Phong")
    private String Roomname;

    @OneToMany(mappedBy = "phongban", cascade = CascadeType.ALL)
    private List<nhanvien> nhanviens;


}
