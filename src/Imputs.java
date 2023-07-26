 public class Imputs implements Circulo{ 
    private int raio;
    private float pi=3.14f;


    public Imputs(int raio) {
        this.raio = raio;
        this.pi= this.getPi();
    }

    public int getRaio() {
        return raio;
    }
    public void setRaio(int raio) {
        this.raio = raio;
    }
    public float getPi() {
        return pi;
    }
    public void setPi(float pi) {
        this.pi = pi;
    }

    @Override
    public void perimetro(){
        double p = 2*this.pi*this.raio;
        System.out.println("o valor do perimetro é: " + p);

    }
    @Override
    public void area(){
        double a=this.getPi()*this.getRaio()*this.getRaio();
        System.out.println("a area é : " + a);
    }
    
}
