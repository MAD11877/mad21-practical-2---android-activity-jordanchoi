package sg.edu.np.mad.s10208161.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // my codes - not even sure if this is how you comment in Java
        // create new user object and init params as specified.
        User u1 = new User("MAD", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", 0, false);
        // changing the title text and description text to specifications
        TextView titleText = findViewById(R.id.titleText);
        titleText.setText(u1.name);
        TextView descText = findViewById(R.id.descText);
        descText.setText(u1.description);

        // changing the button texts

        Button messageBtn = findViewById(R.id.messageBtn);
        messageBtn.setText("Message");
        Button followBtn = findViewById(R.id.followBtn);
        followBtnText(u1, followBtn);

        followBtn.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v)
                    {
                        u1.toggleFollow();
                        followBtnText(u1, followBtn);
                    }
        });
    }

    // create the User class as a nested class? or outside?
    // is this how i even create the class and constructor? seems to work tho

    public class User {
        String name;
        String description;
        int id;
        boolean followed;

        public User(String n, String desc, int idn, boolean fllw) {
            name = n;
            description = desc;
            id = idn;
            followed = fllw;
        }

        public void toggleFollow() {
            if (followed) {
                followed = false;
            }
            else {
                followed = true;
            }
        }
    }

    public void followBtnText(User u, Button followBtn) {
        // check if the user is followed and change relevant button texts. set as method would be better?
        if (u.followed) {
            followBtn.setText("Followed");
        }
        else {
            followBtn.setText("Follow");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("debug","start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("debug","stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("debug","destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("debug","pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("debug","resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("debug","restart");
    }
}