public class MainActivity extends AppCompatActivity {
    RadioGroup rg; 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Get Radio Group Changed Value 
        rg = findViewById(R.id.RadioGroup2);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = findViewById(checkedId);
                Log.d("demo", "Check: " + rb.getText().toString());
            }
        });

        // Get Picked Value 
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rg.getCheckedRadioButtonId() == R.id.radioButton) {
                    Log.d("demo", "Radio Button Choosen"); 
                }
            }
        });
    }
}
