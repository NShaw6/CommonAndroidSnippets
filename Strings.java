// Inside Resources strings.xml
// <string name="Test">Test</string>

String s = getResources().getString(R.string.test); 
Log.d("demo", s); 


// String Array strings.xml
/* 
    <string-array name="color_array">
        <item>Red</item>
        <item>Blue</item>
    </string-array>
*/

String[] colors = getResources().getStringArray(R.array.color_array); 
for (String str : colors){
Log.d("demo", str);
} 
