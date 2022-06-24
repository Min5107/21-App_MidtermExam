package com.example.homework1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework1.tarea.Data
import kotlinx.android.synthetic.main.activity_tarea.*
import kotlinx.android.synthetic.main.tarea_recycle.*


class TareaActivity: AppCompatActivity() {

    val DataList = arrayListOf(
        Data(R.drawable.t_img1, "오사카", "일본 오사카부"," 인구수 : 900만명 \n 시장 : 마쓰이 이치로 \n 추천 장소 : 도톤보리 \n 추천 음식 : 타코야키 \n 관광객(연) : 886만명 "),
        Data(R.drawable.t_img2, "고베", "일본 효고현","인구수 : 153만명 \n 시장 : 히사모토 키조 \n 추천 장소 : 고베 포트타워 \n 추천 음식 : 고베규 \n 관광객(연) : 2240만명"),
        Data(R.drawable.t_img3, "도쿄", "일본 도쿄도","인구수 : 1396만명 \n 시장 : 고이케 유리코 \n 추천 장소 : 도쿄타워 \n 추천 음식 : 에도마에 초밥 \n 관광객(연) : 2394만명"),
        Data(R.drawable.t_img4, "후쿠오카", "일본 후쿠오카현","인구수 : 153만명 \n 시장 : 타카시마 소이치로 \n 추천 장소 : 기린 맥주 후쿠오카 \n 추천 음식 : 히카타 라멘 \n 관광객(연) : 2298만명"),
        Data(R.drawable.t_img5, "교토", "일본 교토시","인구수 : 153만명 \n 시장 : 카도카와 다이사쿠 \n 추천 장소 : 교토 타워 \n 추천 음식 : 카이세키 \n 관광객(연) : 5564만명"),
        Data(R.drawable.t_img6, "나라", "일본 나라현","나: 153만명 \n 시장 : 나카가와 모토노부 \n 추천 장소 : 사슴공원 \n 추천 음식 : 나라즈케 \n 관광객(연) : 1300만명"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tarea)

        t_recycler.layoutManager = LinearLayoutManager(this)
        t_recycler.adapter = com.example.homework1.tarea.Adapter(DataList)




    }

}