public class Principal{
    public static void main(String[] args){
        Fila<Integer> fila = new Fila<Integer>("Números Inteiros");

        fila.imprimeFila();
        fila.enfileirar(4);
        fila.enfileirar(3);
        fila.enfileirar(2);
        fila.enfileirar(1);
        fila.imprimeFila();

        fila.imprimeFila();

        /* System.out.println("Dado: "+ fila.desenfileirar() +" removido!"); */

        Integer total=1;
        for(int i=0;i<4;i++){
            total*=fila.desenfileirar();
        }

        System.out.println("Total:" + total);
    }
}