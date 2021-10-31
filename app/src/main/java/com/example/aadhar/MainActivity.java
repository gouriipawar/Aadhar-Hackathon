package com.example.aadhar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.xml.datatype.XMLGregorianCalendar;

import in.gov.uidai.otpapiclient.GetValues;
import in.gov.uidai.otpapiclient.OtpAPIClientMain;
import in.gov.uidai.otpapiclient.OtpAPIService;
import in.gov.uidai.otpapiclient.model.OtpRes;

public class MainActivity extends AppCompatActivity {
Button b1;
EditText e1;
String aadhar;
    OtpAPIClientMain xyz ;
    String[] abc ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        e1 = findViewById(R.id.e1);
        xyz = new OtpAPIClientMain();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aadhar = e1.getText().toString().trim();
                try {

//                    abc = new String[aadhar.length()];
                    String[] c = new String[aadhar.length()];
                    String strArray[] = aadhar.split(" ");
                    for (int i = 0; i<strArray.length; i++){
//                        c[i] = String.valueOf(aadhar.charAt(i));
                        strArray[i]  = String.valueOf(aadhar.charAt(i));// problem is here not close by ["242",2,3,4]

                    }

//                    new GetValues().setNewData(aadhar);
//                    xyz.main(strArray);

//                    xyz.setData(Arrays.toString(strArray));//
//                    xyz.setData(aadhar);
                   Set<String> mystr = new HashSet<>(Arrays.asList(aadhar));
                   String[] nstr = method(mystr);
                    Log.d("TAG", "onClick: s"+Arrays.toString(nstr));// result
                    Log.d("TAG", "onClick: in method "+nstr[0]);
                   if (nstr !=null ){
                       xyz.main(nstr);
                   } else
                    Toast.makeText(MainActivity.this,abc[0],Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.d("TAG", "onClick: error "+e.getMessage());
//                    Toast.makeText(MainActivity.this,abc[1],Toast.LENGTH_LONG).show();

                }

            }
        });
    }
    private String[] method(Set<String > strings){
        String[] str = new String[strings.size()];
        int index = 0;
        for (String nstr :strings){
            str[index++] = nstr;
        }
        return  str;
    }


}