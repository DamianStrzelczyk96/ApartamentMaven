import lombok.Data;


@Data
public class Apartament {


    private String miasto;
    private double powierzchnia;
    public double cena;

//    public Apartament(String miasto,double powierzchnia,double cena){
//        this.miasto=miasto;
//        this.powierzchnia=powierzchnia;
//        this.cena=cena;
//    }
    public  void getFullPrice(){
        cena=0.95*cena;
        System.out.println(cena);
    }

}
