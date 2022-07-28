package com.azmovhudstc.mobiuzapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.azmovhudstc.mobiuzapp.adapter.TariffsAdapter
import com.azmovhudstc.mobiuzapp.model.Tarif
import kotlinx.android.synthetic.main.fragment_tariflar.view.*
import java.util.ArrayList

class TariflarFragment : Fragment() {
    lateinit var root:View
    lateinit var adapter: TariffsAdapter
    lateinit var list:ArrayList<Tarif>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_tariflar, container, false)
        root.tariflar_rv.layoutManager=LinearLayoutManager(context)
        loadDataTarifs()
        adapter=TariffsAdapter(loadDataTarifs(), fragment = parentFragment)
        root.tariflar_rv.adapter=adapter
        return root
    }

    private fun loadDataTarifs(): ArrayList<Tarif> {
        list= ArrayList()
        list.add(Tarif("Mobi 20","*111*120#","20000/1 000 so`m oylik kunlik obenent to`lovi 500","Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi.\n" +
                "\n" +
                "Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                "\n" +
                "Internet-trafikni yaxlitlash kvanti 1 KB.\n" +
                "\n" +
                "“Mobi 20” tarifida “Gap ko‘p” xizmatini ulash mumkin. Ulanish narxi- 10 000 so`m\n" +
                "Ushbu tarif rejasiga yangi ulanilganda yoki o‘tilganda, abonent to‘lovi darhol yechib olinadi. Abonent to‘loviga kiritilgan daqiqa, Mb va SMS to'plamlari to‘liq hajmda beriladi.\n" +
                "\n" +
                "Ushbu tarif rejasiga o'tish uchun abonent balansida kamida 24 210,35 so'm (tarif rejasini o'zgartirish uchun 4210,35 so'm miqdoridagi to'lovni hisobga olganda)  yoki 40 000 so'm (tarif rejasini o'zgartirish uchun 20000 so'm miqdoridagi to'lovni hisobga olganda) bo'lishi kerak. Hisobda yuqorida ko'rsatib o'tilgan qiymatlardan kam mablag' bo'lganda, o'tishni amalga oshirish imkoniyati mavjud emas.\n" +
                "\n" +
                "Abonent to`lovi ko`proq bo`lgan tarif rejalaridan \"Mobi 20\" tarif rejasiga o`tish narxi - 20000 so`m\n" +
                "\n" +
                "Abonent to`lovi kamroq bo`lgan tarif rejalaridan \"Mobi 20\" tarif rejasiga o`tish narxi - 4210,35 so`m \n" +
                "\"Mobi 20\", \"Chilla Lite+\" va \"Gap Yo’q mini\" tarif rejalari orasida o‘tish narxi – 4210,35 so‘m.\n" +
                "\n" +
                "\"Mobi 20 » tarif rejasi va  Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi –  0.\n" +
                "\"Mobi 20\" tarif rejasidan \"Oson\", \"Terminal Yillik\" tarif rejalariga o'tish imkoniyati- mavjud emas.\n" +
                "Tarif rejasi o‘zgartirilganda foydalanilmagan daqiqa, SMS va megabaytlar keyingi davrga o‘tkaziladi va qo’shiladi.\n" +
                "Balans nolga teng yoki manfiy bo‘lib qolganda,raqam qisman blokirovka qilinadi (qisman blokirovkada chiquvchi daqiqalar, SMS va internet bloklanadi) va abonent «Aloqadaman» xizmatining shartlariga muvofiq kiruvchi qo‘ng‘iroqlar va SMS larni qabul qilishi mumkin bo‘ladi.  \n" +
                "\n" +
                "Bloklangan holatda abonent to‘lovi yechilmaydi; \n" +
                "Oylik abonent to‘lovi yechilish tartibida tarif rejasi bo‘yicha daqiqa, MB va SMS’lar to'liqligicha 1 kalendar oyga taqdim etiladi.\n" +
                " Agar abonent to‘lovini yechib olish payti kelganda, abonent hisobida oylik abonent to'lovini yechib olish uchun  yetarli mablag‘ bo‘lmasa, lekin kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lsa,to'lovni yechib olish va to'plamlar har kunlik tartibga o'tkaziladi. Abonent to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                "\n" +
                "Abonent to‘lovini har kunlik yechib olish holatida, daqiqa,MB  va SMSlar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                "Agar abonent to'lovini yechib olish vaqti kelganda, abonent hisobida oylik va kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lmasa, abonent ulanganligi to'g'risida SMS-xabar orqali ogohlantiriladigan mablag' yetishmasligi bo'yicha blokga tushadi. Abonent hisob tarif bo'yicha abonent to'lovini (oylik yoki kunlik) yechib olish uchun yetarli bo'lgan qiymatgacha to'ldirishiga qadar blokda bo'ladi. Abonent to'lovi hisob to'ldirilgandan keyin darhol yechib olinadi.\n" +
                "\n" +
                "Agar hisobni to‘ldirish paytida abonent to‘lovni har kunlik yechishda bo‘lsa, abonent to‘lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)      Abonent bloklangan va balansni 0 so‘mdan ko‘proq va 20 000 so‘mdan kamroq bo‘lgan mablag’ bilan to‘ldiradi (oylik abonent to‘lovining to‘liq miqdoridan kamroq):\n" +
                "\n" +
                "1 Misol: Abonent 15-yanvarda bloklangan (mablag' yetishmaganligi sababli yoki qisman bloklash) holatda. 15-yanvar  soat 12:00 da balansni 5000 so‘mga to‘ldiradi. Raqam faollashadi, balans 4 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob  to'ldirilishi bilan,\"MOBI 20\" tarif rejasi uchun joriy kunga kunlik abonent to'lovini yechish darhol amalga oshiriladi. Joriy kun oxirigacha kunlik daqiqa,MB va SMS to'plamlardan foydalanish mumkin. Hisobda 20 000 so'mdan kam mablag' bo'lganligi sababli, abonent to'lovini oylik yechib olishga o'tish AMALGA OSHIRILMAYDI.\n" +
                "\n" +
                "b)      Abonent bloklangan va balansni  20 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq): \n" +
                "2 Misol: Abonent 10-yanvarda -200 so‘m balans bilan blokga tushgan. Tarif bo'yicha abonent to'lovini yechish 15-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 25000 so‘mga to‘ldiradi. Raqam faollashadi, balans 24 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob to'ldirilgandan keyin tarif rejasi uchun abonent to'lovi to'liqligicha yechib olinadi. Mablag'lar yechib olingandan keyin abonent balansi 4800 so'mni tashkil qiladi. Mablag'lar yechib olinganda tarif bo'yicha to'plamlar to'liq hajmda, 1 kalendar oyiga beriladi. Keyingi yechib olish sanasi 15-fevral deb belgilanadi.   \n" +
                "\n" +
                "c)       Abonent  faol holatda,abonent to'lovini har kunlik yechishda va balansni  20 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "\n" +
                "3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 20 000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi."))
        list.add(Tarif("Mobi 30","*111*128#","30000/1 000 so`m oylik kunlik obenent to`lovi 500","3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 20 000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent  faol holatda,abonent to'lovini har oylik yechishda va balansni  20 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                " 4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan.  15-yanvar soat 12:00 da balansni 20000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi. Oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi.  \n" +
                "«Mobi 20» TR JShShIR bo‘lmagan xorijiy fuqarolarga ulash imkoniyati mavjud. JShShIR bo‘lmagan xorijiy fuqaroning SIM-kartasi faollashtirilgan paytdan boshlab 90 kun davomida faol bo‘ladi.\n" +
                "\n" +
                "SIM-kartaning amal qilish muddatini uzaytirish uchun abonent 90 kun o‘tgunga qadar JShShIR (jismoniy shaxsning shaxsiy identifikatsion raqami) taqdim qilishi kerak.  \n" +
                "\n" +
                "Abonent tomonidan JShShIR taqdim qilingandan keyin, xodim ariza, shaxsni tasdiqlovchi hujjat asosida  JShShIR ma’lumotlarini abonent kartochkasiga kiritadi. \n" +
                "\n" +
                "Abonent shartnoma bekor qilingandan keyin raqamdan foydalanish istagini bildirganda, raqamni tiklash «Raqamni tiklash» xizmatining shartlariga muvofiq amalga oshiriladi.\n" +
                "\n" +
                "Bunda abonent JShShIR taqdim qilishi kerak.           \n" +
                "\n" +
                "JShShIR bo‘lmagan xorijiy fuqarolarga xizmat ko‘rsatish davrida, rouming xizmatlaridan foydalanish imkoniyati mavjud emas.   \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Moldova, Rossiya, Ukraina.\n" +
                "\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrland, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kaymanov orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "\n" +
                "\n" +
                "Xalqaro aloqa uchun tariflar."))
        list.add(Tarif("Mobi 40","*111*121#","40000/1 000 so`m oylik kunlik obenent to`lovi 500","3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 20 000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent  faol holatda,abonent to'lovini har oylik yechishda va balansni  20 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                " 4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan.  15-yanvar soat 12:00 da balansni 20000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi. Oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi.  \n" +
                "«Mobi 20» TR JShShIR bo‘lmagan xorijiy fuqarolarga ulash imkoniyati mavjud. JShShIR bo‘lmagan xorijiy fuqaroning SIM-kartasi faollashtirilgan paytdan boshlab 90 kun davomida faol bo‘ladi.\n" +
                "\n" +
                "SIM-kartaning amal qilish muddatini uzaytirish uchun abonent 90 kun o‘tgunga qadar JShShIR (jismoniy shaxsning shaxsiy identifikatsion raqami) taqdim qilishi kerak.  \n" +
                "\n" +
                "Abonent tomonidan JShShIR taqdim qilingandan keyin, xodim ariza, shaxsni tasdiqlovchi hujjat asosida  JShShIR ma’lumotlarini abonent kartochkasiga kiritadi. \n" +
                "\n" +
                "Abonent shartnoma bekor qilingandan keyin raqamdan foydalanish istagini bildirganda, raqamni tiklash «Raqamni tiklash» xizmatining shartlariga muvofiq amalga oshiriladi.\n" +
                "\n" +
                "Bunda abonent JShShIR taqdim qilishi kerak.           \n" +
                "\n" +
                "JShShIR bo‘lmagan xorijiy fuqarolarga xizmat ko‘rsatish davrida, rouming xizmatlaridan foydalanish imkoniyati mavjud emas.   \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Moldova, Rossiya, Ukraina.\n" +
                "\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrland, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kaymanov orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "\n" +
                "\n" +
                "Xalqaro aloqa uchun tariflar."))
        list.add(Tarif("Mobi 50","*111*122#","50000/1 000 so`m oylik kunlik obenent to`lovi 500","3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 20 000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent  faol holatda,abonent to'lovini har oylik yechishda va balansni  20 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                " 4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan.  15-yanvar soat 12:00 da balansni 20000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi. Oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi.  \n" +
                "«Mobi 20» TR JShShIR bo‘lmagan xorijiy fuqarolarga ulash imkoniyati mavjud. JShShIR bo‘lmagan xorijiy fuqaroning SIM-kartasi faollashtirilgan paytdan boshlab 90 kun davomida faol bo‘ladi.\n" +
                "\n" +
                "SIM-kartaning amal qilish muddatini uzaytirish uchun abonent 90 kun o‘tgunga qadar JShShIR (jismoniy shaxsning shaxsiy identifikatsion raqami) taqdim qilishi kerak.  \n" +
                "\n" +
                "Abonent tomonidan JShShIR taqdim qilingandan keyin, xodim ariza, shaxsni tasdiqlovchi hujjat asosida  JShShIR ma’lumotlarini abonent kartochkasiga kiritadi. \n" +
                "\n" +
                "Abonent shartnoma bekor qilingandan keyin raqamdan foydalanish istagini bildirganda, raqamni tiklash «Raqamni tiklash» xizmatining shartlariga muvofiq amalga oshiriladi.\n" +
                "\n" +
                "Bunda abonent JShShIR taqdim qilishi kerak.           \n" +
                "\n" +
                "JShShIR bo‘lmagan xorijiy fuqarolarga xizmat ko‘rsatish davrida, rouming xizmatlaridan foydalanish imkoniyati mavjud emas.   \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Moldova, Rossiya, Ukraina.\n" +
                "\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrland, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kaymanov orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "\n" +
                "\n" +
                "Xalqaro aloqa uchun tariflar."))
        list.add(Tarif("Mobi 60","*111*129#","60000/1 000 so`m oylik kunlik obenent to`lovi 500","3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 20 000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent  faol holatda,abonent to'lovini har oylik yechishda va balansni  20 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                " 4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan.  15-yanvar soat 12:00 da balansni 20000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi. Oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi.  \n" +
                "«Mobi 20» TR JShShIR bo‘lmagan xorijiy fuqarolarga ulash imkoniyati mavjud. JShShIR bo‘lmagan xorijiy fuqaroning SIM-kartasi faollashtirilgan paytdan boshlab 90 kun davomida faol bo‘ladi.\n" +
                "\n" +
                "SIM-kartaning amal qilish muddatini uzaytirish uchun abonent 90 kun o‘tgunga qadar JShShIR (jismoniy shaxsning shaxsiy identifikatsion raqami) taqdim qilishi kerak.  \n" +
                "\n" +
                "Abonent tomonidan JShShIR taqdim qilingandan keyin, xodim ariza, shaxsni tasdiqlovchi hujjat asosida  JShShIR ma’lumotlarini abonent kartochkasiga kiritadi. \n" +
                "\n" +
                "Abonent shartnoma bekor qilingandan keyin raqamdan foydalanish istagini bildirganda, raqamni tiklash «Raqamni tiklash» xizmatining shartlariga muvofiq amalga oshiriladi.\n" +
                "\n" +
                "Bunda abonent JShShIR taqdim qilishi kerak.           \n" +
                "\n" +
                "JShShIR bo‘lmagan xorijiy fuqarolarga xizmat ko‘rsatish davrida, rouming xizmatlaridan foydalanish imkoniyati mavjud emas.   \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Moldova, Rossiya, Ukraina.\n" +
                "\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrland, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kaymanov orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "\n" +
                "\n" +
                "Xalqaro aloqa uchun tariflar."))
        list.add(Tarif("Mobi 70","*111*130#","70000/1 000 so`m oylik kunlik obenent to`lovi 500","3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 20 000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent  faol holatda,abonent to'lovini har oylik yechishda va balansni  20 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                " 4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan.  15-yanvar soat 12:00 da balansni 20000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi. Oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi.  \n" +
                "«Mobi 20» TR JShShIR bo‘lmagan xorijiy fuqarolarga ulash imkoniyati mavjud. JShShIR bo‘lmagan xorijiy fuqaroning SIM-kartasi faollashtirilgan paytdan boshlab 90 kun davomida faol bo‘ladi.\n" +
                "\n" +
                "SIM-kartaning amal qilish muddatini uzaytirish uchun abonent 90 kun o‘tgunga qadar JShShIR (jismoniy shaxsning shaxsiy identifikatsion raqami) taqdim qilishi kerak.  \n" +
                "\n" +
                "Abonent tomonidan JShShIR taqdim qilingandan keyin, xodim ariza, shaxsni tasdiqlovchi hujjat asosida  JShShIR ma’lumotlarini abonent kartochkasiga kiritadi. \n" +
                "\n" +
                "Abonent shartnoma bekor qilingandan keyin raqamdan foydalanish istagini bildirganda, raqamni tiklash «Raqamni tiklash» xizmatining shartlariga muvofiq amalga oshiriladi.\n" +
                "\n" +
                "Bunda abonent JShShIR taqdim qilishi kerak.           \n" +
                "\n" +
                "JShShIR bo‘lmagan xorijiy fuqarolarga xizmat ko‘rsatish davrida, rouming xizmatlaridan foydalanish imkoniyati mavjud emas.   \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Moldova, Rossiya, Ukraina.\n" +
                "\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrland, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kaymanov orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "\n" +
                "\n" +
                "Xalqaro aloqa uchun tariflar."))
        list.add(Tarif("Mobi 80","*111*131#","80000/1 000 so`m oylik kunlik obenent to`lovi 500","3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 20 000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent  faol holatda,abonent to'lovini har oylik yechishda va balansni  20 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                " 4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan.  15-yanvar soat 12:00 da balansni 20000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi. Oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi.  \n" +
                "«Mobi 20» TR JShShIR bo‘lmagan xorijiy fuqarolarga ulash imkoniyati mavjud. JShShIR bo‘lmagan xorijiy fuqaroning SIM-kartasi faollashtirilgan paytdan boshlab 90 kun davomida faol bo‘ladi.\n" +
                "\n" +
                "SIM-kartaning amal qilish muddatini uzaytirish uchun abonent 90 kun o‘tgunga qadar JShShIR (jismoniy shaxsning shaxsiy identifikatsion raqami) taqdim qilishi kerak.  \n" +
                "\n" +
                "Abonent tomonidan JShShIR taqdim qilingandan keyin, xodim ariza, shaxsni tasdiqlovchi hujjat asosida  JShShIR ma’lumotlarini abonent kartochkasiga kiritadi. \n" +
                "\n" +
                "Abonent shartnoma bekor qilingandan keyin raqamdan foydalanish istagini bildirganda, raqamni tiklash «Raqamni tiklash» xizmatining shartlariga muvofiq amalga oshiriladi.\n" +
                "\n" +
                "Bunda abonent JShShIR taqdim qilishi kerak.           \n" +
                "\n" +
                "JShShIR bo‘lmagan xorijiy fuqarolarga xizmat ko‘rsatish davrida, rouming xizmatlaridan foydalanish imkoniyati mavjud emas.   \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Moldova, Rossiya, Ukraina.\n" +
                "\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrland, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kaymanov orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "\n" +
                "\n" +
                "Xalqaro aloqa uchun tariflar."))
        list.add(Tarif("Mobi 100","*111*132#","90000/1 000 so`m oylik kunlik obenent to`lovi 500","3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 20 000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent  faol holatda,abonent to'lovini har oylik yechishda va balansni  20 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                " 4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan.  15-yanvar soat 12:00 da balansni 20000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi. Oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi.  \n" +
                "«Mobi 20» TR JShShIR bo‘lmagan xorijiy fuqarolarga ulash imkoniyati mavjud. JShShIR bo‘lmagan xorijiy fuqaroning SIM-kartasi faollashtirilgan paytdan boshlab 90 kun davomida faol bo‘ladi.\n" +
                "\n" +
                "SIM-kartaning amal qilish muddatini uzaytirish uchun abonent 90 kun o‘tgunga qadar JShShIR (jismoniy shaxsning shaxsiy identifikatsion raqami) taqdim qilishi kerak.  \n" +
                "\n" +
                "Abonent tomonidan JShShIR taqdim qilingandan keyin, xodim ariza, shaxsni tasdiqlovchi hujjat asosida  JShShIR ma’lumotlarini abonent kartochkasiga kiritadi. \n" +
                "\n" +
                "Abonent shartnoma bekor qilingandan keyin raqamdan foydalanish istagini bildirganda, raqamni tiklash «Raqamni tiklash» xizmatining shartlariga muvofiq amalga oshiriladi.\n" +
                "\n" +
                "Bunda abonent JShShIR taqdim qilishi kerak.           \n" +
                "\n" +
                "JShShIR bo‘lmagan xorijiy fuqarolarga xizmat ko‘rsatish davrida, rouming xizmatlaridan foydalanish imkoniyati mavjud emas.   \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Moldova, Rossiya, Ukraina.\n" +
                "\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrland, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kaymanov orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "\n" +
                "\n" +
                "Xalqaro aloqa uchun tariflar."))
        list.add(Tarif("Mobi 120","*111*133#","100000/1 000 so`m oylik kunlik obenent to`lovi 500","3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 20 000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent  faol holatda,abonent to'lovini har oylik yechishda va balansni  20 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                " 4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan.  15-yanvar soat 12:00 da balansni 20000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi. Oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi.  \n" +
                "«Mobi 20» TR JShShIR bo‘lmagan xorijiy fuqarolarga ulash imkoniyati mavjud. JShShIR bo‘lmagan xorijiy fuqaroning SIM-kartasi faollashtirilgan paytdan boshlab 90 kun davomida faol bo‘ladi.\n" +
                "\n" +
                "SIM-kartaning amal qilish muddatini uzaytirish uchun abonent 90 kun o‘tgunga qadar JShShIR (jismoniy shaxsning shaxsiy identifikatsion raqami) taqdim qilishi kerak.  \n" +
                "\n" +
                "Abonent tomonidan JShShIR taqdim qilingandan keyin, xodim ariza, shaxsni tasdiqlovchi hujjat asosida  JShShIR ma’lumotlarini abonent kartochkasiga kiritadi. \n" +
                "\n" +
                "Abonent shartnoma bekor qilingandan keyin raqamdan foydalanish istagini bildirganda, raqamni tiklash «Raqamni tiklash» xizmatining shartlariga muvofiq amalga oshiriladi.\n" +
                "\n" +
                "Bunda abonent JShShIR taqdim qilishi kerak.           \n" +
                "\n" +
                "JShShIR bo‘lmagan xorijiy fuqarolarga xizmat ko‘rsatish davrida, rouming xizmatlaridan foydalanish imkoniyati mavjud emas.   \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Moldova, Rossiya, Ukraina.\n" +
                "\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrland, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kaymanov orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "\n" +
                "\n" +
                "Xalqaro aloqa uchun tariflar."))
        list.add(Tarif("Mobi 140","*111*134#","120000/1 000 so`m oylik kunlik obenent to`lovi 500","3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 20 000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent  faol holatda,abonent to'lovini har oylik yechishda va balansni  20 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                " 4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan.  15-yanvar soat 12:00 da balansni 20000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi. Oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi.  \n" +
                "«Mobi 20» TR JShShIR bo‘lmagan xorijiy fuqarolarga ulash imkoniyati mavjud. JShShIR bo‘lmagan xorijiy fuqaroning SIM-kartasi faollashtirilgan paytdan boshlab 90 kun davomida faol bo‘ladi.\n" +
                "\n" +
                "SIM-kartaning amal qilish muddatini uzaytirish uchun abonent 90 kun o‘tgunga qadar JShShIR (jismoniy shaxsning shaxsiy identifikatsion raqami) taqdim qilishi kerak.  \n" +
                "\n" +
                "Abonent tomonidan JShShIR taqdim qilingandan keyin, xodim ariza, shaxsni tasdiqlovchi hujjat asosida  JShShIR ma’lumotlarini abonent kartochkasiga kiritadi. \n" +
                "\n" +
                "Abonent shartnoma bekor qilingandan keyin raqamdan foydalanish istagini bildirganda, raqamni tiklash «Raqamni tiklash» xizmatining shartlariga muvofiq amalga oshiriladi.\n" +
                "\n" +
                "Bunda abonent JShShIR taqdim qilishi kerak.           \n" +
                "\n" +
                "JShShIR bo‘lmagan xorijiy fuqarolarga xizmat ko‘rsatish davrida, rouming xizmatlaridan foydalanish imkoniyati mavjud emas.   \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Moldova, Rossiya, Ukraina.\n" +
                "\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrland, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kaymanov orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "\n" +
                "\n" +
                "Xalqaro aloqa uchun tariflar."))
        list.add(Tarif("Mobi 150","*111*135#","130000/1 000 so`m oylik kunlik obenent to`lovi 500","3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 20 000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent  faol holatda,abonent to'lovini har oylik yechishda va balansni  20 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                " 4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan.  15-yanvar soat 12:00 da balansni 20000 so‘mga to‘ldiradi. Balans jami 25 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi. Oylik 2000 daqiqa, 2 000 MB, 2000 SMS to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi.  \n" +
                "«Mobi 20» TR JShShIR bo‘lmagan xorijiy fuqarolarga ulash imkoniyati mavjud. JShShIR bo‘lmagan xorijiy fuqaroning SIM-kartasi faollashtirilgan paytdan boshlab 90 kun davomida faol bo‘ladi.\n" +
                "\n" +
                "SIM-kartaning amal qilish muddatini uzaytirish uchun abonent 90 kun o‘tgunga qadar JShShIR (jismoniy shaxsning shaxsiy identifikatsion raqami) taqdim qilishi kerak.  \n" +
                "\n" +
                "Abonent tomonidan JShShIR taqdim qilingandan keyin, xodim ariza, shaxsni tasdiqlovchi hujjat asosida  JShShIR ma’lumotlarini abonent kartochkasiga kiritadi. \n" +
                "\n" +
                "Abonent shartnoma bekor qilingandan keyin raqamdan foydalanish istagini bildirganda, raqamni tiklash «Raqamni tiklash» xizmatining shartlariga muvofiq amalga oshiriladi.\n" +
                "\n" +
                "Bunda abonent JShShIR taqdim qilishi kerak.           \n" +
                "\n" +
                "JShShIR bo‘lmagan xorijiy fuqarolarga xizmat ko‘rsatish davrida, rouming xizmatlaridan foydalanish imkoniyati mavjud emas.   \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Moldova, Rossiya, Ukraina.\n" +
                "\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrland, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kaymanov orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "\n" +
                "\n" +
                "Xalqaro aloqa uchun tariflar."))
        return list
    }
}