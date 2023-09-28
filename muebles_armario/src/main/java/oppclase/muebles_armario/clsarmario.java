package oppclase.muebles_armario;

public class clsarmario extends clsmueble {
    private boolean espejo;
    private int cajones;
    
    //Constructores
    clsarmario() {
        super();
        espejo = false;
        cajones = 0;
    }
    clsarmario(String Col) {
        super(Col);
        espejo = false;
        cajones = 0;
    }
    clsarmario(String Col, String Mat) {
        super(Col, Mat);
        espejo = false;
        cajones = 0;
    }
    clsarmario(String Col, String Mat, int Tam) {
        super(Col, Mat, Tam);
        espejo = false;
        cajones = 0;
    }
    clsarmario(String Col, String Mat, int Tam, int Prec) {
        super(Col, Mat, Tam, Prec);
        espejo = false;
        cajones = 0;
    }
    clsarmario(String Col, String Mat, int Tam, int Prec, boolean Espe) {
        super(Col, Mat, Tam, Prec);
        setEspejo(Espe);
        cajones = 0;
    }
    clsarmario(String Col, String Mat, int Tam, int Prec, boolean Espe, int Caj) {
        super(Col, Mat, Tam, Prec);
        setEspejo(Espe);
        setCajones(Caj);
    }
    //Metodos set
    public void setEspejo(boolean Espe) {
        espejo = Espe;
    }
    public void setCajones(int Caj) {
        cajones = Caj;
    }
    //metodos get
    public boolean getEspejo() {
        return espejo;
    }
    public int getCajones() {
        return cajones;
    }
    
    
}
