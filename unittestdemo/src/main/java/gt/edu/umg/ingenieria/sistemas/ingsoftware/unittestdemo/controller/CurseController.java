
package gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.controller;

import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.model.T2Course;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class CurseController {
    
    
    @GetMapping("/course/getAll")
    public List<T2Course> todos ( ){
        return null;
        
    }
    
    
}
