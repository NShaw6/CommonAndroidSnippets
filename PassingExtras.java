x// Main Class
final static String NAME_KEY = "name"; 
Button b = findViewById(R.id.button1); 
b.setOnClickListener(new View.onClickListener() {
public void onClick(View v) {
Intent i = new Intent(getBaseContext(), ActivityA.class); 
i.putExtra(NAME_KEY, "Bob"); 
startActivity(i); 
}
});


// Activity A
Button b = findViewById(R.id.button1); 

if (getIntent().getExtras()!=null) {
  if(getIntent().getExtras().getString(MainActivity.NAME_KEY) {
  String name = getIntent().getExtras().getString(MainActivity.NAME_KEY);
  }
 }

b.setOnClickListener(new View.onClickListener() {
public void onClick(View v) {
finish();
}
});
