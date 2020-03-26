import lombok.Data;


@Data
public class Apartament extends Budynek  {



    String miasto;
   double powierzchnia;
   double cena;

//    public Apartament(String miasto,double powierzchnia,double cena){
//        this.miasto=miasto;
//        this.powierzchnia=powierzchnia;
//        this.cena=cena;
//    }
    public  void getFullPrice(){
        cena=0.95*cena;
        System.out.println(cena);
    }

    public String miasto() {
        return null;
    }

    public double powierzchnia() {
        return 0;
    }

    public double cena() {
        return 0;
    }
}
