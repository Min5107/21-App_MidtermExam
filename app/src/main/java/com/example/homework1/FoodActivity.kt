package com.example.homework1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework1.tarea.Adapter1
import com.example.homework1.tarea.Data1
import kotlinx.android.synthetic.main.activity_food.*

class FoodActivity : AppCompatActivity() {

    val DataList1 = arrayListOf(
        Data1(R.drawable.f_img1,"모츠나베"," 가게명 : 케이슈 \n 메인음식 : 모츠나베 \n 가격 : 1300엔 \n 지역 : 후쿠오카 \n 영업시간 : 17:00 ~ 13:00 \n 휴무일 : 없음 \n 번호 : +81 92-739-8245"),
        Data1(R.drawable.f_img2,"고베규"," 가게명 : 스테이크 랜드 고베관 \n 메인음식 : 고베규 \n 가격 : 1080엔 \n지역 : 고배 \n 영업시간 : 11:00 ~ 22:00 \n 휴무일 : 없음 \n 번호 : +81 78-322-2900"),
        Data1(R.drawable.f_img3,"스시"," 가게명 : 스시지로 \n 메인음식 : 스시 \n 가격 : 16000엔 \n지역 : 긴자 \n 영업시간 : 11:00 ~ 20:30 \n 휴무일 : 일요일 \n 번호 : +81 3-3535-3600"),
        Data1(R.drawable.f_img4,"라멘"," 가게명 : 콘조키호토토기스  \n 메인음식 : 시오소바 \n 가격 : 1200엔 \n지역 : 도쿄 \n 영업시간 : 11:00 ~ 20:00 \n 휴무일 : 없음 \n 번호 : +81 3-5315-4733"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        f_recycler.layoutManager = LinearLayoutManager(this)
        f_recycler.adapter = Adapter1(DataList1)
        }
    }
