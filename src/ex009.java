import java.util.Scanner;
/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
public class ex009 {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int horaI, horaF, total;

    System.out.println("Que horas começou o jogo? ");
    horaI = teclado.nextInt();

    System.out.println("Que horas terminou o jogo? ");
    horaF = teclado.nextInt();

    if (horaI < horaF) {
        total = horaF - horaI;
        System.out.printf("O jogador passou \033[32m%d horas\033[m Jogando!", total);
    } else {
        total = (24 - horaI) + horaF;
        System.out.printf("O jogador passou \033[31m%d horas\033[m Jogando!", total);
    }
    teclado.close();
    }
}
