
import java.util.Objects;

public class Telefon {
    private String nameFactory;
    private String model;
    private double sizeDisplay;
    private int quantityAkb;
    private String TypeOS;
    private double price;

    public Telefon(String nameFactory, String model, double sizeDisplay, int quantityAkb, String typeOS, double price) {
        this.nameFactory = nameFactory;
        this.model = model;
        this.sizeDisplay = sizeDisplay;
        this.quantityAkb = quantityAkb;
        this.TypeOS = typeOS;
        this.price = price;
    }

    public String getNameFactory() {
        return this.nameFactory;
    }

    public String getModel() {
        return this.model;
    }

    public double getSizeDisplay() {
        return this.sizeDisplay;
    }

    public int getQuantityAkb() {
        return this.quantityAkb;
    }

    public String getTypeOS() {
        return this.TypeOS;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Telefon telefon = (Telefon)o;
            return Double.compare(telefon.sizeDisplay, this.sizeDisplay) == 0 && this.quantityAkb == telefon.quantityAkb && Double.compare(telefon.price, this.price) == 0 && Objects.equals(this.nameFactory, telefon.nameFactory) && Objects.equals(this.model, telefon.model) && Objects.equals(this.TypeOS, telefon.TypeOS);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.nameFactory, this.model, this.sizeDisplay, this.quantityAkb, this.TypeOS, this.price});
    }

    public String toString() {
        return "Telefon{nameFactory='" + this.nameFactory + "', model='" + this.model + "', sizeDisplay=" + this.sizeDisplay + ", quantityAkb=" + this.quantityAkb + ", TypeOS='" + this.TypeOS + "', price=" + this.price + "}";
    }
}