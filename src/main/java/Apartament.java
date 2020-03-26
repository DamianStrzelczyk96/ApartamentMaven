import lombok.Data;


@Data
public class Apartament  {



    String miasto;
   double powierzchnia;
   double cena;


    public  void getFullPrice(){
        cena=0.95*cena;
        System.out.println(cena);
    }

}
