import java.util.Map;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import android.util.Pair;
import android.graphics.Bitmap;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjs implements ace
{
    public final adjv a;
    public final String b;
    public final zme c;
    public final aphs d;
    public final boolean e;
    
    public adjs(final adjv a, final String b, final zme c, final aphs d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final Object a(final acc acc) {
        final adjv a = this.a;
        final String b = this.b;
        final zme c = this.c;
        final aphs d = this.d;
        final boolean e = this.e;
        a.r.add(b);
        if (a.n) {
            final adjz adjz = a.q.get(b);
            if (adjz != null && !adjz.f) {
                final Map q = a.q;
                final adjy b2 = adjz.b();
                b2.b(true);
                q.put(b, b2.a());
            }
        }
        tbi.f();
        final adjz adjz2 = a.q.get(b);
        ListenableFuture listenableFuture;
        if (adjz2 != null && !adjz2.f && adjz2.d != null && !Uri.EMPTY.equals((Object)adjz2.d)) {
            try {
                ((admj)a.h.a()).C(adjz2.d);
                listenableFuture = afwm.m((Object)Pair.create((Object)aezp.k((Object)adjz2), (Object)aezp.j((Object)a.p.get(b))));
            }
            catch (final RuntimeException ex) {
                ttr.f("UploadClientApi", "Cannot start service inline", (Throwable)ex);
                listenableFuture = afwm.l((Throwable)ex);
            }
        }
        else {
            ttr.m("UploadClientApi", "Falling back to ForegroundService async start.");
            listenableFuture = aftq.f(afnd.p((afty)new adef(a, b, 5), a.e), (aftz)new xow(a, b, 7), a.f);
        }
        final ListenableFuture p = afnd.p((afty)new adjj(a, c, b, d, e), a.e);
        final ListenableFuture f = aftq.f(listenableFuture, (aftz)new xow(a, b, 8), a.c);
        final Long n = (Long)((vai)a.s.c).n(45364156L).aM();
        ListenableFuture t = p;
        if (n > 0L) {
            t = afwm.t(p, (long)n, TimeUnit.SECONDS, a.d);
        }
        teu.k((ListenableFuture)new afuh((afeh)afeq.p((Object[])new ListenableFuture[] { t, f }), true), a.c, (tes)new fwr(a, acc, b, 11), (tet)new vcd(a, b, acc, 19));
        return "UploadApiConfirm";
    }
}
