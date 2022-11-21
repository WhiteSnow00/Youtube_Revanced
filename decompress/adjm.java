import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjm
{
    public final oco a;
    public final atnb b;
    public final ajhi c;
    public final boolean d;
    public final arjd e;
    private final afxk f;
    private ListenableFuture g;
    private ahcr h;
    private final arjd i;
    
    public adjm(final oco a, final arjd e, final atnb b, final afxk f, final ajhi c, final arjd i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.e = e;
        this.b = b;
        this.f = f;
        this.c = c;
        this.i = i;
        final int a2 = i.a;
        boolean d = false;
        if (a2 != 0) {
            if (adfe.f(1000) < i.a) {
                d = true;
            }
        }
        this.d = d;
    }
    
    public final void a() {
        synchronized (this) {
            if (this.h == null) {
                return;
            }
            final String name = this.c.name();
            final StringBuilder sb = new StringBuilder("ProfileSpan(");
            sb.append(name);
            sb.append(").cancel()");
            tut.g(sb.toString());
            final ListenableFuture g = this.g;
            if (g != null) {
                g.cancel(false);
            }
        }
    }
    
    public final void b() {
        synchronized (this) {
            if (this.h != null && this.g != null) {
                final String name = this.c.name();
                final StringBuilder sb = new StringBuilder("ProfileSpan(");
                sb.append(name);
                sb.append(").stop()");
                tut.g(sb.toString());
                final long g = this.a.g();
                final ahcr h = this.h;
                final long e = ((aosq)h.instance).e;
                h.copyOnWrite();
                final aosq aosq = (aosq)h.instance;
                aosq.b |= 0x4;
                aosq.e = g - e;
                final ListenableFuture l = afxr.l(this.h);
                final ListenableFuture g2 = this.g;
                if (g2 instanceof afxi) {
                    final afxi afxi = (afxi)g2;
                    if (afxi.getDelay(TimeUnit.MILLISECONDS) > 0L) {
                        afxi.cancel(false);
                    }
                }
                final ListenableFuture g3 = this.g;
                afxr.v(afxr.M(l, g3).j((Callable)new zwg(l, g3, 6), (Executor)this.f), (afwr)new nqg(this, 15), this.f);
            }
        }
    }
    
    public final void c() {
        monitorenter(this);
        try {
            if (this.h != null) {
                monitorexit(this);
                return;
            }
            if (!this.d) {
                monitorexit(this);
                return;
            }
            final String name = this.c.name();
            final StringBuilder sb = new StringBuilder("ProfileSpan(");
            sb.append(name);
            sb.append(").start()");
            tut.g(sb.toString());
            final long g = this.a.g();
            final arjd i = this.i;
            final Object b = i.b;
            adjn adjn = null;
            Label_0255: {
                if (b == null) {
                    adjn = adjn.a;
                }
                else {
                    final int f = adfe.f(((aufx)b).a);
                    final int f2 = adfe.f(((aufx)i.b).b);
                    int j = 0;
                    int n = 0;
                    while (j < ((List)((aufx)i.b).c).size()) {
                        final int intValue = ((List<Integer>)((aufx)i.b).c).get(j);
                        n += intValue;
                        if (f < n) {
                            final Object b2 = i.b;
                            adjn = adjn.a(intValue / (float)((aufx)b2).a, ((aufx)b2).b * j + f2);
                            break Label_0255;
                        }
                        ++j;
                    }
                    adjn = adjn.a;
                }
            }
            Object g2;
            if (adjn == adjn.a) {
                g2 = afxr.l(aosp.a);
            }
            else {
                g2 = this.f.f((Callable)new zwh(this, adjn, g, 2), adjn.c, TimeUnit.MILLISECONDS);
            }
            this.g = (ListenableFuture)g2;
            final ahcr builder = ((ahcz)aosq.a).createBuilder();
            final ajhi c = this.c;
            builder.copyOnWrite();
            final aosq aosq = (aosq)builder.instance;
            aosq.c = c.d;
            aosq.b |= 0x1;
            final float n2 = (float)this.i.a;
            builder.copyOnWrite();
            final aosq aosq2 = (aosq)builder.instance;
            aosq2.b |= 0x2;
            aosq2.d = n2 / 1000.0f;
            builder.copyOnWrite();
            final aosq aosq3 = (aosq)builder.instance;
            aosq3.b |= 0x4;
            aosq3.e = g;
            this.h = builder;
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
