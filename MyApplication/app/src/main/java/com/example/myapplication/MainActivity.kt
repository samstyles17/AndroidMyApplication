package com.example.myapplication



import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var topAnimation:Animation
    private lateinit var bottomAnimation:Animation
    private lateinit var heading:TextView
    private lateinit var heading1:TextView
    private lateinit var button1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE) // will hide the title
        supportActionBar?.hide() // hide the title bar
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        ) // enable full screen
        setContentView(R.layout.activity_main)
        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation)
        heading=findViewById(R.id.heading)
        heading1=findViewById(R.id.heading1)
        button1=findViewById(R.id.button1)
        heading.animation=topAnimation
        heading1.animation=topAnimation
        button1.animation=bottomAnimation
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            // Define the action to start the second activity
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
