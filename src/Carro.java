/**
 * Instancia um objeto do tipo carro
 * @author Lucas Vidal
 *
 * @see @link https://www.linkedin.com/in/lucas-vidal-dev/
 *
 * */
public class Carro {

    private String cor;
    private String marca;
    private String modelo;
    private int potencia;
    private boolean isFlex;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isFlex() {
        return isFlex;
    }

    public void setFlex(boolean flex) {
        isFlex = flex;
    }

    public void ligar() {
        System.out.println("Ligou... Vrum Vrum");
    }

    public void desligar() {
        System.out.println("Desligando... zzzz");
    }

    public void subirVidro() {
        System.out.println("Subindo vidro");
    }

    public void descendoVidro() {
        System.out.println("Descendo vidro");
    }
}
