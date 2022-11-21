import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adrj implements Runnable
{
    public final adrm a;
    public final adrl b;
    public final String c;
    public final adrh d;
    public final adrf e;
    
    public adrj(final adrm a, final adrl b, final String c, final adrh d, final adrf e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void run() {
        final adrm a = this.a;
        final adrl b = this.b;
        final String c = this.c;
        final adrh d = this.d;
        final adrf e = this.e;
        if (b.d()) {
            return;
        }
        try {
            final adoj b2 = a.d.b(c);
            if (b2 == null) {
                tut.c("UploadTaskController", "Cannot call executeOrUndoTask because job doesn't exist in database");
                b.a.R((Throwable)new NullPointerException());
                return;
            }
            final adog b3 = d.b(b2);
            final boolean b4 = b3 != null && b2.ai;
            d.g();
            int n = 3;
            if (b3 != null) {
                if (adgg.t(b3)) {
                    a.e(c, b3, d, e, b);
                    return;
                }
                final int y = adme.y(b3.c);
                if (y != 0) {
                    if (y == 3 && b3.f > a.b.c()) {
                        a.e(c, b3, d, e, b);
                        return;
                    }
                }
            }
            adnq adnq;
            if (b4) {
                adnq = d.l();
            }
            else {
                adnq = d.a(b2);
            }
            if (adnq != null && !b2.aj) {
                final adnr g = adnq.g();
                if (!g.b) {
                    d.g();
                    final asdz b5 = adro.b(c);
                    b5.f(afhk.s(adnq));
                    final adro d2 = b5.d();
                    final adnd e2 = a.e;
                    final String e3 = b2.e;
                    final apki j = d.j;
                    final int c2 = g.c;
                    final ahcr builder = apjv.a.createBuilder();
                    final apjq a2 = e2.a(c);
                    builder.copyOnWrite();
                    final apjv apjv = (apjv)builder.instance;
                    a2.getClass();
                    apjv.c = a2;
                    apjv.b |= 0x1;
                    builder.copyOnWrite();
                    final apjv apjv2 = (apjv)builder.instance;
                    apjv2.d = j.S;
                    apjv2.b |= 0x2;
                    if (c2 != 1) {
                        if (c2 != 2) {
                            if (c2 != 3) {
                                if (c2 != 4) {
                                    if (c2 != 5) {
                                        n = 1;
                                    }
                                    else {
                                        n = 9;
                                    }
                                }
                                else {
                                    n = 7;
                                }
                            }
                            else {
                                n = 4;
                            }
                        }
                    }
                    else {
                        n = 2;
                    }
                    builder.copyOnWrite();
                    final apjv apjv3 = (apjv)builder.instance;
                    apjv3.e = n - 1;
                    apjv3.b |= 0x8;
                    final apjv apjv4 = (apjv)builder.build();
                    final akps d3 = akpu.d();
                    ((ahcr)d3).copyOnWrite();
                    akpu.aq((akpu)d3.instance, apjv4);
                    e2.b(e3, (akpu)((ahcr)d3).build());
                    b.a.Q((Object)d2);
                    return;
                }
            }
            final long c3 = a.b.c();
            ListenableFuture listenableFuture;
            if (b4) {
                listenableFuture = d.e(c, a.d);
            }
            else {
                final adnd e4 = a.e;
                final String e5 = b2.e;
                final apki i = d.j;
                final ahcr builder2 = apjw.a.createBuilder();
                final apjq a3 = e4.a(c);
                builder2.copyOnWrite();
                final apjw apjw = (apjw)builder2.instance;
                a3.getClass();
                apjw.c = a3;
                apjw.b |= 0x1;
                builder2.copyOnWrite();
                final apjw apjw2 = (apjw)builder2.instance;
                apjw2.d = i.S;
                apjw2.b |= 0x2;
                final akps d4 = akpu.d();
                ((ahcr)d4).copyOnWrite();
                akpu.ao((akpu)d4.instance, (apjw)builder2.build());
                e4.b(e5, (akpu)((ahcr)d4).build());
                listenableFuture = d.p(c, a.d);
            }
            b.b(listenableFuture);
            afxr.v(listenableFuture, new adrk(a, c, d, e, b, c3, b4, listenableFuture), a.c);
        }
        catch (final admk admk) {
            tut.f("UploadTaskController", "Storage exception trying to read job before executing upload task", (Throwable)admk);
            b.a.R((Throwable)admk);
        }
    }
}
