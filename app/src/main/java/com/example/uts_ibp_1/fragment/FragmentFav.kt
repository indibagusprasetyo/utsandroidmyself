package com.example.uts_ibp_1.fragment

//Nama        : Indi Bagus Prasetyo ;
//NIM         : 10121902 ;
//Kelas       : IF9K ;
//Mata Kuliah : Pemrograman Android ;
//Dosen       : Rizki Adam Kurniawan, M.Kom. ;
//Final       : Selasa, 11 Juni 2024 ;

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_ibp_1.R
import com.example.uts_ibp_1.adapter.Music
import com.example.uts_ibp_1.adapter.MusicAdapter
import android.widget.VideoView

class FragmentFav : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fav, container, false)

        val recyclerViewMusic = view.findViewById<RecyclerView>(R.id.recyclerViewMusic)

        recyclerViewMusic.layoutManager = LinearLayoutManager(requireContext())

        val musicList = listOf(
            Music("Sabilulungan", R.drawable.ic_fav),
            Music("Mohamad Alsekh", R.drawable.ic_fav),
            Music("Elektronomia - Energy", R.drawable.ic_fav),
            Music("A Sky Full Of Stars - Coldplay", R.drawable.ic_fav),
            Music("Right Now - Akon", R.drawable.ic_fav),
            Music("Alone - Alan Walker", R.drawable.ic_fav),
            Music("Levels - Avicii", R.drawable.ic_fav),
            Music("Bis Kota - Franky & Jane", R.drawable.ic_fav),
            Music("Bukan Puisi - Black Finit", R.drawable.ic_fav),
        )

        val musicAdapter = MusicAdapter(musicList)
        recyclerViewMusic.adapter = musicAdapter

        val videoView = view.findViewById<VideoView>(R.id.videoView)

        val mediaController = MediaController(requireContext())
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        val videoUri = Uri.parse("android.resource://" + requireContext().packageName + "/" + R.raw.sample_video)
        videoView.setVideoURI(videoUri)

        videoView.start()

        return view
    }
}
