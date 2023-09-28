package oppclase.muebles_armario;

import javax.swing.JOptionPane;

public class Muebles_armario {

    public static void main(String[] args) {
        
        String color = JOptionPane.showInputDialog("Digite un Color para el Armario ");
        String material = JOptionPane.showInputDialog("Digite el Material del armario ");
        String tamañoStr = JOptionPane.showInputDialog("Digite el tamaño del armario ");
        String precioStr = JOptionPane.showInputDialog("Digite el precio del armario ");
        String espejoStr = JOptionPane.showInputDialog("El amario tiene espejo? (True/False) ");
        String cajonesStr = JOptionPane.showInputDialog("Cuantos cajones tiene el armario?");
        
        
        int tamaño = Integer.parseInt(tamañoStr);
        int precio = Integer.parseInt(precioStr);
        boolean espejo = Boolean.parseBoolean(espejoStr);
        int cajones = Integer.parseInt(cajonesStr);
        
        
        //clsmueble armario = new clsmueble(color, material, tamaño, precio);
        clsarmario armario = new clsarmario(color, material, tamaño, precio, espejo, cajones);
        
        JOptionPane.showMessageDialog(null, "Color del armario: " + armario.getColor() +
                                                        "\nMaterial del armario: " + armario.getMaterial() + 
                                                        "\nTamaño del armario: " + armario.getTamaño() +
                                                        "\nPrecio del armario: " + armario.getPrecio() +
                                                        "\nArmario tiene Espejo: " + armario.getEspejo() +
                                                        "\ncajones del armario: " + armario.getCajones() );
    }
}
