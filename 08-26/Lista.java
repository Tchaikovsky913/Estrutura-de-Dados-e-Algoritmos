public class Lista<T>{
    private String nomeLista;
    private No<T> primeiroNo;
    private No<T> ultimoNo;

    public Lista(){
        this(null);
    }

    public Lista(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);

        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            novoNo.setNextNo(primeiroNo);
            primeiroNo = novoNo;
        }
    }









    public void setNomeLista(String nomeLista){
        this.nomeLista = nomeLista;
    }

    public String getNomeLista(){
        return this.nomeLista;
    }

    public void setPrimeiroNo(No<T> primeiroNo){
        this.primeiroNo = primeiroNo;
    }

    public No<T> getPrimeiroNo(){
        return this.primeiroNo;
    }

    public void setUltimoNo(No<T> ultimoNo){
        this.ultimoNo = ultimoNo;
    }

    public No<T> getUltimoNo(){
        return this.ultimoNo;
    }
}