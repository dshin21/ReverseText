package com.example.danie.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        final EditText myEditText = (EditText) findViewById( R.id.myEditText );
        final TextView myTextView = (TextView) findViewById( R.id.myTextView );
        Button myBtn = (Button) findViewById( R.id.myBtn );

        myBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View view ) {
                myTextView.setText( reverseString( String.valueOf( myEditText.getText() ) ) );
            }
        } );
    }

    private String reverseString( String content ) {
        StringBuilder temp = new StringBuilder();

        for ( int i = content.length() - 1; i >= 0; i-- ) {
            temp.append( content.charAt( i ) );
        }
        return ( temp.length() == 0 ) ? " " : temp.toString();
    }
}
