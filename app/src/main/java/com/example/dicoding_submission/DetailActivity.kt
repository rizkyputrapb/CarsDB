package com.example.dicoding_submission

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.dicoding_submission.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    private var cars: Cars? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@DetailActivity, R.layout.activity_detail)
        setSupportActionBar(binding.detailAppBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        cars = intent.getSerializableExtra("cars") as? Cars
        binding.cars = cars
        supportActionBar?.setTitle("${cars?.manufacturer} ${cars?.name}")
        Glide.with(this@DetailActivity)
            .load(cars!!.img)
            .apply(RequestOptions())
            .into(binding.imageView)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profile_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when(item.itemId) {
        android.R.id.home -> {
            this.finish()
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}