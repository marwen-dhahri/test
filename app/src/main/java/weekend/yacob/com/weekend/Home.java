package weekend.yacob.com.weekend;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

import weekend.yacob.com.weekend.HomeFragment;
import weekend.yacob.com.weekend.R;

public class Home extends FragmentActivity {
    private FragmentTabHost mTabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);

        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        // add our navigation menu
        Bundle b = new Bundle();
        b.putString("key", "home");
        mTabHost.addTab(mTabHost.newTabSpec("home").setIndicator("",getResources().getDrawable(R.drawable.logo)),HomeFragment.class, b);

        b = new Bundle();
        b.putString("key", "favorite");
        mTabHost.addTab(mTabHost.newTabSpec("favorite").setIndicator("",getResources().getDrawable(R.drawable.menu2)), HomeFragment.class, b);

        b = new Bundle();
        b.putString("key", "map");
        mTabHost.addTab(mTabHost.newTabSpec("map").setIndicator("",getResources().getDrawable(R.drawable.menu3)), HomeFragment.class, b);
        b = new Bundle();
        b.putString("key", "menu");
        mTabHost.addTab(mTabHost.newTabSpec("menu").setIndicator("",getResources().getDrawable(R.drawable.menu5)),HomeFragment.class, b);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}