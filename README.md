# Kuliner Semarang

![Lawang Sewu by Nur Arifah(dribble.com)!](https://cdn.dribbble.com/users/4866327/screenshots/11021513/media/51c90af5665aa8fd11f21021da714af8.png?compress=1&resize=1200x900)

_"Lawang Sewu Building in Semarang, Flat Line Illustration"_ oleh [Nur Arifah](https://dribbble.com/nur_arifah)

<div id="kuliner-semarang"/>

Aplkasi sederhana yang menampilkan daftar kuliner
di kota Semarang. Dibuat dengan Android Studio dalam bahasa Java.

- [Kuliner Semarang](#kuliner-semarang)
- 📝 [Penjelasan Singkat](#short-desc)
- 🧰 Tools
  - ![android](readme-assets/android_16x16.png) [Android Studio](#android-studio)
  - ![book](readme-assets/book_16x16.png) [Dependencies](#dependencies)
- 🖼 [Demonstrasi](#demo)
- 📚 [Sumber Belajar](#sources)

<div id="short-desc"/>

## 📝 Penjelasan Singkat

> Aplikasi ini masih menggunakan data yang dideklarasikan secara langsung, belum menggunakan interaksi dengan database.

Layout yang digunakan :

- `ConstraintLayout`
- `LinearLayout`
- `RelativeLayout`
- `RecyclerView`
- `CardView`

Tambahkan dependencies aplikasi ini ke dalam file berikut

> `build.gradle (Module:[nama projectnya])`

Selanjutnya, cari bagian :

```gradle
    dependencies {

    }
```

lalu isi dengan _implementation_ dari tiap depedency.

> File implementation `androidx.recyclerview:recyclerview:1.2.1` ini bisa ditemui di dalam bagian `Gradle Scripts` dari project.
>
> > Untuk mengubah tipe tampilan `Project` sidebar, klik kiri pada anak panah bawah di sebelah tipe tampilan saat ini, lalu pilih `Android`

<div id="android-studio"/>

### ![android](readme-assets/android_32x32.png) Android Studio

Berikut adalah spesifikasi Android Studio yang saya
gunakan.

- [Android Studio Arctic Fox 2020.3.1](https://developer.android.com/studio)
- Android Image API 30

<div id="dependencies"/>

### ![book](readme-assets/book_32x32.png) Dependencies

- [CardView 1.0.0](https://developer.android.com/jetpack/androidx/releases/cardview?hl=en)

```gradle
    dependencies {
        //dependency 1
        //dependency 2
        implementation 'androidx.cardview:cardview:1.0.0'

    }
```

- [RecyclerView 1.2.1](https://developer.android.com/jetpack/androidx/releases/recyclerview?hl=en)

```gradle
    dependencies {
        implementation 'androidx.recyclerview:recyclerview:1.2.1'
    }
```

<div id="demo"></div>

### 🖼 Demonstrasi

Berikut demo aplikasi ketika dijalankan.

![Appsdemo](readme-assets/demo_kulinersemarang.gif)

### 📚 Sumber Belajar

Berikut adalah sumber belajar yang saya gunakan.

> Silahkan coba klik salah satu gambar. Sumber berikut berupa video YouTube.

| Judul                                                                        | Sumber                                                                                                                                                                                                                                                                                     | Pemilik            |
| ---------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------ |
| Membuat Aplikasi List Kuliner                                                | [![Studi Kasus Aplikasi Kuliner ](readme-assets/hqdefault-recyclerview.jpg)](https://www.youtube.com/watch?v=zQpKmnNehb0&list=PLVslXNopr4TnQ4WSWY6_Jysg0e61RN00l&index=17 "Studi Kasus Aplikasi ")                                                                                         | Fahri Firdausillah |
| RecyclerView OnClickListener to New Activity Android Studio Beginner's Guide | [![RecyclerView OnClickListener to New Activity Android Studio](readme-assets/maxresdefault-recyclerview-onclicklistener.jpg)](https://www.youtube.com/watch?v=vBxNDtyE_Co&list=PLVslXNopr4TnQ4WSWY6_Jysg0e61RN00l&index=20 "RecyclerView OnClickListener to New Activity Android Studio") | Ben O'Brien        |
| Recyclerview with Cardview in Android Studio Part 1: Display items           | [![RecyclerView with CardView](readme-assets/maxresdefault-recyclerview-with-cardview.jpg)](https://www.youtube.com/watch?v=oq_xGMN0mRE&list=PLVslXNopr4TnQ4WSWY6_Jysg0e61RN00l&index=19 "RecyclerView with CardView")                                                                     | AndroidWorldClub   |
