package th2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class run {
    public static void main(String[] args) {
        Student student1 = new Student("Thi",16,"HN");
        Student student2 = new Student("Linh",17,"HN");
        Student student3 = new Student("Nhi",18,"HN");
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println(".....Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student student : students){
            System.out.println(student.toString());
        }
    }
}
