import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import java.util.Iterator;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.AutoplayRendererOuterClass;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hrz
{
    public final asiq a;
    public hrx b;
    private final hsh c;
    private final hlq d;
    private final oby e;
    private final Executor f;
    private final Executor g;
    private final xam h;
    @Deprecated
    private final afaq i;
    private final abpu j;
    private final vlf k;
    private final zmf l;
    private final abfc m;
    private final hrp n;
    private final hzn o;
    private final cyb p;
    private final lkx q;
    private final aujg r;
    
    public hrz(final hsh c, final hzn o, final lkx q, final hrp n, final hlq d, final oby e, final Executor f, final Executor g, final xam h, final aujg r, final afaq i, final abpu j, final vlf k, final zmf l, final abfc m, final cyb p22, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = new asiq();
        o.getClass();
        this.o = o;
        this.d = d;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        g.getClass();
        this.g = g;
        h.getClass();
        this.h = h;
        this.c = c;
        r.getClass();
        this.r = r;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.q = q;
        this.m = m;
        this.p = p22;
        this.n = n;
    }
    
    public static abjt a(final xan g, final boolean b, final boolean b2, final zdj h) {
        final abjs a = abjt.a();
        a.g = g;
        a.d(b);
        a.c(b2);
        if (h != null) {
            a.h = h;
        }
        return a.a();
    }
    
    public static void c(final guv guv, final long n, final int n2, final afva afva) {
        if (n2 != 2) {
            guv.c(n, afva);
            return;
        }
        guv.b(n, afva);
    }
    
    public static boolean e(final answ answ) {
        return answ != null && answ.h;
    }
    
    public static PlaybackStartDescriptor f(final agmc agmc, final aiqj aiqj) {
        final Object b = agmc.b;
        ahxj ahxj = null;
        antf antf = null;
        Label_0048: {
            if (b != null) {
                final akqn akqn = (akqn)b;
                if ((akqn.b & 0x2) != 0x0) {
                    if ((antf = akqn.d) == null) {
                        antf = antf.a;
                    }
                    break Label_0048;
                }
            }
            antf = null;
        }
        aiqj a;
        int n;
        if (antf != null && antf.b == 139970731) {
            final ante ante = (ante)antf.c;
            anuv anuv;
            if ((anuv = ante.r) == null) {
                anuv = anuv.a;
            }
            if (anuv.ry((ahaq)AutoplayRendererOuterClass.autoplayEndpointRenderer)) {
                anuv anuv2;
                if ((anuv2 = ante.r) == null) {
                    anuv2 = anuv.a;
                }
                ahxj = (ahxj)anuv2.rx((ahaq)AutoplayRendererOuterClass.autoplayEndpointRenderer);
            }
            a = aiqj;
            if (ahxj != null) {
                a = aiqj;
                if ((ahxj.b & 0x8) != 0x0) {
                    final ahbb ahbb = (ahbb)((ahbh)aiqj).toBuilder();
                    final ahab d = ahxj.d;
                    ((ahaz)ahbb).copyOnWrite();
                    final aiqj aiqj2 = (aiqj)ahbb.instance;
                    d.getClass();
                    aiqj2.b |= 0x1;
                    aiqj2.c = d;
                    a = (aiqj)((ahaz)ahbb).build();
                }
            }
            n = 0;
        }
        else {
            n = 58160;
            a = aiqj;
        }
        final abjp d2 = PlaybackStartDescriptor.d();
        d2.a = a;
        d2.g = true;
        final PlaybackStartDescriptor a2 = d2.a();
        if (n != 0) {
            return hko.G(a2, 58160);
        }
        return a2;
    }
    
    public static boolean g(final answ answ, final String s, final cyb cyb, final boolean b) {
        return answ != null && answ.B && cyb.n(b) && !TextUtils.isEmpty((CharSequence)s);
    }
    
    public static boolean h(final answ answ, final cyb cyb, final boolean b) {
        return answ != null && answ.H && cyb.n(b);
    }
    
    public final void b() {
        final hrx b = this.b;
        if (b != null) {
            b.i = true;
            final Iterator iterator = b.g.values().iterator();
            while (iterator.hasNext()) {
                ((hry)iterator.next()).d();
            }
            b.g.clear();
            if (((vai)b.m.a).f(45376867L) && b.k != null) {
                try {
                    b.k.a();
                }
                catch (final Exception ex) {
                    zlm.c(zll.a, zlk.x, "Failed to cancel Player Prefetch.", (Throwable)ex);
                }
            }
            this.b = null;
        }
    }
    
    public final void d(final Optional optional, final aiqj aiqj, final String s, final boolean b) {
        this.b();
        final ArrayList l = this.o.l();
        for (int size = l.size(), i = 0; i < size; ++i) {
            ((hsa)l.get(i)).bf();
        }
        if (optional.isEmpty()) {
            ttr.b("No reel navigator.");
            return;
        }
        if (s == null) {
            ttr.b("No cpn.");
            return;
        }
        final long a = ((guv)optional.get()).a(aiqj);
        if (a == Long.MIN_VALUE) {
            ttr.b("No reel watch endpoint.");
            return;
        }
        final hlq d = this.d;
        if (((ahbc)aiqj).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            if (d.a.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
                d.d((ttg)new fdc((shd)d.a.get(reelWatchEndpointOuterClass$ReelWatchEndpoint), s, 15));
            }
        }
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        this.b = new hrx(s, a, this.o, this.i, this.e, (guv)optional.get(), this.c, this.f, this.g, this.h, this.j, this.r, this.k, this.l, new HashMap(), this.q, this.m, this.n, this.p, null, null, null, null, null, null);
        final answ answ = (answ)this.i.a();
        final hsh c = this.c;
        final boolean g = g(answ, reelWatchEndpointOuterClass$ReelWatchEndpoint2.e, this.p, hko.A(reelWatchEndpointOuterClass$ReelWatchEndpoint2));
        final hrx b2 = this.b;
        b2.getClass();
        c.c(aiqj, s, false, g, b, (zpf)b2);
        final ArrayList j = this.o.l();
        for (int size2 = j.size(), k = 0; k < size2; ++k) {
            ((hsa)j.get(k)).bm(aiqj);
        }
    }
}
