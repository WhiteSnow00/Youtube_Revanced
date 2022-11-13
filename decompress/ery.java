import java.util.concurrent.TimeUnit;
import java.util.Observer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ery implements Runnable
{
    public final esm a;
    
    public ery(final esm a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final wyl wyl = (wyl)this.a.bC.a();
        synchronized (wyl.p) {
            if (wyl.c) {
                zlm.b(zll.b, zlk.l, "HeartbeatClient.configure() have been called more than once.");
                return;
            }
            final akcn f = wyl.C.f();
            alvx alvx;
            if (f == null) {
                alvx = null;
            }
            else {
                alvy alvy;
                if ((alvy = f.m) == null) {
                    alvy = alvy.a;
                }
                if ((alvx = alvy.f) == null) {
                    alvx = alvx.a;
                }
            }
            Label_0807: {
                if (alvx != null && alvx.b) {
                    if ((wyl.t = alvx.g) != 0) {
                        long c;
                        if ((c = ((aqpr)wyl.x.c()).c) == -1L) {
                            c = 0L;
                        }
                        final long n = wyl.t * 4;
                        wyl.u = 2;
                        teu.m(wyl.b(c + n), (tes)vcb.h);
                    }
                    synchronized (wyl.p) {
                        wyl.s.addObserver((Observer)wyl);
                        wyl.n = wyl.v.a((Object)wyl, (Class)zms.class, (tge)new wyk(wyl, 1));
                        wyl.o = wyl.v.a((Object)wyl, (Class)zmu.class, (tge)new wyk(wyl, 0));
                        if (wyl.i == null) {
                            wyl.j = (tgz)new tsz(wyl, 2);
                            wyl.k = (tha)new tta(wyl, 2);
                            (wyl.i = new thg()).a(wyl.q);
                        }
                        wyl.i.c((thc)wyl.j);
                        wyl.i.c((thc)wyl.k);
                        monitorexit(wyl.p);
                        long g;
                        if (alvx.c <= 0) {
                            g = wyl.a;
                        }
                        else {
                            g = TimeUnit.SECONDS.toMillis(alvx.c);
                        }
                        wyl.g = g;
                        long h;
                        if (alvx.d <= 0) {
                            h = wyl.b;
                        }
                        else {
                            h = TimeUnit.SECONDS.toMillis(alvx.d);
                        }
                        wyl.h = h;
                        final boolean e = alvx.e;
                        wyl.d = e;
                        wyl.e = alvx.f;
                        wyl.f = alvx.h;
                        zme c2;
                        if (e) {
                            c2 = wyl.w.c();
                        }
                        else {
                            c2 = null;
                        }
                        wyl.l = c2;
                        if (!wyl.d) {
                            wyl.m = null;
                        }
                        else if (wyl.z) {
                            wyl.m = new zli(wyl.D.ag(wyl.w.c()), wyl.w.c().g());
                        }
                        else {
                            wyl.m = new zli(wyl.w.k(), wyl.w.c().g());
                        }
                        if (qca.c(wyl.q.getApplicationContext())) {
                            wyl.e();
                            break Label_0807;
                        }
                        wyl.d();
                        break Label_0807;
                    }
                }
                synchronized (wyl.p) {
                    final thg i = wyl.i;
                    if (i != null) {
                        i.b(wyl.q);
                        wyl.i.d((thc)wyl.j);
                        wyl.i.d((thc)wyl.k);
                        wyl.s.deleteObserver((Observer)wyl);
                        wyl.v.l(new tgf[] { wyl.n });
                        wyl.v.l(new tgf[] { wyl.o });
                    }
                    wyl.h();
                    monitorexit(wyl.p);
                    wyl.c = true;
                }
            }
        }
    }
}
