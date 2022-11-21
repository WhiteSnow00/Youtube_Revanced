import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aari implements Runnable
{
    public final aark a;
    public final boolean b;
    public final Context c;
    public final float d;
    public final ViewGroup e;
    
    public aari(final aark a, final boolean b, final Context c, final float d, final ViewGroup e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void run() {
        final aark a = this.a;
        final boolean b = this.b;
        int n;
        if (!b) {
            n = 16842872;
        }
        else {
            n = 16842871;
        }
        this.e.addView((View)(a.k = new aarj(this.c, (aatv)a, aavd.b(this.d), b, n)));
        a.k.invalidate();
    }
}
