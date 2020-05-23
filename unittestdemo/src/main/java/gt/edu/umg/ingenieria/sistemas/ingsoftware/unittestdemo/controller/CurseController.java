
package gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.controller;

import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.model.T2Course;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class CurseController {
    
    
    @GetMapping("/course/getAll")
    public List<T2Course> todos ( ){
        return null;
        
    }
    
    @GetMapping("/course/top/{records}/{name}")
    public List<T2Course> getAllCouserFilter(@PathVariable int records,String name)
    {
        return null;
    }
    
    @PostMapping("/course/add")
    public void addCourse(@RequestBody String token,T2Course course)
    {
        
    }
    
    
}
