import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import android.util.SparseArray;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ConcurrentMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aevx implements aevu, aetp
{
    public static final afma a;
    public final oco b;
    public final afxk c;
    public final ConcurrentMap d;
    public final AtomicLong e;
    public final int f;
    public final int g;
    private final aeuo h;
    private final atnb i;
    private final aewi j;
    private final aeud k;
    
    static {
        a = afma.m("com/google/apps/tiktok/tracing/TraceManagerImpl");
    }
    
    public aevx(final aeuo h, final oco b, final afxk c, final atnb i, final aewi j, final aeud k, final Map map, final Map map2) {
        final boolean b2 = true;
        this.d = (ConcurrentMap)new ConcurrentHashMap(2, 0.75f, 1);
        this.h = h;
        this.b = b;
        this.c = c;
        this.i = i;
        this.j = j;
        this.k = k;
        if (!map.isEmpty()) {
            adme.L(((afkc)map).d == 1, "Please only specify the max number of spans once.");
            this.f = ((aeui)agpx.an(((afgm)map).s())).a();
        }
        else {
            this.f = 500;
        }
        if (!map2.isEmpty()) {
            adme.L(((afkc)map2).d == 1 && b2, "Please only specify the trace deadline limit once.");
            this.g = ((aevo)agpx.an(((afgm)map2).s())).a();
        }
        else {
            this.g = 2100000;
        }
        this.e = new AtomicLong(this.g);
    }
    
    private static final void f(final aevk aevk, final String s) {
        if (aevk != null) {
            aetw aetw;
            if (aevk instanceof aetz) {
                String s3;
                final String s2 = s3 = aewp.h(aevk);
                if (!"".equals(s2)) {
                    s3 = ": ".concat(String.valueOf(s2));
                }
                aetw = new aetw(s3, s, ((aetz)aevk).f());
                aewk.d(aetw);
            }
            else {
                aetw = new aetw(s);
                aewk.d(aetw);
            }
            c.i(((aflw)aevt.a).g().h(afmz.a, (Object)"TraceManager"), "Duplicate trace", "com/google/apps/tiktok/tracing/TraceManager", "reportDuplicateTraceException", 'k', "TraceManager.java", aetw);
        }
    }
    
    private final aevk g(final String s, final aevb aevb, final long f, final long n, final int n2) {
        final UUID b = this.k.b();
        final float a = this.j.a;
        b.getLeastSignificantBits();
        final ahcr builder = aewg.a.createBuilder();
        final long leastSignificantBits = b.getLeastSignificantBits();
        builder.copyOnWrite();
        final aewg aewg = (aewg)builder.instance;
        aewg.b |= 0x2;
        aewg.d = leastSignificantBits;
        final long mostSignificantBits = b.getMostSignificantBits();
        builder.copyOnWrite();
        final aewg aewg2 = (aewg)builder.instance;
        aewg2.b |= 0x1;
        aewg2.c = mostSignificantBits;
        builder.copyOnWrite();
        final aewg aewg3 = (aewg)builder.instance;
        aewg3.b |= 0x4;
        aewg3.f = f;
        builder.copyOnWrite();
        final aewg aewg4 = (aewg)builder.instance;
        aewg4.b |= 0x8;
        aewg4.g = n / 1000000L;
        builder.copyOnWrite();
        final aewg aewg5 = (aewg)builder.instance;
        aewg5.i = 1;
        aewg5.b |= 0x40;
        final aewg aewg6 = (aewg)builder.build();
        final aewu aewu = new aewu(s, aevb, n2);
        final aeww aeww = new aeww(this, b, aewg6, aewu, n, this.b);
        final aeup aeup = new aeup(aewu, aeww);
        final aeuo h = this.h;
        if (h.d.compareAndSet(false, true)) {
            h.c.execute((Runnable)new com.google.android.youtube.api.jar.client.c(h, 20));
        }
        final aeun aeun = new aeun(aeup, h.b);
        aeuo.a.put((Object)aeun, (Object)Boolean.TRUE);
        (aeww.e = (ListenableFuture)aeun.a).addListener((Runnable)aeww, (Executor)this.c);
        this.d.put(b, aeww);
        aewp.n(aeup);
        return aeup;
    }
    
    @Override
    public final Map a() {
        final afgj h = afgm.h();
        for (final Map.Entry<K, aeww> entry : this.d.entrySet()) {
            h.g(entry.getKey(), entry.getValue().b().d);
        }
        return h.c();
    }
    
    @Override
    public final aeuq b(final String s, final aevb aevb) {
        return this.c(s, aevb, this.b.c(), this.b.e());
    }
    
    @Override
    public final aeuq c(final String s, final aevb aevb, final long n, final long n2) {
        final aevk a = aewp.a();
        f(a, s);
        final aevk g = this.g(s, aevb, n, n2, 1);
        if (a == ((aeup)g).a) {
            return g;
        }
        return new aevv(g, a);
    }
    
    @Override
    public final aevj d(final String s, final aevb aevb) {
        final aevk a = aewp.a();
        f(a, s);
        return new aevw(new aeux(this.g(s, aevb, this.b.c(), this.b.e(), 2)), a);
    }
    
    public void e(aewg a, final SparseArray sparseArray, final String s) {
        a = (aewg)aewp.a();
        aewp.n((aevk)new aeul(s, aeul.a, aeva.a));
        try {
            for (adgg adgg : (Set)this.i.a()) {}
            aewp.n((aevk)a);
        }
        finally {
            aewp.n((aevk)a);
            while (true) {}
        }
    }
}
