package com.aldi.valrorant_agen.db

import com.aldi.valrorant_agen.R
import com.aldi.valrorant_agen.model.ValoranAgen

object CharData {
    private val database = arrayOf(
            arrayOf(
                    "Jett",
                    "peran: Duelist",
                    "negara: Korea Selatan",
                    "Mewakili negara asalnya, Korea Selatan, gaya bertarung Jett yang tangkas dengan banyak pengelakan memungkinkannya mengambil risiko yang tak bisa dilakukan orang lain. Dia mengitari tiap pertempuran, menebas musuh sebelum mereka menyadari apa yang terjadi.",
                    "9/13",
                    "Sword",
                    R.drawable.jett_agen,
                    R.drawable.jett_bg,
                    R.drawable.duelist,
                    "https://playvalorant.com/id-id/agents/jett/",
                    R.drawable.korea_selatan
            ),
            arrayOf(
                    "Breach",
                    "peran: Controller",
                    "negara: Swedia",
                    "Breach, orang bionik dari Swedia, menembakkan ledakan kinetik kuat tertarget untuk membuka jalan secara agresif menembus wilayah musuh. Kerusakan dan gangguan yang dia timbulkan memastikan pertarungan tak akan pernah adil.\n",
                    "7/20",
                    "Bow",
                    R.drawable.breach_agen,
                    R.drawable.breach_bg,
                    R.drawable.controller,
                    "https://playvalorant.com/id-id/agents/breach/",
                    R.drawable.swedia
            ),
            arrayOf(
                    "Brimstone",
                    "peran: controler",
                    "negara: Amerika serikat",
                    "Bergabung dari AS, persenjataan orbital Brimstone memastikan squad-nya selalu di posisi menguntungkan. Kemampuannya untuk melancarkan bantuan secara presisi dan aman menjadikannya seorang komandan tempur tak tertandingi. ",
                    "4/30",
                    "Claymore",
                    R.drawable.brimstone_agen,
                    R.drawable.brimstone_bg,
                    R.drawable.controller,
                    "https://playvalorant.com/id-id/agents/brimstone/",
                    R.drawable.amerika_serikat
            ),
            arrayOf(
                    "Cypher",
                    "peran: sentinel",
                    "negara: maroko",
                    "Seorang makelar informasi dari Maroko, Cypher adalah jaringan pengintai satu orang yang mengawasi tiap gerakan musuh. Tak ada rahasia yang aman. Tak ada manuver yang tak terlihat. Cypher selalu mengawasi.\n",
                    "12/2",
                    "Bow",
                    R.drawable.cypher_agen,
                    R.drawable.cypher_bg,
                    R.drawable.sentinel,
                    "https://playvalorant.com/id-id/agents/cypher/",
                    R.drawable.maroko
            ),
            arrayOf(
                    "Astra",
                    "peran: controler",
                    "negara: ghana",
                    "Agen asal Ghana, Astra, memberdayakan kekuatan semesta untuk mereka ulang medan tempur sesuka hatinya. Dengan kendali penuh atas wujud astralnya dan bakat meramal strategisnya, dia akan selalu unggul dari musuuhnya. ",
                    "7/15",
                    "Polearm",
                    R.drawable.astra_agen,
                    R.drawable.astra_bg,
                    R.drawable.controller,
                    "https://playvalorant.com/id-id/agents/astra/",
                    R.drawable.gana
            ),
            arrayOf(
                    "Killjoy",
                    "peran: sentinel",
                    "negara: german",
                    "Sang genius dari Jerman, Killjoy, dengan mudah mengamankan posisi penting medan perang dengan segudang penemuannya. Jika kerusakan yang dihasilkan tak menghentikan musuh, debuff robot-robotnya akan mengatasinya.",
                    "3/14",
                    "Sword",
                    R.drawable.killjoy_agen,
                    R.drawable.killjoy_bg,
                    R.drawable.sentinel,
                    "https://playvalorant.com/id-id/agents/killjoy/",
                    R.drawable.german
            ),
            arrayOf(
                    "Neon",
                    "peran: duelist",
                    "negara: philipina",
                    "Agen dari Filipina, Neon, melesat maju dengan kecepatan yang mencengangkan, menyemburkan pancaran bioelektrik secepat tubuhnya menghasilkannya. Dia berlari untuk mengejutkan musuh, lalu menyerang mereka lebih cepat dari kilat.",
                    "11/20",
                    "Sword",
                    R.drawable.neon_agen,
                    R.drawable.neon_bg,
                    R.drawable.duelist,
                    "https://playvalorant.com/id-id/agents/neon/",
                    R.drawable.philiphine
            ),
            arrayOf(
                    "Omen",
                    "peran: controler",
                    "negara: indonesia",
                    "Omen Sesosok hantu dalam pikiran, Omen berburu di dalam bayangan. Dia membutakan musuh, berteleportasi di penjuru medan tempur, lalu membiarkan rasa paranoid menghantui selagi musuh berusaha menerka di mana dia akan menyerang berikutnya.",
                    "7/27",
                    "Catalyst",
                    R.drawable.omen_agen,
                    R.drawable.omen_bg,
                    R.drawable.controller,
                    "https://playvalorant.com/id-id/agents/omen/",
                    R.drawable.indonesia
            ),
            arrayOf(
                    "Sage",
                    "peran: sentinel",
                    "negara: tiongkok",
                    "Benteng pertahanan dari Tiongkok, Sage memberikan rasa aman bagi dirinya dan timnya ke mana pun dia pergi. Bisa membangkitkan teman yang gugur dan menahan gempuran sengit, dia menjadi sumber ketenangan dalam medan perang bagai neraka.",
                    "8/31",
                    "Catalyst",
                    R.drawable.sage_agen,
                    R.drawable.sage_bg,
                    R.drawable.sentinel,
                    "https://playvalorant.com/id-id/agents/sage/",
                    R.drawable.tiongkok
            ),
            arrayOf(
                    "Sova",
                    "peran: initiator",
                    "negara: rusia",
                    "Terlahir dari musim dingin abadi tundra Rusia, Sova melacak, menemukan, dan menghabisi musuh dengan efisiensi dan presisi dahsyat. Busur khusus dan kemampuan pengintaian luar biasanya memastikan bahwa kamu bisa lari, tetapi tak bisa sembunyi.",
                    "3/3",
                    "Sword",
                    R.drawable.sova_agen,
                    R.drawable.sova_bg,
                    R.drawable.initiator,
                    "https://playvalorant.com/id-id/agents/sova/",
                    R.drawable.rusia
            )
    )

    val listData: ArrayList<ValoranAgen>
        get(){
                val list = ArrayList<ValoranAgen>()
                for (data in database) {
                        val valoranAgen = ValoranAgen()
                        valoranAgen.name = data[0] as String
                        valoranAgen.peran = data[1] as String
                        valoranAgen.negara = data[2] as String
                        valoranAgen.bio = data[3] as String
                        valoranAgen.birth = data[4] as String
                        valoranAgen.weapon = data[5] as String
                        valoranAgen.pic = data[6] as Int
                        valoranAgen.background = data[7] as Int
                        valoranAgen.role = data[8] as Int
                        valoranAgen.charlink = data[9] as String
                        valoranAgen.country = data[10] as Int

                        list.add(valoranAgen)
                }
                return list
        }
}