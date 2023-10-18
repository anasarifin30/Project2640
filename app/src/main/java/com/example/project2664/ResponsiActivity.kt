package com.example.project2664

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ResponsiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_responsi)

        val location: ImageView = findViewById(R.id.imageViewMaps)
        val rvBuku: RecyclerView = findViewById(R.id.recycleViewBook)

//        Set layout manager di RecycleView
        rvBuku.layoutManager = LinearLayoutManager(this)
//            List data buku
        val data = ArrayList<SpacePerpus>()
        data.add(SpacePerpus(R.drawable.perpus,"Emi's Beach Adventure",
            "Lorem ipsum Dolor sit amet Lorem ipsum dolor sit amet","Lorem ipsum Dolor sit amet Lorem ipsum dolor sit amet"))
        data.add(SpacePerpus(R.drawable.bermain,"Ade's Beach Adventure",
            "Lorem ipsum Dolor sit amet Lorem ipsum dolor sit amet","Lorem ipsum Dolor sit amet Lorem ipsum dolor sit amet"))
        data.add(SpacePerpus(R.drawable.food,"Mermaid Beach Adventure",
            "Lorem ipsum Dolor sit amet Lorem ipsum dolor sit amet","Lorem ipsum Dolor sit amet Lorem ipsum dolor sit amet"))


//        set adapter
        val adapter = AdapterResponsi(data)
//        set adapater ke recycle view
        rvBuku.adapter = adapter

/*       location.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:47.6,-122,3?z=11")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            if (mapIntent.resolveActivity(packageManager) != null) {
                startActivity(mapIntent)
            }
        }*/

        location.setOnClickListener {
            val intent = Intent(
                android.content.Intent.ACTION_VIEW,
                Uri.parse("https://maps.app.goo.gl/ngmvP7rph591zSwQ9")
            );
            startActivity(intent);
        }
    }
}