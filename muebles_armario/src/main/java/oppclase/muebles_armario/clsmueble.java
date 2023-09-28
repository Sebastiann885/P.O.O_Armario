package oppclase.muebles_armario;

public class clsmueble {   
    private String color;
    private String material;
    private int tamaño;
    private int precio;
    //Contructore
    clsmueble() {
        color = "Sin Color";
        material = "Sin Material";
        tamaño = 0;
        precio = 9999;
    }
    clsmueble(String Col) {
        setColor(Col);
        material = "Sin Material";
        tamaño = 0;
        precio = 9999;
    }
    clsmueble(String Col, String Mat) {
        setColor(Col);
        setMaterial(Mat);
        tamaño = 0;
        precio = 9999;
    }
    clsmueble(String Col, String Mat, int Tam) {
        setColor(Col);
        setMaterial(Mat);
        setTamaño(Tam);
        precio = 9999;
    }
    clsmueble(String Col, String Mat, int Tam, int Prec) {
        setColor(Col);
        setMaterial(Mat);
        setTamaño(Tam);
        setPrecio(Prec);
    }
    //Metodos set
    public void setColor(String Col) {
        color = Col.toUpperCase();
    }
    public void setMaterial(String Mat) {
        material = Mat.toUpperCase();
    }
    public void setTamaño(int Tam) {
        if ((Tam >=50) && (Tam <= 200)) {
            tamaño = Tam;
        }
        else {
            tamaño = 120;
        }
    }
    public void setPrecio(int Prec) {
        precio = Prec;
    }
    //Metodos get
    public String getColor() {
        return color;
    }
    public String getMaterial() {
        return material;
    }
    public int getTamaño() {
        return tamaño;
    }
    public int getPrecio() {
        return precio;
    }

}
