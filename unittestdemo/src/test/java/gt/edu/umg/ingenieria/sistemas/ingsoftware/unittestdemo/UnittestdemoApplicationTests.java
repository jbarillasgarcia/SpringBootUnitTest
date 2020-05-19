package gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo;

import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.controller.CurseController;
import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.model.T2Course;
import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.model.T2Student;
import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.util.exception.RecordNotFoundException;
import java.util.Date;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
        
public class UnittestdemoApplicationTests {
    
	@LocalServerPort
    private int port;
        
        @Autowired
    private TestRestTemplate testRestTemplate;
        
         @Autowired
    private CurseController theController;
    
         
         @Test
    public void test1()  {
        //given
        final Integer max = 100;
        
        //when
        
        
        
        //then
        
    }
    

}
