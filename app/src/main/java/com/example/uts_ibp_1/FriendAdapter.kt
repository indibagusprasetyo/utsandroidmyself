//Nama        : Indi Bagus Prasetyo ;
//NIM         : 10121902 ;
//Kelas       : IF9K ;
//Mata Kuliah : Pemrograman Android ;
//Dosen       : Rizki Adam Kurniawan, M.Kom. ;
//Final       : Selasa, 11 Juni 2024 ;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_ibp_1.R

class FriendAdapter(private val dataList: List<Pair<String, Int>>) :
    RecyclerView.Adapter<FriendAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textItem: TextView = itemView.findViewById(R.id.textFriend)
        val imageItem: ImageView = itemView.findViewById(R.id.imageFriend)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_friend, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textItem.text = dataList[position].first
        holder.imageItem.setImageResource(dataList[position].second)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}
