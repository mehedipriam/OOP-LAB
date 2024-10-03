import java.util.Scanner;

public class Student {
    String name;
    int id;
    float cgpa;
    public Student(String name, int id, float cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
    }

}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine(); //Abc, 101, 3.5
        String[] parts = s.split(", ");

        String n = parts[0];
        int id = Integer.parseInt(parts[1]);
        float cgpa = Float.parseFloat(parts[2]);
        Student st = new Student(n,id,cgpa);


    }
}
