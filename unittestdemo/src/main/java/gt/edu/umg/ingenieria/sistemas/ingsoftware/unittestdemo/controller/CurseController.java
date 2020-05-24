/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.controller;

import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.model.T2Course;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author diegoovalle
 */
public class CurseController {
    @GetMapping("/course/getAll")
    public List<T2Course> allCourse (){
        return null;
    }
    
    @PostMapping("/course/add")
    public T2Course create(@RequestBody(required = true) T2Course course) {
        return null;
    }
}
