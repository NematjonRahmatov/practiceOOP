import java.lang.annotation.Target;
import java.util.Random;
import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        Scanner nn = new Scanner(System.in);
        Train[] trains = new Train[5];
        trains[0] = new Train("man", nn.nextInt(), "20:34");
        trains[1] = new Train("tu", nn.nextInt(), "19:30");
        trains[2] = new Train("1", nn.nextInt(), "17:30");
        trains[3] = new Train("5", nn.nextInt(), "23:30");
        trains[4] = new Train("768", nn.nextInt(), "10:30");

        Test2 man = new Test2(1, 2);
        System.out.println(man.get_a() + " " + man.get_b());
        man.set_a(2);
        man.set_b(3);
        System.out.println(man.get_a() + " " + man.get_b());

        int n = 10;
        Student[] students = new Student[n];
        students[0] = new Student("Petrov", "A.I.", 1);
        students[1] = new Student("Petrovna", "B.I.", 1);
        students[2] = new Student("Ivanov", "A.S..", 1);
        students[3] = new Student("Pushkin", "A.S.", 2);
        students[4] = new Student("Dostoevskii", "F.M.", 2);
        students[5] = new Student("Shishkin", "I.I.", 3);
        students[6] = new Student("Aivazovskii", "I.K.", 3);
        students[7] = new Student("Mate", "V.V.", 3);
        students[8] = new Student("Preobrazhenkii", "M.T.", 3);
        students[9] = new Student("Solncev", "F.G.", 3);

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 5; j++) {
                students[i].AddGrade(new Random().nextInt(9, 10));
            }
        }   
        for(int i = 0; i < n; i++){
            students[i].Ots();
            System.out.println();
        }
        for(int i = 0; i < n; i++){
            if(students[i].isGood()){
                System.out.println(students[i].name);
            }
        }
    }
}
class Test1{
    public int a;
    public int b;
    public void firstM(){
        System.out.println(a + " " + b);
    }
    public void Sum(){
        System.out.println(a + b);
    }
    public void Max(){
        System.out.println(Math.max(a, b));
    }
}
class Test2{
    public int a, b;
    public Test2(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int get_a(){
        return a;
    }
    public int get_b(){
        return b;
    }
    public void set_a(int a){
        this.a = a;
    }
    public void set_b(int b){
        this.b = b;
    }
}
class Student{
    public String name;
    public String ini;
    public int ngrp;
    private int[] ot = new int[5];
    public int i = 0;

    public Student(String name, String ini, int ngrp){
        this.name = name;
        this.ini = ini;
        this.ngrp = ngrp;
    }
    public void AddGrade(int ott){
        if(i <= 4) {
            ot[i] = ott;
            i = i + 1;
        }
        else{
            System.out.println("Full of Grade");
        }
    }

    public void Ots(){
        for(int i = 0; i < 5; i++){
            System.out.print(ot[i] + " ");
        }
    }

    public boolean isGood(){
        int s = 0;
        for(int i = 0; i < 5; i++){
            if(ot[i] >= 9){
                s = s + 1;
            }
        }
        if(s == 5){
            return true;
        }else{
            return false;
        }
    }
}
class Train{
    public String PunkNaz;
    public int NPoezd;
    public String Time;

    public Train(String PunkNaz, int NPoezd, String Time){
        this.PunkNaz = PunkNaz;
        this.NPoezd = NPoezd;
        this.Time = Time;
    }
}
