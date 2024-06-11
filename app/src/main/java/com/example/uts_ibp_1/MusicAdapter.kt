package com.example.uts_ibp_1.adapter

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

data class Music(val title: String, val albumArt: Int)

class MusicAdapter(private val musicList: List<Music>) :
    RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    class MusicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val musicTitle: TextView = itemView.findViewById(R.id.textViewMusicTitle)
        val albumArt: ImageView = itemView.findViewById(R.id.imageViewAlbumArt)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_music, parent, false)
        return MusicViewHolder(view)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        val music = musicList[position]
        holder.musicTitle.text = music.title
        holder.albumArt.setImageResource(music.albumArt)
    }

    override fun getItemCount(): Int {
        return musicList.size
    }
}
