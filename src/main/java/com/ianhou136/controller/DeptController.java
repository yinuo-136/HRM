package com.ianhou136.controller;


import com.ianhou136.pojo.Dept;
import com.ianhou136.pojo.Result;
import com.ianhou136.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping
    public Result list() {
        log.info("enquire dept data");

        List<Dept> deptList = deptService.list();

        return Result.success(deptList);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("delete dept {}", id);

        deptService.delete(id);
        return Result.success();
    }

    @PostMapping
    public Result add(@RequestBody Dept dept) {
        log.info("add dept {}", dept);
        deptService.add(dept);

        return Result.success();
    }

    @PutMapping
    public Result put(@RequestBody Dept dept) {
        log.info("update dept {}", dept);
        return null;
    }
}
