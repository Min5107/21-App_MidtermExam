package com.example.homework1.tarea
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework1.R
import kotlinx.android.synthetic.main.enjoy_recycle.view.*

class  Data2(val e_img:Int, val e_txt:String, val e_script:String)

class AdapterViewHolder2(v : View) : RecyclerView.ViewHolder(v){
    val E_img = v.e_img
    val E_txt = v.e_txt
    val E_script = v.e_script
}

class Adapter2(val DataList2: ArrayList<Data2>) : RecyclerView.Adapter<AdapterViewHolder2>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder2 {
        val cellForRow =
            LayoutInflater.from(parent.context).inflate(R.layout.enjoy_recycle, parent, false)
        return AdapterViewHolder2(cellForRow)
    }

    override fun onBindViewHolder(holder: AdapterViewHolder2, position: Int) {
        val eurData = DataList2[position]
        holder.E_img.setImageResource(eurData.e_img)
        holder.E_txt.text = eurData.e_txt
        holder.E_script.text = eurData.e_script

        /* holder.itemView.setOnClickListener {
            val ssang_i1 = Intent(holder.itemView.context, SsangActivity1::class.java)
            ssang_i1.putExtra("fimg", furData.f_img)
            ssang_i1.putExtra("fScript", furData.f_script)

            ContextCompat.startActivity(holder.itemView.context,ssang_i1,null)

        } */

    }

    override fun getItemCount() = DataList2.size
}
