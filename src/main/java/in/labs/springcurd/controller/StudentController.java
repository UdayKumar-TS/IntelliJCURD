package in.labs.springcurd.controller;

import in.labs.springcurd.model.Student;
import in.labs.springcurd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

     @Autowired
     private StudentService ser;
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student stu){

 return ser.createStudent(stu);
    }
    @GetMapping("/find")
    public List<Student> GetStudent() {
        return ser.GetStudent();
    }


    @DeleteMapping ("/delete")
    public String DeleteStudent(@RequestParam int  id) {
        return ser.DeleteStudent(id);
    }

    @PutMapping("/update")
    public Student Update(@RequestParam int id, @RequestBody Student s){
        return ser.updatedata(id,s);
    }

}
