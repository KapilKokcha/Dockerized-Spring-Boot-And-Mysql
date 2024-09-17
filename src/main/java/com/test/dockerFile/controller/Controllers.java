package com.test.dockerFile.controller;

import com.test.dockerFile.entity.DemoEntity;
import com.test.dockerFile.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docker")
public class Controllers {

    @Autowired
    private DemoRepository demoRepository;

    @GetMapping("test")
    public String testFile() {
        return "Working";
    }

    @PostMapping("/add")
    public ResponseEntity<DemoEntity> add(@RequestBody DemoEntity demoEntity) {
        DemoEntity demoEntity1 = demoRepository.save(demoEntity);
        return new ResponseEntity<>(demoEntity1, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<DemoEntity>> getAll() {
        List<DemoEntity> demoEntityList = demoRepository.findAll();
        return new ResponseEntity<>(demoEntityList, HttpStatus.OK);
    }

}
