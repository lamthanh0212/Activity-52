public class Test {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement() ;

        int sosvdo = studentManagement.svdo() ;
        int sosvrot = studentManagement.svrot() ;

        Student maxx = studentManagement.timsvcogpacaoI();
        Student minn = studentManagement.timsvcogpathapI() ;

        System.out.println("So sv do: " + sosvdo);
        System.out.println("So sv rot: " + sosvrot);

        System.out.println("Sv gpa cao nhat: ");
        maxx.innamegpa();
        System.out.println("Sv gpa thap nhat: ");
        minn.innamegpa();
    }
}
