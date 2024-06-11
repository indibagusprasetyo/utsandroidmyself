package com.example.uts_ibp_1.fragment

//Nama        : Indi Bagus Prasetyo ;
//NIM         : 10121902 ;
//Kelas       : IF9K ;
//Mata Kuliah : Pemrograman Android ;
//Dosen       : Rizki Adam Kurniawan, M.Kom. ;
//Final       : Selasa, 11 Juni 2024 ;

import ActivityAdapter
import FriendAdapter
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_ibp_1.R

class FragmentActivity : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_activity, container, false)

        val recyclerViewActivity = view.findViewById<RecyclerView>(R.id.recyclerViewActivity)
        val recyclerViewFriend = view.findViewById<RecyclerView>(R.id.recyclerViewFriend)

        recyclerViewActivity.layoutManager = LinearLayoutManager(requireContext())
        recyclerViewFriend.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        val activityDataList = listOf(
            Pair("Bangun Tidur", R.drawable.ic_wakeup),
            Pair("Ibadah", R.drawable.ic_prayer),
            Pair("Gosok Gigi", R.drawable.ic_brushteeth),
            Pair("Mandi", R.drawable.ic_shower),
            Pair("Sarapan", R.drawable.ic_breakfast),
            Pair("Bekerja", R.drawable.ic_work),
            Pair("Istirahat", R.drawable.ic_rest),
            Pair("WorkOut", R.drawable.ic_workout),
            Pair("QualityTime", R.drawable.ic_qt),
            Pair("Makan", R.drawable.ic_eat),
            Pair("Belajar", R.drawable.ic_study),
            Pair("Kuliah", R.drawable.ic_college)
        )

        val friendsDataList = listOf(
            Pair("Difa", R.drawable.ic_teman_difa),
            Pair("Fajar", R.drawable.ic_teman_fajar),
            Pair("Joy", R.drawable.ic_teman_joy)
        )

        val activityAdapter = ActivityAdapter(activityDataList)
        recyclerViewActivity.adapter = activityAdapter

        val friendAdapter = FriendAdapter(friendsDataList)
        recyclerViewFriend.adapter = friendAdapter

        return view
    }
}
