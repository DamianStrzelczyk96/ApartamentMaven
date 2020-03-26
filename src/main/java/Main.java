import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Apartament warszawa = new Apartament();
        warszawa.setMiasto("warszawa");
        warszawa.setCena(150000);
        warszawa.setPowierzchnia(100);
        System.out.println(warszawa);
        Apartament krwakow = new Apartament();
        krwakow.setMiasto("Krakow");
        krwakow.setPowierzchnia(150);
        krwakow.setCena(200000);
        Apartament gdansk = new Apartament();
        gdansk.setCena(300000);
        gdansk.setPowierzchnia(200);
        gdansk.setMiasto("Gdańsk");

        ArrayList<Apartament> mieszkania = new ArrayList();
        mieszkania.add(warszawa);
        mieszkania.add(krwakow);
        mieszkania.add(gdansk);
        gdansk.getFullPrice();
        System.out.println(gdansk.cena);


        System.out.println(mieszkania);
        System.out.println(krwakow.getCena());
        krwakow.getFullPrice();

        double srednia = (warszawa.cena+gdansk.cena+krwakow.cena)/mieszkania.size();
        System.out.println(srednia);
        System.out.format("%.2f%n", srednia);
        double suma = 0;
        suma += mieszkania.stream().mapToDouble(Apartament -> Apartament.cena).sum();
        double srednia2 = suma/mieszkania.size();
        System.out.format("%.2f%n", srednia2);

        Blok blok1 =new Blok();
        blok1.setCzyJestSiłownia(true);
        blok1.setGaraż(true);
        blok1.setLiczbametrów(10000);
        blok1.setLiczbamieszkań(15);
        blok1.setLiczbaokien(90);
        blok1.setOgródek(true);
        blok1.setLiczbapokoi(60);
        System.out.println(blok1);


        Dom domek= new Dom();
        domek.setCzyJestSiłownia(false);
        domek.setGaraż(true);
        domek.setLiczbametrów(150);
        domek.setLiczbamieszkań(1);
        domek.setLiczbaokien(10);
        domek.setLiczbapokoi(8);
        domek.setOgródek(true);

        System.out.println(domek);

        }

}
