package gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo;

import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.controller.CurseController;
import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.model.T2Course;
import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.model.T2Student;
import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.util.exception.RecordNotFoundException;
import java.util.Date;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
        
public class UnittestdemoApplicationTests {
    
	@LocalServerPort
    private int port;
        
        @Autowired
    private TestRestTemplate testRestTemplate;
        
         @Autowired
    private CurseController theController;
    
         
    @Test
    public void testGetAll()  {
        //given
        final T2Course[] expeted = new T2Course[101];
       
        //when
        final ResponseEntity<T2Course[]> resFromApi = 
                this.testRestTemplate.getForEntity(String.format("http://localhost:%d/course/getAll", this.port), 
                     T2Course[].class);
        
       T2Course[] actual = resFromApi.getBody();
        //then
        //Assertions.assertEquals(expeted.length, actual.length);
    }
    
    @Test
    public void testCourseTop(){
        //given
        final int record = 10;
        final String name = "Sed";
        final T2Course[] expetedRecords = new T2Course[record];
        //when
        final ResponseEntity<T2Course[]> resFromApi2 = 
                this.testRestTemplate.getForEntity(String.format("http://localhost:%d/course/top/%d/%s", this.port,record,name), 
                     T2Course[].class);
        
       T2Course[] actualRecords = resFromApi2.getBody();
       //then
       //Assertions.assertArrayEquals(expetedRecords, actualRecords);
    }
    
    @Test
    public void testCourseAdd()
    {
        //given
        final T2Course expetedc = new T2Course();
        expetedc.setName("Prueba");
        expetedc.setDescription("Test");
        //when
        ParameterizedTypeReference<T2Course> v = new ParameterizedTypeReference<T2Course>() {} ;
        final ResponseEntity resFromApi3 = this.testRestTemplate.exchange(String.format("http://localhost:%d/course/add", this.port), HttpMethod.POST, null, v);

        //RequestEntity request = RequestEntity.post(new URI("http://localhost:%d/course/add", this.port)).body(expetedc);
    }
    
}