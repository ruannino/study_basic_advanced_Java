package entities;

public class Carro {
    private String carroMarca;
    private String carroModelo;
    private final int carroAno;

    public Carro(String carroMarca, String carroModelo){
        this(carroMarca, carroModelo, 2000);
    }
    public Carro(String carroMarca, String carroModelo, int carroAno){
        this.carroMarca = carroMarca;
        this.carroModelo = carroModelo;
        this.carroAno = carroAno;
    }
    public String getCarroMarca(){
        return carroMarca;
    }
    public void setCarroMarca(String carroMarca){
        this.carroMarca = carroMarca;
    }

    public String getCarroModelo(){
        return carroModelo;
    }
    public void setCarroModelo(String carroModelo){
        this.carroModelo = carroModelo;
    }
    public int getCarroAno(){
        return carroAno;
    }
    public String toString(){
        return "Marca: " + carroMarca
                + "\nModelo: " + carroModelo
                + "\nAno: " + carroAno;
    }
}
