package monp.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.net.ssl.SNIHostName;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    private Button makeItRain;
    private Button showInfo;
    private TextView moneyValue;
    private int moneyCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makeItRain = findViewById(R.id.buttonMakeItRain);
        moneyValue = findViewById(R.id.moneyValue);

        moneyValue.setTextColor(ContextCompat.getColor(MainActivity.this,
                R.color.orange));

    }

    public void showMoney(View view) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        moneyCounter+= 1000;
        moneyValue.setText(String.valueOf(numberFormat.format(moneyCounter)));

        switch (moneyCounter){
            case 20000:
                moneyValue.setTextColor(ContextCompat.getColor(MainActivity.this,
                        R.color.purple));
                break;
            case 30000:
                moneyValue.setTextColor(Color.MAGENTA);
                break;
            case 40000:
                moneyValue.setTextColor(Color.LTGRAY);
                break;
             default:
                 moneyValue.setTextColor(Color.WHITE);
                 break;



        }
        Log.d("Make It Rain","onClick: " + moneyCounter);
    }

    public void showInfo(View view) {
        Toast.makeText(MainActivity.this, R.string.app_info, LENGTH_SHORT)
                .show();

     //   Snackbar.make(moneyValue, R.string.app_info, Snackbar.LENGTH_LONG)
     //           .setAction("More", view1 -> {
     //               Log.d("Snack", "showInfo: Snackbar More")
     //           })
     //           .show();

    }
}
