package com.example.register

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
//import com.google.firebase.firestore.auth.User

//import android.content.Context
//import android.content.Intent
//import android.content.SharedPreferences
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.widget.EditText
//import android.widget.Toast
//import androidx.core.content.ContextCompat.startActivity
//import com.google.firebase.auth.FirebaseAuth
//import com.google.firebase.firestore.FirebaseFirestore

class login : AppCompatActivity() {
    private var mAuth: FirebaseAuth? = null
    private var mFirebaseDatabaseInstances: FirebaseFirestore? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        mAuth= FirebaseAuth.getInstance()
        mFirebaseDatabaseInstances = FirebaseFirestore.getInstance()

        val button = findViewById<Button>(R.id.rb)
        button.setOnClickListener{
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }

    }

    fun login(v: View?)
    {
        var u = findViewById<View>(R.id.userName) as EditText
        var p = findViewById<View>(R.id.passWord) as EditText

            try {
                mFirebaseDatabaseInstances?.collection("users")!!.document(u.text.toString())
                    .get().addOnSuccessListener { result ->
                        val uu = result.toObject(User::class.java)
                                as User?
                        if(uu==null)
                        {
                            Toast.makeText(this, "User does not exist", Toast.LENGTH_LONG).show()
                        }

                        else {
                            if
                                    (uu.password.equals(p.text.toString())) {

                                        var i=Intent(applicationContext,SplashActivity::class.java)
                                i.putExtra("uname",u.text.toString())
                                startActivity(i)
                            } else {
                                Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_LONG).show()
                            }
                        }
                    }
                    .addOnFailureListener { exception ->
                        Toast.makeText(this, "User does not exist",
                            Toast.LENGTH_LONG).show()
                    }
            }
            catch(e:Exception)
            {
                Toast.makeText(this, "User does not exist",
                    Toast.LENGTH_LONG).show()
            }

        }
    }








