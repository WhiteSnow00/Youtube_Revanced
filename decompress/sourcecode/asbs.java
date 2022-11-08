import java.util.logging.Logger;
import java.util.List;
import io.grpc.Status;
import java.util.Map;
import java.util.IdentityHashMap;
import java.util.logging.Level;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asbs implements Runnable
{
    final /* synthetic */ aruo a;
    final /* synthetic */ atdo b;
    
    public asbs(final atdo b, final aruo a, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final atdo b = this.b;
        final asbz asbz = (asbz)b.c;
        if (asbz.r != b.a) {
            return;
        }
        final aruo a = this.a;
        final List a2 = a.a;
        asbz.H.b(1, "Resolved address: {0}, config={1}", new Object[] { a2, a.b });
        final asbz asbz2 = (asbz)this.b.c;
        if (asbz2.R != 2) {
            asbz2.H.b(2, "Address resolved: {0}", new Object[] { a2 });
            ((asbz)this.b.c).R = 2;
        }
        ((asbz)this.b.c).S = null;
        final aruo a3 = this.a;
        final arum c = a3.c;
        final arsy arsy = (arsy)a3.b.a(arsy.a);
        asci asci = null;
        Label_0176: {
            if (c != null) {
                final Object b2 = c.b;
                if (b2 != null) {
                    asci = (asci)b2;
                    break Label_0176;
                }
            }
            asci = null;
        }
        Status a4;
        if (c != null) {
            a4 = c.a;
        }
        else {
            a4 = null;
        }
        final asbz asbz3 = (asbz)this.b.c;
        asci k;
        if (!asbz3.M) {
            if (asci != null) {
                asbz3.H.a(2, "Service config from name resolver discarded by channel settings");
            }
            final Object c2 = this.b.c;
            k = asbz.f;
            if (arsy != null) {
                ((asbz)c2).H.a(2, "Config selector from name resolver discarded by channel settings");
            }
            ((asbz)this.b.c).J.d(k.a());
        }
        else {
            if (asci != null) {
                if (arsy != null) {
                    asbz3.J.d(arsy);
                    k = asci;
                    if (asci.a() != null) {
                        ((asbz)this.b.c).H.a(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                        k = asci;
                    }
                }
                else {
                    asbz3.J.d(asci.a());
                    k = asci;
                }
            }
            else if (a4 != null) {
                if (!asbz3.L) {
                    asbz3.H.a(2, "Fallback to error due to invalid first service config without default config");
                    this.b.c(c.a);
                    return;
                }
                k = asbz3.K;
            }
            else {
                k = asbz.f;
                asbz3.J.d((arsy)null);
            }
            if (!k.equals(((asbz)this.b.c).K)) {
                final arrm h = ((asbz)this.b.c).H;
                String s;
                if (k == asbz.f) {
                    s = " to empty";
                }
                else {
                    s = "";
                }
                h.b(2, "Service config changed{0}", new Object[] { s });
                ((asbz)this.b.c).K = k;
            }
            try {
                ((asbz)this.b.c).L = true;
            }
            catch (final RuntimeException ex) {
                final Logger a5 = asbz.a;
                final Level warning = Level.WARNING;
                final String value = String.valueOf(((asbz)this.b.c).i);
                final StringBuilder sb = new StringBuilder("[");
                sb.append(value);
                sb.append("] Unexpected exception from parsing service config");
                a5.logp(warning, "io.grpc.internal.ManagedChannelImpl$NameResolverListener$1NamesResolved", "run", sb.toString(), ex);
            }
        }
        final arrg b3 = this.a.b;
        final atdo b4 = this.b;
        if (b4.b == ((asbz)b4.c).s) {
            final auls c3 = b3.c();
            final arrf a6 = arsy.a;
            if (((arrg)c3.a).b.containsKey(a6)) {
                final IdentityHashMap identityHashMap = new IdentityHashMap(((arrg)c3.a).b);
                identityHashMap.remove(a6);
                c3.a = new arrg(identityHashMap);
            }
            final Object b5 = c3.b;
            if (b5 != null) {
                ((IdentityHashMap)b5).remove(a6);
            }
            final Map c4 = k.c;
            if (c4 != null) {
                c3.b(artq.a, (Object)c4);
                c3.a();
            }
            final arrg a7 = c3.a();
            final arxy a8 = ((asbr)this.b.b).a;
            final artm a9 = arsu.a(a2, a7, k.b);
            asex asex;
            if ((asex = (asex)a9.c) == null) {
                try {
                    final aseo d = a8.d;
                    final Object a10 = d.a;
                    final artr a11 = ((arts)d.b).a((String)a10);
                    if (a11 == null) {
                        final StringBuilder sb2 = new StringBuilder("Trying to load '");
                        sb2.append((String)a10);
                        sb2.append("' because using default policy, but it's unavailable");
                        throw new aryc(sb2.toString());
                    }
                    asex = new asex(a11, (Object)null);
                }
                catch (final aryc aryc) {
                    a8.a.d(arrx.c, (arto)new arya(Status.k.withDescription(aryc.getMessage())));
                    a8.b.c();
                    a8.c = null;
                    a8.b = (artq)new aryb();
                    return;
                }
            }
            final artr c5 = a8.c;
            if (c5 == null || !asex.a.b().equals(c5.b())) {
                a8.a.d(arrx.a, (arto)new arxz());
                a8.b.c();
                a8.c = asex.a;
                final artq b6 = a8.b;
                a8.b = a8.c.a(a8.a);
                a8.a.a().b(2, "Load balancer changed from {0} to {1}", new Object[] { b6.getClass().getSimpleName(), a8.b.getClass().getSimpleName() });
            }
            final Object b7 = asex.b;
            if (b7 != null) {
                a8.a.a().b(1, "Load-balancing config: {0}", new Object[] { b7 });
            }
            if (!a8.b.d(arsu.a(a9.a, a9.b, b7))) {
                this.b.e();
            }
        }
    }
}
