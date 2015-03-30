package materialtest.theartistandtheengineer.co.materialtest.activities;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.telly.mrvector.MrVector;

import materialtest.theartistandtheengineer.co.materialtest.R;

/**
 * Created by mpcen-desktop on 3/26/15.
 */
public class VectorTestActivity extends ActionBarActivity {

    Toolbar toolbar;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_test);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        imageView = (ImageView) findViewById(R.id.vectorImage);
        Drawable drawable = MrVector.inflate(getResources(), R.drawable.vector_android);

        if(Build.VERSION.SDK_INT >= 16){
            imageView.setBackground(drawable);
        } else{
            imageView.setBackgroundDrawable(drawable);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_vector_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.action_settings){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
