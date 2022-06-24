package com.example.homework1.tarea
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.homework1.R
import com.example.homework1.SsangActivity
import kotlinx.android.synthetic.main.tarea_recycle.view.*


class  Data(val T_img:Int, val T_name:String, val T_script:String, val T_Sscript:String)


class AdapterViewHolder(v : View) : RecyclerView.ViewHolder(v){
    val T_img = v.t_img
    val T_name = v.t_ntxt
    val T_Script = v.t_script
    val T_Sscript = v.t_sscript

}

class Adapter(val DataList:ArrayList<Data>) : RecyclerView.Adapter<AdapterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {
        val cellForRow =
            LayoutInflater.from(parent.context).inflate(R.layout.tarea_recycle, parent, false)
        return AdapterViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {
        val curData = DataList[position]
        holder.T_img.setImageResource(curData.T_img)
        holder.T_name.text = curData.T_name
        holder.T_Script.text = curData.T_script
        holder.T_Sscript.text = curData.T_Sscript

       holder.itemView.setOnClickListener {
           val ssang_i = Intent(holder.itemView.context, SsangActivity::class.java)
                ssang_i.putExtra("timg", curData.T_img)
                ssang_i.putExtra("tScript", curData.T_script)
                ssang_i.putExtra("tSscript", curData.T_Sscript)

               ContextCompat.startActivity(holder.itemView.context,ssang_i,null)

        }


}


    override fun getItemCount() = DataList.size
}