Class: Mahasiswa
State jumlah 5 :
- Nama (String): menyimpan nama mahasiswa.
- NIM (String): menyimpan NIM (Nomor Induk Mahasiswa) mahasiswa.
- Alamat (String): menyimpan alamat mahasiswa.
- umur (int): menyimpan umur mahasiswa.
- Jurusan (String): menyimpan jurusan mahasiswa.
Behavior jumlah 5 (constructor bukan termasuk behaviour) :
- getNIM(): metode untuk mengembalikan nilai NIM mahasiswa.
- getNama(): metode untuk mengembalikan nilai nama mahasiswa.
- setNama(String Nama): metode untuk mengubah nilai nama mahasiswa.
- setNIM(String NIM): metode untuk mengubah nilai NIM mahasiswa.
- cetakInformasi(): metode untuk mencetak informasi NIM dan nama mahasiswa.
Behavior yang ada pada class Mahasiswa termasuk dalam jenis fungsi, karena metode-metode tersebut mengembalikan nilai (getters) atau melakukan tindakan tertentu (setters, cetakInformasi) pada objek Mahasiswa.

Perbedaan antara objek yang terbentuk pada objek mhs1 dan mhs2 terletak pada penggunaan constructor yang berbeda saat membuat objek Mahasiswa.
Pada objek mhs1, constructor yang digunakan adalah Mahasiswa(String Nama, String NIM). Dalam kode Mahasiswa mhs1 = new Mahasiswa("Daplun", "H1L009002");, hanya dua parameter (Nama dan NIM) yang diberikan saat membuat objek mhs1. Sehingga atribut-alamat, umur, dan jurusan tidak diinisialisasi dan akan menggunakan nilai default untuk tipe data masing-masing (null untuk String dan 0 untuk int).
Pada objek mhs2, constructor yang digunakan adalah Mahasiswa(String Nama, String NIM, String Alamat). Dalam kode Mahasiswa mhs2 = new Mahasiswa("Daplun","H1L009002", "Purwokerto");, tiga parameter (Nama, NIM, dan Alamat) diberikan saat membuat objek mhs2. Dengan demikian, atribut umur dan jurusan tetap menggunakan nilai default, yaitu 0 dan null, sedangkan atribut Nama, NIM, dan Alamat akan diinisialisasi sesuai dengan nilai yang diberikan.
Dengan kata lain, objek mhs1 hanya memiliki Nama dan NIM yang terdefinisi, sedangkan objek mhs2 memiliki Nama, NIM, dan Alamat yang terdefinisi.

Konstruktor adalah sebuah metode khusus dalam sebuah class yang digunakan untuk membuat dan menginisialisasi objek dari class tersebut. Konstruktor memiliki nama yang sama dengan nama classnya dan tidak memiliki tipe pengembalian (void atau lainnya). Ketika sebuah objek dibuat menggunakan operator new, konstruktor akan dieksekusi untuk menginisialisasi atribut-atribut pada objek tersebut.
Pada class Mahasiswa di atas, terdapat 3 konstruktor yang berbeda:
- Mahasiswa(String Nama, String NIM): Konstruktor ini menerima dua parameter, yaitu Nama dan NIM. Konstruktor ini digunakan untuk membuat objek Mahasiswa dengan menginisialisasi Nama dan NIM saja. Atribut Alamat, umur, dan Jurusan akan menggunakan nilai default (null untuk String dan 0 untuk int).
- Mahasiswa(String Nama, String NIM, String Alamat): Konstruktor ini menerima tiga parameter, yaitu Nama, NIM, dan Alamat. Konstruktor ini digunakan untuk membuat objek Mahasiswa dengan menginisialisasi Nama, NIM, dan Alamat. Atribut umur dan Jurusan akan menggunakan nilai default (0 dan null).
- Mahasiswa(String Nama, String NIM, String Alamat, int umur, String Jurusan): Konstruktor ini menerima lima parameter, yaitu Nama, NIM, Alamat, umur, dan Jurusan. Konstruktor ini digunakan untuk membuat objek Mahasiswa dengan menginisialisasi semua atribut yang ada pada class Mahasiswa.
Dengan adanya tiga konstruktor tersebut, kita dapat membuat objek Mahasiswa dengan berbagai kombinasi nilai yang sesuai dengan konstruktor yang dipilih.

Pada kode sumber class Mahasiswa, kata kunci private dan public digunakan untuk mengatur aksesibilitas atau visibilitas atribut dan metode dalam class. Berikut adalah penjelasan untuk masing-masing kata kunci tersebut:
- private: Ketika sebuah atribut atau metode dideklarasikan dengan kata kunci private, artinya mereka hanya dapat diakses secara langsung dari dalam class tersebut. Atribut atau metode yang memiliki aksesibilitas private tidak dapat diakses atau diubah dari class lain, bahkan dari class turunan. Dalam class Mahasiswa, atribut Nama, NIM, Alamat, umur, dan Jurusan memiliki aksesibilitas private, sehingga hanya dapat diakses dan diubah langsung dari dalam class Mahasiswa itu sendiri.
- public: Ketika sebuah atribut atau metode dideklarasikan dengan kata kunci public, artinya mereka dapat diakses dari mana saja, baik dari dalam class itu sendiri, class turunan, maupun class lain di luar class tersebut. Dalam class Mahasiswa, metode getNIM(), getNama(), setNama(String Nama), setNIM(String NIM), dan cetakInformasi() memiliki aksesibilitas public, sehingga dapat diakses dan digunakan dari luar class Mahasiswa dengan membuat objek Mahasiswa dan memanggil metode-metode tersebut.
Dengan menggunakan kata kunci private dan public, kita dapat mengontrol aksesibilitas atribut dan metode dalam class, sehingga menjaga integritas dan keamanan data serta memperhatikan prinsip enkapsulasi dalam pemrograman berorientasi objek.

Pada kode sumber class Mahasiswa, kata kunci this digunakan untuk merujuk ke objek saat ini. Dalam konteks penggunaannya, this digunakan untuk merujuk ke atribut atau metode dalam class yang sedang dieksekusi.
this.Nama, this.NIM, this.Alamat, this.umur, this.Jurusan: Dalam konstruktor dan metode cetakInformasi(), this digunakan untuk merujuk ke atribut-atribut dalam class Mahasiswa. Hal ini digunakan untuk membedakan antara variabel lokal (parameter atau variabel dalam metode) dengan atribut yang sama namanya. Dengan menggunakan this, kita dapat mengakses atribut-atribut class dan mengatur nilainya.

Behavior yang harus ditambahkan adalah metode getter dan setter untuk atribut Alamat dalam class Mahasiswa. Metode getter digunakan untuk mendapatkan nilai alamat dari sebuah objek Mahasiswa, sedangkan metode setter digunakan untuk mengubah nilai alamat pada objek tersebut.
public String getAlamat() {
    return Alamat;
}

public void setAlamat(String Alamat) {
    this.Alamat = Alamat;
}

Setelah menambahkan behavior tersebut, Anda dapat menggunakan metode getAlamat() untuk mendapatkan alamat dari objek Mahasiswa, dan menggunakan metode setAlamat(String Alamat) untuk mengubah nilai alamat.
public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa("John Doe", "H1L009002");
    mhs1.setAlamat("Jakarta");
    System.out.println("Alamat mahasiswa: " + mhs1.getAlamat());

    Mahasiswa mhs2 = new Mahasiswa("Jane Smith", "H1L009003", "Bandung");
    System.out.println("Alamat mahasiswa: " + mhs2.getAlamat());
    mhs2.setAlamat("Surabaya");
    System.out.println("Alamat mahasiswa setelah diubah: " + mhs2.getAlamat());
}

Berikut ini adalah isi kelas Televisi yang diperlukan untuk menghasilkan output yang diinginkan:
public class Televisi {
    private final String merek;
    private final String harga;
    private boolean hidup;
    private int channel;

    public Televisi(String merek, String harga) {
        this.merek = merek;
        this.harga = harga;
    }

    public void informasiTv() {
        System.out.println("Televisi " + merek + " harga " + harga);
    }

    public void hidupkanTv() {
        hidup = true;
        System.out.println("Televisi hidup");
    }

    public void matikanTv() {
        hidup = false;
        System.out.println("Televisi mati");
    }

    public void setChannel(int channel) {
        if (hidup) {
            this.channel = channel;
        } else {
            System.out.println("Televisi belum dinyalakan");
        }
    }

    public int getChannel() {
        return channel;
    }
}

Dari percobaan di atas, dapat disimpulkan:
- Class: Terdapat dua class dalam contoh tersebut, yaitu class Main dan class Televisi. Class Main digunakan sebagai entry point untuk menjalankan program dan mengatur penggunaan objek Televisi. Class Televisi merupakan kelas yang mewakili objek televisi.
- Objek: tvFlat
- Penyusun Class terdiri atas: merek, harga, hidup, channel, konstruktor, prosedur informasiTv(), hidupkanTv(), matikanTv(), setChannel(), dan getChannel().

