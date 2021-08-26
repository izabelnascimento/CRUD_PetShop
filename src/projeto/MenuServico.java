package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuServico implements Interface2 {
    
    Scanner entrada = new Scanner(System.in);
    ArrayList<Servico> lista = new ArrayList();
    int op, i;

    @Override
    public void Cadastrar(){
        System.out.println("Identificador: ");
        int id = entrada.nextInt();
        System.out.println("Tipo de serviço: ");
        String tipo = entrada.next();
        System.out.println("Produtos necessários: ");
        String produto = entrada.next();
        System.out.println("Valor: ");
        String valor = entrada.next();
        System.out.println("Serviço de emergência? ");
        String emergencia = entrada.next();
        System.out.println("Tempo estimado em horas: ");
        String duracao = entrada.next();
            lista.add(new Servico(id, tipo, produto, valor, emergencia, duracao));
    }
    
    @Override
    public void Consultar(int buscar){
        for(i=0; i<lista.size(); i++){
            Servico idServico = lista.get(i);
            if(idServico.getId() == buscar){
                lista.get(i);
                System.out.println("Identificador: ");
                System.out.println(idServico.getId());
                System.out.println("Tipo: ");
                System.out.println(idServico.getTipo());
                System.out.println("Produtos necessários: ");
                System.out.println(idServico.getProduto());
                System.out.println("Valor: ");
                System.out.println(idServico.getValor());
                System.out.println("Emergência? ");
                System.out.println(idServico.getEmergencia());
                System.out.println("Tempo estimado em horas: ");
                System.out.println(idServico.getDuracao());
            }
        }
    }
    
    @Override
    public void Consultar(String buscar2){
        for(i=0; i<lista.size(); i++){
            Servico buscar2Servico = lista.get(i);
            if(buscar2Servico.getTipo().equalsIgnoreCase(buscar2)){
                lista.get(i);
                System.out.println("Identificador: ");
                System.out.println(buscar2Servico.getId());
                System.out.println("Tipo: ");
                System.out.println(buscar2Servico.getTipo());
                System.out.println("Produtos necessários: ");
                System.out.println(buscar2Servico.getProduto());
                System.out.println("Valor: ");
                System.out.println(buscar2Servico.getValor());
                System.out.println("Emergência? ");
                System.out.println(buscar2Servico.getEmergencia());
                System.out.println("Tempo estimado em horas: ");
                System.out.println(buscar2Servico.getDuracao());
            }
        }
    }

    @Override
    public void Alterar() {
        if(lista.isEmpty()){
            System.out.println("Não há serviços cadastrados.");
        }else{
            System.out.println("Digite o id do serviço para alterá-lo:");
            int busca = entrada.nextInt();
            if(lista.isEmpty()){
                System.out.println("Não há serviços cadastrados.");
            }else{
                for(i=0; i<lista.size(); i++){
                    Servico idServico = lista.get(i);
                    if(idServico.getId() == busca){
                        do{
                            System.out.println("O que deseja alterar?");
                            System.out.println("1- Identificador");
                            System.out.println("2- Tipo");
                            System.out.println("3- Produtos necessários");
                            System.out.println("4- Valor");
                            System.out.println("5- Emergência?");
                            System.out.println("6- Duração");
                            System.out.println("0- Voltar");
                            op = entrada.nextInt();

                            switch(op){
                                case 1: 
                                    lista.remove(idServico.getId());
                                    System.out.println("Digite o novo identificador: ");
                                    int troca = entrada.nextInt();
                                    lista.get(i).setId(troca);
                                    System.out.println("Alteração feita!");
                                    break;
                                case 2:
                                    lista.remove(idServico.getTipo());
                                    System.out.println("Digite o novo tipo: ");
                                    String troca2 = entrada.next();
                                    lista.get(i).setTipo(troca2);
                                    System.out.println("Alteração feita!");
                                    break;
                                case 3:
                                    lista.remove(idServico.getProduto());
                                    System.out.println("Digite os novos produtos necessários : ");
                                    troca2 = entrada.next();
                                    lista.get(i).setProduto(troca2);
                                    System.out.println("Alteração feita!");
                                    break;
                                case 4:
                                    lista.remove(idServico.getValor());
                                    System.out.println("Digite o novo valor: ");
                                    troca2 = entrada.next();
                                    lista.get(i).setValor(troca2);
                                    System.out.println("Alteração feita!");
                                    break;
                                case 5:
                                    lista.remove(idServico.getEmergencia());
                                    System.out.println("Digite o novo Emergencia? ");
                                    troca2 = entrada.next();
                                    lista.get(i).setEmergencia(troca2);
                                    System.out.println("Alteração feita!");
                                    break;
                                case 6:
                                    lista.remove(idServico.getDuracao());
                                    System.out.println("Digite a nova duração: ");
                                    troca2 = entrada.next();
                                    lista.get(i).setDuracao(troca2);
                                    System.out.println("Alteração feita!");
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Opção inexistente.");
                                    break;
                            }
                        } while(op!=0);
                    }
                }
            }
        }
    }
    
    @Override
    public void Excluir(){
        if(lista.isEmpty()){
            System.out.println("Não há serviços cadastrados.");
        }else{
            System.out.println("Digite o id do contato para removê-lo: ");
            int remove = entrada.nextInt();
            for(i=0; i<lista.size(); i++){
                Servico idServico = lista.get(i);
                if(idServico.getId() == remove){
                    lista.remove(i);
                    System.out.println("Serviço excluído!");
                }
            }
        }
    }

    @Override
    public void Listar() {
        if(lista.isEmpty()){
            System.out.println("Não há serviços cadastrados.");
        }else{
            System.out.println("Há " + lista.size() + " serviço(s) cadastrado(s), lista: ");
            for(i=0; i<lista.size(); i++){
                Servico idServico = lista.get(i);
                System.out.println("Identificador: ");
                System.out.println(idServico.getId());
                System.out.println("Tipo: ");
                System.out.println(idServico.getTipo());
                System.out.println("Produtos necessários: ");
                System.out.println(idServico.getProduto());
                System.out.println("Valor: ");
                System.out.println(idServico.getValor());
                System.out.println("Emergência? ");
                System.out.println(idServico.getEmergencia());
                System.out.println("Tempo estimado em horas: ");
                System.out.println(idServico.getDuracao());
            }
        }
    }
    
    public final void Pontinho(){
        System.out.println("----------------------------------------------------");
    }
}