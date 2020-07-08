public class ExercicioX {

    public static void main(String[] args) {


        for (int i = 150; i <= 300; i++) {
            System.out.println(i);
        }
        int soma = 1;
        for (int i = 1; i <= 1000; i++) {
            System.out.println(soma += i);

        }
        System.out.println(soma);
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }


        }
        int fatorial = 1;
        for (int n = 0; n <= 10; n++) {
            if (n <1){
                System.out.println("O fatorial de "+ n + " é "+ fatorial);
                continue;
            }
            System.out.println("O fatorial de "+ n + " é ("+(n-1)+"!) * "+ n +" = "+ (fatorial *= (n)));
        }




    }

}
