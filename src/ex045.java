/*Fazer um programa para ler um número inteiro N e depois os dados(id, nome e salario) de N funcionários.
Não dever repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa deve ler
um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação.
Ao final, mostrar a listagem atualizada dos funcionários conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente.
Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada. */
import entities.EmployeeExList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ex045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = teclado.nextInt();
        teclado.nextLine();

        List<EmployeeExList> list = new ArrayList<>();

        for (int i = 0; i < n;i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Name: ");
            String name = teclado.nextLine();
            System.out.print("Salary: ");
            double salary = teclado.nextDouble();

            EmployeeExList emp = new EmployeeExList(id, name, salary);
            list.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = teclado.nextInt();
        Integer pos = Position(list, idSalary);

        if (pos == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = teclado.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (EmployeeExList i : list) {
            System.out.println(i);
        }

        teclado.close();
    }
    public static Integer Position(List<EmployeeExList> list , int id) {
        for (int i =0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
