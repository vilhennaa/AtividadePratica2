public class Jogo {

    //metodo para mostrar o menu
    private static void menu() {
        System.out.println("ELITE");
        System.out.println("1) Novo Elite Player");
        System.out.println("2) Novo NPC");
        System.out.println("3) Novo Boss");
        System.out.println("4) Procurar Personagem");
        System.out.println("5) Listar Personagens");
        System.out.println("0) Sair");
    }

    //metodo para mostrar o menu de listar ou excluir personagens
    private static void menuListarExcluir() {
        System.out.println("1) Listar um Personagem específico");
        System.out.println("2) Listar todos os Personagens");
        System.out.println("3) Excluir um Personagem específico");
        System.out.println("4) Excluir todos os Personagem");
        System.out.println("0) Voltar ao menu principal");
    }

    //metodo para verificar a opção escolhida no menu
    private static void opcaoMenu(int op) {

        switch (op) {
            //Criar novo personagem do tipo Elite Player
            case 1:
                PlayerElite pe1 = new PlayerElite();
                System.out.println("\nNovo Elite Player:");
                System.out.print("Nome: ");
                pe1.setNome(Console.lerString());
                System.out.print("Idade: ");
                pe1.setIdade(Console.lerInt());
                System.out.print("Vida: ");
                pe1.setVida(Console.lerInt());
                System.out.print("Fala do Personagem: ");
                pe1.setFalaPersonagem(Console.lerString());
                System.out.print("Classe:");
                pe1.setClasse(Console.lerString());
                System.out.print("Ataque:");
                pe1.setAtaque(Console.lerInt());
                //adicionar na lista
                Cadastro.cadastrar(pe1);
                System.out.println("Player Elite cadastrado com sucesso!!!");
                break;

            //Criar novo personagem do tipo NPC
            case 2:
                Npc npc1 = new Npc();
                System.out.println("\nNovo NPC:");
                System.out.print("Nome: ");
                npc1.setNome(Console.lerString());
                System.out.print("Idade: ");
                npc1.setIdade(Console.lerInt());
                System.out.print("Vida: ");
                npc1.setVida(Console.lerInt());
                System.out.print("Fala do Personagem: ");
                npc1.setFalaPersonagem(Console.lerString());
                System.out.print("Profissão do NPC: ");
                npc1.setProfissao(Console.lerString());
                //adicionar na lista
                Cadastro.cadastrar(npc1);
                System.out.println("NPC cadastrado com sucesso!!!");
                break;

            // Criar novo personagem do tipo Boss
            case 3:
                PlayerBoss boss = new PlayerBoss();
                System.out.println("\nNovo Boss:");
                System.out.print("Nome: ");
                boss.setNome(Console.lerString());
                System.out.print("Idade: ");
                boss.setIdade(Console.lerInt());
                System.out.print("Vida: ");
                boss.setVida(Console.lerInt());
                System.out.print("Fala do Personagem: ");
                boss.setFalaPersonagem(Console.lerString());
                System.out.print("Ataque Especial do Boss: ");
                boss.setAtaqueEspecial(Console.lerString());
                System.out.println("Dano do Ataque Especial do Boss: ");
                boss.setAtaqueEspecial(Console.lerString());
                //adicionar da lista
                Cadastro.cadastrar(boss);
                System.out.println("Boss cadastrado com sucesso!!!");
                break;

            case 4:
                System.out.println("\nBatalhar:");

                break;

            // abre o menu interno
            case 5:
                System.out.println("\nListar/Excluir Personagens:");
                menuListarExcluir();
                int op2 = Console.lerInt();
                do {
                    switch (op2){
                        // Procura por um personagem especifico
                        case 1:
                            System.out.println("\nProcurar Personagem:");
                            System.out.println("Digite o nome do personagem: ");
                            Personagem p = Cadastro.buscar(Console.lerString());

                            if (p != null){
                                System.out.println(p.toString());
                                return;
                            }
                            System.out.println("\nPersonagem não encontrado");
                            break;

                        // lista todos os personagens
                        case 2:
                            System.out.println("\nListar todos os Personagems:");
                            if (Cadastro.getListaPersonagems().size() == 0) {
                                System.out.println("Não tem personagens cadastrados");
                                return;
                            }
                            for (Personagem pTemp : Cadastro.getListaPersonagems()) {
                                System.out.println(pTemp.toString());
                            }
                            break;

                        // Exclui um personagem especifico
                        case 3:
                            System.out.println("\nExcluir um Personagem:");

                            break;

                        // Exclui todos os personagens
                        case 4:
                            System.out.println("\nExcluir todos os Personagems");

                            break;

                        case 0:
                            System.out.println("\nVoltar ao menu principal");
                            return;

                        default:
                            System.out.println("\nOpção invalida, digite novamtente");
                            break;
                    }
                } while (op2 != 0);
                break;

            case 0:
                System.out.println("\nSaindo do jogo...");
                break;

            default:
                System.out.println("\nOpção invalida, digite novamtente");
                break;
        }

    }

    //metodo para executar o "jogo" na classe main
    public static void executarJogo() {
        int op;
        do {
            menu();
            op = Console.lerInt();
            opcaoMenu(op);
        } while (op != 0);
    }
}
