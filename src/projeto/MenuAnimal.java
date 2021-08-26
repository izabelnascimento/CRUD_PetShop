package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuAnimal implements Interface2{
    
    int op,ao, cont = 0;
        
        ArrayList<Animal> lista = new ArrayList ();
        Scanner entrada = new Scanner(System.in);
    
    @Override
    public void Cadastrar(){
                    System.out.println("IDENTIFICADOR :");
                    int ID = entrada.nextInt();
                    System.out.println("TIPO :");
                    String tipo = entrada.next();
                    System.out.println("NOME DO ANIMAL:");
                    String nomea = entrada.next();
                    System.out.println("NOME DO DONO :");
                    String nomer = entrada.next();
                    System.out.println("CONTATO DO RESPONSAVEL :");
                    String contato = entrada.next();
                    System.out.println("CPF DO RESPONSAVEL :");
                    String CPF = entrada.next();
                    System.out.println("RAÇA :");
                    String raca = entrada.next();
                    System.out.println("IDADE :");
                    String idade = entrada.next();
                    System.out.println("PESO :");
                    String peso = entrada.next();
                    
                    lista.add(new Animal(ID,tipo,nomea,nomer,contato,CPF,raca,idade,peso));
    }
    
    @Override
    public void Consultar(String buscar2){
                        for(int i = 0; i < lista.size(); i++){
                            Animal idAnimal = lista.get(i);
                            if (idAnimal.getNomea() .equalsIgnoreCase(buscar2)){
                                lista.get(i);
                                System.out.println("--------------------------------------------------");
                                System.out.println("Nome do animal:");
                                System.out.println(idAnimal.getNomea());
                                System.out.println("Idade do animal: ");
                                System.out.println(idAnimal.getIdade());
                                System.out.println("Peso do animal:");
                                System.out.println(idAnimal.getPeso());
                            }
                        }
    }
    @Override
    public void Consultar(int buscar){
                        for(int i = 0; i < lista.size(); i++){
                            Animal idAnimal = lista.get(i);
                            if (idAnimal.getID()== buscar){
                                lista.get(i);
                                System.out.println("--------------------------------------------------");
                                System.out.println("Nome do animal:");
                                System.out.println(idAnimal.getNomea());
                                System.out.println("Idade do animal: ");
                                System.out.println(idAnimal.getIdade());
                                System.out.println("Peso do animal:");
                                System.out.println(idAnimal.getPeso());
                            }
                        }
    }
    
    @Override
    public void Alterar(){
        do {
               
               System.out.println("O que deseja alterar ? ");
               System.out.println("1. Nome");
               System.out.println("2. Peso");
               System.out.println("3. idade");
               System.out.println("0. Voltar");
               ao = entrada.nextInt();
               
               switch(ao){
                   
                    case 1:
                  
                       System.out.println("Digite o NOME que deseja alterar: ");
                    String alte= entrada.next();
                   
                    for (int i = 0; i <lista.size(); i++) {
                        Animal idAnimal =  lista.get(i);
                        if (idAnimal.getNomea().equalsIgnoreCase(alte)) {
                            lista.remove(idAnimal.getNomea());
                            System.out.println("Digite o novo NOME: ");
                            String nnome = entrada.next();                         
                            lista.get(i).setNomea(nnome);
                            System.out.println("Alterado!");
                            
                        }
                    }
                    break;
                       
                    case 2:
                       System.out.println("Digite o NOME que deseja alterar o peso: ");
                    String alte2= entrada.next();
                   
                    for (int i = 0; i <lista.size(); i++) {
                        Animal idAnimal =  lista.get(i);
                        if (idAnimal.getNomea().equalsIgnoreCase(alte2)) {
                            lista.remove(idAnimal.getPeso());
                            System.out.println("Digite o novo Peso: ");
                            String npeso = entrada.next();                         
                            lista.get(i).setPeso(npeso);
                            System.out.println("Alterado!"); 
                            
                        }
                    }
                    break;
                    
                    case 3:
                       System.out.println("Digite o NOME que deseja alterar a idade: ");
                    String alte3= entrada.next();
                   
                    for (int i = 0; i <lista.size(); i++) {
                        Animal idAnimal =  lista.get(i);
                        if (idAnimal.getNomea().equalsIgnoreCase(alte3)) {
                            lista.remove(idAnimal.getIdade());
                            System.out.println("Digite a nova Idade: ");
                            String nidade = entrada.next();                         
                            lista.get(i).setIdade(nidade);
                            System.out.println("Alterado!");
                            
                        }
                    }
                    break;
               }
               
           }while ( ao != 0);
    }
    
    @Override
    public void Excluir(){
         System.out.println("Digite o NOME do cliente que deseja remover: ");
               String rem= entrada.next();
                   
               for (int i = 0; i <lista.size(); i++) {
               Animal idAnimal =  lista.get(i);
               if (idAnimal.getNomea().equalsIgnoreCase(rem)) {
               lista.remove(i);
               System.out.println("--------------------------------------------------");
               System.out.println("Removido!");
                    }
                }
    }
    
    @Override
    public void Listar(){
        int i;
            for (i=0; i<lista.size(); i++){
            Animal idAnimal = lista.get(i);
                System.out.println("Identifiador");
            System.out.println( idAnimal.getID() );
                System.out.println("Tipo");
            System.out.println(idAnimal.getTipo());
                System.out.println("Nome do animal");
            System.out.println(idAnimal.getNomea());
                System.out.println("Nome do responsavel");
            System.out.println(idAnimal.getNomer());
                System.out.println("Contato");
            System.out.println(idAnimal.getContato());
                System.out.println("CPF");
            System.out.println(idAnimal.getCPF());
                System.out.println("Raça");
            System.out.println(idAnimal.getRaca());
                System.out.println("Idade");
            System.out.println(idAnimal.getIdade());
                System.out.println("Peso");
            System.out.println(idAnimal.getPeso());
        }    
    }
    
    public final void Pontinho(){
        System.out.println("----------------------------------------------------");
    }
}