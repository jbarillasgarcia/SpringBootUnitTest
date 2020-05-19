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
    private T2Course getAllCourses;
         
         @Test
    public void test1() throws RecordNotFoundException {
        //given
        final Integer max = 100;
        final 
        //when
        final T2Course all = this.getAllCourses;
        final Integer conteo = count.all;
        if (conteo > max){
        
        throw RecordNotFoundException (UMGTooManyRowsException)}
        
        
        //then
        assertThat(actual.getIdStudent()).isEqualTo(expected.getIdStudent());
        assertThat(actual.getName()).isEqualTo(expected.getName());
        assertThat(actual.getSurname()).isEqualTo(expected.getSurname());
    }
    

}
