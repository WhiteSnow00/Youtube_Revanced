import android.os.SystemClock;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class acdh implements osp
{
    final /* synthetic */ acsx a;
    final /* synthetic */ acdi b;
    
    public acdh(final acdi b, final acsx a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final View view) {
        if (view != null) {
            this.a.onTouch(view, this.b.d(SystemClock.uptimeMillis(), 3, ouj.a(0.0f, 0.0f)));
        }
    }
}
