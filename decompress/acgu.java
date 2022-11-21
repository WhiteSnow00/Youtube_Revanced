import android.os.SystemClock;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class acgu implements ous
{
    final acwn a;
    final acgw b;
    
    public acgu(final acgw b, final acwn a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final View view, final owk owk) {
        if (view != null) {
            this.a.onTouch(view, this.b.d(SystemClock.uptimeMillis(), 1, owk));
        }
    }
}
