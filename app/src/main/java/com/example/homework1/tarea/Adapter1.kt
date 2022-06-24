package com.example.homework1.tarea
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.homework1.R
import com.example.homework1.SsangActivity1
import kotlinx.android.synthetic.main.food_recycle.view.*

class  Data1(val f_img:Int, val f_txt:String, val f_script:String)

class AdapterViewHolder1(v : View) : RecyclerView.ViewHolder(v){
    val F_img = v.food_img
    val F_txt = v.f_txt
    val F_script = v.food_script
}

class Adapter1(val DataList1: ArrayList<Data1>) : RecyclerView.Adapter<AdapterViewHolder1>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder1 {
        val cellForRow =
            LayoutInflater.from(parent.context).inflate(R.layout.food_recycle, parent, false)
        return AdapterViewHolder1(cellForRow)
    }

    override fun onBindViewHolder(holder: AdapterViewHolder1, position: Int) {
        val furData = DataList1[position]
        holder.F_img.setImageResource(furData.f_img)
        holder.F_txt.text = furData.f_txt
        holder.F_script.text = furData.f_script

            holder.itemView.setOnClickListener {
            val ssang_i1 = Intent(holder.itemView.context, SsangActivity1::class.java)
            ssang_i1.putExtra("fimg", furData.f_img)
            ssang_i1.putExtra("fScript", furData.f_script)

            ContextCompat.startActivity(holder.itemView.context,ssang_i1,null)

        }

    }

    override fun getItemCount() = DataList1.size
}