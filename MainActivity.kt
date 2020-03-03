package com.example.elavi.kotlinfun
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
class MainActivity : AppCompatActivity() {
        var numbervalue=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val counter = findViewById<Button>(R.id.counter) as Button
        var number=findViewById<EditText>(R.id.number)
        val reset=findViewById<Button>(R.id.reset) as Button
// set on-click listener
        counter.setOnClickListener {
            Toast.makeText(this@MainActivity, "Counter is Working.", Toast.LENGTH_SHORT).show()
            numbervalue=numbervalue+1
            number.setText(numbervalue.toString())
        }
        reset.setOnClickListener {
            Toast.makeText(this@MainActivity, "Value Reset to 0.", Toast.LENGTH_SHORT).show()
            numbervalue=0
        }

    }
}
