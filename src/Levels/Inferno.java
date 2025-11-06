package Levels;

import java.util.ArrayList;

public class Inferno {
    private ArrayList<Cerchio> cerchi;
    private int cerchioCorrente;

    public Inferno() {
        cerchi = new ArrayList<>();
        cerchioCorrente = 0;
    }

    public void vaiAlCerchioSuccessivo() {

    }

    public ArrayList<Cerchio> getCerchi() {
        return cerchi;
    }

    public void setCerchi(ArrayList<Cerchio> cerchi) {
        this.cerchi = cerchi;
    }

    public int getCerchioCorrente() {
        return cerchioCorrente;
    }

    public void setCerchioCorrente(int cerchioCorrente) {
        this.cerchioCorrente = cerchioCorrente;
    }
}
