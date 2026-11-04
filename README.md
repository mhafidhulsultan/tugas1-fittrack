# Tugas 1: Sistem Keanggotaan Gym FitTrack - Remedial UTS Praktikum PBO

* **Nama Lengkap** : Muhammad Hafidhul Sultan
* **NPM**          : 250810701100056
* **Kelas**        : Praktikum Pemrograman Berorientasi Objek

---

## Status Project
**[ SELESAI / COMPLETED ]** - Versi 1.0.0
Seluruh persyaratan tugas (validasi if-else, konsep OOP, array, Javadoc) telah terpenuhi dan berjalan dengan baik.

## Deskripsi Singkat
FitTrack adalah sistem pendataan member gym berbasis Java yang dirancang untuk menggantikan pencatatan manual menggunakan buku tulis. Program ini memastikan setiap data yang dimasukkan (nama, nomor telepon, tanggal daftar, dan jenis paket keanggotaan) selalu tervalidasi dengan aman sebelum disimpan ke dalam array selama aplikasi berjalan.

## Konsep OOP yang Diterapkan

| Konsep OOP | Lokasi Penerapan | Alasan Pemilihan |
|---|---|---|
| **Encapsulation** | Atribut `private` dan Getter/Setter di class `Member` | Melindungi atribut agar tidak diakses secara langsung dari luar dan memusatkan validasi data di method setter. |
| **Constructor Overloading** | Class `Member` (`Member(...)` dengan 4 parameter dan 3 parameter) | Memberikan fleksibilitas pembuatan objek member, baik dengan paket custom maupun tanpa paket (default Basic). |
| **Method Overriding** | Method `toString()` di class `Member` | Mengubah representasi string bawaan Java menjadi tampilan data member yang rapi dan berlabel. |

## Struktur Direktori Project

```text
tugas1-fittrack/
│
├── .gitignore            # Pengaturan file yang diabaikan oleh Git
├── README.md             # Dokumentasi penjelasan project
└── src/                  # Folder penyimpanan source code Java
    ├── Member.java       # Class data model dan validasi member gym
    └── TesFitTrack.java  # Class utama untuk pengujian program (Main)
```

## Prasyarat
- **Java Development Kit (JDK)**: Versi 11 atau lebih baru.
- **IDE**: Disarankan menggunakan IntelliJ IDEA (sesuai pedoman praktikum) atau teks editor lain seperti VS Code.

## Cara Menjalankan Program
Pastikan komputer sudah terinstal JDK. Ikuti langkah-langkah berikut di terminal atau command prompt:

1. Buka terminal lalu arahkan direktori ke folder penyimpanan project:
   ```bash
   cd tugas1-fittrack
   ```
2. Kompilasi kedua file source code Java di dalam folder `src`:
   ```bash
   javac src/Member.java src/TesFitTrack.java
   ```
3. Jalankan program pengujian menggunakan class utama (`TesFitTrack`):
   ```bash
   java -cp src TesFitTrack
   ```

## Contoh Output
Berikut adalah hasil eksekusi program yang menampilkan skenario pembuatan objek berhasil maupun saat validasi menolak data yang salah:

[Screenshot Hasil Eksekusi](output.png)

## Nilai Default
Ketika objek dibuat menggunakan data yang tidak lolos validasi, program tidak akan *crash*, melainkan menggunakan nilai default yang aman:
- `nama`: "Member Baru"
- `noTelepon`: "0000000000"
- `tanggalDaftar`: "01-01-2026"
- `jenisPaket`: "Basic"

Alasan pemilihan nilai ini adalah untuk menjaga integritas data agar tidak ada nilai `null` di dalam sistem, sekaligus menjadi penanda visual bagi staf resepsionis bahwa data tersebut harus segera dikonfirmasi/diedit ulang.

## Batasan dan Pengembangan Lanjutan
- **Batasan**: Sistem saat ini hanya menyimpan data sementara di dalam memori lokal (Array). Data akan hilang sepenuhnya ketika aplikasi ditutup.
- **Pengembangan Lanjutan**: Ke depannya, program dapat dikembangkan dengan menghubungkannya ke Database (seperti MySQL) untuk penyimpanan permanen, serta pembuatan Antarmuka Pengguna Grafis (GUI) agar staf tidak lagi menggunakan Command Line/Terminal.