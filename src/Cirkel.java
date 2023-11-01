public class Cirkel extends GeometriFigur {
    protected double radius;

    public Cirkel(double radius, String farve, boolean filled){
        super(farve, filled);
        this.radius = radius;
    }

    public Cirkel(){

    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getOmkreds() {
        return radius*2*Math.PI;
    }

    public double getAreal() {
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Cirkel{" +
                "radius=" + radius +
                ", farve='" + farve + '\'' +
                ", filled=" + filled +
                '}';
    }
}
