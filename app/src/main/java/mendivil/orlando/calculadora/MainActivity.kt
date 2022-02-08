package mendivil.orlando.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cero: Button = findViewById(R.id.btn0)
        val uno: Button = findViewById(R.id.btn1)
        val dos: Button = findViewById(R.id.btn2)
        val tres: Button = findViewById(R.id.btn3)
        val cuatro: Button = findViewById(R.id.btn4)
        val cinco: Button = findViewById(R.id.btn5)
        val seis: Button = findViewById(R.id.btn6)
        val siete: Button = findViewById(R.id.btn7)
        val ocho: Button = findViewById(R.id.btn8)
        val nueve: Button = findViewById(R.id.btn9)

        val suma: Button = findViewById(R.id.btnSuma)
        val resta: Button = findViewById(R.id.btnRestar)
        val multiplicar: Button = findViewById(R.id.btnMultiplicar)
        val dividir: Button = findViewById(R.id.btnDividir)

        val borrar: Button = findViewById(R.id.btnBorrar)
        val resultado: Button = findViewById(R.id.btnResultado)

        val operacion: TextView = findViewById(R.id.tViewOperacion)
        val operacion2: TextView = findViewById(R.id.tViewOperacion2)

        var num1: Float = 0f
        var num2: Float = 0f
        var total: Float = 0f
        var signo: Char = '+'

            cero.setOnClickListener(View.OnClickListener {
            if (operacion.text.toString().startsWith('0'))
                operacion.setText("0")
            else
                operacion.setText(operacion.text.toString() + "0")
        })

        uno.setOnClickListener(View.OnClickListener {
            if (operacion.text.toString().startsWith('0'))
                operacion.setText("1")
            else
                operacion.setText(operacion.text.toString() + "1")
        })

        dos.setOnClickListener(View.OnClickListener {
            if (operacion.text.toString().startsWith('0'))
                operacion.setText("2")
            else
                operacion.setText(operacion.text.toString() + "2")
        })

        tres.setOnClickListener(View.OnClickListener {
            if (operacion.text.toString().startsWith('0'))
                operacion.setText("3")
            else
                operacion.setText(operacion.text.toString() + "3")
        })

        cuatro.setOnClickListener(View.OnClickListener {
            if (operacion.text.toString().startsWith('0'))
                operacion.setText("4")
            else
                operacion.setText(operacion.text.toString() + "4")
        })

        cinco.setOnClickListener(View.OnClickListener {
            if (operacion.text.toString().startsWith('0'))
                operacion.setText("5")
            else
                operacion.setText(operacion.text.toString() + "5")
        })

        seis.setOnClickListener(View.OnClickListener {
            if (operacion.text.toString().startsWith('0'))
                operacion.setText("6")
            else
                operacion.setText(operacion.text.toString() + "6")
        })

        siete.setOnClickListener(View.OnClickListener {
            if (operacion.text.toString().startsWith('0'))
                operacion.setText("7")
            else
                operacion.setText(operacion.text.toString() + "7")
        })

        ocho.setOnClickListener(View.OnClickListener {
            if (operacion.text.toString().startsWith('0'))
                operacion.setText("8")
            else
                operacion.setText(operacion.text.toString() + "8")
        })

        nueve.setOnClickListener(View.OnClickListener {
            if (operacion.text.toString().startsWith('0'))
                operacion.setText("9")
            else
                operacion.setText(operacion.text.toString() + "9")
        })

        borrar.setOnClickListener(View.OnClickListener {
            if (operacion.text.toString().length != 1)
                operacion.setText(operacion.text.toString().dropLast(1))
            else
                operacion.setText("0")
        })

        suma.setOnClickListener(View.OnClickListener {
            num1 = operacion.text.toString().toFloat()
            signo = '+'

            operacion2.setText(operacion.text.toString() + " + ")
            operacion.setText("0")
        })

        resta.setOnClickListener(View.OnClickListener {
            num1 = operacion.text.toString().toFloat()
            signo = '-'

            operacion2.setText(operacion.text.toString() + " - ")
            operacion.setText("0")
        })

        multiplicar.setOnClickListener(View.OnClickListener {
            num1 = operacion.text.toString().toFloat()
            signo = '*'

            operacion2.setText(operacion.text.toString() + " * ")
            operacion.setText("0")
        })

        dividir.setOnClickListener(View.OnClickListener {
            num1 = operacion.text.toString().toFloat()
            signo = '/'

            operacion2.setText(operacion.text.toString() + " / ")
            operacion.setText("0")
        })

        resultado.setOnClickListener(View.OnClickListener {
            num2 = operacion.text.toString().toFloat()

            when(signo){
                '+' -> {total = num1 + num2}
                '-' -> {total = num1 - num2}
                '*' -> {total = num1 * num2}
                '/' -> {total = num1 / num2}
            }

            operacion2.setText("")
            operacion.setText(total.toString())

            num1 = 0f
            num2 = 0f
            signo = '+'

        })






    }
}