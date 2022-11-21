import android.os.SystemClock;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class acgt implements our
{
    final acwn a;
    final acgw b;
    
    public acgt(final acgw b, final acwn a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final View view, final owk owk) {
        this.b.a = SystemClock.uptimeMillis();
        if (view != null) {
            final acwn a = this.a;
            final acgw b = this.b;
            a.onTouch(view, b.d(b.a, 0, owk));
        }
    }
}
