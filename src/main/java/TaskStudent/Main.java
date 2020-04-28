package TaskStudent;

import epam.Group;
import epam.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Group singers = new Group();
        while (true) {
            System.out.print("If you want to start enter  something: ");
            String startString = scanner.nextLine();
            System.out.print("If you want to add student enter <yes>, otherwise enter <no> ");
            String answer = scanner.nextLine();
            if (answer.equals("yes")) {
                System.out.print("Enter student's name: ");
                String name = scanner.nextLine();
                System.out.print("Enter student's averageScore: ");
                double averageScore = scanner.nextDouble();
                Student student = new Student(name, averageScore);
                singers.addStudent(student);
                singers.showAllStudents();

            } else {
                singers.showAllStudents();
                break;
            }
        }
    }
}
