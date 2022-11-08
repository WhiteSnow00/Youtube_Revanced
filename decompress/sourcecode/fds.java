import j$.util.Optional;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fds implements vau
{
    public final vax a;
    public final jpd b;
    public final uyi c;
    public final uyi d;
    public final eg e;
    private final tku g;
    private final xlv h;
    private final abno i;
    private final vdp j;
    private final zki k;
    private final Executor l;
    private final Executor m;
    private final fai n;
    private final abhq o;
    private final flg p;
    private final uyi r;
    private final aamd s;
    
    public fds(final vax a, final tku g, final uyi c, final uyi d, final xlv h, final abno i, final abhq o, final eg e, final vbq j, final zki k, final aamd s, final Executor l, final Executor m, final fai n, final jpd b, final flg p21, final uyi r, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.g = g;
        this.c = c;
        this.d = d;
        this.h = h;
        this.i = i;
        this.o = o;
        this.e = e;
        this.j = (vdp)j;
        this.k = k;
        this.s = s;
        this.l = l;
        this.m = m;
        this.n = n;
        this.b = b;
        this.p = p21;
        this.r = r;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        if (((agzd)aioe).rs((agyr)aoea.b)) {
            final aoea aoea = (aoea)((agzd)aioe).rr((agyr)aoea.b);
            final int f = this.h.f();
            int n = 1;
            if (f != 0) {
                if (this.h.f() == 1) {
                    n = n;
                }
                else {
                    n = 0;
                }
            }
            final int c = aoea.c;
            ListenableFuture listenableFuture2 = null;
            Label_0431: {
                if ((c & 0x1) != 0x0 && n == 0) {
                    if ((c & 0x4) == 0x0 || !aoea.f.equals(this.i.s()) || this.o.t()) {
                        if (!this.n.h()) {
                            final ListenableFuture e = afrp.e((ListenableFuture)aftj.m(this.g.a()), (aexg)new bwj(this, 8), this.m);
                            ListenableFuture listenableFuture;
                            if ((aoea.c & 0x4) != 0x0 && this.s.c()) {
                                final String f2 = aoea.f;
                                if (this.r.aw()) {
                                    final ListenableFuture f3 = afrp.f((ListenableFuture)aftj.m(uji.P(this.p.b(f2).C((asjc)exl.i).J((asjc)exl.j).aa((Object)Optional.empty()))), (afry)new fdr(this, 2), this.m);
                                    final iio a = iio.a;
                                    a.getClass();
                                    listenableFuture = afrp.e(f3, (aexg)new bwj(a, 9), this.m);
                                }
                                else {
                                    final ListenableFuture f4 = afrp.f((ListenableFuture)aftj.m(tmy.ci(this.j.f(this.k.c()).f(gkt.aZ(f2)).j((Class)apwi.class))), (afry)new fdr(this, 3), this.m);
                                    final iio a2 = iio.a;
                                    a2.getClass();
                                    listenableFuture = afrp.e(f4, (aexg)new bwj(a2, 9), this.m);
                                }
                            }
                            else {
                                listenableFuture = afva.m((Object)false);
                            }
                            listenableFuture2 = afrp.f((ListenableFuture)aftj.m(e), (afry)new fdr(afrp.e((ListenableFuture)aftj.m(listenableFuture), fee.b, this.m), 0), this.m);
                            break Label_0431;
                        }
                    }
                }
                listenableFuture2 = afva.m((Object)false);
            }
            tcp.k(listenableFuture2, this.l, (tcn)etg.i, (tco)new exa(this, aoea, 7));
            return;
        }
        throw new vbh();
    }
}
