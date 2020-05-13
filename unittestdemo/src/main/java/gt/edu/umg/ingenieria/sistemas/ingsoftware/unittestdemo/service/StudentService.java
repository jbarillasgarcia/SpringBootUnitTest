package gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.service;

import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.dao.StudentRepository;
import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.model.T2Student;
import gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.util.exception.RecordNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository repo;
    
    public List<T2Student> getAllStudents() {
        return this.repo.findAll();
    }
    
    public List<T2Student> getByNameAndSurname(String name, String surname) {
        return (List<T2Student>) this.repo.findStudentByNameAndSurname(name, surname);
    }
    
    public T2Student getById(Integer id) {
        return this.repo.findById(id).get();
    }
    
    public T2Student insertStudent(T2Student newStudent) {
        return this.repo.save(newStudent);
    }
    
    public T2Student updateStudent(T2Student updatedStudent) {
        return this.repo.save(updatedStudent);
    }
    
    public Boolean deleteStudent(Integer studentId) throws RecordNotFoundException {
        try {
            this.repo.deleteById(studentId);
        } catch (Exception ex) {
            throw new RecordNotFoundException(ex.getMessage());
        }
        
        return true;
    }

}
