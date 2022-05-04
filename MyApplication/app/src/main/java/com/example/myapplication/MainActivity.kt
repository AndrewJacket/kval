package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_id).setOnClickListener {
            val editText = findViewById<EditText>(R.id.edit_id)
            val recyclerView = findViewById<RecyclerView>(R.id.text_id)
            call.enqueue(object : Callback<Rest> {
                override fun onResponse(call: Call<Rest>, response: Response<Rest>) {
                    val list = response.body()!!
                    recyclerview.adapter = MyAdapter(mutablelistOf(list), this@MainActivity)
                    recyclerview.layoutManager = LinearLayoutManager(this@MainActivity)
                }

                override fun onFailure(call: Call<Rest>, t: Throwable) {
                    Toast.makeText(this@MainActivity, t.localizedMessage, Toast.LENGTH_LONG).show()
                }

            })
        }
    }
}