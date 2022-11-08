import android.os.SystemClock;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class acdf implements osq
{
    final /* synthetic */ acsx a;
    final /* synthetic */ acdi b;
    
    public acdf(final acdi b, final acsx a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final View view, final ouj ouj) {
        this.b.a = SystemClock.uptimeMillis();
        if (view != null) {
            final acsx a = this.a;
            final acdi b = this.b;
            a.onTouch(view, b.d(b.a, 0, ouj));
        }
    }
}
