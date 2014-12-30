package test.activitytest;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.test.ActivityInstrumentationTestCase2;

import com.csipsimple.ui.SipHome;
import com.csipsimple.ui.dialpad.DialerFragment;

/**
 * Created by tqcenglish on 14-12-29.
 */
public class ActivityTest extends ActivityInstrumentationTestCase2<SipHome> {
    private Context activitContext;
    private static final int TONE_RELATIVE_VOLUME = 80;

    public ActivityTest() {
        super(SipHome.class);
    }

    public void testPlayTone() throws Exception {
        DialerFragment df = (DialerFragment) getActivity().getCurrentFragment();
       /* df.onTrigger(1, 2);
        df.onTrigger(1, 3);
        df.onTrigger(1, 4);
        df.onTrigger(1, 5);
        df.onTrigger(1, 6);
        df.onTrigger(1, 7);
        df.onTrigger(1, 8);*/
        df.onTrigger(1, 9);
    }
}
