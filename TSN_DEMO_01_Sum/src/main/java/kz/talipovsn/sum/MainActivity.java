package kz.talipovsn.sum;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText_a; // Переменная для доступа к компоненту со значением "a"
    EditText editText_b; // Переменная для доступа к компоненту со значением "b"
    TextView textView_sum; // Переменная для доступа к компоненту со значением результата
    Button buttonSum; // Переменная для доступа к компоненту кнопки

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Доступ к компонентам окна
        editText_a = findViewById(R.id.editText_a);
        editText_b = findViewById(R.id.editText_b);
        textView_sum = findViewById(R.id.textView_sum);
        buttonSum = findViewById(R.id.buttonSum);
    }

    // МЕТОД КНОПКИ РАСЧЕТА
    public void onClick(View v) {
        // Объявление локальных переменных
        double a, b, x, y;

        try { // НАЧАЛО ЗАЩИЩЕННОГО БЛОКА

            // Чтение данных из компонент
            a = Double.parseDouble(editText_a.getText().toString().trim());
            b = Double.parseDouble(editText_b.getText().toString().trim());
            x = Double.parseDouble(editText_b.getText().toString().trim());

            // Основной алгоритм
            if (x<7){
                y = Math.pow(x,2)+Math.pow(a,2)+Math.pow(b,2);
            }
            else {
                y = (a+b)/(Math.pow(x,3)*Math.pow(a+b,2));
            }

            // Вывод полученного значения в компонент
            textView_sum.setText(String.valueOf(y));

        } catch (Exception e) { // ЧТО ДЕЛАТЬ ЕСЛИ ВОЗНИКНЕТ ОШИБКА В БЛОКЕ МЕЖДУ "TRY" И "CATCH":

            // Вывод сообщения об ошибке
            textView_sum.setText("Неверные входные данные для расчета!");

        }  // КОНЕЦ ЗАЩИЩЕННОГО БЛОКА

    }

}
