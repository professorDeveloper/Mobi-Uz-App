package com.azmovhudstc.mobiuzapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.azmovhudstc.mobiuzapp.adapter.MinutesAdapter
import com.azmovhudstc.mobiuzapp.model.Minut
import kotlinx.android.synthetic.main.fragment_minutes.view.*

class MinutesFragment : Fragment() {

    lateinit var minutesAdapter: MinutesAdapter
    lateinit var arrayList: ArrayList<Minut>
    lateinit var root: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_minutes, container, false)
        loadData()
        minutesAdapter = MinutesAdapter(loadData(), parentFragment)
        root.minutes_rv.layoutManager=LinearLayoutManager(context)
        root.minutes_rv.adapter=minutesAdapter
        return root
    }

    private fun loadData(): java.util.ArrayList<Minut> {
        arrayList = ArrayList()
        arrayList.add(
            Minut(
                "<< 60 daqiqa >>",
                "*103*60#",
                "To`plamga kiritilgan daqiqa 60 daqiqa",
                "To`plamga kiritilgan daqiqa 120 daqiqa\n\\n\n" +
                        "Xarid qiling\n\nan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati ohirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\n" +
                        "\n" +
                        "To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Tarif rejasi o'zgartirilganda daqiqalar to'plami saqlanib qoladi;\n" +
                        "\n" +
                        "To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha qo'ng'iroqlar uchun mo'ljallangan;\n" +
                        "\n" +
                        "Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \"UMS\" MChJ tarmog'ida bo'lgandagina amal qiladi;\n" +
                        "\n" +
                        "Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilngan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Daqiqalarning sarflanish tartibi:"
            )
        )
        arrayList.add(
            Minut(
                "<< 120 daqiqa >>",
                "*103*120#",
                "To`plamga kiritilgan daqiqa 120 daqiqa",
                "To`plamga kiritilgan daqiqa 120 daqiqa\n\\n\\n" +
                        "Mobiuz yangi Mobi 60 tarif rejasini ishga tushirdi!\n" +
                        "\n" +
                        "U oyiga:\n" +
                        "\uD83D\uDC4915 000 MB;\n" +
                        "\uD83D\uDC49tarmoq ichida cheksiz qo‘ng‘iroqlar;\n" +
                        "\uD83D\uDC49O‘zbekiston bo‘yicha 5 000 daqiqa;\n" +
                        "\uD83D\uDC493 500 ta SMS-xabarni o‘z ichiga olgan. Abonent to‘lovi – 60 ming so‘m.\n" +
                        "\n" +
                        "Tarif oyning 1-kuniga bog'liq emas. To‘plamlar va oylik abonent to'lovi ulanish/o'tish kunidayoq belgilanadi.\n" +
                        "\n" +
                        "Mobi 60 – bu Mobi tariflar turkumidagi o'ninchi mahsulotdir, unga Mobi 20, 25, 30+, 40, 50, 70, 90, 110 va 150 ham kiradi.\n" +
                        "\n" +
                        "Yangi tarif rejasi haqida batafsil: https://mobi.uz/uz/tariff/liketalk/71276/.\n" +
                        "\n" +
                        "#mobiuz #tarif\n" +
                        "***"
            )
        )
        arrayList.add(
            Minut(
                "<< 180 daqiqa >>" ,
                "*103*180#",
                "To`plamga kiritilgan daqiqa 180 daqiqa",
                "To`plamga kiritilgan daqiqa 180 daqiqa\n\n\n" + "Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljalangan tarif rejalarida faollashtirish imkoniyati bor;\n" +
                        "To'lpamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                        "\n" +
                        "To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\n" +
                        "\n" +
                        "To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\n" +
                        "\n" +
                        "To'plam faollashgani haqida SMS-xabarnoma keladi;"
            )
        )
        arrayList.add(
            Minut(
                "<< 300 daqiqa >>",
                "*103*300#",
                "To`plamga kiritilgan daqiqa 300 daqiqa",
                "To`plamga kiritilgan daqiqa 300 daqiqa\n\\n\nn" + "Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati ohirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\n" +
                        "\n" +
                        "To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Tarif rejasi o'zgartirilganda daqiqalar to'plami saqlanib qoladi;\n" +
                        "\n" +
                        "To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha qo'ng'iroqlar uchun mo'ljallangan;\n" +
                        "\n" +
                        "Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \"UMS\" MChJ tarmog'ida bo'lgandagina amal qiladi;\n" +
                        "\n" +
                        "Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilngan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Daqiqalarning sarflanish tartibi:"
            )
        )
        arrayList.add(
            Minut(
                "<< 900 daqiqa >>" ,
                "*103*900#",
                "To`plamga kiritilgan daqiqa 900 daqiqa",
                "To`plamga kiritilgan daqiqa 900 daqiqa\n\\n\nn" +
                        "“Gap ko‘p” xizmati (faqat tarmoq ichidagi qo‘ng‘iroqlarga)>7 kunlik Multi-to‘plam trafigi>Hisob to‘ldirilganlik uchun bonus>15 kunlik Multi-to‘plam trafigi>Tarif rejasi bo‘yicha trafik>Xarid qilingan daqiqalar to‘plami bo‘yicha trafik.\n" +
                        "\n" +
                        "«Maxi New», «Ultra», «Maxi Year», «Ultra Year», “Premial”, “Premial Yillik”, “Ideal”, “Ideal Yillik” tarif rejalarida abonent to‘loviga kiritilgan daqiqalar yakunlangandan keyin tarmoq ichidagi qo‘ng‘iroqlar “Daqiqalar to‘plami”dan sarflanmaydi.\n" +
                        "\n" +
                        "Narxlar barcha soliqlarni inobarga olgan ko'rsatilgan"
            )
        )
        arrayList.add(
            Minut(
                "<< 1000 daqiqa >>",
                "*103*1000#",
                "To`plamga kiritilgan daqiqa 1000 daqiqa",
                "To`plamga kiritilgan daqiqa 1000 daqiqa\n\n\n" + "o'plam narxi to'plam faollashtirilganda yechib qolinadi.\n" +
                        "\n" +
                        "To'plam amal qilish muddati – faollashtirilgan kundan boshlab 30 kalendar kuni.\n" +
                        "\n" +
                        "Faollashtirilgan to´plamda daqiqalar qoldig´ini bilish:\n" +
                        "\n" +
                        "USSD-buyruq: *103#\n" +
                        "\n" +
                        "SMS-yordamchi: 616020 raqamiga 3."
            )
        )
        arrayList.add(
            Minut(
                "<< 1200 daqiqa >>",
                "*103*1200#",
                "To`plamga kiritilgan daqiqa 1200 daqiqa",
                "To`plamga kiritilgan daqiqa 1200 daqiqa\n\n\n" +
                        "Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljalangan tarif rejalarida faollashtirish imkoniyati bor;\n" +
                        "To'lpamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                        "\n" +
                        "To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\n" +
                        "\n" +
                        "To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\n" +
                        "\n" +
                        "To'plam faollashgani haqida SMS-xabarnoma keladi;\n" +
                        "\n" +
                        "Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati ohirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\n" +
                        "\n" +
                        "To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Tarif rejasi o'zgartirilganda daqiqalar to'plami saqlanib qoladi;\n" +
                        "\n" +
                        "To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha qo'ng'iroqlar uchun mo'ljallangan;\n" +
                        "\n" +
                        "Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \"UMS\" MChJ tarmog'ida bo'lgandagina amal qiladi;\n" +
                        "\n" +
                        "Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilngan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Daqiqalarning sarflanish tartibi:"
            )
        )
        arrayList.add(
            Minut(
                "<< 1500 daqiqa >>",
                "*103*1500#",
                "To`plamga kiritilgan daqiqa 1500 daqiqa",
                "To`plamga kiritilgan daqiqa 1500 daqiqa\n\n\n" +
                        "Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljalangan tarif rejalarida faollashtirish imkoniyati bor;\n" +
                        "To'lpamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                        "\n" +
                        "To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\n" +
                        "\n" +
                        "To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\n" +
                        "\n" +
                        "To'plam faollashgani haqida SMS-xabarnoma keladi;\n" +
                        "\n" +
                        "Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati ohirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\n" +
                        "\n" +
                        "To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Tarif rejasi o'zgartirilganda daqiqalar to'plami saqlanib qoladi;\n" +
                        "\n" +
                        "To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha qo'ng'iroqlar uchun mo'ljallangan;\n" +
                        "\n" +
                        "Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \"UMS\" MChJ tarmog'ida bo'lgandagina amal qiladi;\n" +
                        "\n" +
                        "Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilngan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Daqiqalarning sarflanish tartibi:"
            )
        )
        arrayList.add(
            Minut(
                "<< 1700 daqiqa >>",
                "*103*1700#",
                "To`plamga kiritilgan daqiqa 1700 daqiqa",
                "To`plamga kiritilgan daqiqa 1700 daqiqa\n\n\n" +
                        "Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljalangan tarif rejalarida faollashtirish imkoniyati bor;\n" +
                        "To'lpamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                        "\n" +
                        "To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\n" +
                        "\n" +
                        "To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\n" +
                        "\n" +
                        "To'plam faollashgani haqida SMS-xabarnoma keladi;\n" +
                        "\n" +
                        "Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati ohirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\n" +
                        "\n" +
                        "To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Tarif rejasi o'zgartirilganda daqiqalar to'plami saqlanib qoladi;\n" +
                        "\n" +
                        "To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha qo'ng'iroqlar uchun mo'ljallangan;\n" +
                        "\n" +
                        "Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \"UMS\" MChJ tarmog'ida bo'lgandagina amal qiladi;\n" +
                        "\n" +
                        "Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilngan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Daqiqalarning sarflanish tartibi:"
            )
        )
        arrayList.add(
            Minut(
                "<< 2000 daqiqa >>",
                "*103*2000#",
                "To`plamga kiritilgan daqiqa 2000 daqiqa",
                "To`plamga kiritilgan daqiqa 2000 daqiqa\n\n\n"
                        + "Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljalangan tarif rejalarida faollashtirish imkoniyati bor;\n" +
                        "To'lpamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                        "\n" +
                        "To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\n" +
                        "\n" +
                        "To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\n" +
                        "\n" +
                        "To'plam faollashgani haqida SMS-xabarnoma keladi;\n" +
                        "\n" +
                        "Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati ohirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\n" +
                        "\n" +
                        "To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Tarif rejasi o'zgartirilganda daqiqalar to'plami saqlanib qoladi;\n" +
                        "\n" +
                        "To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha qo'ng'iroqlar uchun mo'ljallangan;\n" +
                        "\n" +
                        "Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \"UMS\" MChJ tarmog'ida bo'lgandagina amal qiladi;\n" +
                        "\n" +
                        "Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilngan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Daqiqalarning sarflanish tartibi:"
            )
        )
        arrayList.add(
            Minut(
                "<< 2200 daqiqa >>",
                "*103*2200#",
                "To`plamga kiritilgan daqiqa 2200 daqiqa",
                "To`plamga kiritilgan daqiqa 2200 daqiqa\n\n\n" + "Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljalangan tarif rejalarida faollashtirish imkoniyati bor;\n" +
                        "To'lpamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                        "\n" +
                        "To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\n" +
                        "\n" +
                        "To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\n" +
                        "\n" +
                        "To'plam faollashgani haqida SMS-xabarnoma keladi;\n" +
                        "\n" +
                        "Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati ohirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\n" +
                        "\n" +
                        "To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Tarif rejasi o'zgartirilganda daqiqalar to'plami saqlanib qoladi;\n" +
                        "\n" +
                        "To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha qo'ng'iroqlar uchun mo'ljallangan;\n" +
                        "\n" +
                        "Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \"UMS\" MChJ tarmog'ida bo'lgandagina amal qiladi;\n" +
                        "\n" +
                        "Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilngan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Daqiqalarning sarflanish tartibi:"
            )
        )
        arrayList.add(
            Minut(
                "<< 2500 daqiqa >>",
                "*103*2500#",
                "To`plamga kiritilgan daqiqa 2500 daqiqa",
                "To`plamga kiritilgan daqiqa 2500 daqiqa\n\n\n" +
                        "Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljalangan tarif rejalarida faollashtirish imkoniyati bor;\n" +
                        "To'lpamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                        "\n" +
                        "To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\n" +
                        "\n" +
                        "To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\n" +
                        "\n" +
                        "To'plam faollashgani haqida SMS-xabarnoma keladi;\n" +
                        "\n" +
                        "Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati ohirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\n" +
                        "\n" +
                        "To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Tarif rejasi o'zgartirilganda daqiqalar to'plami saqlanib qoladi;\n" +
                        "\n" +
                        "To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha qo'ng'iroqlar uchun mo'ljallangan;\n" +
                        "\n" +
                        "Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \"UMS\" MChJ tarmog'ida bo'lgandagina amal qiladi;\n" +
                        "\n" +
                        "Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilngan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Daqiqalarning sarflanish tartibi:"
            )
        )
        arrayList.add(
            Minut(
                "<< 2700 daqiqa >>",
                "*103*2700#",
                "To`plamga kiritilgan daqiqa 2700 daqiqa",
                "To`plamga kiritilgan daqiqa 2700 daqiqa\n\n\n" +
                        "Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljalangan tarif rejalarida faollashtirish imkoniyati bor;\n" +
                        "To'lpamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                        "\n" +
                        "To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\n" +
                        "\n" +
                        "To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\n" +
                        "\n" +
                        "To'plam faollashgani haqida SMS-xabarnoma keladi;\n" +
                        "\n" +
                        "Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati ohirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\n" +
                        "\n" +
                        "To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Tarif rejasi o'zgartirilganda daqiqalar to'plami saqlanib qoladi;\n" +
                        "\n" +
                        "To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha qo'ng'iroqlar uchun mo'ljallangan;\n" +
                        "\n" +
                        "Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \"UMS\" MChJ tarmog'ida bo'lgandagina amal qiladi;\n" +
                        "\n" +
                        "Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilngan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Daqiqalarning sarflanish tartibi:"
            )
        )
        arrayList.add(
            Minut(
                "<< 3000 daqiqa >>",
                "*103*3000#",
                "To`plamga kiritilgan daqiqa 3000 daqiqa",
                "To`plamga kiritilgan daqiqa 3000 daqiqa\n\n\n"
                        + "Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljalangan tarif rejalarida faollashtirish imkoniyati bor;\n" +
                        "To'lpamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                        "\n" +
                        "To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\n" +
                        "\n" +
                        "To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\n" +
                        "\n" +
                        "To'plam faollashgani haqida SMS-xabarnoma keladi;\n" +
                        "\n" +
                        "Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati ohirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\n" +
                        "\n" +
                        "To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Tarif rejasi o'zgartirilganda daqiqalar to'plami saqlanib qoladi;\n" +
                        "\n" +
                        "To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha qo'ng'iroqlar uchun mo'ljallangan;\n" +
                        "\n" +
                        "Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \"UMS\" MChJ tarmog'ida bo'lgandagina amal qiladi;\n" +
                        "\n" +
                        "Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilngan tariflar bo'yicha narxlanadi;\n" +
                        "\n" +
                        "Daqiqalarning sarflanish tartibi:"
            )
        )

        return arrayList
    }
}
