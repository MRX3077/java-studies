package fase_2_orientacao_a_objetos.modulo_1_classes_objetos_atributos_e_metodos;

public class Main_7 {
    int x=5;
    public static void main(String[] args){
        Main_7 myObj1 = new Main_7();
        Main_7 myObj2 = new Main_7();
        myObj2.x=25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
