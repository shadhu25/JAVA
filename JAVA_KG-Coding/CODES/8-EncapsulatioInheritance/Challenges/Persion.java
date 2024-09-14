package _9EncapsulatioInheritance.Challenges;

import java.util.Objects;
import java.util.PrimitiveIterator;

public class Persion {
    private String name;
    private int age;

    public Persion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Persion))
            return false;
        else if (this==obj)
            return true;
        else {
            Persion Obj=(Persion) obj;
            return name.equals(Obj.name) && age==Obj.age;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Persion persion1=new Persion("krishn",22);
        Persion persion2=new Persion("krishn",25);
        if(persion2.equals(persion1))
            System.out.println("Equals");
        else
            System.out.println("Not equals");
    }
}
