import library.Reader;

public class Libmain {
    public static void main(String[] args) {
        Reader r1 = new Reader("Manjon", 1, "IVT", "29.03.2004", "+7921");
        r1.takeBook(2);
        String[] nab = {"lol", "ndifndgi", "dngindv", "difdgo9d"};
        r1.takeBook(nab);
        r1.returnBook(45);
        r1.returnBook(nab);
        Reader.ab(22, 15);
    }
}
