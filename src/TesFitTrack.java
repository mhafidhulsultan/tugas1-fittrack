public class TesFitTrack {
    
    /**
     * Method utama untuk menjalankan program pengujian FitTrack.
     *
     * @param args argumen command line (tidak digunakan)
     */
    public static void main(String[] args) {

	System.out.println("=========================================");
     	System.out.println("   SISTEM PENDATAAN MEMBER FITTRACK      ");
     	System.out.println("=========================================\n");
        
        Member[] daftarMember = new Member[4];

        System.out.println("=== UJI COBA PEMBUATAN OBJEK ===");
        
        daftarMember[0] = new Member("Budi Santoso", "081234567890", "22-10-2026", "VIP");
        
        daftarMember[1] = new Member("Andi Wijaya", "085712345678", "22-10-2026", "Premium");
        
        daftarMember[2] = new Member("Siti Aminah", "081987654321", "22-10-2026");
        
        System.out.println("-> Percobaan input data melanggar validasi saat buat objek:");
        daftarMember[3] = new Member("Dodi", "081", "22-10-2026", "Super");
        
        System.out.println("\n=== UJI COBA SETTER TIDAK VALID PADA OBJEK JADI ===");

        System.out.println("-> Mencoba ganti nomor telepon Budi jadi 089:");
        daftarMember[0].setNoTelepon("089"); 
        
        System.out.println("\n=== CETAK SELURUH DATA MEMBER DARI ARRAY ===");
        
        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println(daftarMember[i].toString());
        }
    }
}