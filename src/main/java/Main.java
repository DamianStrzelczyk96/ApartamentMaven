import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Apartament warszawa = new Apartament();
        warszawa.setMiasto("warszawa");
        warszawa.setCena(150000);
        warszawa.setPowierzchnia(100);

        Apartament krwakow = new Apartament();
        krwakow.setMiasto("Krakow");
        krwakow.setPowierzchnia(150);
        krwakow.setCena(200000);
        Apartament gdansk = new Apartament();
        gdansk.setCena(300000);
        gdansk.setPowierzchnia(200);
        gdansk.setMiasto("Gdańsk");

        ArrayList mieszkania = new ArrayList();
        mieszkania.add(warszawa);
        mieszkania.add(krwakow);
        mieszkania.add(gdansk);
        gdansk.getFullPrice();
        System.out.println(gdansk.cena);


        System.out.println(mieszkania);
        System.out.println(krwakow.getCena());
        krwakow.getFullPrice();


        }


}
