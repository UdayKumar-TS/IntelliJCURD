package in.labs.springcurd.service;


import in.labs.springcurd.model.Student;
import in.labs.springcurd.StudentRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class StudentService {

    @Autowired
    private StudentRepo repo;


    public Student createStudent(Student student) {
        return repo.save(student);


    }

    public List<Student> GetStudent() {
        List<Student> stulist = repo.findAll();
        return stulist;
    }

    public String DeleteStudent(int id) {

        repo.deleteById(id);
        return "deleted";
    }

    public Student updatedata(int id,Student s) {

        Optional<Student> studentOptional = repo.findById(id);

        if (studentOptional.isPresent()) {
            Student student=studentOptional.get();
           // BeanUtils.copyProperties(student, student);

            student.setName(s.getName());
            student.setLoc(s.getLoc());
            return repo.save(student);

        }else return null;
    }
}
