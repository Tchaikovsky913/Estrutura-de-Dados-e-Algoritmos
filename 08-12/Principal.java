import java.util.Scanner;
import java.util.ArrayList;

public class Principal{
    public static void main(String[] args){
        
        //Stack: memoria onde é armazenada apenas tipo de variáveis primitivos: int, float, objetos...
        //Heap: memoria extensa, é usada para armazenar instancias  de classes e dados compartilhados e objetos complexos.


        Scanner pintacilgoScanner = new Scanner(System.in);

        ArrayList<Pessoa> listaP = new ArrayList<Pessoa>();

        //instanciamento dos objetos
        Pessoa obj1 = new Pessoa();
        Pessoa obj2 = new Pessoa("Miguel" , 19);
        Pessoa obj3 = new Pessoa();

        //leitura dos dados e armazenamento no primeiro objeto
        System.out.println("Digite o nome: ");
        obj1.setNome(pintacilgoScanner.nextLine());
        System.out.println("Digite o idade: ");
        obj1.setIdade(pintacilgoScanner.nextInt());

        //adiciona os endereços de memoria dos dados dos objetos em uma lista do tipo Pessoa
        listaP.add(obj1);
        listaP.add(obj2);
        listaP.add(obj3);

        //entra em um for no qual o auxP(ponteiro) inica no primeiro elemtno da lista do tipo Pessoa (nesse caso obj1)
        for(Pessoa auxP : listaP){
            System.out.println(auxP.toString());
        }

        pintacilgoScanner.close();
    }
}