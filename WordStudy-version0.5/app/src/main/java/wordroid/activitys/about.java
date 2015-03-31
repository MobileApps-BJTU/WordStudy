package wordroid.activitys;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

import wordroid.Explanation.AboutFragment1;
import wordroid.Explanation.AboutFragment2;
import wordroid.model.R;

public class about extends Activity implements AboutFragment1.OnFragmentInteractionListener{

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.showabout);

        getFragmentManager().beginTransaction()
                .replace(R.id.fragment_holder,new AboutFragment1())
                .addToBackStack(null)
                .commit();
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public void sendToSecondFragment() {
        getFragmentManager().beginTransaction()
                .replace(R.id.fragment_holder, AboutFragment2.newInstance())
                .addToBackStack(null)
                .commit();
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public void onBackPressed(){

        while (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStackImmediate();
        }
        super.onBackPressed();
    }
}
