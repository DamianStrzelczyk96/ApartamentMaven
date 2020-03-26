import lombok.Data;

@Data
public class Blok extends Budynek {
    @Override
    public String toString() {
        return "Blok{" +
                "liczbapokoi=" + liczbapokoi +
                ", liczbaokien=" + liczbaokien +
                ", liczbametrów=" + liczbametrów +
                ", liczbamieszkań=" + liczbamieszkań +
                ", garaż=" + garaż +
                ", ogródek=" + ogródek +
                ", czyJestSiłownia=" + czyJestSiłownia +
                '}';
    }
}
