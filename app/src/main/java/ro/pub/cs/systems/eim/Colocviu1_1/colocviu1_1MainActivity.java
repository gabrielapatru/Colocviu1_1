package ro.pub.cs.systems.eim.Colocviu1_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.provider.SyncStateContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class colocviu1_1MainActivity extends AppCompatActivity {

    private Button north, east, west, south, second;
    private TextView textView1;
    int i=0;

    private NorthClickListener northClickListener = new NorthClickListener();

    private class NorthClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            i++;
            textView1.setText(textView1.getText().toString() +
                    ((Button)north).getText().toString() + ", ");
        }
    }
    private SouthClickListener southClickListener = new SouthClickListener();

    private class SouthClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            i++;
            textView1.setText(textView1.getText().toString() +
                    ((Button)south).getText().toString() + ", ");
        }
    }

    private EastClickListener eastClickListener = new EastClickListener();

    private class EastClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            i++;
            textView1.setText(textView1.getText().toString() +
                    ((Button)east).getText().toString() + ", ");
        }
    }

    private WestClickListener westClickListener = new WestClickListener();

    private class WestClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            i++;
            textView1.setText(textView1.getText().toString() +
                    ((Button)west).getText().toString() + ", ");
        }
    }

    private secondClickListener secondClickListener = new secondClickListener();

    private class secondClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
           textView1.setText(textView1.getText().toString() +
                     i + ", ");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colocviu1_1_main);

        if (savedInstanceState != null){
            if (savedInstanceState.containsKey("textView1") ){
                TextView usernameEditText = (TextView)findViewById(R.id.textView);
                usernameEditText.setText(savedInstanceState.getString("textView1"));
            }
        }

        north = (Button)findViewById(R.id.north);
        north.setOnClickListener(northClickListener);
        east = (Button)findViewById(R.id.east);
        east.setOnClickListener(eastClickListener);
        west = (Button)findViewById(R.id.west);
        west.setOnClickListener(westClickListener);
        south = (Button)findViewById(R.id.south);
        south.setOnClickListener(southClickListener);
        textView1 = (TextView) findViewById(R.id.textView);

        second = (Button)findViewById(R.id.second);
        second.setOnClickListener(secondClickListener);

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        TextView usernameEditText = (TextView) findViewById(R.id.textView);
        savedInstanceState.putString("textView1", usernameEditText.getText().toString());
        if (savedInstanceState.containsKey("textView1")) {
            TextView text = (TextView)findViewById(R.id.textView);
            usernameEditText.setText(savedInstanceState.getString("textView1"));
        }
    }
}