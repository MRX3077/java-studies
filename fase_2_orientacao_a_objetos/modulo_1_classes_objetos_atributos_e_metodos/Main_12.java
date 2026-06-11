package fase_2_orientacao_a_objetos.modulo_1_classes_objetos_atributos_e_metodos;

public class Main_12 {
    static class Car{
        String brand, model;
        int year, speed;

        public void accelerate(int increment){
            speed = speed + increment;
        }

        public void data(){
            System.out.println("Marca: "+brand);
            System.out.println("Modelo: "+model);
            System.out.println("Ano: "+year);
            System.out.println("Velocidade atual: "+speed);
        }
    }
    public static void main(String[] args){
        Car car1 = new Car();
        car1.brand = "Mitsubishi";
        car1.model = "Lancer";
        car1.year = 2025;

        Car car2 = new Car();
        car2.brand = "Fiat";
        car2.model = "Fastback Abarth";
        car2.year = 2026;

        car1.accelerate(91);
        car2.accelerate(50);

        car1.data();
        System.out.println();

        car2.data();
    }
}
