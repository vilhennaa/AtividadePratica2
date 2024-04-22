public class Jogo {

    private static void menu() {
        System.out.println("ELITE");
        System.out.println("1) Novo Elite Player");
        System.out.println("2) Novo NPC");
        System.out.println("3) Novo Boss");
        System.out.println("4) Procurar Personagem");
        System.out.println("5) Listar Personagens");
        System.out.println("0) Sair");
    }

    private static void opcaoMenu(int op) {

        switch (op) {
            case 1:
                System.out.println("\nNovo Elite Player:");

                break;

            case 2:
                System.out.println("\nNovo NPC:");

                break;

            case 3:
                System.out.println("\nNovo Boss:");

                break;

            case 4:
                System.out.println("\nProcurar Personagem:");

                break;

            case 5:
                System.out.println("\nListar Personagem:");

                break;

            case 0:
                System.out.println("\nSaindo do jogo...");
                break;

            default:
                System.out.println("\nOpção invalida, digite novamtente");
                break;
        }

    }

    public static void executarJogo() {
        int op;
        do {
            menu();
            op = Console.lerInt();
            opcaoMenu(op);
        } while (op != 0);
    }
}
