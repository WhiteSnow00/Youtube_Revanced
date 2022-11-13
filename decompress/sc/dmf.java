import android.view.View;
import android.view.ViewTreeObserver$OnDrawListener;
import android.app.Activity;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dmf implements dmg
{
    public final Set a;
    public volatile boolean b;
    
    public dmf() {
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public final void a(final Activity activity) {
        if (this.b) {
            return;
        }
        if (!this.a.add(activity)) {
            return;
        }
        final View decorView = activity.getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnDrawListener((ViewTreeObserver$OnDrawListener)new dme(this, decorView, 0));
    }
}
