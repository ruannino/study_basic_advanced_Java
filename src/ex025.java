/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.*/

import java.util.Scanner;
import entities.Employee;

public class ex025 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = teclado.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = teclado.nextDouble();

        System.out.print("Tax: ");
        employee.tax = teclado.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee);

        System.out.print("Which percentage to increase salary? ");
        double percentage = teclado.nextDouble();

        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + employee);

        teclado.close();
    }
}

