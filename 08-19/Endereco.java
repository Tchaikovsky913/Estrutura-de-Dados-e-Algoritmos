public class Endereco{
    private String rua;
    private int numero;
    private String bairro;

    public Endereco(){
        this(null,0,null);
    }

    public Endereco(String rua, int numero, String bairro){
        setRua();
        setNumero();
        setBairro();
    }

    public void setRua(String rua){
        System.out.println("Rua:");
        this.rua = rua;
    }
    public getRua(){
        return this.rua = rua;
    }

    public void setNumero(int numero){
        System.out.println("Numero:");
        this.numero = numero;
    }
    public getNumero(){
        return this.numero = numero;
    }

    public void setBairro(String bairro){
        System.out.println("Bairro:");
        this.bairro = bairro;
    }
    public getBairro(){
        return this.bairro = bairro;
    }

    @Override
    public String toString(){
        return String.format("Endereco:[Rua: %s, Numero: %i, Bairro: %s]",getRua(), getNumero(), getBairro());
    }
}