import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

final class hdy implements rbr
{
    final /* synthetic */ Activity a;
    final /* synthetic */ hea b;
    
    public hdy(final hea b, final Activity a) {
        this.b = b;
        this.a = a;
    }
    
    public final void nP(final boolean b) {
        final hea b2 = this.b;
        final boolean o = hgd.o((rbi)b2.ah, b2.ai, b2.r(), b2.ae);
        final Activity a = this.a;
        if (a != null) {
            hgd.w(b, b2.aF, a, o);
        }
    }
}
