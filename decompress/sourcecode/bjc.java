import android.os.Handler;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.emsg.EventMessage;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bjc implements buc
{
    public final bou a;
    public long b;
    final /* synthetic */ bjd c;
    private final bve d;
    private final bxb e;
    
    public bjc(final bjd c, final bre bre) {
        this.c = c;
        this.a = bou.D(bre);
        this.e = new bxb();
        this.d = new bve();
        this.b = -9223372036854775807L;
    }
    
    public final void b(final ayf ayf) {
        this.a.b(ayf);
    }
    
    public final void d(final bar bar, final int n, final int n2) {
        bhp.g((buc)this.a, bar, n);
    }
    
    public final void e(long x, final int n, final int n2, final int n3, final bub bub) {
        this.a.e(x, n, n2, n3, bub);
        while (this.a.A(false)) {
            ((bcv)this.d).clear();
            bve d;
            if (this.a.E(this.e, (bdb)this.d, 0, false) == -4) {
                ((bdb)this.d).c();
                d = this.d;
            }
            else {
                d = null;
            }
            if (d != null) {
                final long e = d.e;
                final Metadata a = ((bvf)this.c.a).a(d);
                if (a == null) {
                    continue;
                }
                final EventMessage eventMessage = (EventMessage)a.b(0);
                final String a2 = eventMessage.a;
                final String b = eventMessage.b;
                if (!"urn:mpeg:dash:event:2012".equals(a2)) {
                    continue;
                }
                if (!"1".equals(b) && !"2".equals(b)) {
                    if (!"3".equals(b)) {
                        continue;
                    }
                }
                try {
                    x = baw.x(baw.N(eventMessage.e));
                }
                catch (final ayz ayz) {
                    x = -9223372036854775807L;
                }
                if (x == -9223372036854775807L) {
                    continue;
                }
                final bjb bjb = new bjb(e, x);
                final Handler b2 = this.c.b;
                b2.sendMessage(b2.obtainMessage(1, (Object)bjb));
            }
        }
        final bou a3 = this.a;
        a3.a.c(a3.k());
    }
    
    public final int f(final aya aya, final int n, final boolean b) {
        return bhp.f((buc)this.a, aya, n, b);
    }
}
