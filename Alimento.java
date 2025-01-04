public class Alimento {
    private static double calorias;
    private static double gorduras;
    private static double carboidratos;
    private static double proteina;
    private static double quantidade;

    public void adicionarAlimento() {
        this.calorias = Alimento.calorias;
        this.gorduras = Alimento.gorduras;
        this.carboidratos = Alimento.carboidratos;
        this.proteina = Alimento.proteina;

    }
    public static void armazenarAlimento () {

    }

    public double getCalorias () {
        return calorias;
    }
    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
    public double getGorduras() {
        return gorduras;
    }
    public void setGorduras(double gorduras) {
        this.gorduras = gorduras;
    }
    public double getCarboidratos() {
        return carboidratos;
    }
    public void setCarboidratos(double carboidratos) {
        this.carboidratos = carboidratos;
    }
    public double getProteina() {
        return proteina;
    }
    public void setProteina(double proteina) {
        this.proteina = proteina;
    }

    public Alimento(double calorias, double gorduras, double carboidratos, double proteina){
        this.calorias = calorias;
        this.gorduras = gorduras;
        this.carboidratos = carboidratos;
        this.proteina = proteina;
    }
    public Alimento(double calorias, double gorduras, double carboidratos, double proteina, double quantidade){
        this.calorias = calorias;
        this.gorduras = gorduras;
        this.carboidratos = carboidratos;
        this.proteina = proteina;
        this.quantidade = quantidade;
    }
}
