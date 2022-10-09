package iphonr;

public class phon {
    int number = 0;
    String model = "phone";
    double weight = 100;

    public phon(int number, String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public phon(int number, String model){
        this.number = number;
        this.model = model;
    }
    public phon(){

    }
    public String toString(){
        String s;
        s = this.model + " " + this.number + " " + this.weight;
        return s;
    }
    public void receiveCall(String name){
        System.out.println("Called " + name);
    }
    public String receiveCall(String name, int nm){
        return (name + " " + nm);
    }
    public int getNumber(){
        return this.number;
    }
    public static void sendMessage(int[] x){
        for(int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }
    }
}
