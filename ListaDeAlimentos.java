import java.util.ArrayList;
import java.util.List;

public class ListaDeAlimentos {
    // Lista uma coleção de objetos da classe Alimento
    List<Alimento> listaDeAlimentos = new ArrayList<>();

    public void listarAlimentos() {
        for (Alimento alimento : listaDeAlimentos) {
            System.out.println("Nome: " + alimento.getNome() + " Calorias: " + alimento.getCalorias());

        }
    }

    // Método de adicionar alimentos:
    public void addAlimento(Alimento Alimento) {
        listaDeAlimentos.add(Alimento);
    }
    // Método de Quantidade de Calorias
}
