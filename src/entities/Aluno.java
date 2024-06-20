package entities;

public class Aluno {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double Media(){
        return nota1 + nota2 + nota3;
    }
    public boolean Passou(){
        return Media() >= 60;
    }
    public double quantoFaltou(){
        return Passou() ? 0 : 60 - Media();
    }
    public String toString(){
        String resultado = "Nome: " + name + "\nNota final: " + String.format("%.2f", Media()) + "\n";
        if (Passou()){
            resultado += "PASSOU\n";
        } else {
            resultado += "REPROVOU\n" + "FALTOU " + String.format("%.2f", quantoFaltou()) + " Pontos.";
        }
        return resultado;
    }
}
