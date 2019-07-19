package App;

public class Calculator {

//    ADUNAREA

    public int addNrs(int nr1, int nr2) {
        int x = nr1 + nr2;
        return x;
    }

    public int addNrs(int nr1, int nr2, int nr3) {
        int x = nr1 + nr2 + nr3;
        return x;
    }

    public float addNrs(float nr1, float nr2, float nr3) {
        float x = nr1 + nr2 + nr3;
        return x;
    }

    public float addNrs(float nr1, int nr2, int nr3) {
        float x = nr1 + nr2 + nr3;
        return x;
    }

//     SCADEREA

    public int difNrs(int nr1, int nr2) {
        int x = nr1 - nr2;
        return x;
    }

    public int difNrs(int nr1, int nr2, int nr3) {
        int x = nr1 - nr2 - nr3;
        return x;
    }

    public float difNrs(float nr1, int nr2) {
        float x = nr1 - nr2;
        return x;
    }

//    INMULTIREA

    public int multNrs(int nr1, int nr2) {
        int x = nr1 * nr2;
        return x;
    }

    public int multNrs(int nr1, int nr2, int nr3, int nr4) {
        int x = nr1 * nr2 * nr3 * nr4;
        return x;
    }

    public float multNrs(float nr1, int nr2) {
        float x = nr1 * nr2;
        return x;
    }

//    IMPARTIREA

    public float divNrs(float nr1, float nr2) {
        float y = nr1 / nr2;
        return y;
    }

    public float divNrs(float nr1, float nr2, float nr3) {
        float y = nr1 / nr2 / nr3;
        return y;
    }

    public int divNrs(int nr1, int nr2) {
        int y = nr1 / nr2;
        return y;
    }

//    MODULO

    public int modulo(int nr1, int nr2) {
        int x = nr1 % nr2;
        return x;
    }

    public float modulo(float nr1, float nr2) {
        float x = nr1 % nr2;
        return x;
    }


}