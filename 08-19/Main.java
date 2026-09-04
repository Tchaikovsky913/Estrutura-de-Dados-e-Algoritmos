public class Main {

    public static void main(String[] args) {
        No obj = new No("Miguel");
        No aux = obj; // objeto auxiliar

        obj.setNextNo(new No("Tiago"));
        obj.getNextNo().setNextNo(new No("Baleia"));

        //laço de repetição que percorre a lista de objetos
        while(aux != null){
            System.out.println(aux.getDado());
            aux = aux.getNextNo();
        }

        System.out.println(obj.getDado());
        System.out.println(obj.getNextNo().getDado());
        System.out.println(obj.getNextNo().getNextNo().getDado());
    }
}