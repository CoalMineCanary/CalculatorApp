package org.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {


	EditText operand1;
	EditText operand2;
	Button buttonPlus;
	Button buttonSubtract;
	Button buttonDivide;
	Button buttonMultiply;
	Button buttonClear;
	TextView result;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Operand fields from the main screen
        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);
        
        // Associate buttons
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonSubtract = (Button) findViewById(R.id.buttonSubtract);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        
        // Associate result textfield
        result = (TextView) findViewById(R.id.textResult);
        
        // Add functionality to process results
        buttonPlus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());

				float theResult = oper1 + oper2;
				result.setText(Float.toString(theResult));
			}
		});
        
       // Subtract Calculator processing
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());

				float theResult = oper1 - oper2;
				result.setText(Float.toString(theResult));
			}
		});
        
        // Divide Calculator processing
        buttonDivide.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());

				float theResult = oper1 / oper2;
				result.setText(Float.toString(theResult));
			}
		});
        
        // Multiply Calculator processing
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());

				float theResult = oper1 * oper2;
				result.setText(Float.toString(theResult));
			}
		});
        
        // Add functionality to process results
        buttonClear.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				operand1.setText("");
				operand2.setText("");
				result.setText("0.00");
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
