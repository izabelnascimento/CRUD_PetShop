package projeto;
import java.util.Scanner;

public class Projeto {

    public static void main(String[] args) {
        int op, op2;
        Scanner entrada = new Scanner (System.in);
        MenuServico s1 = new MenuServico();
        MenuAnimal a1 = new MenuAnimal();
        MenuProduto p1 = new MenuProduto();
        
        do{
            System.out.println("Qual você deseja?");
            System.out.println("1- Animal");
            System.out.println("2- Produto");
            System.out.println("3- Servico");
            System.out.println("0- Voltar");
            op = entrada.nextInt();
            s1.Pontinho();
            
            switch (op){
                case 1:
                    do{
                        System.out.println("1- Cadastrar Animal");
                        System.out.println("2- Consultar Animal por id");
                        System.out.println("3- Consultar Animal por Nome");
                        System.out.println("4- Alterar Animal");
                        System.out.println("5- Excluir Animal");
                        System.out.println("6- Listar Animal");
                        System.out.println("0- Voltar");
                        op2 = entrada.nextInt();
                        a1.Pontinho();

                        switch(op2){
                            case 1:
                                a1.Cadastrar();
                                a1.Pontinho();
                                break;
                            case 2:
                                System.out.println("Digite o ID do animal:");
                                int buscar = entrada.nextInt();
                                a1.Consultar(buscar);
                                a1.Pontinho();
                                break;
                            case 3:
                                System.out.println("Digite o nome do animal:");
                                String buscar2 = entrada.next();
                                a1.Consultar(buscar2);
                                a1.Pontinho();
                                break;
                            case 4:
                                a1.Alterar();
                                a1.Pontinho();
                                break;
                            case 5:
                                a1.Excluir();
                                a1.Pontinho();
                                break;
                            case 6:
                                a1.Listar();
                                a1.Pontinho();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                a1.Pontinho();
                                break;
                        }
                    }while(op2!=0);
                    break;
                case 2:
                    do{
                        System.out.println("1- Cadastrar Produto");
                        System.out.println("2- Consultar Produto por ID");
                        System.out.println("3- consultar Produto por tipo");
                        System.out.println("4- Alterar Produto");
                        System.out.println("5- Excluir Produto");
                        System.out.println("6- Listar Produto");
                        System.out.println("0- Voltar");
                        op2 = entrada.nextInt();
                        p1.Pontinho();

                        switch(op2){
                            case 1:
                                p1.Cadastrar();
                                p1.Pontinho();
                                break;
                            case 2:
                                System.out.println("Digite o identificador para buscar: ");
                                int buscar2 = entrada.nextInt();
                                p1.Consultar(buscar2);
                                p1.Pontinho();
                                break;
                            case 3:
                                System.out.println("Digite o tipo para buscar: ");
                                String buscar = entrada.next();
                                p1.Consultar(buscar);
                                p1.Pontinho();
                                break;
                            case 4:
                                p1.Alterar();
                                p1.Pontinho();
                                break;
                            case 5:
                                p1.Excluir();
                                break;
                            case 6:
                                p1.Listar();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                    }while(op2!=0);
                    break;
                case 3:
                    do{
                        System.out.println("1- Cadastrar Serviço");
                        System.out.println("2- Consultar Serviço por id");
                        System.out.println("3- Consultar Serviço por tipo");
                        System.out.println("4- Alterar Serviço");
                        System.out.println("5- Excluir Serviço");
                        System.out.println("6- Listar Serviço");
                        System.out.println("0- Voltar");
                        op2 = entrada.nextInt();
                        s1.Pontinho();

                        switch(op2){
                            case 1:
                                s1.Cadastrar();
                                s1.Pontinho();
                                break;
                            case 2:
                                System.out.println("Digite o identificador para busca: ");
                                int buscar = entrada.nextInt();
                                s1.Consultar(buscar);
                                s1.Pontinho();
                                break;
                            case 3:
                                System.out.println("Digite o tipo para busca: ");
                                String buscar2 = entrada.next();
                                s1.Consultar(buscar2);
                                s1.Pontinho();
                                break;
                            case 4:
                                s1.Alterar();
                                s1.Pontinho();
                                break;
                            case 5:
                                s1.Excluir();
                                s1.Pontinho();
                                break;
                            case 6:
                                s1.Listar();
                                s1.Pontinho();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                s1.Pontinho();
                                break;
                        }
                    }while(op2!=0); 
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    s1.Pontinho();
                    break;
            }
        }while(op!=0);
    }
}