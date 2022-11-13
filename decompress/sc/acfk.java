import android.os.SystemClock;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class acfk implements oty
{
    final acvb a;
    final acfl b;
    
    public acfk(final acfl b, final acvb a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final View view) {
        if (view != null) {
            this.a.onTouch(view, this.b.d(SystemClock.uptimeMillis(), 3, ovs.a(0.0f, 0.0f)));
        }
    }
}
