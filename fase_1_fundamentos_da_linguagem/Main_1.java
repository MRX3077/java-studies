package fase_1_fundamentos_da_linguagem;

public class Main_1 {
    public static void main(String[] args){
        int quant, position, pos=0;
        float sum=0, medium, big=0;        

        System.out.println("Digite quantos alunos a turma possui: ");
        quant = Integer.parseInt(System.console().readLine());
        String[] students = new String[quant];

        if(quant==0){
            System.out.println("Nenhum aluno na sala.");
        }
        for(position=0; position<quant; position++){
            System.out.println("Digite o nome do "+(position+1)+("º aluno: "));
            students[position] = System.console().readLine();
        }
        float[] grade = new float[quant];
        for(position=0; position<quant; position++){
            System.out.println("Digite a nota do "+students[position]+":");
            grade[position] = Float.parseFloat(System.console().readLine());
            sum = sum + grade[position];
            if(big<grade[position]){
                big = grade[position];
                pos = position;
            }
        }
        System.out.println("Sistema: ");
        for(position=0; position<quant; position++){
            System.out.println((position+1)+"º aluno, "+students[position]+" tirou a nota "+grade[position]);
        }
        medium = sum / quant;
        System.out.println("A média da sala foi: "+medium);
        System.out.println("A maior nota da sala foi o "+(pos+1)+"º aluno, "+students[pos]+", com a nota: "+grade[pos]);
    }
}
