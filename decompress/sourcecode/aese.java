import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import android.util.SparseArray;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import com.google.android.youtube.api.jar.client.d;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ConcurrentMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aese implements aesb, aepw
{
    public static final afik a;
    public final oas b;
    public final afts c;
    public final ConcurrentMap d;
    public final AtomicLong e;
    public final int f;
    public final int g;
    private final aeqv h;
    private final atjj i;
    private final aesp j;
    private final aeqk k;
    
    static {
        a = afik.m("com/google/apps/tiktok/tracing/TraceManagerImpl");
    }
    
    public aese(final aeqv h, final oas b, final afts c, final atjj i, final aesp j, final aeqk k, final Map map, final Map map2) {
        final boolean b2 = true;
        this.d = (ConcurrentMap)new ConcurrentHashMap(2, 0.75f, 1);
        this.h = h;
        this.b = b;
        this.c = c;
        this.i = i;
        this.j = j;
        this.k = k;
        if (!map.isEmpty()) {
            agot.v(((afgm)map).d == 1, (Object)"Please only specify the max number of spans once.");
            this.f = ((aeqp)adwd.aL((Iterable)((afcw)map).s())).a();
        }
        else {
            this.f = 500;
        }
        if (!map2.isEmpty()) {
            agot.v(((afgm)map2).d == 1 && b2, (Object)"Please only specify the trace deadline limit once.");
            this.g = ((aerv)adwd.aL((Iterable)((afcw)map2).s())).a();
        }
        else {
            this.g = 2100000;
        }
        this.e = new AtomicLong(this.g);
    }
    
    private static final void f(final aerr aerr, final String s) {
        if (aerr != null) {
            aeqc aeqc;
            if (aerr instanceof aeqf) {
                String s3;
                final String s2 = s3 = aesw.h(aerr);
                if (!"".equals(s2)) {
                    s3 = ": ".concat(String.valueOf(s2));
                }
                aeqc = new aeqc(s3, s, (Throwable)((aeqf)aerr).f());
                aesr.d((Throwable)aeqc);
            }
            else {
                aeqc = new aeqc(s);
                aesr.d((Throwable)aeqc);
            }
            c.i(((afig)aesa.a).g().h(afjj.a, (Object)"TraceManager"), "Duplicate trace", "com/google/apps/tiktok/tracing/TraceManager", "reportDuplicateTraceException", 'k', "TraceManager.java", (Throwable)aeqc);
        }
    }
    
    private final aerr g(final String s, final aeri aeri, final long f, final long n, final int n2) {
        final UUID b = this.k.b();
        final float a = this.j.a;
        b.getLeastSignificantBits();
        final agza builder = aesn.a.createBuilder();
        final long leastSignificantBits = b.getLeastSignificantBits();
        builder.copyOnWrite();
        final aesn aesn = (aesn)builder.instance;
        aesn.b |= 0x2;
        aesn.d = leastSignificantBits;
        final long mostSignificantBits = b.getMostSignificantBits();
        builder.copyOnWrite();
        final aesn aesn2 = (aesn)builder.instance;
        aesn2.b |= 0x1;
        aesn2.c = mostSignificantBits;
        builder.copyOnWrite();
        final aesn aesn3 = (aesn)builder.instance;
        aesn3.b |= 0x4;
        aesn3.f = f;
        builder.copyOnWrite();
        final aesn aesn4 = (aesn)builder.instance;
        aesn4.b |= 0x8;
        aesn4.g = n / 1000000L;
        builder.copyOnWrite();
        final aesn aesn5 = (aesn)builder.instance;
        aesn5.i = 1;
        aesn5.b |= 0x40;
        final aesn aesn6 = (aesn)builder.build();
        final aetb aetb = new aetb(s, aeri, n2);
        final aetd aetd = new aetd(this, b, aesn6, aetb, n, this.b);
        final aeqw aeqw = new aeqw(aetb, aetd);
        final aeqv h = this.h;
        if (h.d.compareAndSet(false, true)) {
            h.c.execute(new d(h, 20));
        }
        final aequ aequ = new aequ((Object)aeqw, h.b);
        aeqv.a.put((Object)aequ, (Object)Boolean.TRUE);
        (aetd.e = (ListenableFuture)aequ.a).addListener((Runnable)aetd, (Executor)this.c);
        this.d.put(b, aetd);
        aesw.n((aerr)aeqw);
        return (aerr)aeqw;
    }
    
    public final Map a() {
        final afct h = afcw.h();
        for (final Map.Entry<K, aetd> entry : this.d.entrySet()) {
            h.g((Object)entry.getKey(), entry.getValue().b().d);
        }
        return (Map)h.c();
    }
    
    public final aeqx b(final String s, final aeri aeri) {
        return this.c(s, aeri, this.b.c(), this.b.e());
    }
    
    public final aeqx c(final String s, final aeri aeri, final long n, final long n2) {
        final aerr a = aesw.a();
        f(a, s);
        final aerr g = this.g(s, aeri, n, n2, 1);
        if (a == ((aeqw)g).a) {
            return g;
        }
        return new aesc(g, a);
    }
    
    public final aerq d(final String s, final aeri aeri) {
        final aerr a = aesw.a();
        f(a, s);
        return new aesd(new aere(this.g(s, aeri, this.b.c(), this.b.e(), 2)), a);
    }
    
    public void e(aesn a, final SparseArray sparseArray, final String s) {
        a = (aesn)aesw.a();
        aesw.n((aerr)new aeqs(s, aeqs.a, aerh.a));
        try {
            for (adcr adcr : (Set)this.i.a()) {}
            aesw.n((aerr)a);
        }
        finally {
            aesw.n((aerr)a);
            while (true) {}
        }
    }
}
