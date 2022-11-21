import android.os.SystemClock;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class acgv implements ouq
{
    final acwn a;
    final acgw b;
    
    public acgv(final acgw b, final acwn a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final View view) {
        if (view != null) {
            this.a.onTouch(view, this.b.d(SystemClock.uptimeMillis(), 3, owk.a(0.0f, 0.0f)));
        }
    }
}
