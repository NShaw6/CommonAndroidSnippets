// Main Class
Button b = findViewById(R.id.button1); 
b.setOnClickListener(new View.onClickListener() {
public void onClick(View v) {
Intent i = new Intent(getBaseContext(), ActivityA.class); 
startActivity(i); 
}
});



// Activity A
Button b = findViewById(R.id.button1); 
b.setOnClickListener(new View.onClickListener() {
public void onClick(View v) {
finish(); 
}
});
