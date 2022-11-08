import android.os.SystemClock;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class acdg implements osr
{
    final /* synthetic */ acsx a;
    final /* synthetic */ acdi b;
    
    public acdg(final acdi b, final acsx a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final View view, final ouj ouj) {
        if (view != null) {
            this.a.onTouch(view, this.b.d(SystemClock.uptimeMillis(), 1, ouj));
        }
    }
}
