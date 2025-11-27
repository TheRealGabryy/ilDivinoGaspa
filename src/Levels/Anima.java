package Levels;

public class Anima {

    private final int peccatiCommessi;
    private final String tempoDaScontare;

    public Anima(int peccatiCommessi, String tempoDaScontare) {
        this.peccatiCommessi = peccatiCommessi;
        this.tempoDaScontare = tempoDaScontare;
    }


    //CREO SOLO I GETTER PERCHE NON LI SETTO MAI SE NON NEL CONSTRUCTOR
    public String getTempoDaScontare() {
        return tempoDaScontare;
    }

    public int getPeccatiCommessi() {
        return peccatiCommessi;
    }
}
