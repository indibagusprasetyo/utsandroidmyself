package com.example.uts_ibp_1

//Nama        : Indi Bagus Prasetyo ;
//NIM         : 10121902 ;
//Kelas       : IF9K ;
//Mata Kuliah : Pemrograman Android ;
//Dosen       : Rizki Adam Kurniawan, M.Kom. ;
//Final       : Selasa, 11 Juni 2024 ;

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.uts_ibp_1.fragment.FragmentActivity
import com.example.uts_ibp_1.fragment.FragmentFav
import com.example.uts_ibp_1.fragment.FragmentGallery
import com.example.uts_ibp_1.fragment.FragmentHome
import com.example.uts_ibp_1.fragment.FragmentProfile
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_nav)
        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.nav_home -> {
                    replaceFragment(FragmentHome())
                    title = "Home"
                }
                R.id.nav_activity -> {
                    replaceFragment(FragmentActivity())
                    title = "Activity"
                }
                R.id.nav_gallery -> {
                    replaceFragment(FragmentGallery())
                    title = "Gallery"
                }
                R.id.nav_fav -> {
                    replaceFragment(FragmentFav())
                    title = "Fav"
                }
                R.id.nav_profile -> {
                    replaceFragment(FragmentProfile())
                    title = "Profile"
                }
            }
            true
        }

        replaceFragment(FragmentHome())
        title = "Home"
        bottomNavigationView.selectedItemId = R.id.nav_home
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentPackage,fragment)
            .commit()
    }
}