public class Fila<T>{
    private String nomeFila;
    private No<T> primeiroNo;
    private No<T> ultimoNo;

    public Fila(){
        this("");
    }

    public Fila(String nomeFila){
        this.nomeFila = nomeFila;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void enfileirar (T dado){
        No<T> novoNo = new No<T>(dado);

        if(primeiroNo== null){
            primeiroNo=novoNo;
            ultimoNo=novoNo;
        }else{
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public T desenfileirar(){
        if(primeiroNo == null){
            System.out.println("Fila vazia");
            return null;
        }
        T dado = primeiroNo.getDado();
        primeiroNo = primeiroNo.getNextNo();
        if(primeiroNo == null){
            ultimoNo = null;
        }

        return dado;
    }
        
    public void  imprimeFila(){
        if(primeiroNo == null){
            System.out.println("Fila vazia");
        }else{
            No<T> aux = primeiroNo;
            while(primeiroNo != null){
                System.out.println("Dado: " + aux.toString());
                aux = aux.getNextNo();
            }
        }
    } 
}