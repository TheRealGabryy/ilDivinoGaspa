package Levels;

public class Anima {
    private int peccatiCommessi;
    private int tempoDaScontare;

    public Anima(int peccatiCommessi, int tempoDaScontare) {
        this.peccatiCommessi = peccatiCommessi;
        this.tempoDaScontare = tempoDaScontare;
    }

    public int getPeccatiCommessi() {
        return peccatiCommessi;
    }

    public void setPeccatiCommessi(int peccatiCommessi) {
        this.peccatiCommessi = peccatiCommessi;
    }

    public int getTempoDaScontare() {
        return tempoDaScontare;
    }

    public void setTempoDaScontare(int tempoDaScontare) {
        this.tempoDaScontare = tempoDaScontare;
    }
}
