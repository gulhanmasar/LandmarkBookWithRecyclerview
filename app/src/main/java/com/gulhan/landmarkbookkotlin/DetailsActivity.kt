package com.gulhan.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gulhan.landmarkbookkotlin.databinding.ActivityDetailBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        // casting

        //intent.getSerializableExtra("landmark")
       // val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark
        val selectedLandmark = MySingleton.chosenLandmark
        selectedLandmark?.let {
            binding.nameText.text = it.name
            binding.countryText.text = it.country
            binding.imageView.setImageResource(it.image)

        }
    }
}