package imperial.heriberto.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var ope: Int = 0
    var numero: Double = 0.0
    lateinit var tv1: TextView
    lateinit var tv2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv1 = findViewById(R.id.tv1)
        tv2 = findViewById(R.id.tv2)
        val btB: Button = findViewById(R.id.btB)
        val btR: Button = findViewById(R.id.btR)

        btR.setOnClickListener(){
            var numero2: Double = tv2.text.toString().toDouble()
            var resp: Double = 0.0

            when(ope){
                1 -> resp = numero + numero2
                2 -> resp = numero - numero2
                3 -> resp = numero * numero2
                4 -> resp = numero / numero2
            }

            tv2.setText(resp.toString())
            tv1.setText("")
        }

        btB.setOnClickListener(){
            tv1.setText("")
            tv2.setText("")
            numero = 0.0
            ope = 0
        }
    }

    fun presionarD(view: View){
        var num2: String = tv2.text.toString()

        when(view.id){
            R.id.bt0 -> tv2.setText(num2 + "0")
            R.id.bt1 -> tv2.setText(num2 + "1")
            R.id.bt2 -> tv2.setText(num2 + "2")
            R.id.bt3 -> tv2.setText(num2 + "3")
            R.id.bt4 -> tv2.setText(num2 + "4")
            R.id.bt5 -> tv2.setText(num2 + "5")
            R.id.bt6 -> tv2.setText(num2 + "6")
            R.id.bt7 -> tv2.setText(num2 + "7")
            R.id.bt8 -> tv2.setText(num2 + "8")
            R.id.bt9 -> tv2.setText(num2 + "9")
        }

    }

    fun presionarO(view: View){
        numero = tv2.text.toString().toDouble()
        var tv2Text: String = tv2.text.toString()
        tv2.setText("0")
        when(view.id){
            R.id.btMas ->{
                tv1.setText(tv2Text + "+")
                ope = 1
            }
            R.id.btMenos ->{
                tv1.setText(tv2Text + "-")
                ope = 2
            }
            R.id.btPor ->{
                tv1.setText(tv2Text + "*")
                ope = 3
            }
            R.id.btEntre ->{
                tv1.setText(tv2Text + "/")
                ope = 4
            }
        }


    }
}