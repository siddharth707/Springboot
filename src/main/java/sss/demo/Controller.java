 package sss.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

 @RestController
 @RequestMapping("/streams")
public class Controller {

      @GetMapping
     public List<Student> getall() {
         return null;
     }
     @PostMapping("/add")
     public String addStudent(@RequestBody Student student) {

         String studentId =student.getStudentId();
         String studentName =student.getStudentName();
         String Address=student.getAddress();
         return "added";
         }
     }
