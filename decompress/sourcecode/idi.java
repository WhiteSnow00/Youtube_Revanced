import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class idi extends icx
{
    public final atjj a;
    private final Executor b;
    
    public idi(final atjj a, final Executor b) {
        this.a = a;
        this.b = b;
    }
    
    public static alxc k(final zyz zyz) {
        final zyx a = zyz.a;
        final List b = zyz.b;
        final String a2 = a.a;
        final String bj = gkt.bj(a2);
        bj.getClass();
        agot.E(bj.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = ((agzi)alxg.a).createBuilder();
        builder.copyOnWrite();
        final alxg alxg = (alxg)builder.instance;
        alxg.c |= 0x1;
        alxg.d = bj;
        final alxc alxc = new alxc(builder);
        final agza a3 = alxc.a;
        a3.copyOnWrite();
        final alxg alxg2 = (alxg)a3.instance;
        alxg2.c |= 0x4;
        alxg2.e = a2;
        final String b2 = a.b;
        final agza a4 = alxc.a;
        a4.copyOnWrite();
        final alxg alxg3 = (alxg)a4.instance;
        b2.getClass();
        alxg3.c |= 0x10;
        alxg3.g = b2;
        final String bt = gkt.bt(a2);
        final agza a5 = alxc.a;
        a5.copyOnWrite();
        final alxg alxg4 = (alxg)a5.instance;
        bt.getClass();
        alxg4.c |= 0x80;
        alxg4.m = bt;
        final Iterator iterator = b.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            int i = 0;
            if (!hasNext) {
                break;
            }
            final String bk = gkt.bk(a2, (String)iterator.next());
            while (i <= 0) {
                final String s = (new String[] { bk })[i];
                final agza a6 = alxc.a;
                a6.copyOnWrite();
                final alxg alxg5 = (alxg)a6.instance;
                s.getClass();
                final agzy j = alxg5.j;
                if (!j.c()) {
                    alxg5.j = agzi.mutableCopy(j);
                }
                alxg5.j.add((Object)s);
                ++i;
            }
        }
        final agp n = a.n;
        if (n != null) {
            final String av = gkt.aV((String)n.e);
            final agza a7 = alxc.a;
            a7.copyOnWrite();
            final alxg alxg6 = (alxg)a7.instance;
            av.getClass();
            alxg6.c |= 0x8;
            alxg6.f = av;
        }
        final int f = apwq.b.f;
        final agza builder2 = ((agzi)anib.a).createBuilder();
        final aorm e = a.d.e();
        builder2.copyOnWrite();
        final anib anib = (anib)builder2.instance;
        e.getClass();
        anib.c = e;
        anib.b = 1;
        alxc.b(Integer.valueOf(f), (anib)builder2.build());
        final aorm as = gkt.aS(a);
        alxc.b(Integer.valueOf(4), fbp.q(as));
        alxc.b(Integer.valueOf(3), fbp.q(as));
        alxc.b(Integer.valueOf(2), fbp.q(null));
        alxc.b(Integer.valueOf(0), fbp.q(null));
        return alxc;
    }
    
    private final ListenableFuture m(final vdv vdv, final zyz zyz) {
        return afld.k((Callable)new czz(this, vdv, zyz, 7), this.b);
    }
    
    public final ListenableFuture a(final vdv vdv, final zyz zyz) {
        return this.m(vdv, zyz);
    }
    
    public final ListenableFuture b(final vdv vdv, final String s) {
        return afld.k((Callable)new czz(this, vdv, s, 6), this.b);
    }
    
    public final ListenableFuture c(final vdv vdv, final zyz zyz) {
        return this.m(vdv, zyz);
    }
    
    public final ListenableFuture d(final vdv vdv, final zyz zyz) {
        return afld.k((Callable)new hlc(vdv, zyz, 15), this.b);
    }
    
    public final ListenableFuture f(final aack aack) {
        return afld.m(aack.i().k(), (aexg)new hwh(this, 4), this.b);
    }
    
    public final void l(final zyx zyx) {
        final bhu bhu = (bhu)this.a.a();
        final String e = fms.e(zyx.a);
        apwq apwq;
        if (!zyx.a.startsWith("BL")) {
            apwq = apwq.b;
        }
        else {
            final int n = gkt.aT(zyx) - 1;
            if (n != 2) {
                if (n != 3) {
                    apwq = apwq.c;
                }
                else {
                    apwq = apwq.e;
                }
            }
            else {
                apwq = apwq.d;
            }
        }
        bhu.D(e, (Object)apwq);
    }
}
