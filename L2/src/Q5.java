public class Q5 {
    public static void main(String[] args) {
        // Laço externo para os números de 1 a 9
        for (int i = 1; i <= 9; i++) {
            System.out.println("Tabuada do " + i + ":");
            
            // Laço interno para multiplicar cada número de 1 a 9
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            
            System.out.println();  // Linha em branco para separar as tabuadas
        }
    }
}
