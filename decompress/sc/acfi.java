import android.os.SystemClock;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class acfi implements otz
{
    final acvb a;
    final acfl b;
    
    public acfi(final acfl b, final acvb a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final View view, final ovs ovs) {
        this.b.a = SystemClock.uptimeMillis();
        if (view != null) {
            final acvb a = this.a;
            final acfl b = this.b;
            a.onTouch(view, b.d(b.a, 0, ovs));
        }
    }
}
