package com.example.myrecyclerreview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myrecyclerreview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        displayNamesList()
    }
    fun displayNamesList(){
        var names = listOf("Ruth","Saru","Cynthia","Linet","Jemimah","Jacinta","Angela","Yvone","Miriam","Yekebedi","Mercy","Atarah","Mumbi","Adrielle","Lokure","Lolii","Ekal","Eyanae","Ekiru","Ekuam","Jylo","Lokush","Mwingi","Nairobi","Hopper","Halima","Akish","Chei")
        binding.rvName.layoutManager = LinearLayoutManager(this)
        val namesAdapter=NamesRvAdapter(names)
        binding.rvName.adapter=namesAdapter
    }

}