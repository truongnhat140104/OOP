import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    String promotion;
    String department;
    String major;
    String speciality;
}

class Course {
    int cid;
    String course;
    ArrayList<Student> students = new ArrayList<>();

    public Course(int cid, String course) {
        this.cid = cid;
        this.course = course;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }
}

public class Main {
    public static void main(String[] args) {
        Course programmingCourse = new Course(101, "Programming");
        Course databaseCourse = new Course(102, "Database");
        Course comboCourse = new Course(103, "Programming and Database");
        Course aiCourse = new Course(201, "Advanced Artificial Intelligence");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students registering for courses: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Student student = new Student();

            System.out.print("Enter student name: ");
            student.name = scanner.nextLine();

            System.out.println("Current promotion:");
            System.out.println("1: Undergraduate");
            System.out.println("2: Graduate");
            System.out.print("Enter the promotion type: ");
            int promotionType = scanner.nextInt();
            scanner.nextLine();

            if (promotionType == 1) {
                System.out.println("Choose a course for undergraduate:");
                System.out.println("101: Programming");
                System.out.println("102: Database");
                System.out.println("103: Both Programming and Database");
                System.out.print("Enter the course number: ");
                int courseNumber = scanner.nextInt();
                scanner.nextLine();

                if (courseNumber == 101) {
                    System.out.println("Enrolled in Programming successfully");
                    programmingCourse.enrollStudent(student);
                } else if (courseNumber == 102) {
                    System.out.println("Enrolled in Database successfully");
                    databaseCourse.enrollStudent(student);
                } else if (courseNumber == 103) {
                    System.out.println("Enrolled in Programming and Database successfully");
                    comboCourse.enrollStudent(student);
                }
            } else if (promotionType == 2) {
                System.out.println("Enrolled in Advanced Artificial Intelligence successfully");
                aiCourse.enrollStudent(student);
            }

            students.add(student);
        }

        System.out.println("List of undergraduate students:");
        for (Student student : programmingCourse.students) {
            System.out.println(student.name + " enrolled in: " + programmingCourse.course);
        }

        for (Student student : databaseCourse.students) {
            System.out.println(student.name + " enrolled in: " + databaseCourse.course);
        }

        for (Student student : comboCourse.students) {
            System.out.println(student.name + " enrolled in: " + comboCourse.course);
        }

        System.out.println("List of graduate students:");
        for (Student student : aiCourse.students) {
            System.out.println(student.name + " enrolled in: " + aiCourse.course);
        }
    }
}
