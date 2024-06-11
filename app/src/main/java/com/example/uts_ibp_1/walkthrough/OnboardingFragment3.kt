//Nama        : Indi Bagus Prasetyo ;
//NIM         : 10121902 ;
//Kelas       : IF9K ;
//Mata Kuliah : Pemrograman Android ;
//Dosen       : Rizki Adam Kurniawan, M.Kom. ;
//Final       : Selasa, 11 Juni 2024 ;

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.uts_ibp_1.MainActivity
import com.example.uts_ibp_1.R


class OnboardingFragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.onboarding_screen3, container, false)

        // Mendapatkan referensi tombol "Get Started" dari layout
        val btnGetStarted = view.findViewById<Button>(R.id.btnGetStarted)

        // Menambahkan listener untuk tombol "Get Started"
        btnGetStarted.setOnClickListener {
            navigateToMainActivity()
        }

        return view
    }

    // Metode untuk menavigasi ke MainActivity
    private fun navigateToMainActivity() {
        val intent = Intent(activity, MainActivity::class.java)
        startActivity(intent)
        activity?.finish()
    }
}
