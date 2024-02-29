import java.util.ArrayList;
import java.util.Iterator;

interface Operation<T> {
    void add(T item);
    void remove(String code);
    void edit(String code, T newItem);
    void display();
}

class ATK {
    private String code;
    private String jenis;
    private String nama;
    private int stok;

    public ATK(String code, String jenis, String nama, int stok) {
        this.code = code;
        this.jenis = jenis;
        this.nama = nama;
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "Kode: " + code + ", Jenis: " + jenis + ", Nama: " + nama + ", Stok: " + stok;
    }

}

class Bag {
    private String code;
    private String jenis;
    private String nama;
    private int stok;

    public Bag(String code, String jenis, String nama, int stok) {
        this.code = code;
        this.jenis = jenis;
        this.nama = nama;
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "Kode: " + code + ", Jenis: " + jenis + ", Nama: " + nama + ", Stok: " + stok;
    }

}

class Inventory<T> implements Operation<T> {
    private ArrayList<T> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    @Override
    public void add(T item) {
        items.add(item);
    }

    @Override
    public void remove(String code) {
        Iterator<T> iterator = items.iterator();
        while (iterator.hasNext()) {
            T item = iterator.next();
        }
    }

    @Override
    public void edit(String code, T newItem) {
    }

    @Override
    public void display() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Inventory<ATK> atkInventory = new Inventory<>();
        atkInventory.add(new ATK("A001", "Pulpen", "Snowman Board Marker", 100));
        atkInventory.add(new ATK("A002", "Pensil", "Faber Castell 2B", 50));


        Inventory<Bag> bagInventory = new Inventory<>();
        bagInventory.add(new Bag("C001", "Tempat Pensil", "Kotak Pensil Plastik", 30));
        bagInventory.add(new Bag("C002", "Tas", "Tas Sekolah Anak", 20));

        System.out.println("Data ATK:");
        atkInventory.display();

        System.out.println("\nData Bag:");
        bagInventory.display();
    }
}