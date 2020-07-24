package com.abcdiane.motormaticmurah.model

import com.abcdiane.motormaticmurah.R

object MotorData {
    private val motorNames = arrayOf(
        "Honda Beat eSP",
        "Honda Beat Street eSP",
        "Honda Vario eSP",
        "Honda Scoopy",
        "Suzuki Address FI",
        "Suzuki NEX II",
        "Yamaha Lexi",
        "Yamaha Mio S",
        "Yamaha All New X-Ride 125",
        "Yamaha MIO M3 125 AKS SSS",
        "Yamaha MIO M3 125"
    )

    private val motorPrice = arrayOf(
        "Rp. 15.450.000",
        "Rp. 16.125.000",
        "Rp. 16.925.000",
        "Rp. 18.100.000",
        "Rp. 15.350.000",
        "Rp. 13.950.000",
        "Rp. 19.950.000",
        "Rp. 15.950.000",
        "Rp. 17.400.000",
        "Rp. 16.300.000",
        "Rp. 15.400.000"
    )

    private val motorDetail = arrayOf(
        "Motor Honda Beat eSP merupakan salah satu motor matic murah terbaru dari Honda. Ia memiliki mesin berkapasitas 108 cc yang cukup nyaman untuk diajak berpergian. Desainnya yang ramping membuat banyak orang yang menyukai motor matic buatan Honda tersebut. Tidak heran jika Honda Beat eSP masuk ke dalam kategori motor matic terlaris.",
        "Kalau Anda ingin tampil beda dan menyukai motor matic bergaya adventure. Maka bisa memilih Honda Beat Street ESP ini. Mesin yang digunakannya memang sama seperti Honda Beat lainnya. Tapi dari segi desain ia lebih terlihat sporty dan keren. Apalagi bagian stangnya yang mirip stang Yamaha X Ride.",
        "Honda Vario eSP merupakan varian motor Honda Vario termurah karena dibanderol kurang dari 20 jutaan. Karena harganya murah, maka jangan kaget jika mesin yang dibawanya masih berkapasitas 108 cc sama seperti Honda BeAt. Buat yang mencari motor matic yang suspensinya nyaman, maka bisa memilih Honda Vario eSP ini.",
        "Honda Scoopy lebih menyasar ke pengguna motor matic wanita. Ia memiliki desain yang elegan dan ramah untuk digunakan wanita. Jika dari kejauhan motor ini mirip dengan motor matic Vespa. Motor matic murah keluaran Honda ini sudah membawa sistem Injeksi PGM FI.",
        "Suzuki Address FI merupakan motor matic murah yang baru diluncurkan oleh Suzuki. Motor matic yang satu ini dibanderol hanya 15 jutaan saja dan flikermania sudah bisa mendapatkan motor matic mesin 113 cc. Desainnya lebih ramping dari Honda Beat, serta memiliki suspensi yang empuk.",
        "Harganya yang hanya 13 jutaan saja, membuat motor matic ini banyak dibeli oleh masyarakat kalangan menengah ke bawah. Meskipun harganya sangat murah, motor matic Suzuki ini tetap dibekali dengan mesin berkapasitas 113cc.",
        "Jika Anda memiliki budget 20 juta, dan ingin mendapatkan motor matic terbaik yang harganya murah. Maka bisa memilih Yamaha Lexi, motor matic yang satu ini memiliki desain yang kokoh dan suspensi yang empuk. Selain itu mesin yang dibawanya sudah berkapasitas 125 cc. Kelebihan lain dari motor matic ini adalah bagasi yang dimilikinya sangat besar.",
        "Mencari motor matic 15 jutaan dari Yamaha ? maka pilihan yang tepat adalah Yamaha Mio S & Sophisticated 125 cc. Harganya cuma 15 jutaan saja, tapi ia sudah dibekali dengan mesin tangguh berbeda dari Honda Beat ataupun Suzuki Nex. Kursi penumpangnya juga luas serta bagasinya bisa muat untuk menaruh banyak barang.",
        "Yamaha All New X-Ride 125 merupakan generasi terbaru dari Yamaha X-Ride yang dulunya hanya dibekali mesin 110 cc. Motor matic murah yang satu ini memiliki tampilan lebih ekstrem layaknya sebuah motor trail. Banyak yang membeli motor ini untuk di modifikasi.",
        "Motor matic murah 125cc buatan Yamaha selain Mio S adalah Mio M3 125 AKS SSS. Motor matic tersebut memiliki tampilan desain yang keren dan sangat cocok untuk semua kaum. Selain itu kenyamanan pada motor matic ini juga terbilang cukup bagus dari suspensi belakang empuk dan rem yang pakem.",
        "Kalau yang varian Yamaha Mio M3 125 AKS SSS memiliki desain yang lebih ekslusif. Maka untuk Yamaha Mio M3 125 ini lebih terlihat standar. Buat yang belum memiliki dana 16 juta dan hanya 15 juta saja, maka bisa memilih Mio M3. Karena dari spesifikasinya sama persis dengan Mio M3 125 AKS SSS yang membedakannya hanya dari tampilannya saja."
    )

    private val motorImages = intArrayOf(
        R.drawable.honda_beat_esp,
        R.drawable.honda_beat_street_esp,
        R.drawable.honda_vario_esp,
        R.drawable.honda_scoopy,
        R.drawable.suzuki_address_fi,
        R.drawable.suzuki_nex_ii,
        R.drawable.yamaha_lexi,
        R.drawable.yamaha_mio_s,
        R.drawable.yamaha_allnew_xride_125,
        R.drawable.yamaha_mio_m3_125_aks_sss,
        R.drawable.yamaha_mio_m3_125
    )

    private val motorMesin = arrayOf("4 Langkah, SOHC dengan Pendinginan Udara",
        "4 Langkah, SOHC dengan Pendinginan Udara",
        "4 Langkah, SOHC Pendingin Udara",
        "4 Langkah, SOHC dengan Pendingin Udara",
        "4-stroke, 1 cylinder, air-cooled, SOHC",
        "4-stroke, 1 silinder, pendingin udara, SOHC, 2 Valve",
        "Liquid Cooled 4-stroke, SOHC, Single Cylinder",
        "Air cooled, 4-stroke, SOHC, Single cylinder",
        "4 Langkah, 2 Valve SOHC, Berpendingin Angin, Bluecore, Cylinder Tunggal",
        "Air cooled 4-stroke, SOHC, Single Silinder",
        "Air cooled 4-stroke, SOHC, Single Silinder")

    private val motorCc = arrayOf("108,2 cc",
        "108,2 cc",
        "108,2 cc",
        "108,2 cc",
        "113 cc",
        "113 cc",
        "124.7 cc",
        "125cc",
        "125cc",
        "125cc",
        "125cc")

    private val motorSistem = arrayOf("Injeksi (PGM-FI)",
        "Injeksi/PGM-FI (Programmed Fuel Injection)",
        "Injeksi(PGM-FI)",
        "Injeksi (PGM-FI)",
        "Fuel Injection",
        "Fuel Injection",
        "Fuel Injection",
        "Fuel Injection",
        "Fuel Injection",
        "Fuel Injection",
        "Fuel Injection")

    private val motorDaya = arrayOf("6,38 KW (8,68 PS)/7.500 rpm",
        "6,38 KW (8,68 PS)/7.500 rpm",
        "6,4 kW (8,7 PS / 7.500 rpm)",
        "6,7 KW (9,1 PS / 7.500 rpm)",
        "6.7 KW / 8000 rpm",
        "6,7 Kw (9,1 PS) / 8000 rpm",
        "8.75 kW / 8000 rpm",
        "7.0 kW / 8000rpm",
        "7.0 kW / 8000rpm",
        "7 kW/8000rpm",
        "7 kW/8000rpm")

    private val motorTorsi = arrayOf("9,01 N.m (0,92 kgf.m)/6.500 rpm",
        "9,01 N.m (0,92 kgf.m)/6.500 rpm    ",
        "9,1 Nm (0,93 kgf.m / 6.000 rpm)",
        "9,4 Nm (0,96 kgf.m) / 6.000 rpm",
        "8.60 N.m / 6000 rpm",
        "8,5 Nm / 6000 rpm",
        "11.3 Nm / 7000 rpm",
        "9.6 N.m / 5500rpm",
        "9.6N.m / 5500rpm",
        "9.6N.m / 5500rpm",
        "9.6N.m/5500rpm")

    val listData: ArrayList<Motor>
        get() {
            val list = arrayListOf<Motor>()
            for (position in motorNames.indices) {
                val motor = Motor()
                motor.name = motorNames[position]
                motor.price = motorPrice[position]
                motor.detail = motorDetail[position]
                motor.photo = motorImages[position]
                motor.mesin = motorMesin[position]
                motor.cc = motorCc[position]
                motor.sistem = motorSistem[position]
                motor.daya = motorDaya[position]
                motor.torsi = motorTorsi[position]
                list.add(motor)
            }
            return list
        }
}