import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asb extends arp
{
    public asb(final Context context, final ajw ajw) {
        super((ars)new arz(context, ajw));
    }
    
    public final void c(final asa d) {
        final ars a = super.a;
        synchronized (((arz)a).a) {
            ((arz)a).d = d;
        }
    }
}
