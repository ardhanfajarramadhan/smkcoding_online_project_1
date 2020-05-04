package com.smkcoding.projectsatu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_biodata.*


class BiodataActivity : AppCompatActivity() {
    var edtName: EditText? = null
    var spinnerGender : Spinner? = null
    var edtEmail : EditText? = null
    var edtTelp : EditText? = null
    var edtAlamat : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        edtName = findViewById(R.id.etName)
        spinnerGender = findViewById(R.id.spJK)
        edtEmail = findViewById(R.id.etEmail)
        edtTelp = findViewById(R.id.etTelp)
        edtAlamat = findViewById(R.id.etAddress)

        btnSave.setOnClickListener { toProfileActivity() }
    }

    private fun toProfileActivity() {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }
}
