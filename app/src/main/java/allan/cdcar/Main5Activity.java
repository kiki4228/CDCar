package allan.cdcar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void back(View v){
        goBack();
    }

    private void goBack() {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
