package com.example.Studentapi;

@RestController
public class StudentController {

    StudentRepository repository = new InMemoryStudentRepositoryImpl();


    @PostMapping("/student")
    public void createStudent(@RequestBody Student student){

        repository.save(student);

        //System.out.println("name: " + student.name);
        //System.out.println("age: " + student.age);
        //System.out.println("telephone number: " + student.tp);

    }

    @GetMapping("/student/:id")
    public Student getStudent(@PathVariable String id){

        //return.

    }


    //Delete a student


    //Update a student

}
