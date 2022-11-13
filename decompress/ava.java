import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

final class ava extends aub
{
    final avb a;
    
    public ava(final avb a) {
        this.a = a;
    }
    
    public final void onActivityPostResumed(final Activity activity) {
        this.a.a.a();
    }
    
    public final void onActivityPostStarted(final Activity activity) {
        this.a.a.b();
    }
}
