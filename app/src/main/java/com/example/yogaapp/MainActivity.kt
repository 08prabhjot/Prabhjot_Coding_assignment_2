package com.example.yogaapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_screen_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.know_more_item){
            val uri: Uri = Uri.parse("https://rajyogarishikesh.com/top-10-yoga-poses-for-beginners.html")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}