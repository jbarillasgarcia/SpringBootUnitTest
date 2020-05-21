package gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo;

import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.controller.DefaultController;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DefaultTests {

    @Autowired
    private DefaultController defController;
    
    @LocalServerPort
    private int port;
    
    @Autowired
    private TestRestTemplate testRestTemplate;
 
    @Test
    public void test1() {
        //given
        final String theName = "Maria";
        final String expected = "Hello Maria";
        final String actual;
        
        //when
        actual = this.testRestTemplate.getForObject(String.format("http://localhost:%d/default/sayhello?yourName=%s", this.port, theName), String.class);
        
        //then
        assertThat(actual).isEqualTo(expected);
        assertThat(actual.equals(expected));
        Assertions.assertEquals(actual, expected, "El nombre no coincide");
    }
    
    @Test
    public void test2() {
        //given
        final String theName = "Maria";
        final String expected = "Hello Maria";
        final String actual;
        
        //when
        actual = this.testRestTemplate.getForObject(String.format("http://localhost:%d/default/sayhello?yourName=%s", this.port, theName), String.class);
        
        //then
        assertThat(actual).isEqualTo(expected);
        assertThat(actual.equals(expected));
        Assertions.assertEquals(actual, expected, "El nombre no coincide");
    }
    
    
}
