package com.example.project2664

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class BookKidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_kid)

//    instance
    val btnFairy:Button = findViewById(R.id.buttonFairy)
    val btnFable:Button = findViewById(R.id.buttonFable)
    val btnScience:Button = findViewById(R.id.buttonScience)


//        event saat button Fairy diklik
        btnFairy.setOnClickListener {
            replaceFragment(FairyFragment())
        }
//        event saat button Fable diklik
        btnFable.setOnClickListener {
            replaceFragment(FableFragment())
        }
//        event saat button Science diklik
        btnScience.setOnClickListener {
            replaceFragment(ScienceFragment())
        }
    }

    private fun replaceFragment(frg: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook,frg)
        fragmentTrx.commit()
    }
}