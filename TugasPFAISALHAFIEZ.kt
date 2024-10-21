class Produk(
    var nama: String,
    var harga: Double,
    var stok: Int
) {
    // Fungsi untuk menampilkan informasi produk
    fun tampilkanInformasi() {
        println("Nama Produk: $nama")
        println("Harga: $harga")
        println("Stok: $stok")
    }

    // Fungsi untuk membeli produk dan mengurangi stok
    fun beliProduk(jumlah: Int) {
        if (jumlah <= stok) {
            stok -= jumlah
            println("$jumlah produk berhasil dibeli.")
        } else {
            println("Stok tidak mencukupi.")
        }
    }
}

fun main() {
    // Membuat objek dari class Produk
    val produk1 = Produk("Laptop", 10000000.0, 10)

    // Menampilkan informasi produk
    produk1.tampilkanInformasi()

    // Simulasi pembelian produk
    produk1.beliProduk(3)

}
