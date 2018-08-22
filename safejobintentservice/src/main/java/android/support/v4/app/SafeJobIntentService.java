package android.support.v4.app;

import android.os.Build;
import android.support.annotation.RestrictTo;

/**
 *
 * issue: https://github.com/evernote/android-job/issues/255
 *
 * copy from: https://github.com/evernote/android-job
 *
 * @author rwondratschek
 */
@RestrictTo(RestrictTo.Scope.LIBRARY)
public abstract class SafeJobIntentService extends JobIntentService {

    @Override
    GenericWorkItem dequeueWork() {
        try {
            return super.dequeueWork();
        } catch (SecurityException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // override mJobImpl with safe class to ignore SecurityException
        if (Build.VERSION.SDK_INT >= 26) {
            mJobImpl = new SafeJobServiceEngineImpl(this);
        } else {
            mJobImpl = null;
        }
    }
}
