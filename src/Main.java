import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometriFigur> figurer = new ArrayList<>();

        Rektangel rektangel1 = new Rektangel( 5,10, "Red", true);
        Rektangel rektangel2 = new Rektangel(10, 15,"blå",false);
        Cirkel cirkel1 = new Cirkel(10,"FieldtestedGrøn",false);
        Cirkel cirkel2 = new Cirkel(90, "Case hardened",true);
        System.out.println(rektangel1);
        System.out.println(cirkel2);

        figurer.add(rektangel1);
        figurer.add(rektangel2);
        figurer.add(cirkel1);
        figurer.add(cirkel2);

        System.out.println(samletAreal(figurer));
    }
    public static double samletAreal(ArrayList<GeometriFigur> figurer) {
        double samlet = 0;
        double Areal = 0;
        for (int i=0; i< figurer.size(); i++) {
            GeometriFigur figur = figurer.get(i);
            Areal = figur.getAreal();
            samlet += Areal;
        }
        return samlet;
    }
}

