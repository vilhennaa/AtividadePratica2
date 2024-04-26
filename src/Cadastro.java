import java.util.ArrayList;
import java.util.List;

public class Cadastro{

    private static List<Personagem> listaPersonagem = new ArrayList<>();

    // valida se o nome já existe na lista.
    public static boolean validarNomePersonagem(String nome){

        for (Personagem tempPersonagem : listaPersonagem) {
            if (nome.equals(tempPersonagem.getNome())) {
                return false;
                
            }
        }
        return true;
    }

    //cadastra o personagem
    public static void cadastrar(Personagem personagem) {
        listaPersonagem.add(personagem);
    }

    public static List<Personagem> getListaPersonagems() {
        return listaPersonagem;
    }

    //metodo para excluir um personagem especifico
    public static Personagem excluir(String nome){

        // percorrer a lista de personagens
        for (Personagem tempPersonagem : listaPersonagem) {

            
            if (tempPersonagem.getNome().equals(nome)) {

                return tempPersonagem;
                
            }
        }
       
        return null; 

    }

    //exclui todos os personagens
    public static void excluirTodos(){
        
        getListaPersonagems().clear();
       
    }


    //busca personagem especifico
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

