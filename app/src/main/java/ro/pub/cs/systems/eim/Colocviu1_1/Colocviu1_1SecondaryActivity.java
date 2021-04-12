package ro.pub.cs.systems.eim.Colocviu1_1;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Colocviu1_1SecondaryActivity extends AppCompatActivity {
    private Button cancel, register;
    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.register:
                    setResult(RESULT_OK, null);
                    break;
                case R.id.cancel:
                    setResult(RESULT_CANCELED, null);
                    break;
            }
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colocviu1_1_secondary);
        cancel = (Button) findViewById(R.id.cancel);
        cancel.setOnClickListener(buttonClickListener);
        register = (Button) findViewById(R.id.register);
        register.setOnClickListener(buttonClickListener);
    }
}
