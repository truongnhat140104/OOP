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
        // Create course objects
        Course programmingCourse = new Course(1, "Ky thuat lap trinh");
        Course databaseCourse = new Course(2, "Co so du lieu");
        Course comboCourse = new Course(3, "Ky thuat lap trinh va Co so du lieu");
        Course aiCourse = new Course(201, "Chi tue nhan tao nang cao");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien can dang ky mon hoc: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Student student = new Student();

            // Collect student name
            System.out.print("Nhap ten sinh vien " + (i + 1) + ": ");
            student.name = scanner.nextLine();

            System.out.println("Cac lua chon :");
            System.out.println("1: Dai hoc");
            System.out.println("2: Cao hoc");
            System.out.print("Nhap lua chon: ");
            int promotionType = scanner.nextInt();
            scanner.nextLine();

            if (promotionType == 1) {
                System.out.println("Cac khoa hoc cho he dai hoc:");
                System.out.println("1: Ky thuat lap trinh");
                System.out.println("2: Co so du lieu");
                System.out.println("3: Ky thuat lap trinh va Co so du lieu");
                System.out.print("Chon khoa hoc: ");
                int courseNumber = scanner.nextInt();
                scanner.nextLine();

                if (courseNumber == 1) {
                    System.out.println("Da dang ky thanh cong Ky thuat lap trinh");
                    programmingCourse.enrollStudent(student);
                } else if (courseNumber == 2) {
                    System.out.println("Da dang ky thanh cong Co so du lieu");
                    databaseCourse.enrollStudent(student);
                } else if (courseNumber == 3) {
                    System.out.println("Da dang ky thanh cong");
                    comboCourse.enrollStudent(student);
                }
            } else if (promotionType == 2) {
                System.out.println("Da dang ky thanh cong Tri tue nhan tao nang cao");
                aiCourse.enrollStudent(student);
            }

            students.add(student);
        }
        System.out.println();
        System.out.println("Danh sach sinh vien dai hoc:");
        for (Student student : programmingCourse.students) {
            System.out.println(student.name + " Da dang ky thanh cong: " + programmingCourse.course);
        }

        for (Student student : databaseCourse.students) {
            System.out.println(student.name + "Da dang ky thanh cong: " + databaseCourse.course);
        }

        for (Student student : comboCourse.students) {
            System.out.println(student.name + " Da dang ky thanh cong: " + comboCourse.course);
        }
        System.out.println();
        System.out.println("Danh sach sinh vien cao hoc:");
        for (Student student : aiCourse.students) {
            System.out.println(student.name + " Da dang ky thanh cong: " + aiCourse.course);
        }
    }
}
