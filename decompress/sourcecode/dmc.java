import android.content.res.Configuration;
import android.view.ViewTreeObserver$OnDrawListener;
import android.content.ComponentCallbacks;
import android.app.Activity;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;
import android.content.ComponentCallbacks2;

// 
// Decompiled by Procyon v0.6.0
// 

final class dmc implements ComponentCallbacks2, dmf
{
    public boolean a;
    private final Set b;
    private boolean c;
    
    public dmc() {
        this.b = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public final void a(final Activity activity) {
        if (this.b.add(activity)) {
            dpg.k();
            if (!this.c) {
                activity.getApplication().registerComponentCallbacks((ComponentCallbacks)this);
                this.c = true;
            }
            activity.getWindow().getDecorView().getViewTreeObserver().addOnDrawListener((ViewTreeObserver$OnDrawListener)new dmd(this, dkg.a(), 1));
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
    }
    
    public final void onLowMemory() {
        this.onTrimMemory(20);
    }
    
    public final void onTrimMemory(final int n) {
        if (n >= 20) {
            this.a = false;
            final dkg a = dkg.a();
            dpg.k();
            a.c.set(false);
        }
    }
}
