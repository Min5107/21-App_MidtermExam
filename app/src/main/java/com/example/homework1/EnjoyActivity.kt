package com.example.homework1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework1.tarea.Adapter2
import com.example.homework1.tarea.Data2
import kotlinx.android.synthetic.main.activity_enjoy.*

class EnjoyActivity : AppCompatActivity() {

    val DataList2 = arrayListOf(
        Data2(R.drawable.e_img1,"유니버셜 스튜디오(오사카)","일본 최대 테마 놀이공원"),
        Data2(R.drawable.e_img2,"도쿄 타워(도쿄)","일본 수도에 있는 랜드마크 타워"),
        Data2(R.drawable.e_img3,"나라 사슴공원(나라)","일본에서 사슴과 놀 수 있는 최대 공원"),
        Data2(R.drawable.e_img4,"아리마 온천(고베)","일본 3대 유명 온천"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enjoy)

        e_recycler.layoutManager = LinearLayoutManager(this)
        e_recycler.adapter = Adapter2(DataList2)
    }
}

