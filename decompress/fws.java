import java.util.List;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.SubscribeEndpointOuterClass$SubscribeEndpoint;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class fws implements zpf
{
    final Map a;
    final SubscribeEndpointOuterClass$SubscribeEndpoint b;
    final boolean c;
    final fwv d;
    final aiqj e;
    final fwt f;
    final aslr g;
    
    public fws(final fwt f, final Map a, final SubscribeEndpointOuterClass$SubscribeEndpoint b, final boolean c, final fwv d, final aslr g, final aiqj e) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.e = e;
    }
    
    public final void a(final dbj dbj) {
        this.f.a.e((Throwable)dbj);
        final Iterator<Object> iterator = ((List<Object>)((SubscribeEndpointOuterClass$SubscribeEndpoint)((ahbc)this.e).rx((ahaq)SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint)).b).iterator();
        while (iterator.hasNext()) {
            final htg d = htg.d(this.f.c, (String)iterator.next());
            if (d != null) {
                final htf f = d.f();
                f.c(this.c);
                final htg a = f.a();
                this.f.c.d(a.b, (acjb)a);
            }
        }
        final fwv d2 = this.d;
        if (d2 != null) {
            final Object b = d2.b;
            if (b != null) {
                ((fwu)b).c();
            }
        }
        final aslr g = this.g;
        if (g != null) {
            g.b(dbj);
        }
    }
    
    public final void mX(Object b) {
        final alaf alaf = (alaf)b;
        final Map a = this.a;
        if (a != null && (alaf.b & 0x10) != 0x0) {
            final wyw wyw = (wyw)tpe.O(a, (Object)"com.google.android.libraries.youtube.logging.interaction_logger", (Class)wyw.class);
            if (wyw != null) {
                wyw.D((wzz)new wyt(alaf.h.I()));
                wyw.t((wzz)new wyt(alaf.h.I()), (alhi)null);
            }
        }
        final Iterator<Object> iterator = ((List<Object>)this.b.b).iterator();
        while (iterator.hasNext()) {
            final htf c = htg.c((String)iterator.next());
            c.d = true;
            c.c(this.c);
            c.d(alaf.i);
            c.e(true);
            if ((alaf.b & 0x4) != 0x0) {
                akuw akuw;
                if ((akuw = alaf.g) == null) {
                    akuw = akuw.a;
                }
                final int b2 = akuw.b;
                int n = 119226798;
                aona f;
                if (b2 == 119226798) {
                    f = (aona)akuw.c;
                }
                else {
                    n = b2;
                    f = null;
                }
                c.f = f;
                aomw e;
                if (n == 136076983) {
                    e = (aomw)akuw.c;
                }
                else {
                    e = null;
                }
                c.e = e;
            }
            final htg a2 = c.a();
            this.f.c.c(a2.b, (acjb)a2);
        }
        if (alaf.e.size() != 0) {
            ((vcy)this.f.b.a()).d((List)alaf.e, this.a);
        }
        final fwv d = this.d;
        if (d != null) {
            b = d.b;
            if (b != null) {
                ((fwu)b).b(alaf);
            }
        }
        final aslr g = this.g;
        if (g != null) {
            g.a();
        }
    }
    
    public final void mY() {
    }
}
