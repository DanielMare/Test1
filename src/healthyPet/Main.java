package healthyPet;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String names = JOptionPane.showInputDialog(null, "vilket djur ska få mat?");
        switch (Namn.valueOf(names.toUpperCase())){
            case SIXTEN:
                Animal six = new Hundar(names, 5);
                JOptionPane.showMessageDialog(null, "Hundfoder till : "+six.getName()+" är "
                        +six.calculateDiet(six, 100)+" gram");
                break;
            case DOGGE:
                Animal dog = new Hundar(names, 10);
                JOptionPane.showMessageDialog(null, "Hundfoder till : "+dog.getName()+" är "
                        +dog.calculateDiet(dog, 150)+" gram");
                break;
            case VENUS:
                Animal ven = new Katter(names, 5);
                JOptionPane.showMessageDialog(null, " kattfoder till katten: "+ven.getName()+" är "
                        +ven.calculateDiet(ven, 100)+" gram");
                break;
            case OVE:
                Animal ov = new Katter(names, 3);
                JOptionPane.showMessageDialog(null, " kattfoder till katten: "+ov.getName()+" är "
                        +ov.calculateDiet(ov, 100)+" gram");
            case HYPNO:
                Animal hyp = new Ormar(names, 1);
                JOptionPane.showMessageDialog(null, " Ormpellets till ormen: "+hyp.getName()+" är "+
                        +hyp.calculateDiet(hyp, 0)+" gram");

        }
    }
}
