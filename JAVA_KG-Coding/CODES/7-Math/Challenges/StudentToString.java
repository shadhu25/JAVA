package _8Math.Challenges;

public class StudentToString {
    String name;
    int rollNo;
    int age;
    String course;
    String address;

    public StudentToString(String name, int rollNo, int age, String course, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.course = course;
        this.address = address;
    }
    @Override
    public String toString(){
        return "Student Details:-\n"+"Name: '"+name+"' | Roll Number: '"+rollNo+"' | Age: "+age+"' | Course: '"+course+"' | Address: '"+address+"'";
    }
    public static void main(String[] args) {
        StudentToString Krishn=new StudentToString("Krishn Kant Kumar",101,22,"BCA","Madai road, Bari yusufpur, Hajipur, Vaishali, Bihar");
        System.out.println(Krishn);
    }
}
