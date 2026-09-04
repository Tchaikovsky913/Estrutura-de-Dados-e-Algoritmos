public class Pilha<T>{
    private String nomePilha;
    private No<T> topo;

    public Pilha(){
        this("");
    }

    public Pilha(String nomePilha){
        this.nomePilha = nomePilha;
        this.topo = null;
    }

    public void push(T dado){
        No<T> novoNo = new No<T>(dado);

        novoNo.setNextNo(topo);
        this.topo = novoNo;
        
        /*
        if(topo == null){
            topo = novoNo;
        } else {
            novoNo.setNextNo(topo);
            topo = novoNo;
        }
        */
    }

    public void setNomePilha(String nomePilha){
        this.nomePilha = nomePilha;
    }

    public String getNomePilha(){
        return this.nomePilha;
    }

    public void setTopo(No<T> topo){
        this.topo = topo;
    }

    public No<T> getTopo(){
        return this.topo;
    }
}