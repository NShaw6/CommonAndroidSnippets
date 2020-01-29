// Main Class
Button b = findViewById(R.id.button1); 
b.setOnClickListener(new View.onClickListener() {
public void onClick(View v) {
Intent i = new Intent("com.example.intentdemo.intent.action.VIEW"); 
startActivity(i); 
}
});

// ManifestFile 
<intent-Filter> 
<action> </action>
<category> </category> 
</intent-Filter> 


// Main Class
Button b = findViewById(R.id.button1); 
b.setOnClickListener(new View.onClickListener() {
public void onClick(View v) {
finish();
}
});
