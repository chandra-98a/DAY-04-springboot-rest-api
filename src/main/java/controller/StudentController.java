package controller;

import bean.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        int id;
        Student student= new Student(1,
                "chandra", "kala"
        );
        return student;
    }
    // http://localhost:8080/students
    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Ramesh", "Fadatare"));
        students.add(new Student(2, "umesh", "Fadatare"));
        students.add(new Student(3, "Ram", "Jadhav"));
        students.add(new Student(4, "Sanjay", "Pawar"));
        return students;
    }

    // Spring BOOT REST API with Path Variable
    // {id} - URI template variable
    // http://localhost:8080/students/1/ramesh/fadatare
    @GetMapping("students/{id}/{first-name}/{last-name}")
    public Student studentPathVariable(@PathVariable("id") int studentId,
                                       @PathVariable("first-name") String fName,
                                       @PathVariable("last-name") String lName){
        return new Student(studentId, fName, lName);
    }

    // Spring boot REST API with Request Param
    //  http://localhost:8080/students/query?id=1&firstName=Ramesh&lastName=Fadatare
    @GetMapping("students/query")
    public Student studentRequestVariable(@RequestParam int id,
                                          @RequestParam String fName,
                                          @RequestParam String lName){
        return new Student(id, fName, lName);
    }

//@RequestBody @PostMapping
    @PostMapping("students/create")
    public  Student createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFname());
        System.out.println(student.getlName());
return student;
    }
}
