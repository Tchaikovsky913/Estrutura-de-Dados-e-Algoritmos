public class Main{
    public static void main(string[] args ){
        Pessoa obj1 = new Pessoa();
        Pessoa obj2 = new Pessoa("Miguel", 19);
    }

    System.out.print("Nome:" + obj1.getNome());
    System.out.print("Idade:" + obj1.getIdade());

    System.out.print("Nome:" + obj2.getNome());
    System.out.print("Idade:" + obj2.getIdade());

    System.out.println(obj1.toString);
    System.out.println(obj2.toString);

}