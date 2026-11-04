/**
 * Merepresentasikan satu member yang terdaftar di FitTrack.
 * Class ini menyimpan data pribadi member dan memastikan setiap
 * perubahan data lolos validasi sebelum disimpan.
 */
public class Member {
    
    private final int MIN_PANJANG_TELEPON = 10;
    private final String AWALAN_TELEPON = "0";

    private String nama = "Member Baru";
    private String noTelepon = "0000000000";
    private String tanggalDaftar = "01-01-2026";
    private String jenisPaket = "Basic";

    /**
     * Constructor lengkap untuk mengisi semua data member.
     * Menggunakan setter agar validasi tetap berjalan.
     *
     * @param nama nama lengkap member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran member
     * @param jenisPaket jenis paket keanggotaan (Basic, Premium, atau VIP)
     */
    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    /**
     * Constructor tanpa paket.
     * Otomatis mengisi jenis paket dengan "Basic" menggunakan pemanggilan this().
     *
     * @param nama nama lengkap member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran member
     */
    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, "Basic");
    }

    /**
     * Mengambil nama lengkap member.
     *
     * @return nama member
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengubah nama member setelah melalui validasi.
     * Menolak input jika kosong atau hanya berisi spasi.
     *
     * @param nama nama baru member
     */
    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("Gagal: Nama tidak boleh kosong atau hanya berisi spasi.");
        }
    }

    /**
     * Mengambil nomor telepon aktif member.
     *
     * @return nomor telepon member
     */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * Mengubah nomor telepon member setelah melalui validasi format.
     * Jika format tidak valid, nomor lama dipertahankan dan pesan penolakan dicetak.
     *
     * @param noTelepon nomor telepon baru, wajib diawali angka 0 dan minimal 10 digit
     */
    public void setNoTelepon(String noTelepon) {
        // Pastikan input tidak null, dimulai dengan 0, dan panjangnya >= 10
        if (noTelepon != null && noTelepon.startsWith(AWALAN_TELEPON) && noTelepon.length() >= MIN_PANJANG_TELEPON) {
            this.noTelepon = noTelepon;
        } else {
            System.out.println("Gagal: Nomor telepon harus diawali angka 0 dan minimal 10 digit.");
        }
    }

    /**
     * Mengambil tanggal pendaftaran member.
     *
     * @return tanggal daftar member
     */
    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    /**
     * Mengubah tanggal pendaftaran member.
     *
     * @param tanggalDaftar tanggal daftar baru
     */
    public void setTanggalDaftar(String tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }

    /**
     * Mengambil jenis paket keanggotaan member.
     *
     * @return jenis paket (Basic, Premium, atau VIP)
     */
    public String getJenisPaket() {
        return jenisPaket;
    }

    /**
     * Mengubah jenis paket keanggotaan setelah melalui validasi pilihan.
     *
     * @param jenisPaket jenis paket baru (hanya Basic, Premium, atau VIP)
     */
    public void setJenisPaket(String jenisPaket) {
        // Pastikan input tidak null, cocokkan dgn 3 paket pilihan gym
        if (jenisPaket != null && (jenisPaket.equals("Basic") || jenisPaket.equals("Premium") || jenisPaket.equals("VIP"))) {
            this.jenisPaket = jenisPaket;
        } else {
            System.out.println("Gagal: Jenis paket hanya boleh Basic, Premium, atau VIP.");
        }
    }

    /**
     * Mengembalikan representasi string dari objek Member dengan format yang rapi dan berlabel.
     *
     * @return string detail data member
     */
    @Override
    public String toString() {
        return "Data Member:\n" +
               "- Nama           : " + nama + "\n" +
               "- No Telepon     : " + noTelepon + "\n" +
               "- Tanggal Daftar : " + tanggalDaftar + "\n" +
               "- Jenis Paket    : " + jenisPaket + "\n" +
               "----------------------------------------";
    }
}