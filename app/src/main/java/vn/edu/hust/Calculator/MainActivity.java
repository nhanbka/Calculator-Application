package vn.edu.hust.Calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtDisplay;
    private Button btnDivide;
    private Button btnMultiply;
    private Button btnMinus;
    private Button btnAdd;
    private Button btnClearUnitElement;
    private Button btnClearElement;
    private Button btnClear;
    private Button Zero;
    private Button One;
    private Button Two;
    private Button Three;
    private Button Four;
    private Button Five;
    private Button Six;
    private Button Seven;
    private Button Eight;
    private Button Nine;
    private Button Dot;
    private Button opposite;
    private Button equal;
    private TextView subDisplay;

    private int temp;
    private int operator;       // 1 = add, 2 = minus, 3 = multiply, 4 = divide

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDisplay = (TextView) findViewById (R.id.txtDisplay);
        subDisplay = (TextView) findViewById(R.id.subDisplay);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnClearElement = (Button) findViewById(R.id.btnClearElement);
        btnClearUnitElement = (Button) findViewById(R.id.btnClearUnitNumber);
        Dot = (Button) findViewById(R.id.btnDot);
        Zero = (Button) findViewById(R.id.btnNo0);
        One = (Button) findViewById(R.id.btnNo1);
        Two = (Button) findViewById(R.id.btnNo2);
        Three = (Button) findViewById(R.id.btnNo3);
        Four = (Button) findViewById(R.id.btnNo4);
        Five = (Button) findViewById(R.id.btnNo5);
        Six = (Button) findViewById(R.id.btnNo6);
        Seven = (Button) findViewById(R.id.btnNo7);
        Eight = (Button) findViewById(R.id.btnNo8);
        Nine = (Button) findViewById(R.id.btnNo9);
        opposite = (Button) findViewById(R.id.btnOpposite);
        equal = (Button) findViewById(R.id.btnEqual);

        One.setOnClickListener(this);
        Two.setOnClickListener(this);
        Three.setOnClickListener(this);
        Four.setOnClickListener(this);
        Five.setOnClickListener(this);
        Six.setOnClickListener(this);
        Seven.setOnClickListener(this);
        Eight.setOnClickListener(this);
        Nine.setOnClickListener(this);
        Zero.setOnClickListener(this);
        Dot.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        opposite.setOnClickListener(this);
        btnClearUnitElement.setOnClickListener(this);
        btnClearElement.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        equal.setOnClickListener(this);

        operator = 0;
    }

    @Override
    public void onClick(View v){
        // clear
        if(v.getId() == R.id.btnClear){
            subDisplay.setText("");
            txtDisplay.setText("0");
        }
        if(v.getId() == R.id.btnClearElement){
            txtDisplay.setText("0");
        }
        if(v.getId() == R.id.btnClearUnitNumber){
            String x = txtDisplay.getText().toString();
            if(x.length() == 1)
                txtDisplay.setText("0");
            else {
                x = x.substring(0, x.length() - 1);
                txtDisplay.setText(x);
            }
        }

        // input number
        if(v.getId() == R.id.btnNo0){
            if(txtDisplay.getText().length() == 9 || txtDisplay.getText().length() == 1);
            else txtDisplay.append("0");
        }
        if(v.getId() == R.id.btnNo1){
            if(txtDisplay.getText().length() == 9);
            else if(txtDisplay.getText().equals("0")){
                txtDisplay.setText("1");
            } else txtDisplay.append("1");
        }
        if(v.getId() == R.id.btnNo2){
            if(txtDisplay.getText().length() == 9);
            else if(txtDisplay.getText().equals("0")){
                txtDisplay.setText("2");
            } else txtDisplay.append("2");
        }
        if(v.getId() == R.id.btnNo3){
            if(txtDisplay.getText().length() == 9);
            else if(txtDisplay.getText().equals("0")){
                txtDisplay.setText("3");
            } else txtDisplay.append("3");
        }
        if(v.getId() == R.id.btnNo4){
            if(txtDisplay.getText().length() == 9);
            else if(txtDisplay.getText().equals("0")){
                txtDisplay.setText("4");
            } else txtDisplay.append("4");
        }
        if(v.getId() == R.id.btnNo5){
            if(txtDisplay.getText().length() == 9);
            else if(txtDisplay.getText().equals("0")){
                txtDisplay.setText("5");
            } else txtDisplay.append("5");
        }
        if(v.getId() == R.id.btnNo6){
            if(txtDisplay.getText().length() == 9);
            else if(txtDisplay.getText().equals("0")){
                txtDisplay.setText("6");
            } else txtDisplay.append("6");
        }
        if(v.getId() == R.id.btnNo7){
            if(txtDisplay.getText().length() == 9);
            else if(txtDisplay.getText().equals("0")){
                txtDisplay.setText("7");
            } else txtDisplay.append("7");
        }
        if(v.getId() == R.id.btnNo8){
            if(txtDisplay.getText().length() == 9);
            else if(txtDisplay.getText().equals("0")){
                txtDisplay.setText("8");
            } else txtDisplay.append("8");
        }
        if(v.getId() == R.id.btnNo9){
            if(txtDisplay.getText().length() == 9);
            else if(txtDisplay.getText().equals("0")){
                txtDisplay.setText("9");
            } else txtDisplay.append("9");
        }

        // handle operator
        if(v.getId() == R.id.btnAdd){
            if(operator != 0){

            }
            temp = Integer.parseInt(txtDisplay.getText().toString());

        }

        if(v.getId() == R.id.btnDot){
            if(txtDisplay.getText().length() == 9);
            else txtDisplay.append(".");
        }
    }
}
