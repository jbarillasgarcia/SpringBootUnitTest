package gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo;

import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.model.T2Student;
import java.util.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UnittestdemoApplicationTests {
    
	 @LocalServerPort
    private int port;
    
    @Autowired
    private TestRestTemplate testRestTemplate;
            
    @Test        
        public void testGetAllCourses () {
        //given
        final Integer theId = 4404218;
        final T2Student expected = new T2Student();
        expected.setIdStudent(4404218);
        expected.setName("Josue");
        expected.setSurname("Mante");
        expected.setEmail("Kathryne_OKeefe@jazmyne.net");
        expected.setBirthdate(new Date());
        expected.setStudentId("dd53683d2623543108ed110f2530cb0254aa");
        expected.setPhone1("1-644-909-9993");
        expected.setPhone2("536.745.2715");
        expected.setAddress1("220 Alysson Drives");
        expected.setAddress2("71032-4490");
        
        //when
        final ResponseEntity res = this.testRestTemplate.getForEntity(String.format("http://localhost:%d/student/getAll", this.port), T2Student.class);
        
        //then
        Assertions.assertEquals(200,res.getStatusCodeValue());
    }

}
