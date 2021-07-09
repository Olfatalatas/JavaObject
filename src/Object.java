class barang {
    String nama;
    int hargaSatuan;
    int jumlah;
    int total;
    int diskon;
    int bayar;

    int hitungHargaTotal(int hargaSatuan, int jumlah) {
        total = hargaSatuan * jumlah;
        System.out.println("Total : " + total);
        return total;
    }

    int hitungDiskon() {
        if (total > 100000) {
            diskon = total * 10 / 100;
            System.out.println("Diskon : " + diskon);
        }

        if (total >= 50000 && total <= 100000) {
            diskon = total * 5 / 100;
            System.out.println("Diskon : " + diskon);

        }

        if (total <= 50000) {
            System.out.println("Tidak ada diskon");
        }

        return diskon;
    }

    int hitungHargaBayar() {
        bayar = total - diskon;
        System.out.println("Yang harus dibayar : " + bayar);
        return bayar;
    }

}

public class Object {
    public static void main(String[] args) throws Exception {
        barang barang1 = new barang();
        barang1.nama = "Oreo";
        barang1.jumlah = 10;
        barang1.hargaSatuan = 15000;
        System.out.println("Nama Barang : " + barang1.nama);
        barang1.hitungHargaTotal(barang1.jumlah, barang1.hargaSatuan);
        barang1.hitungDiskon();
        barang1.hitungHargaBayar();

        System.out.println("*********************");

        barang barang2 = new barang();
        barang2.nama = "Kripik";
        barang2.jumlah = 10;
        barang2.hargaSatuan = 8000;
        System.out.println("Nama Barang : " + barang2.nama);
        barang2.hitungHargaTotal(barang2.jumlah, barang2.hargaSatuan);
        barang2.hitungDiskon();
        barang2.hitungHargaBayar();

        System.out.println("*********************");

        barang barang3 = new barang();
        barang3.nama = "Kopi";
        barang3.jumlah = 3;
        barang3.hargaSatuan = 5000;
        System.out.println("Nama Barang : " + barang3.nama);
        barang3.hitungHargaTotal(barang3.jumlah, barang3.hargaSatuan);
        barang3.hitungDiskon();
        barang3.hitungHargaBayar();

    }
}
