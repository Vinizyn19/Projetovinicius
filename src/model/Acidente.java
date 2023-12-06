// Acidente.java
package model;

public class Acidente {
    private TipoAcidente tipo;
    private boolean morte;

    public Acidente(TipoAcidente tipo, boolean morte) {
        this.tipo = tipo;
        this.morte = false;
    }

    public TipoAcidente getTipo() {
        return tipo;
    }

    public boolean isMorte() {
        return morte;
    }
}
