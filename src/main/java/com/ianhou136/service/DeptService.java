package com.ianhou136.service;

import com.ianhou136.pojo.Dept;

import java.util.List;

public interface DeptService {

    List<Dept> list();

    void delete(Integer id);

    void add(Dept dept);
}

