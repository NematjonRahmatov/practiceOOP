import iphonr.*;
public class mainpro {
    public static void main(String[] args) {
        phon iph1 = new phon(1,"iphone x", 193);
        phon iph2 = new phon(2,"iphone 11", 180);
        phon iph3 = new phon(3,"iphone 12", 150);
        System.out.println(iph1.toString());
        System.out.println(iph2.toString());
        System.out.println(iph3.toString());
        iph1.receiveCall("Kall");
        System.out.println(iph1.getNumber() + " " + iph2.getNumber() + " " + iph3.getNumber());
        phon neiph = new phon();
        System.out.println(neiph.toString());
        System.out.println(iph1.receiveCall("nemat", 925));
        int[] x = {14364, 2456546, 46546543};
        phon.sendMessage(x);

    }
}
