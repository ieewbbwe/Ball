package debug;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mobile_core.module_main.main.DemoActivity;
import com.mobile_core.module_main.main.MainActivity;
import com.mobile_core.module_main.main.campaign.CampaignListActivity;

/**
 * Created by picher on 2018/7/5.
 * Describe：
 */
public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, CampaignListActivity.class);
        startActivity(intent);
        finish();
    }

}
