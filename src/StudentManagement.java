import java.util.Scanner;

public class StudentManagement {
    private int n;
    private Student[] students;

    public StudentManagement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        students = new Student[n];


        for (int i = 0; i < n; i = i + 1) {
            System.out.println("Nhap vao thong tin thu " + i );
            String name;
            double gpa;
            System.out.println("Nhap vao ten sv thu " + i );
            name = scanner.nextLine();
            System.out.println("Nhap vao gpa sv thu " + i );
            gpa = scanner.nextDouble();
            scanner.nextLine();
            students[i] = new Student();
            students[i].setGpa();
            students[i].setName();
        }


    }

    public int svdo() {
        int c = 0;
        for (Student student : students) {
            boolean ktra = student.ktragpa();
            if (ktra == true) {
                c = c + 1;

            }

        }
        return c;
    }

    public int svrot() {
        int c = 0;
        for (Student student : students) {
            boolean ktra = student.ktragpa();
            if (ktra == false) {
                c = c + 1;

            }

        }
        return c;
    }

    public Student timsvcogpacaoI () {
        Student max = students[0];
        for ( Student student : students) {
            if ( student.getGpa() > max.getGpa()) {
                max = student ;
            }
        }
        return max ;
    }

    public Student timsvcogpathapI () {
        Student min = students[0];
        for ( Student student : students) {
            if ( student.getGpa() < min.getGpa()) {
                min = student ;
            }
        }
        return min ;
    }
}
