import lombok.Data;

@Data
public abstract class Budynek {
    int liczbapokoi;
    int liczbaokien;
    int liczbametrów;
    int liczbamieszkań;
    boolean garaż;
    boolean ogródek;
    boolean czyJestSiłownia;


}
