package idv.star.homework2_1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {
        private ImageView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
    }
public void findView(){
    tvResult=(ImageView)findViewById(R.id.tvResult);




}




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.change_wallpaper:
            break;

            case R.id.a:
                tvResult.setBackgroundColor(Color.WHITE);
                tvResult.setImageResource(R.drawable.a);

                break;


            case R.id.b:
                tvResult.setBackgroundColor(Color.WHITE);
                tvResult.setImageResource(R.drawable.b);
                break;

            case R.id.c:
                tvResult.setBackgroundColor(Color.WHITE);
                tvResult.setImageResource(R.drawable.c);
                break;

            case R.id.change_background_color:
                break;



            case R.id.red:
                tvResult.setImageResource(0);
            tvResult.setBackgroundColor(Color.RED);
                break;
            case R.id.green:
                tvResult.setImageResource(0);
            tvResult.setBackgroundColor(Color.GREEN);
                break;
            case R.id.blue:
                tvResult.setImageResource(0);
               tvResult.setBackgroundColor(Color.BLUE);
              break;

            case R.id.exit:
                System.exit(0);
        }

        return true;




    }





}
