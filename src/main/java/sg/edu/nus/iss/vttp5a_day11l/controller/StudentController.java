package sg.edu.nus.iss.vttp5a_day11l.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.nus.iss.vttp5a_day11l.model.Student;

@Controller
@RequestMapping("/students") // why here no need the get mtd?
public class StudentController {
    
    List<Student> students;

    public StudentController() {
        students = new ArrayList<>();
    }

    @ResponseBody
    // @GetMapping("/allStudents")  --> when to use this?
    @RequestMapping(path = {"", "/allStudents"}, method=RequestMethod.GET) // why is the path thing diff than home controller
    public List<Student> getStudentList() throws ParseException {
        
        // convert a date string to epoch (long)
        String dob = "15 Apr 1999 10:25:00.000 HKT";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss.SSS zzz");
        Date dDob = sdf.parse(dob);
        Long epochDob = dDob.getTime();
        // convert epoch Long to Date
        Long epochTime = epochDob;
        Date dTime = new Date(epochTime);
        String formattedTime = sdf.format(dTime);
        System.out.println(formattedTime);

        Student s1 = new Student(1, "Melvik", "Chen", formattedTime, "melvik@gmail.com", "15 XXX 123456");
        students.add(s1);

        Student s2 = new Student(1, "Rachel", "Phua", formattedTime, "rach@gmail.com", "25 YYY 654321");
        students.add(s2);

        Student s3 = new Student(1, "Charlie", "Chua", formattedTime, "charlie@gmail.com", "35 ZZZ 135790");
        students.add(s3);
    
        return students;
    }
}
