import com.google.android.setupcompat.logging.CustomEvent;
import android.os.PersistableBundle;
import android.os.Build$VERSION;
import android.os.Parcelable;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import android.app.FragmentManager;
import android.util.Log;
import android.os.Bundle;
import android.app.Activity;
import com.google.android.setupcompat.logging.MetricKey;
import android.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aego extends Fragment
{
    private static final String a = "aego";
    private MetricKey b;
    private long c;
    private long d;
    
    public aego() {
        this.d = 0L;
        this.setRetainInstance(true);
    }
    
    public static void a(Activity activity) {
        if (aegu.e(activity.getIntent())) {
            final aegr a = aegr.a(activity.getApplicationContext());
            final String m = aegu.m(activity);
            final Bundle bundle = new Bundle();
            bundle.putString("screenName", aegu.m(activity));
            bundle.putString("intentAction", activity.getIntent().getAction());
            a.b(m, bundle);
            final FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager != null && !fragmentManager.isDestroyed()) {
                final Object fragmentByTag = fragmentManager.findFragmentByTag("lifecycle_monitor");
                if (fragmentByTag == null) {
                    final Fragment fragment = new aego();
                    try {
                        fragmentManager.beginTransaction().add(fragment, "lifecycle_monitor").commitNow();
                        activity = (Activity)fragment;
                    }
                    catch (final IllegalStateException ex) {
                        Log.e(aego.a, "Error occurred when attach to Activity:".concat(String.valueOf(String.valueOf(activity.getComponentName()))), (Throwable)ex);
                        activity = (Activity)fragmentByTag;
                    }
                }
                else {
                    if (!(fragmentByTag instanceof aego)) {
                        Log.wtf(aego.a, String.valueOf(activity.getClass().getSimpleName()).concat(" Incorrect instance on lifecycle fragment."));
                        return;
                    }
                    activity = (Activity)fragmentByTag;
                }
                final aego aego = (aego)activity;
            }
        }
    }
    
    public final void onAttach(final Context context) {
        super.onAttach(context);
        this.b = MetricKey.b("ScreenDuration", this.getActivity());
    }
    
    public final void onDetach() {
        super.onDetach();
        final Activity activity = this.getActivity();
        final MetricKey b = this.b;
        final long millis = TimeUnit.NANOSECONDS.toMillis(this.d);
        aegu.l(activity, "Context cannot be null.");
        aegu.l(b, "Timer name cannot be null.");
        aegu.j(millis >= 0L, "Duration cannot be negative.");
        final aegr a = aegr.a((Context)activity);
        final Bundle bundle = new Bundle();
        bundle.putParcelable("MetricKey_bundle", (Parcelable)MetricKey.a(b));
        bundle.putLong("timeMillis", millis);
        a.f(2, bundle);
    }
    
    public final void onPause() {
        super.onPause();
        this.d += System.nanoTime() - this.c;
    }
    
    public final void onResume() {
        super.onResume();
        this.c = System.nanoTime();
        if (Build$VERSION.SDK_INT >= 29) {
            final PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putLong("onScreenResume", System.nanoTime());
            aegu.c((Context)this.getActivity(), CustomEvent.e(MetricKey.b("ScreenActivity", this.getActivity()), persistableBundle));
        }
    }
}
