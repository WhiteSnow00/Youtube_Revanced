import java.util.List;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjj implements afty
{
    public final adjv a;
    public final zme b;
    public final String c;
    public final aphs d;
    public final boolean e;
    
    public adjj(final adjv a, final zme b, final String c, final aphs d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final ListenableFuture a() {
        final adjv a = this.a;
        final zme b = this.b;
        final String c = this.c;
        final aphs d = this.d;
        final boolean e = this.e;
        adkp.I(b.z() ^ true, "Need a signed-in user.");
        final admv b2 = a.g.b(c);
        b2.getClass();
        ListenableFuture listenableFuture;
        if (b2.x) {
            a.M("Upload cannot be confirmed twice.");
            listenableFuture = afwm.m((Object)aezp.k((Object)a.a(b2)));
        }
        else {
            final adjz adjz = a.q.get(c);
            adjz.getClass();
            adkp.I((b2.b & 0x80) != 0x0, "Upload type is not set.");
            adkp.I(true ^ adjz.f, "Cannot confirm an upload which failed its creation.");
            final adlq a2 = a.g.a(c, new adjl(b));
            final List k = adpp.k(a.a);
            if (b2.D) {
                k.add(aphq.f);
            }
            k.add(aphq.h);
            final admv b3 = a2.b;
            b3.getClass();
            final adlp i = a.k;
            final String d2 = b.d();
            admt admt;
            if ((admt = admt.a(b2.l)) == null) {
                admt = admt.a;
            }
            i.k(c, d2, d, adjx.l(admt), e, k.toArray(new aphq[0]));
            a.i.i(c, b3);
            listenableFuture = afwm.m((Object)aezp.k((Object)a.a(b3)));
        }
        return listenableFuture;
    }
}
