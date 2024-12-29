import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Reservasi {
    private Pelanggan pelanggan;
    private Kamar kamar;
    private LocalDate tglCekin;
    private LocalDate tglCekout;

    public Reservasi(Pelanggan pelanggan, Kamar kamar, LocalDate tglCekin, LocalDate tglCekout) {
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        this.tglCekin = tglCekin;
        this.tglCekout = tglCekout;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public Kamar getKamar() {
        return kamar;
    }

    public LocalDate getTglCekin() {
        return tglCekin;
    }

    public LocalDate getTglCekout() {
        return tglCekout;
    }

    public void simpanReservasi() {
        String reservasi = "Pelanggan: " + pelanggan.getNama() + ", Kamar: " + kamar.getNokamar() + ", Check-in: " + tglCekin + ", Check-out: " + tglCekout;
        try (FileWriter writer = new FileWriter("reservasi.txt", true)) {
            writer.write(reservasi + "\n");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file: " + e.getMessage());
        }
    }
}