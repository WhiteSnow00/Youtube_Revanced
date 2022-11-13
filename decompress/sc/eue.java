import android.graphics.Rect;
import android.util.DisplayMetrics;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.Iterator;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eue implements eun, eul, skb
{
    public final atke a;
    public final atke b;
    public final Map c;
    private final atke d;
    private final atke e;
    private final atke f;
    private final atke g;
    private final Executor h;
    private final Map i;
    private euo j;
    
    public eue(final ccb ccb, final atke d, final atke a, final atke b, final atke e, final atke g, final atke f, final Executor h, final byte[] array, final byte[] array2) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.e = e;
        this.g = g;
        this.f = f;
        this.h = h;
        this.c = new HashMap();
        this.i = new HashMap();
        ccb.p((eun)this);
    }
    
    private static int C(final int n) {
        if (n == 0) {
            return 2;
        }
        if (n != 1) {
            return 3;
        }
        return 0;
    }
    
    public final void A(final shd shd) {
    }
    
    public final void B(final she she) {
    }
    
    public final void D() {
        for (final eud eud : this.c.values()) {
            final euf e = eud.e;
            if (e != null) {
                e.a.c((rqb)e);
                if (e.b == 2) {
                    e.b = 3;
                    e.c.l(2, new zpj[0]);
                }
            }
            if (eud.f && eud.c != null) {
                ((rpi)this.b.a()).e(sfr.a, eud.a, eud.c, 4);
            }
            if (eud.c != null) {
                ((rpi)this.b.a()).h(sfr.a, eud.a, eud.c);
            }
            if (eud.f) {
                ((rpi)this.b.a()).l(sfr.a, eud.a);
            }
            ((rpi)this.b.a()).q(sfr.a, eud.a);
        }
        for (final dmx dmx : this.i.values()) {
            if (dmx.a) {
                ((rpi)this.b.a()).e(sfr.a, (shm)dmx.b, (sfw)dmx.c, 4);
                ((rpi)this.b.a()).l(sfr.a, (shm)dmx.b);
            }
            ((rpi)this.b.a()).h(sfr.a, (shm)dmx.b, (sfw)dmx.c);
            ((rpi)this.b.a()).q(sfr.a, (shm)dmx.b);
        }
        this.c.clear();
        this.i.clear();
    }
    
    public final void a(final eud eud) {
        if (eud.e == null && eud.d != null && eud.c != null) {
            if (eud.b.b.isDone()) {
                Object e = null;
                try {
                    final hyx hyx = (hyx)this.f.a();
                    final akxi akxi = (akxi)afwm.u((Future)eud.b.b);
                    final shm a = eud.a;
                    final sfw c = eud.c;
                    final String d = eud.d;
                    e = ((atke)hyx.a).a();
                    final rpy rpy = (rpy)((atke)hyx.b).a();
                    final Object c2 = hyx.c;
                    eud.e = new euf((rqc)e, rpy, ((rzv)((atke)hyx.d).a()).l(a, c), akxi, a, c, d, (byte[])null);
                    e = eud.e;
                    if (((euf)e).b != 0) {
                        return;
                    }
                    ((euf)e).b = 1;
                    ((euf)e).a.a((rqb)e);
                    return;
                }
                catch (final ExecutionException e) {}
                catch (final rye rye) {}
                qdw.s(eud.a, ((Throwable)e).getMessage());
            }
        }
    }
    
    public final void c(final Bundle bundle) {
    }
    
    public final void d() {
    }
    
    public final void e() {
    }
    
    public final void f(final shd shd, final String s) {
        final eud eud = this.c.get(shd.a);
        if (eud == null) {
            return;
        }
        final scv a = ((rqx)this.g.a()).a;
        if (a != null) {
            a.e = s;
        }
        eud.d = s;
        this.a(eud);
    }
    
    public final void g(final boolean b) {
    }
    
    public final void h(final shd shd) {
    }
    
    public final void i(final she she) {
    }
    
    public final void j(final List list) {
        for (final she she : list) {
            final Object b = ((ziy)this.d.a()).b;
            final ahpf a = ahpf.a;
            final shm b2 = shm.b(((eg)b).T(), ahpf.c, 3, sdl.b(new sdx[] { (sdx)new sfd(she) }));
            ((rpi)this.b.a()).o(sfr.a, b2);
            ((rpi)this.b.a()).p(sfr.a, b2);
            final sfw b3 = sfw.b(((eg)((qcy)this.a.a()).c).R(ahpc.c, b2.a), ahpc.c, 3, sdl.b(new sdx[0]));
            ((rpi)this.b.a()).g(sfr.a, b2, b3);
            ((rpi)this.b.a()).f(sfr.a, b2, b3);
            this.i.put(she.a.e, new dmx(b2, b3));
        }
    }
    
    public final void k(final shd shd) {
    }
    
    public final void l(final she she) {
    }
    
    public final void m(final sjn sjn) {
        if (sjn != sjn.c) {
            return;
        }
        final euo j = this.j;
        if (j == null) {
            qdw.s((shm)null, "Received onMuteAdEvent with no registered reelMuteRequestApi");
            return;
        }
        j.a();
    }
    
    public final void n(final List list) {
        final ArrayList list2 = new ArrayList(list.size());
        final Iterator iterator = list.iterator();
        int i;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            i = 0;
            if (!hasNext) {
                break;
            }
            final shd shd = (shd)iterator.next();
            final Object b = ((ziy)this.d.a()).b;
            final ahpf a = ahpf.a;
            final shm b2 = shm.b(((eg)b).T(), ahpf.c, 3, sdl.b(new sdx[] { (sdx)new sfc(shd) }));
            ((rpi)this.b.a()).o(sfr.a, b2);
            final eud eud = new eud(b2, shd);
            list2.add(eud);
            this.c.put(shd.a, eud);
        }
        while (i < list2.size()) {
            final eud eud2 = (eud)list2.get(i);
            ((rpi)this.b.a()).p(sfr.a, eud2.a);
            eud2.b.b.addListener((Runnable)new euc(this, eud2), this.h);
            ++i;
        }
    }
    
    public final void o(final shd shd) {
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint a = shd.a;
        if (!this.c.containsKey(a)) {
            qdw.s((shm)null, "Got onPageEnter for unregistered reel");
            return;
        }
        final eud eud = this.c.get(a);
        eud.f = true;
        ((rpi)this.b.a()).j(sfr.a, eud.a);
        if (eud.c == null) {
            return;
        }
        ((rpi)this.b.a()).b(sfr.a, eud.a, eud.c);
    }
    
    public final void p(final she she) {
        final ansq a = she.a;
        if (!this.i.containsKey(a.e)) {
            qdw.r("Unrecognized page entry for reels NVC");
            return;
        }
        final dmx dmx = this.i.get(a.e);
        dmx.a = true;
        ((rpi)this.b.a()).j(sfr.a, (shm)dmx.b);
        ((rpi)this.b.a()).b(sfr.a, (shm)dmx.b, (sfw)dmx.c);
    }
    
    public final void q(final int n, shd shd) {
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint a = shd.a;
        if (!this.c.containsKey(a)) {
            qdw.s((shm)null, "Got onPageExit for unregistered reel");
            return;
        }
        shd = (shd)this.c.get(a);
        try {
            if (((eud)shd).c != null) {
                if (((eud)shd).f) {
                    ((rpi)this.b.a()).e(sfr.a, ((eud)shd).a, ((eud)shd).c, C(n));
                }
                final euf e = ((eud)shd).e;
                if (e != null) {
                    if (e.b == 2) {
                        if (n == 0) {
                            e.c.k(17, new zpj[0]);
                        }
                    }
                }
            }
            else {
                qdw.s(((eud)shd).a, "Got onPageExit with playerResponse not yet bound");
            }
            ((rpi)this.b.a()).l(sfr.a, ((eud)shd).a);
        }
        finally {
            ((eud)shd).f = false;
        }
    }
    
    public final void r(int c, final she she) {
        final ansq a = she.a;
        if (!this.i.containsKey(a.e)) {
            qdw.r("Unrecognized page exit for reels NVC");
            return;
        }
        final dmx dmx = this.i.get(a.e);
        dmx.a = false;
        final rpi rpi = (rpi)this.b.a();
        final sfr a2 = sfr.a;
        final Object b = dmx.b;
        final Object c2 = dmx.c;
        c = C(c);
        rpi.e(a2, (shm)b, (sfw)c2, c);
        ((rpi)this.b.a()).l(sfr.a, (shm)dmx.b);
    }
    
    public final void s(final eum eum) {
        eum.a((eul)this);
    }
    
    public final void t(final euo j) {
        try {
            ((skc)this.e.a()).c((skb)this);
        }
        catch (final rpq rpq) {
            qdw.s((shm)null, rpq.getMessage());
        }
        this.j = j;
    }
    
    public final void u() {
    }
    
    public final void v(final int n, final int n2) {
    }
    
    public final void w(final DisplayMetrics displayMetrics, final Rect rect, final Rect rect2) {
    }
    
    public final void x() {
        ((skc)this.e.a()).k((skb)this);
        this.j = null;
    }
    
    public final void y(final boolean b) {
    }
    
    public final void z(final boolean b) {
    }
}
