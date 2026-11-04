\# Tugas 1: Sistem Keanggotaan Gym FitTrack - Remedial UTS Praktikum PBO



\* \*\*Nama Lengkap\*\* : Muhammad Hafidhul Sultan

\* \*\*NPM\*\*          : 250810701100056

\* \*\*Kelas\*\*        : Praktikum Pemrograman Berorientasi Objek


## Status Project
**[ SELESAI / COMPLETED ]** - Versi 1.0.0
Seluruh persyaratan tugas (validasi if-else, konsep OOP, array, Javadoc) telah terpenuhi dan berjalan dengan baik.


\## Deskripsi Singkat

FitTrack adalah sistem pendataan member gym berbasis Java yang dirancang untuk menggantikan pencatatan manual menggunakan buku tulis. Program ini memastikan setiap data yang dimasukkan (nama, nomor telepon, tanggal daftar, dan jenis paket keanggotaan) selalu tervalidasi dengan aman sebelum disimpan ke dalam array selama aplikasi berjalan.



\## Konsep OOP yang Diterapkan



| Konsep OOP | Lokasi Penerapan | Alasan Pemilihan |

|            |                  |                  |

| \*\*Encapsulation\*\* | Atribut `private` dan Getter/Setter di class `Member` | Melindungi atribut agar tidak diakses secara langsung dari luar dan memusatkan validasi data di method setter. |

| \*\*Constructor Overloading\*\* | Class `Member` (`Member(...)` dengan 4 parameter dan 3 parameter) | Memberikan fleksibilitas pembuatan objek member, baik dengan paket custom maupun tanpa paket (default Basic). |

| \*\*Method Overriding\*\* | Method `toString()` di class `Member` | Mengubah representasi string bawaan Java menjadi tampilan data member yang rapi dan berlabel. |

## Struktur Direktori Project

```text
tugas1-fittrack/
│
├── .gitignore          # Pengaturan file yang diabaikan oleh Git
├── README.md           # Dokumentasi penjelasan project
└── src/                # Folder penyimpanan source code Java
    ├── Member.java     # Class data model dan validasi member gym
    └── TesFitTrack.java  # Class utama untuk pengujian program (Main)

## Cara Menjalankan Program

Pastikan komputer sudah terinstal **Java Development Kit (JDK)**. Ikuti langkah-langkah berikut di terminal/command prompt:

1. Buka terminal lalu arahkan direktori ke folder penyimpanan project:
   ```bash
   cd tugas1-fittrack

   javac src/Member.java src/TesFitTrack.java
  
   java -cp src TesFitTrack

## Ringkasan Aturan Validasi & Pengujian

Program FitTrack mengimplementasikan beberapa aturan validasi pada class `Member` untuk memastikan integritas data[cite: 1]:

1. **Nama Member**: Tidak boleh bernilai `null`, kosong, atau hanya terdiri dari spasi.
2. **Nomor Telepon**: Harus diawali dengan angka `'0'` dan memiliki panjang minimal 10 digit.
3. **Jenis Paket**: Hanya menerima pilihan `"Basic"`, `"Premium"`, atau `"VIP"`.

### Skenario Pengujian pada `TesFitTrack`
- **Pembuatan Objek Normal**: Memastikan data yang valid tersimpan dengan benar (paket VIP, Premium, dan Basic default).
- **Penolakan Data Invalid**: Sistem otomatis menolak nomor telepon yang terlalu pendek atau jenis paket yang tidak sesuai daftar, lalu menampilkan pesan error serta mempertahankan nilai default yang aman[cite: 1].
- **Method `toString()`**: Mengubah representasi objek menjadi format teks berlabel yang mudah dibaca[cite: 1].

## Catatan Pengembangan

Project ini dikembangkan secara bertahap menggunakan kontrol versi Git untuk memenuhi standar kualitas kode pada Praktikum Pemrograman Berorientasi Objek (PBO), dengan penekanan pada:
- Penerapan *Encapsulation* dan validasi ketat pada data masukan.
- Pemenuhan prinsip *Clean Code* (konstanta `final`, menghindari *magic number/string*)[cite: 1].
- Dokumentasi kode yang lengkap melalui *Javadoc* dan panduan penggunaan via README[cite: 1].
