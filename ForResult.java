// Main Class
final static String RESULT_KEY = "result"; 
final static int REQ_CODE = 1001; 

Button b = findViewById(R.id.button1); 
b.setOnClickListener(new View.onClickListener() {
public void onClick(View v) {
Intent i = new Intent(getBaseContext(), ActivityA.class); 
startActivityForResult(i, REQ_CODE); 
}
});

// override onActivityResultMethod 
if (requestCode == REQ_CODE) {
if (resultCode == RESULT_OK && data.getExtras().containsKey(RESULT_KEY)) {
string x = data.getExtras().getString(RESULT_KEY);
} else {
// error occur 
}

// Activity A
// Main Class
Button b = findViewById(R.id.button1); 
b.setOnClickListener(new View.onClickListener() {
public void onClick(View v) {
Intent i = new Intent(); 
i.putExtra(MainActivity.RESULT_KEY, "HI"); 
setResult(RESULT_OK, i); 
finish(); 
}
});
