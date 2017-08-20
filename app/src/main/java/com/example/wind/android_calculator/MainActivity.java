package com.example.wind.android_calculator;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.wind.android_calculator.databinding.ActivityMainBinding;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private double valueOne = Double.NaN;
    private double valueTwo;
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';
    private static final char SIN = 's';
    private static final char COS = 'c';
    private static final char TAN = 't';


    private char CURRENT_ACTION = '0';
    private DecimalFormat decimalFormat;

    private void computeCalculation() {
        if(!Double.isNaN(valueOne)) {
            if (CURRENT_ACTION != SIN && CURRENT_ACTION != COS && CURRENT_ACTION != TAN)
                valueTwo = Double.parseDouble(binding.editText.getText().toString());
            binding.editText.setText(null);

            if(CURRENT_ACTION == ADDITION)
                valueOne = this.valueOne + valueTwo;
            else if(CURRENT_ACTION == SUBTRACTION)
                valueOne = this.valueOne - valueTwo;
            else if(CURRENT_ACTION == MULTIPLICATION)
                valueOne = this.valueOne * valueTwo;
            else if(CURRENT_ACTION == DIVISION)
                valueOne = this.valueOne / valueTwo;
            else if(CURRENT_ACTION == SIN)
                valueOne = Math.sin(Math.toRadians(this.valueOne));
            else if(CURRENT_ACTION == COS)
                valueOne = Math.cos(Math.toRadians(this.valueOne));
            else if(CURRENT_ACTION == TAN)
                valueOne = Math.tan(Math.toRadians(this.valueOne));
        }
        else {
            try {
                valueOne = Double.parseDouble(binding.editText.getText().toString());
            }
            catch (Exception e){}
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CURRENT_ACTION == '0'){
                    binding.infoTextView.setText(null);
                    CURRENT_ACTION = '1';
                }
                binding.infoTextView.setText(binding.infoTextView.getText().toString() + "0");
                binding.editText.setText(binding.editText.getText() + "0");
            }
        });

        binding.buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CURRENT_ACTION == '0'){
                    binding.infoTextView.setText(null);
                    CURRENT_ACTION = '1';
                }
                binding.infoTextView.setText(binding.infoTextView.getText().toString() + "1");
                binding.editText.setText(binding.editText.getText() + "1");
            }
        });

        binding.buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CURRENT_ACTION == '0'){
                    binding.infoTextView.setText(null);
                    CURRENT_ACTION = '1';
                }
                binding.infoTextView.setText(binding.infoTextView.getText().toString() + "2");
                binding.editText.setText(binding.editText.getText() + "2");
            }
        });

        binding.buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CURRENT_ACTION == '0'){
                    binding.infoTextView.setText(null);
                    CURRENT_ACTION = '1';
                }
                binding.infoTextView.setText(binding.infoTextView.getText().toString() + "3");
                binding.editText.setText(binding.editText.getText() + "3");
            }
        });

        binding.buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CURRENT_ACTION == '0'){
                    binding.infoTextView.setText(null);
                    CURRENT_ACTION = '1';
                }
                binding.infoTextView.setText(binding.infoTextView.getText().toString() + "4");
                binding.editText.setText(binding.editText.getText() + "4");
            }
        });

        binding.buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CURRENT_ACTION == '0'){
                    binding.infoTextView.setText(null);
                    CURRENT_ACTION = '1';
                }
                binding.infoTextView.setText(binding.infoTextView.getText().toString() + "5");
                binding.editText.setText(binding.editText.getText() + "5");
            }
        });

        binding.buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CURRENT_ACTION == '0'){
                    binding.infoTextView.setText(null);
                    CURRENT_ACTION = '1';
                }
                binding.infoTextView.setText(binding.infoTextView.getText().toString() + "6");
                binding.editText.setText(binding.editText.getText() + "6");
            }
        });

        binding.buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CURRENT_ACTION == '0'){
                    binding.infoTextView.setText(null);
                    CURRENT_ACTION = '1';
                }
                binding.infoTextView.setText(binding.infoTextView.getText().toString() + "7");
                binding.editText.setText(binding.editText.getText() + "7");
            }
        });

        binding.buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CURRENT_ACTION == '0'){
                    binding.infoTextView.setText(null);
                    CURRENT_ACTION = '1';
                }
                binding.infoTextView.setText(binding.infoTextView.getText().toString() + "8");
                binding.editText.setText(binding.editText.getText() + "8");
            }
        });

        binding.buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CURRENT_ACTION == '0'){
                    binding.infoTextView.setText(null);
                    CURRENT_ACTION = '1';
                }
                binding.infoTextView.setText(binding.infoTextView.getText().toString() + "9");
                binding.editText.setText(binding.editText.getText() + "9");
            }
        });

        binding.buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = ADDITION;
                binding.infoTextView.setText(decimalFormat.format(valueOne) + "+");
                binding.editText.setText(null);
            }
        });

        binding.buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = SUBTRACTION;
                binding.infoTextView.setText(decimalFormat.format(valueOne) + "-");
                binding.editText.setText(null);
            }
        });

        binding.buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = MULTIPLICATION;
                binding.infoTextView.setText(decimalFormat.format(valueOne) + "*");
                binding.editText.setText(null);
            }
        });

        binding.buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = DIVISION;
                binding.infoTextView.setText(decimalFormat.format(valueOne) + "/");
                binding.editText.setText(null);
            }
        });

        binding.buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                binding.infoTextView.setText(binding.infoTextView.getText().toString() +
                        " = " + decimalFormat.format(valueOne));
                valueOne = Double.NaN;
                CURRENT_ACTION = '0';
                binding.editText.setText(null);
            }
        });

        binding.buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.infoTextView.setText(null);
                binding.editText.setText(null);
            }
        });

        binding.buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.infoTextView.setText(binding.infoTextView.getText().toString() + ".");
                binding.editText.setText(binding.editText.getText() + ".");
            }
        });

        binding.buttonSIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CURRENT_ACTION = SIN;
                computeCalculation();
                binding.infoTextView.setText("sin" + decimalFormat.format(valueOne));
                binding.editText.setText(null);
            }
        });

        binding.buttonCOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = COS;
                binding.infoTextView.setText("cos" + decimalFormat.format(valueOne));
                binding.editText.setText(null);
            }
        });

        binding.buttonTAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = TAN;
                binding.infoTextView.setText("tan" + decimalFormat.format(valueOne));
                binding.editText.setText(null);
            }
        });


        decimalFormat = new DecimalFormat("#.##########");
    }
}
