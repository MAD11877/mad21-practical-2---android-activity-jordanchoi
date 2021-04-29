package sg.edu.np.mad.s10208161.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class User {
        String name;
        String description;
        int id;
        boolean followed;

        public User() {
        }

    }
}