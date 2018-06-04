package zaratedev.list.shopping.com.shoppinglist.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import zaratedev.list.shopping.com.shoppinglist.Fragments.RightFragment;
import zaratedev.list.shopping.com.shoppinglist.R;
import zaratedev.list.shopping.com.shoppinglist.SendMenssage;

public class MainActivity extends AppCompatActivity implements SendMenssage {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendData(String message) {
        RightFragment rightFragment = (RightFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_right);

        rightFragment.setMessage(message);


    }
}
