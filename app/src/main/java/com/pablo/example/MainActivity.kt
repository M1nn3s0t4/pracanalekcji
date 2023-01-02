package com.pablo.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_potwierdz = findViewById<Button>(R.id.btn_potwierdz)

        btn_potwierdz.setOnClickListener {
            val et_imie = findViewById<EditText>(R.id.imie)
            val et_nick = findViewById<LinearLayout>(R.id.nick)
            val et_haslo = findViewById<EditText>(R.id.haslo)
            val et_potwierdz = findViewById<EditText>(R.id.potwierdz)

            // sprawdzamy czy hasło i potwierdź hasło są takie same
            if (et_haslo.text.toString() == et_potwierdz.text.toString()) {
                // hasła są takie same, możesz wykonać dalsze czynności
                Toast.makeText(this, "Hasła zostały potwierdzone!", Toast.LENGTH_SHORT).show()
            } else {
                //hasła nie są takie same, wyświetl komunikat
                Toast.makeText(this, "Hasła nie są takie same!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}