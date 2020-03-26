import lombok.Data;

@Data
public class Dom extends Budynek {
    @Override
    public String toString() {
        return "Dom{" +
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
