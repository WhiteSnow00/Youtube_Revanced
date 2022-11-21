import android.app.Activity;
import android.os.Bundle;
import android.view.ViewTreeObserver$OnWindowFocusChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aegi implements ViewTreeObserver$OnWindowFocusChangeListener
{
    public final aegj a;
    
    public aegi(final aegj a) {
        this.a = a;
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        final aegj a = this.a;
        final aegr a2 = aegr.a(a.getContext());
        final String shortString = a.a.getComponentName().toShortString();
        final Activity a3 = a.a;
        final Bundle bundle = new Bundle();
        bundle.putString("packageName", a3.getComponentName().getPackageName());
        bundle.putString("screenName", a3.getComponentName().getShortClassName());
        bundle.putInt("hash", a.hashCode());
        bundle.putBoolean("focus", b);
        bundle.putLong("timeInMillis", System.currentTimeMillis());
        a2.g(shortString, bundle);
    }
}
