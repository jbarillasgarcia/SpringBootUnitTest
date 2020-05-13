package gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.controller;

import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.model.T2Student;
import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.service.StudentService;
import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.util.exception.RecordNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    private StudentService ser;

    @GetMapping("/getAll")
    public List<T2Student> getAll() {
        return this.ser.getAllStudents();
    }
    
    @GetMapping("/getByNameAndSurname")
    public List<T2Student> getByNameAndSurname(@RequestParam("name") String name, @RequestParam("surname") String surname) {
        return this.ser.getByNameAndSurname(name, surname);
    }
    
    @GetMapping("/getById")
    public T2Student getById(@RequestParam("id") Integer id) {
        return this.ser.getById(id);
    }
    
    @PostMapping("/create")
    public T2Student create(@RequestBody(required = true) T2Student student) {
        return this.ser.insertStudent(student);
    }
    
    @PutMapping("/update")
    public T2Student update(@RequestBody(required = true) T2Student student) {
        return this.ser.updateStudent(student);
    }
    
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable(required = true) Integer id) {
        try {
            this.ser.deleteStudent(id);
        } catch (RecordNotFoundException ex) {
            return ex.getMessage();
        } catch (Exception ex) {
            return ex.getMessage();
        }
        
        return "Student deleted!!!";
    }
}
