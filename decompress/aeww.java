import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;
import android.util.SparseArray;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeww implements Runnable
{
    public final aevx a;
    public final UUID b;
    public final aewg c;
    public final AtomicReference d;
    public ListenableFuture e;
    int f;
    private final oco g;
    private final long h;
    
    public aeww(final aevx a, final UUID b, final aewg c, final aewu aewu, final long h, final oco g) {
        this.f = 0;
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.g = g;
        this.d = new AtomicReference((V)aewu);
    }
    
    public final long a() {
        return this.g.e() - this.h;
    }
    
    final aewv b() {
        monitorenter(this);
        try {
            aewu g = this.d.get();
            final int n = g.f + 1;
            final aewu[] array = new aewu[n];
            while (g != null) {
                array[g.f] = g;
                g = g.g;
            }
            final ahcr builder = this.c.toBuilder();
            final SparseArray sparseArray = new SparseArray(n);
            int i = 0;
            aewu aewu = null;
            while (i < n) {
                final aewu aewu2 = array[i];
                final Object g2 = aewu2.e.g(aevh.c);
                aeuy a;
                if (g2 == null) {
                    a = aeuy.a;
                }
                else {
                    a = new aeuy(1, g2);
                }
                aewu aewu3 = aewu;
                if (a.c == 1) {
                    ((aeue)a.b).a();
                    aewu3 = aewu;
                    if (aewu2.f != 0) {
                        aewu3 = aewu2;
                    }
                }
                ++i;
                aewu = aewu3;
            }
            int j = 0;
            int n2 = 0;
            while (j < n) {
                final aewu aewu4 = array[j];
                int e = aewu4.a();
                if (aewu != null) {
                    final int f = aewu.f;
                    e = e;
                    if (f != 0) {
                        if (aewu4.f == 0) {
                            e = f;
                        }
                        else if (aewu.equals(aewu4)) {
                            e = -1;
                        }
                        else {
                            e = aewu4.a();
                        }
                    }
                }
                final ahcr builder2 = aeuw.a.createBuilder();
                final String c = aewu4.c;
                builder2.copyOnWrite();
                final aeuw aeuw = (aeuw)builder2.instance;
                c.getClass();
                aeuw.b |= 0x1;
                aeuw.c = c;
                final int f2 = aewu4.f;
                builder2.copyOnWrite();
                final aeuw aeuw2 = (aeuw)builder2.instance;
                aeuw2.b |= 0x2;
                aeuw2.d = f2;
                builder2.copyOnWrite();
                final aeuw aeuw3 = (aeuw)builder2.instance;
                aeuw3.b |= 0x4;
                aeuw3.e = e;
                final int k = aewu4.j;
                builder2.copyOnWrite();
                final aeuw aeuw4 = (aeuw)builder2.instance;
                if (k == 0) {
                    throw null;
                }
                aeuw4.i = k - 1;
                aeuw4.b |= 0x200;
                final boolean h = aewu4.h;
                builder2.copyOnWrite();
                final aeuw aeuw5 = (aeuw)builder2.instance;
                aeuw5.b |= 0x400;
                aeuw5.j = h;
                final long f3 = aewu4.d / 1000000L;
                builder2.copyOnWrite();
                final aeuw aeuw6 = (aeuw)builder2.instance;
                aeuw6.b |= 0x8;
                aeuw6.f = f3;
                final long l = aewu4.i;
                if (l != 0L) {
                    adme.T(true);
                    final long g3 = (l & 0x3FFFFFFFFFFFFFFFL) / 1000000L;
                    builder2.copyOnWrite();
                    final aeuw aeuw7 = (aeuw)builder2.instance;
                    aeuw7.b |= 0x20;
                    aeuw7.g = g3;
                    adme.T(true);
                    final boolean h2 = (0x4000000000000000L & l) != 0x0L;
                    builder2.copyOnWrite();
                    final aeuw aeuw8 = (aeuw)builder2.instance;
                    aeuw8.b |= 0x100;
                    aeuw8.h = h2;
                }
                final aeuw aeuw9 = (aeuw)builder2.build();
                builder.copyOnWrite();
                final aewg aewg = (aewg)builder.instance;
                aeuw9.getClass();
                final ahdp e2 = aewg.e;
                if (!e2.c()) {
                    aewg.e = ahcz.mutableCopy(e2);
                }
                aewg.e.add((Object)aeuw9);
                final int f4 = aewu4.f;
                final aevb e3 = aewu4.e;
                if (aewu.a.a(aewu4) != null) {
                    throw null;
                }
                sparseArray.append(f4, (Object)aevb.d(e3, aeva.a));
                int n3 = n2;
                if (!aewu4.c()) {
                    n3 = n2 + 1;
                }
                ++j;
                n2 = n3;
            }
            if (this.f != 0) {
                final ahcr builder3 = aetv.a.createBuilder();
                final ahcr builder4 = aetu.a.createBuilder();
                final int f5 = this.f;
                builder4.copyOnWrite();
                final aetu aetu = (aetu)builder4.instance;
                aetu.b |= 0x1;
                aetu.c = f5;
                final aetu c2 = (aetu)builder4.build();
                builder3.copyOnWrite();
                final aetv aetv = (aetv)builder3.instance;
                c2.getClass();
                aetv.c = c2;
                aetv.b |= 0x1;
                final aetv h3 = (aetv)builder3.build();
                builder.copyOnWrite();
                final aewg aewg2 = (aewg)builder.instance;
                h3.getClass();
                aewg2.h = h3;
                aewg2.b |= 0x20;
            }
            final aewv aewv = new aewv(array[0].c, this.b, (aewg)builder.build(), sparseArray, n2);
            monitorexit(this);
            return aewv;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void run() {
        final aevx a = this.a;
        final ListenableFuture e = this.e;
        final aewv b = this.b();
        adme.T(a.d.remove(b.c) != null);
        if (e.isCancelled()) {
            aetv aetv;
            if ((aetv = ((aewg)b.d).h) == null) {
                aetv = aetv.a;
            }
            final long d = a.b.d();
            final Object d2 = b.d;
            final long c = d - ((aewg)d2).g;
            final ahcr builder = ((ahcz)d2).toBuilder();
            final ahcr builder2 = aetv.toBuilder();
            final ahcr builder3 = aett.a.createBuilder();
            final int a2 = b.a;
            builder3.copyOnWrite();
            final aett aett = (aett)builder3.instance;
            aett.b |= 0x2;
            aett.d = a2;
            builder3.copyOnWrite();
            final aett aett2 = (aett)builder3.instance;
            aett2.b |= 0x1;
            aett2.c = c;
            final aett d3 = (aett)builder3.build();
            builder2.copyOnWrite();
            final aetv aetv2 = (aetv)builder2.instance;
            d3.getClass();
            aetv2.d = d3;
            aetv2.b |= 0x2;
            final aetv h = (aetv)builder2.build();
            builder.copyOnWrite();
            final aewg aewg = (aewg)builder.instance;
            h.getClass();
            aewg.h = h;
            aewg.b |= 0x20;
            final aewg aewg2 = (aewg)builder.build();
            final int n = aewg2.e.size() - 1;
            final Iterator iterator = agpx.R((List)aewg2.e).iterator();
            while (true) {
                int b2;
                aeuw aeuw2;
                do {
                    int i = n;
                    if (!iterator.hasNext()) {
                        final ArrayList list = new ArrayList();
                        int n2 = 0;
                        while (i >= 0) {
                            final aeuw aeuw = (aeuw)aewg2.e.get(i);
                            final int n3 = (int)aeuw.f;
                            final String c2 = aeuw.c;
                            final int b3 = aeuw.b;
                            final String value = String.valueOf(c2);
                            String s;
                            if ((b3 & 0x20) == 0x0) {
                                s = " (Timed Out)";
                            }
                            else {
                                s = "";
                            }
                            list.add(new StackTraceElement("tk_trace", value.concat(s), "Started After", (n3 - n2) / 1000));
                            i = ((aeuw)aewg2.e.get(i)).e;
                            n2 = n3;
                        }
                        ((afly)((afly)((afly)((aflw)aevx.a).g()).i((Throwable)new aewk(null, (StackTraceElement[])list.toArray(new StackTraceElement[0])))).j("com/google/apps/tiktok/tracing/TraceManagerImpl", "handleTraceTimeout", 338, "TraceManagerImpl.java")).y("Trace %s timed out after %d ms. Complete trace: %s", b.b, (Object)c, (Object)aewg2);
                        a.e(aewg2, (SparseArray)b.e, (String)b.b);
                        return;
                    }
                    aeuw2 = (aeuw)iterator.next();
                    b2 = aeuw2.b;
                } while ((b2 & 0x20) != 0x0 || (b2 & 0x4) == 0x0);
                int i = aeuw2.d;
                continue;
            }
        }
        try {
            afxr.t((Future)e);
            final long g = ((aewg)b.d).g;
            while (true) {
                long value2;
                do {
                    value2 = a.e.get();
                    if (g <= value2) {
                        a.e((aewg)b.d, (SparseArray)b.e, (String)b.b);
                        return;
                    }
                } while (!a.e.compareAndSet(value2, 300000L + g));
                final long n4 = a.g;
                for (final aeww aeww : a.d.values()) {
                    if (aeww.c.g < g - n4) {
                        final afxi e2 = a.c.e((Runnable)tkz.k, 10L, TimeUnit.SECONDS);
                        aeww.getClass();
                        ((ListenableFuture)e2).addListener((Runnable)new aevy(aeww, 1), (Executor)afwd.a);
                    }
                }
                continue;
            }
        }
        catch (final ExecutionException ex) {
            ((afly)((afly)((afly)((aflw)aevx.a).g()).i(ex.getCause())).j("com/google/apps/tiktok/tracing/TraceManagerImpl", "handleTraceComplete", 276, "TraceManagerImpl.java")).t("Trace %s failed collection", b.b);
        }
    }
    
    @Override
    public final String toString() {
        final String hexString = Integer.toHexString(System.identityHashCode(this));
        final Object b = this.b().b;
        final StringBuilder sb = new StringBuilder("UnfinishedTrace@");
        sb.append(hexString);
        sb.append("[");
        sb.append((String)b);
        sb.append("]");
        return sb.toString();
    }
}
