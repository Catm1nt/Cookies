package com.example.android.cookies;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.TextView;
/**
 * The way this app is supposed to work is that once the assigned button is
 * pressed in the UI, the background picture and TextView text will change once.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Assigned the Button the name eatTheCookie and called the view from the xml file
         */
        Button eatTheCookie = (Button) findViewById(R.id.eatTheCookie);

        /**
         * Assigned TextView to statusTextView and called the view from the xml file
         */
        final TextView statusTextView = (TextView) findViewById(R.id.status_text_view);

        /**
         * Assigned ImageView to cookieImage and called the view from the xml file. After that
         * the initial image resource was set to before_cookie.jpg
         */
        final ImageView cookieImage = (ImageView) findViewById(R.id.android_cookie_image_view);
        cookieImage.setImageResource(R.drawable.before_cookie);

        /**
         * This method is called when the button ID'd eatTheCookie is pressed. It changes the
         * statusTextView TextView to show the text "I'm so full!" and changes the cookieImage ImageView
         * to show after_cookie.jpg
         */
        eatTheCookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                statusTextView.setText("I'm so full!");
                cookieImage.setImageResource(R.drawable.after_cookie);
            }
        });
    }
}
