        // Access Buttons
        Button btn = findViewById(R.id.button);
        Log.d("demo", btn.getText().toString());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("demo", "Button Clicked");
            }
        });



        // Or Implement View.OnClickListener
         @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            Log.d("demo", "Button Clicked");
        }
    }
