package com.example.uts_ibp_1.fragment

//Nama        : Indi Bagus Prasetyo ;
//NIM         : 10121902 ;
//Kelas       : IF9K ;
//Mata Kuliah : Pemrograman Android ;
//Dosen       : Rizki Adam Kurniawan, M.Kom. ;
//Final       : Selasa, 11 Juni 2024 ;

import android.app.AlertDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.uts_ibp_1.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class FragmentProfile : Fragment(), OnMapReadyCallback {

    private lateinit var googleMap: GoogleMap
    private lateinit var mapView: MapView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val buttonFacebook = view.findViewById<Button>(R.id.buttonFacebook)
        val buttonInstagram = view.findViewById<Button>(R.id.buttonInstagram)
        val buttonTwitter = view.findViewById<Button>(R.id.buttonTwitter)
        val buttonLinkedIn = view.findViewById<Button>(R.id.buttonLinkedIn)
        val buttonPhone = view.findViewById<Button>(R.id.buttonPhone)
        val buttonEmail = view.findViewById<Button>(R.id.buttonEmail)
        val buttonAboutDialog = view.findViewById<Button>(R.id.buttonAboutDialog)

        buttonFacebook.setOnClickListener {
            openSocialMedia("https://www.facebook.com/indy.bagusprasetyo/")
        }

        buttonInstagram.setOnClickListener {
            openSocialMedia("https://instagram.com/in7.xyz")
        }

        buttonTwitter.setOnClickListener {
            openSocialMedia("https://x.com/GusliemP?t=fBh6-uFp-hIOJJ3gL0VBpQ&s=09")
        }

        buttonLinkedIn.setOnClickListener {
            openSocialMedia("https://www.linkedin.com/in/indibagusprasetyo12/")
        }

        buttonPhone.setOnClickListener {
            callPhoneNumber("0895620062432")
        }

        buttonEmail.setOnClickListener {
            sendEmail("indi.10121902@mahasiswa.unikom.ac.id")
        }

        buttonAboutDialog.setOnClickListener {
            showAboutDialog()
        }

        mapView = view.findViewById(R.id.mapView)
        mapView.onCreate(savedInstanceState)
        mapView.onResume()
        mapView.getMapAsync(this)

        return view
    }

    override fun onMapReady(map: GoogleMap) {
        googleMap = map
        val myLocation = LatLng(-7.042145231812669, 107.7685062952067) // Ganti dengan koordinat tempat tinggal Anda
        googleMap.addMarker(MarkerOptions().position(myLocation).title("My Location"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myLocation, 15f))
    }

    private fun openSocialMedia(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    private fun callPhoneNumber(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
        startActivity(intent)
    }

    private fun sendEmail(email: String) {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:$email")
        }
        startActivity(intent)
    }

    private fun showAboutDialog() {
        val dialog = AlertDialog.Builder(requireContext())
            .setTitle("Tentang")
            .setMessage("Author By : Indi Bagus Prasetyo (10121902) Version 1.0.0")
            .setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            .create()

        dialog.show()
    }

}
