import android.content.Context;
import android.view.OrientationEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class arcr extends OrientationEventListener
{
    final arct a;
    
    public arcr(final arct a, final Context context) {
        this.a = a;
        super(context);
    }
    
    public final void onOrientationChanged(final int a) {
        final arct a2 = this.a;
        a2.a = a;
        if (!a2.b) {
            a2.a();
            return;
        }
        if (arct.d(a)) {
            arct.e(this.a);
            return;
        }
        Math.abs(a - 90);
    }
}
