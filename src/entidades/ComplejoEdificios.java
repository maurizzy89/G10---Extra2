package entidades;

import java.util.ArrayList;

public class ComplejoEdificios {

    private ArrayList<Edificio> buildings;

    public void fillList() {
        buildings = new ArrayList();

        Polideportivo sportCenter1 = new Polideportivo("Sport Center 666", true, 4.5, 3.75, 8.80);
        Polideportivo sportCenter2 = new Polideportivo("Sport Center 333", false, 2.25, 1.37, 4.40);
        EdificioDeOficinas officesBuilding1 = new EdificioDeOficinas("Offices From Sons Of Filth", 4, 3, 2, 4.3, 3.8, 19.07);
        EdificioDeOficinas officesBuilding2 = new EdificioDeOficinas("Offices From The Emptiness", 6, 4, 7, 5.4, 3.5, 24.65);

        buildings.add(sportCenter1);
        buildings.add(sportCenter2);
        buildings.add(officesBuilding1);
        buildings.add(officesBuilding2);
    }

    public void showList() {
        fillList();
        boolean flag = false;
        int accountantRoofing = 0, accountantOpenRoof = 0;

        for (Edificio elemento : buildings) {
            if (elemento instanceof Polideportivo) {
                System.out.println("The area from " + ((Polideportivo) elemento).getName() + " is: " + elemento.calcularSuperficie() + " m2.");
                System.out.println("The volume from " + ((Polideportivo) elemento).getName() + " is: " + elemento.calcularVolumen() + " cm3.");
                if (((Polideportivo) elemento).isRoofing()) {
                    flag = true;
                    accountantRoofing++;
                } else {
                    accountantOpenRoof++;
                }
            }
            if (elemento instanceof EdificioDeOficinas) {
                System.out.println("The area from " + ((EdificioDeOficinas) elemento).getName() + " is: " + elemento.calcularSuperficie() + " m2.");
                System.out.println("The volume from " + ((EdificioDeOficinas) elemento).getName() + " is: " + elemento.calcularVolumen() + " cm3.");
            }
        }
        System.out.println("");
        for (Edificio elemento : buildings) {
            if (elemento instanceof EdificioDeOficinas) {
                ((EdificioDeOficinas) elemento).cantPersonas();
            }
        }
        System.out.println("\nThe number of Sport Centers with Roofing is: " + accountantRoofing);
        System.out.println("The number of Sport Centers with Open Roof is: " + accountantOpenRoof);
    }
}