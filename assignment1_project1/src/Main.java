package src;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> grades1 = List.of(78, 89, 99, 51);
        List<Integer> grades2 = List.of(78, 89, 75, 63, 82);

        Student student1 = new Student("Harry", "Potter", 21, true, new ArrayList<>(grades1));
        Student student2 = new Student("Ron", "Weasley", 20, true, new ArrayList<>(grades2));

        Teacher teacher1 = new Teacher("Severus", "Snape", 51, true, "Math", 7, 800000);
        Teacher teacher2 = new Teacher("Albus", "Dumbledore", 71, true, "Philosophy", 25, 1500000);

        School school = new School();
        school.addMember(student1);
        school.addMember(student2);
        school.addMember(teacher1);
        school.addMember(teacher2);

        System.out.println(school);

        System.out.println("GPA of " + student1 + " is " + student1.calculateGPA());
        teacher2.giveRaise(10);
        System.out.println("After raise: " + teacher2);
    }
}
