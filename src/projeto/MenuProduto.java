package projeto;

import java.util.ArrayList;  
import java.util.Scanner;

public class MenuProduto implements Interface2{
   String marca, tipo, valor, validade, quantidade, novo1;
   int num, i, id, excluir, alte, buscar, novo;
   
                                                            
    Scanner entrada = new Scanner(System.in);
     ArrayList<Produto> list = new ArrayList ();
    
    @Override
    public void Cadastrar(){
        
        System.out.println("Digite o id"); 
        id = entrada.nextInt();
        
        System.out.println("Digite a marca:");
        marca = entrada.next();
        
        System.out.println("Digite o tipo:");
        tipo = entrada.next();
        
        System.out.println("Digite o valor");
        valor = entrada.next();
        
        System.out.println("Digite o validade");
        validade = entrada.next();
        
        System.out.println("Digite o quantidade");
        quantidade = entrada.next();
        
        list.add(new Produto(id, marca, tipo,valor,validade,quantidade));
        
    }
    
    @Override
    public void Consultar(int buscar2){
     
            for (int i=0; i<list.size(); i++){
               Produto idProduto = list.get(i);
                 if(idProduto.getId() == buscar2){
                     list.get(i);
                     System.out.println("Identificador: ");
                     System.out.println(idProduto.getId());
                     System.out.println("Marca: ");
                     System.out.println(idProduto.getMarca());
                     System.out.println("Tipo: ");
                     System.out.println(idProduto.getTipo());
                     System.out.println("Valor: ");
                     System.out.println(idProduto.getValor());
                     System.out.println("Validade: ");
                     System.out.println(idProduto.getValidade());
                     System.out.println("Quantidade: ");
                     System.out.println(idProduto.getQuantidade());
                     
                 }
             }
    }
    @Override
    public void Consultar(String buscar){
     
            for (int i=0; i<list.size(); i++){
               Produto idProduto = list.get(i);
                 if(idProduto.getTipo().equalsIgnoreCase(buscar) ){
                     list.get(i);
                     System.out.println("Identificador: ");
                     System.out.println(idProduto.getId());
                     System.out.println("Marca: ");
                     System.out.println(idProduto.getMarca());
                     System.out.println("Tipo: ");
                     System.out.println(idProduto.getTipo());
                     System.out.println("Valor: ");
                     System.out.println(idProduto.getValor());
                     System.out.println("Validade: ");
                     System.out.println(idProduto.getValidade());
                     System.out.println("Quantidade: ");
                     System.out.println(idProduto.getQuantidade());
                     
                 }
             }
    }

    @Override
     public void Alterar(){
       
        if(list.isEmpty()){
            System.out.println("Nada cadastrado!");
        }else{
            System.out.println("Digite o Id que deseja alterar: ");
            alte = entrada.nextInt();
             for (int i = 0; i <list.size(); i++) {
                Produto idProduto =  list.get(i);
                if (idProduto.getId() == alte){
                list.remove(idProduto.getId());
                do{
                    System.out.println("O que deseja alterar: ");
                    System.out.println("1-Id");
                    System.out.println("2-marca");
                    System.out.println("3-Tipo");
                    System.out.println("4-Valor");
                    System.out.println("5-Validade");
                    System.out.println("6-Quantidade");
                    System.out.println("0-Sair");
                    num = entrada.nextInt();
                   
                    switch(num){
                       
                        case 1:
                            list.remove(idProduto.getId());
                            System.out.println("Digite um novo Id: ");
                            novo = entrada.nextInt();
                            list.get(i).setId(novo);
                            System.out.println("A alteração foi feita!");
                           
                            break;
                           
                        case 2:
                           
                            list.remove(idProduto.getId());
                            System.out.println("Digite um novo Marca: ");
                            novo1 = entrada.next();
                            list.get(i).setMarca(novo1);
                            System.out.println("A alteração foi feita!");
                           
                            break;
                           
                        case 3:
                           
                            list.remove(idProduto.getId());
                            System.out.println("Digite um novo Tipo: ");
                            novo1 = entrada.next();
                            list.get(i).setTipo(novo1);
                            System.out.println("A alteração foi feita!");
                           
                            break;
                           
                        case 4:
                           
                            list.remove(idProduto.getId());
                            System.out.println("Digite um novo Valor: ");
                            novo1 = entrada.next();
                            list.get(i).setValor(novo1);
                            System.out.println("A alteração foi feita!");
                           
                            break;
                           
                        case 5:
                           
                            list.remove(idProduto.getId());
                            System.out.println("Digite um novo Validade: ");
                            novo1 = entrada.next();
                            list.get(i).setValidade(novo1);
                            System.out.println("A alteração foi feita!");
                           
                            break;
                           
                        case 6:
                           
                            list.remove(idProduto.getId());
                            System.out.println("Digite um novo Quantidade: ");
                            novo1 = entrada.next();
                            list.get(i).setQuantidade(novo1);
                            System.out.println("A alteração foi feita!");
                           
                            break;
                           
                    }
                }
               
                 while(num!=0);
               
                }
            }    
        }
    }
     
     @Override
     public void Excluir(){
         
         if(list.isEmpty()){
            System.out.println("Nada cadastrado!");
        }else{
            System.out.println("Digite o Id que deseja Excluir: ");
            excluir = entrada.nextInt();
            for(i=0; i<list.size(); i++){
                Produto idProduto = list.get(i);
                if(idProduto.getId() == excluir){
                    list.remove(i);
                    System.out.println("Excluído! ");
                }
            }
        }
    }
     
     @Override
     public void Listar(){
         if(list.isEmpty()){
            System.out.println("Nada cadastrado!");
        }else{
            System.out.println("Lista: ");
            for(i=0; i<list.size(); i++){
                Produto idProduto = list.get(i);
                System.out.println("Identificador: ");
                System.out.println(idProduto.getId());
                System.out.println("Marca: ");
                System.out.println(idProduto.getMarca());
                System.out.println("Tipo: ");
                System.out.println(idProduto.getTipo());
                System.out.println("Valor: ");
                System.out.println(idProduto.getTipo());
                System.out.println("Validade: ");
                System.out.println(idProduto.getValidade());
                System.out.println("Quantidade: ");
                System.out.println(idProduto.getQuantidade());
            }
        }
    }
    
    public final void Pontinho(){
        System.out.println("----------------------------------------------------");
    }
}