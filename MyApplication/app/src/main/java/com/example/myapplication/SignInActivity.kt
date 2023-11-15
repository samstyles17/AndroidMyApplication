package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class SignInActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var signInButton: Button

    // Dummy username and password for demonstration purposes
    private val dummyUsername = "admin"
    private val dummyPassword = "password"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in)

        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        signInButton = findViewById(R.id.signInButton)

        signInButton.setOnClickListener {
            val enteredUsername = usernameEditText.text.toString().trim()
            val enteredPassword = passwordEditText.text.toString().trim()

            if (enteredUsername == dummyUsername && enteredPassword == dummyPassword) {
                // Successful login
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                navigateToHomePage(enteredUsername)
            } else {
                // Invalid credentials
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun navigateToHomePage(username: String) {
        val intent = Intent(this, HomePageActivity::class.java)
        intent.putExtra("USERNAME_EXTRA", username)
        startActivity(intent)
        finish() // Optional: If you don't want the user to go back to the sign-in activity using the back button
    }
}
