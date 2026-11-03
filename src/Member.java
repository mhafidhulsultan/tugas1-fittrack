public class Member {
    
    private final int MIN_PANJANG_TELEPON = 10;
    private final String AWALAN_TELEPON = "0";

    private String nama = "Member Baru";
    private String noTelepon = "0000000000";
    private String tanggalDaftar = "01-01-2026";
    private String jenisPaket = "Basic";

    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
    	setNama (nama);
	setNoTelepon(noTelepon);
	setTanggalDaftar(tanggalDaftar);
	setJenisPaket(jenisPaket);
    }

    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, "Basic");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("Gagal: Nama tidak boleh kosong atau hanya berisi spasi.");
        }
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
	// Pastikan input tidak null, dimulai dengan 0, dan panjangnya >= 10
        if (noTelepon != null && noTelepon.startsWith(AWALAN_TELEPON) && noTelepon.length() >= MIN_PANJANG_TELEPON) {
            this.noTelepon = noTelepon;
        } else {
            System.out.println("Gagal: Nomor telepon harus diawali angka 0 dan minimal 10 digit.");
        }
    }

    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    public void setTanggalDaftar(String tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }

    public String getJenisPaket() {
        return jenisPaket;
    }

    public void setJenisPaket(String jenisPaket) {
        // Pastikan input tidak null, cocokkan dgn 3 paket pilihan gym
        if (jenisPaket != null && (jenisPaket.equals("Basic") || jenisPaket.equals("Premium") || jenisPaket.equals("VIP"))) {
            this.jenisPaket = jenisPaket;
        } else {
            System.out.println("Gagal: Jenis paket hanya boleh Basic, Premium, atau VIP.");
        }
    }


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