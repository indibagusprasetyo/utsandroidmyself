package com.example.uts_ibp_1.fragment

//Nama        : Indi Bagus Prasetyo ;
//NIM         : 10121902 ;
//Kelas       : IF9K ;
//Mata Kuliah : Pemrograman Android ;
//Dosen       : Rizki Adam Kurniawan, M.Kom. ;
//Final       : Selasa, 11 Juni 2024 ;

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_ibp_1.R
import com.example.uts_ibp_1.adapter.GalleryAdapter

class FragmentGallery : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_gallery, container, false)

        val recyclerViewGallery = view.findViewById<RecyclerView>(R.id.recyclerViewGallery)

        recyclerViewGallery.layoutManager = GridLayoutManager(requireContext(), 3) // 3 kolom

        val images = listOf(
            R.drawable.ic_gallery1,
            R.drawable.ic_gallery2,
            R.drawable.ic_gallery3,
            R.drawable.ic_gallery4,
            R.drawable.ic_gallery5
        )

        val galleryAdapter = GalleryAdapter(images)
        recyclerViewGallery.adapter = galleryAdapter

        return view
    }
}
