import android.content.Context;
import android.view.OrientationEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class arfn extends OrientationEventListener
{
    final arfp a;
    
    public arfn(final arfp a, final Context context) {
        this.a = a;
        super(context);
    }
    
    public final void onOrientationChanged(final int a) {
        final arfp a2 = this.a;
        a2.a = a;
        if (!a2.b) {
            a2.a();
            return;
        }
        if (arfp.d(a)) {
            arfp.e(this.a);
            return;
        }
        Math.abs(a - 90);
    }
}
