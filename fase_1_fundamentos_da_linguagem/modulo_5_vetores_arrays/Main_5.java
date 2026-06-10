package fase_1_fundamentos_da_linguagem.modulo_5_vetores_arrays;

public class Main_5 {
    public static void main(String[] args){
        int vet;
        String[] name = new String[4];

        System.out.println("Digite os nomes para guardar no vetor: ");
        for(vet=0; vet<4; vet++){
            name[vet] = System.console().readLine();
        }
        System.out.println("A ordem inversa dos nomes digitados é: ");
        for(vet=3; vet>=0; vet--){
            System.out.println("O "+(vet+1)+" nome digitado foi: "+name[vet]);
        }
    }
}
