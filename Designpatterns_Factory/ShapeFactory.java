package Designpatterns_Factory;

public class ShapeFactory {
    public static Shape getShape(TipoEnum tipoEnum){
        switch (tipoEnum){
            case CERCHIO:
                return new Cerchio();
            case RETTANGOLO:
                return new Rettangolo();
            default:
                throw new IllegalArgumentException("Tipo di forma non funzionante");
        }
    }
}
