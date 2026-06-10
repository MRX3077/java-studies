package fase_1_fundamentos_da_linguagem.modulo_5_vetores_arrays;

public class Main_1 {
    public static void main(String[] args){
        int car;
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for(car=0; car<4; car++){
            System.out.println("O carro é: "+cars[car]);
        }
        cars[0] = "Opel";
        System.out.println("Agora o primeiro é um: "+cars[0]);
    }
}
