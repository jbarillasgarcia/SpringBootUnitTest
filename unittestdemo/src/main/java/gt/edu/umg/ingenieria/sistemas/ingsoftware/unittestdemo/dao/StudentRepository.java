package gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.dao;

import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.model.T2Student;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<T2Student, Integer> {

    @Query(
            value = "SELECT s.* FROM t2_student s LIMIT 10", 
            nativeQuery = true
    )
    public List<T2Student> findAll();
    
    public List<T2Student> findStudentByNameAndSurname(String name, String surname);
    
}
