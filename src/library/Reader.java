package library;

import java.util.Stack;

public class Reader {
    String fioo;
    int rtic;
    String fac;
    String dayb;
    String number;
    public Reader(String fioo, int rtic, String fac, String dayb, String number){
        this.fioo = fioo;
        this.rtic = rtic;
        this.fac = fac;
        this.dayb = dayb;
        this.number = number;
    }
    public void takeBook(int countbook){
        System.out.println(this.fioo + " give " + countbook + " books");
    }

    public void returnBook(int countbook){
        System.out.println(this.fioo + " returned " + countbook + " books");
    }
    public void returnBook(String[] namebook){
        System.out.print(this.fioo + " returned this books: ");
        for(int i = 0; i < namebook.length - 1; i++){
            System.out.print(namebook[i] + ", ");
        }
        System.out.print(namebook[namebook.length - 1]);
        System.out.println();
    }

    public void takeBook(String[] namebook){
        System.out.print(this.fioo + " give this books: ");
        for(int i = 0; i < namebook.length - 1; i++){
            System.out.print(namebook[i] + ", ");
        }
        System.out.print(namebook[namebook.length - 1]);
        System.out.println();
    }
    public static void ab(int a, int b){
        if(a < b){
            System.out.print(a + " ");
            a = a + 1;
            ab(a, b);
        }
        if(a > b){
            System.out.print(a + " ");
            a = a - 1;
            ab(a, b);
        }
        if(a == b){
            return;
        }
        System.out.println();
    }
}
