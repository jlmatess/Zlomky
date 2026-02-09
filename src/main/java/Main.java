import cz.uhk.zlomky.Zlomek;

public class Main {


    static void main() {
        IO.println("Projekt ZLOMKY"); //novinka Javy 25, jiank System.out.println()
        IO.println("========================================");

        var a = new Zlomek(3,4); //konsttruktor bez parametru = definuji k.

        a. setCitatel(3);
        a. setJmenovatel(4);

        IO.println("Zlomek : "+ a.getCitatel() + " / " +a.getJmenovatel());

        Zlomek b = new Zlomek(4 , 5);
        IO.println(b);
    }
}
