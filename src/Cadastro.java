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

    public static Personagem excluir(String nome){

        // percorrer a lista de personagens
        for (Personagem tempPersonagem : listaPersonagem) {

            
            if (tempPersonagem.getNome().equals(nome)) {

                return tempPersonagem;
                
            }
        }
       
        return null; 

    }

    public static void excluirTodos(){
        
        getListaPersonagems().clear();
       
    }

    public static Personagem buscar(String nome) {

        // percorrer a lista de personagens
        for (Personagem tempPersonagem : listaPersonagem) {

            
            if (tempPersonagem.getNome().equals(nome)) {

                
                return tempPersonagem;
            }

        }
       
        return null; 

    }

}

