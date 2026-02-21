interface FlatSketch {
    FlatSketch clone();
}

class TShirtSketch implements FlatSketch {
    private String neckStyle;
    private int sleeveLength;

    public TShirtSketch(String neckStyle, int sleeveLength) {
        this.neckStyle = neckStyle;
        this.sleeveLength = sleeveLength;
    }

    @Override
    public FlatSketch clone() {
        return new TShirtSketch(this.neckStyle, this.sleeveLength);
    };

    public void setNeckStyle(String neckStyle) {
        this.neckStyle = neckStyle;
    }

    public void setSleeveLength(int sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    public void display() {
        System.out.println("T Shirt Neck Style is : " + neckStyle + " and Sleeve Length is : " + sleeveLength);
    }
}

class TrouserSketch implements FlatSketch {
    private String fitType;
    private int length;

    public TrouserSketch(String fitType, int length) {
        this.fitType = fitType;
        this.length = length;

    }

    public FlatSketch clone() {
        return new TrouserSketch(this.fitType, this.length);
    }

    public void setTrouserFit(String fitType) {
        this.fitType = fitType;
    }

    public void setTrouserLength(int length) {
        this.length = length;
    }

    public void display() {
        System.out.println("Trouser Fit Style is : " + fitType + " and Length is : " + length);
    }

}

public class SketchApp {
    public static void main(String[] args) {

        TrouserSketch trouserOriginal = new TrouserSketch("Straight", 29);
        trouserOriginal.display();

        TrouserSketch dupliTrouser = (TrouserSketch) trouserOriginal.clone();
        dupliTrouser.setTrouserFit("Baggy");
        dupliTrouser.setTrouserLength(34);

        dupliTrouser.display();
    }
}
