import java.util.Scanner;

public class FactorialRecursion {
    //técnica de programação em que método chama a si mesmo
    //caso base da recursão (caminho q não chama a chamada recursiva)
    //stackoverflow = recursão infinita, salvando td contexto do método na memória (pilha)

    public int factorial(int N) throws IllegalArgumentException {
        if (N < 0) throw new IllegalArgumentException();
        return factorialR(N);
    }

    private int factorialR(int N) {
        int resposta = 1;
        if (N > 1) resposta = N * factorialR(N - 1);
        return resposta;
    }

    public static class TestFactorial {
        public static void main(String[] args) {
            FactorialRecursion F = new FactorialRecursion();
            int N, f;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type value of  N: ");
            N = scanner.nextInt();
            f = F.factorial(N);
            System.out.println(N + " factorial  = " + f);
        }
    }
}