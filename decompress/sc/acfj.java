import android.os.SystemClock;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class acfj implements oua
{
    final acvb a;
    final acfl b;
    
    public acfj(final acfl b, final acvb a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final View view, final ovs ovs) {
        if (view != null) {
            this.a.onTouch(view, this.b.d(SystemClock.uptimeMillis(), 1, ovs));
        }
    }
}
