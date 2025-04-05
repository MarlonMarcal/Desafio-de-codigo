import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do Salário: ");
        double valorSalario = sc.nextDouble();
        System.out.println("Informe o valor do Beneficio: ");
        double valorBeneficio = sc.nextDouble();

        sc.close();

        double imposto = 0.0;

        if (valorSalario <= 1100.0) {

            imposto = valorSalario * 0.05;
            valorSalario = valorSalario - imposto;
            System.out.println("Salario Liquido: " + (valorSalario + valorBeneficio));

        } else if (valorSalario > 1100.0 && valorSalario <= 2500.0) {

            imposto = valorSalario * 0.10;
            valorSalario = valorSalario - imposto;
            System.out.println("Salario Liquido: " + (valorSalario + valorBeneficio));

        } else {

            imposto = valorSalario * 0.15;

            double saida = valorSalario - imposto + valorBeneficio;

            System.out.println(saida);

        }
        {

        }

    }
}
