package fase_1_fundamentos_da_linguagem.modulo_5_vetores_arrays;

public class Main_4 {
    public static void main(String[] args){
        int vet, big, small;
        int[] numb = new int[5];
        
        System.out.println("Digite os números para salvar no vetor: ");
        for(vet=0; vet<5; vet++){
            numb[vet] = Integer.parseInt(System.console().readLine());
        }
        big = numb[0];
        small = big;
        System.out.println("Os números digitados foram: ");
        for(vet=0; vet<5; vet++){
            if(big<numb[vet]){
                big = numb[vet];
            }
            if(small>numb[vet]){
                small = numb[vet];
            }
            System.out.println("O "+(vet+1)+" número digitado foi: "+numb[vet]);
        }
        System.out.println("O maior número digitado foi: "+big);
        System.out.println("O menor número digitado foi: "+small);
    }
}
