import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjq implements afty
{
    public final adjv a;
    public final String b;
    public final aphu c;
    public final boolean d;
    
    public adjq(final adjv a, final String b, final aphu c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final ListenableFuture a() {
        final adjv a = this.a;
        final String b = this.b;
        final aphu c = this.c;
        final boolean d = this.d;
        final admv b2 = a.g.b(b);
        final adjz adjz = a.q.get(b);
        ListenableFuture listenableFuture = afwm.m((Object)false);
        final Boolean value = true;
        if (b2 == null) {
            if (adjz != null) {
                a.k.f(b, null, c);
                listenableFuture = afwm.m((Object)value);
            }
            else {
                a.M("Cannot cancel an upload that does not exist.");
            }
        }
        else if (!b2.x && !a.r.contains(b)) {
            a.I(b2, c);
            listenableFuture = afwm.m((Object)value);
        }
        else if (d) {
            ((admj)a.h.a()).v(b);
            return afwm.m((Object)value);
        }
        return listenableFuture;
    }
}
