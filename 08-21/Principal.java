public class Principal {

    public static void main(String[] args){

        No<String> obj = new No<String>("Rafael");
        No<Pessoa> objP = new No<Pessoa>(new Pessoa("Gabriel", 29, new Endereco("A", 10, "B")));
        
        
        //obj.setNextNo(obj1);
        obj.setNextNo(new No<String>("Cecília"));
        obj.getNextNo().setNextNo(new No<String>("Joaquim"));        
        /*
        System.out.println(obj.getDado());
        System.out.println(obj.getNextNo().getDado());
        System.out.println(obj.getNextNo().getNextNo().getDado());

        */
        No<String> aux = obj;
        while (aux != null) {
            System.out.println(aux.getDado());
            aux = aux.getNextNo();
        }
        
        System.out.println(objP.getDado().toString());
    }   
}