import java.util.ArrayList;
import java.util.List;

public class Cadastro{

    private static List<Personagem> listaPersonagem = new ArrayList<>();

    public static void cadastrar(Personagem personagem) {
        listaPersonagem.add(personagem);
    }

    public static List<Personagem> getListaPersonagems() {
        return listaPersonagem;
    }

    public static Personagem buscar(String nome) {

        // percorrer a lista de funcionarios
        for (Personagem tempPersonagem : listaPersonagem) {

            
            if (tempPersonagem.getNome() == nome) {

                
                return tempPersonagem;
            }

        }
       
        return null; 

    }

}

