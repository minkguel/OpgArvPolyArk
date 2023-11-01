public class Rektangel extends GeometriFigur {
    double lengte;
    double bredte;

    public Rektangel(double lengte, double bredte, String farve, boolean filled) {
        super(farve, filled);
        this.lengte = lengte;
        this.bredte = bredte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getBredte() {
        return bredte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setBredte(double bredte) {
        this.bredte = bredte;
    }

    public double getAreal() {
        return lengte * bredte;
    }

    public double getOmkreds() {
        return (lengte+lengte) + (bredte+bredte);
    }

    @Override
    public String toString() {
        return "Rektangel{" +
                "lengte=" + lengte +
                ", bredte=" + bredte +
                ", farve='" + farve + '\'' +
                ", filled=" + filled +
                '}';
    }
}

