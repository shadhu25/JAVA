package _9EncapsulatioInheritance.Challenges;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp=new Employee("Krishn Kant Kumar",22,10000006);
        System.out.println(emp.studentDetails());
        emp.setSalary(1000000009);
        System.out.println(emp.studentDetails());
    }
}
