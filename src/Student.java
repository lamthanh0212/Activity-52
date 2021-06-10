public class Student {
    private String name ;
    private double gpa ;

    public Student () {

    }

    public Student (String name , double gpa) {
        this.gpa = gpa ;
        this.name = name ;
    }

    public String getName () {
        return  name ;
    }
    public double getGpa () {
        return gpa ;
    }

    public void setName () {
        this.name = name ;
    }
    public void setGpa () {
        this.gpa =gpa ;
    }

    public boolean ktragpa () {
        if (gpa >= 1.5){
            return true ;
        } else {
            return false ;
        }
    }

    public void innamegpa () {
        System.out.println("Ten sv la: " + name + "co gpa: " + gpa);
    }


}
