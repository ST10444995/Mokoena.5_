package com.example.mokoenatbst10444995

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val age = findViewById<EditText>(R.id.inputAge)
        val display = findViewById<TextView>(R.id.txtDisplay)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val txtHeading = findViewById<TextView>(R.id.txtHeading)

        btnGenerate.setOnClickListener {
            val age = age.text.toString().toIntOrNull()
            if (age == null) {
                display.text = "please  enter a valid Age"


            } else {
                if (age < 35 || age > 90) {
                    display.text = "please enter age between 35 to 90"
                    age.text.clear()


                }


            } /* 10 famous people chosen*/

            val result = when (age) {
                41 -> "Kobe Bryant was a well know basketball player who played shooting guard.He won 5 championship titles "
                60 -> "Diego Maradona was the greatest soccer player and was known world-wide.He won 2 world Champion titles with Argentina. He died at the age of 60"
                35 -> "Kiernan Forbes was a well known song writer and rapper who also had his own business he worked at on the side. He died at the age 35 after hee was assinated"
                51 -> "Micheal Jackson was known as the King of Pop and was a song writer. he died after an illness at the age of 51"
                62 -> "Jackson Mthembu worked as a politician that served as a Minister in the presidency and was an parliament helper in the ANC.He died at the age of 62 after a short illness"
                81 -> "Winnie Mandela was known as an anti apartheid and was Mandela's second wife.She died at the age of 81"
                38 -> "Lundi Tymara was known as an successful gospel singer.He suffered from a liver condition and died at 38"
                47 -> "Aaron Ferguson was a well known actor who opened his own acting agency call Ferguson Films.He was self-employed and worked together with his wife Connie Ferguson.He died at the age of 47"
                48 -> "whitney Houston was an American singer , actress and producer.She produces the best selling music of all time.she died at the age of 48."
                38 -> "HHP was well known as Jabulani Tsambo who was known as a Motswako rapper and performed in different languages.He died at the age of 38 at the cost of suicide."



                else -> "No one died at this age , try a different one!"




            }
            display.text = result


        }
        btnClear.setOnClickListener { age.text.clear()
        display.text = ""
        }

    }
}
