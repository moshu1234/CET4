package oneteam.cet4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButtons();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_bt_1:
                Toast.makeText(this, "第一个按钮", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_bt_2:
                Toast.makeText(this, "第二个按钮", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_bt_3:
                Toast.makeText(this, "第三个按钮", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_ib_1:
                Toast.makeText(this, "第一个图片按钮", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_ib_2:
                Toast.makeText(this, "第二个图片按钮", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_ib_3:
                Toast.makeText(this, "第三个图片按钮", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    private void initButtons(){
        Button button1=(Button)findViewById(R.id.main_bt_1);
        button1.setOnClickListener(this);
        Button button2=(Button)findViewById(R.id.main_bt_2);
        button2.setOnClickListener(this);
        Button button3=(Button)findViewById(R.id.main_bt_3);
        button3.setOnClickListener(this);
        ImageButton imageButton1=(ImageButton)findViewById(R.id.main_ib_1);
        imageButton1.setOnClickListener(this);
        ImageButton imageButton2=(ImageButton)findViewById(R.id.main_ib_2);
        imageButton2.setOnClickListener(this);
        ImageButton imageButton3=(ImageButton)findViewById(R.id.main_ib_3);
        imageButton3.setOnClickListener(this);
    }
}
