package exercicios;

public class Circulo {
    public Double raio;
    private Double PI = 3.141516;

    public Circulo(Double raio){
        setRaio(raio);
    }
    public Double getPI(){
        return PI;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        if(raio <= 0){
            throw new IllegalAccessException("O valor tem que ser maior que 0")
        }
        this.raio = raio;
    }
    public double calcularArea(){
        return  this.PI * this.raio * this.raio;
    }

    public double calcularPerimentro(){
        return  2 * (this.PI * raio);
    }
}
