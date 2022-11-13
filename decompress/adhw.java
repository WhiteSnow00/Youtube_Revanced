import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adhw
{
    public final oby a;
    public final atke b;
    public final ajfj c;
    public final boolean d;
    public final argj e;
    private final afvt f;
    private ListenableFuture g;
    private ahaz h;
    private final argj i;
    
    public adhw(final oby a, final argj e, final atke b, final afvt f, final ajfj c, final argj i, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.e = e;
        this.b = b;
        this.f = f;
        this.c = c;
        this.i = i;
        final int a2 = i.a;
        boolean d = false;
        if (a2 != 0) {
            if (adkp.E(1000) < i.a) {
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
            ttr.g(sb.toString());
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
                ttr.g(sb.toString());
                final long g = this.a.g();
                final ahaz h = this.h;
                final long e = ((aoqg)h.instance).e;
                h.copyOnWrite();
                final aoqg aoqg = (aoqg)h.instance;
                aoqg.b |= 0x4;
                aoqg.e = g - e;
                final ListenableFuture m = afwm.m((Object)this.h);
                final ListenableFuture g2 = this.g;
                if (g2 instanceof afvr) {
                    final afvr afvr = (afvr)g2;
                    if (afvr.getDelay(TimeUnit.MILLISECONDS) > 0L) {
                        afvr.cancel(false);
                    }
                }
                final ListenableFuture g3 = this.g;
                afwm.w(afwm.L(new ListenableFuture[] { m, g3 }).j((Callable)new zuj(m, g3, 5), (Executor)this.f), (afva)new npp(this, 15), (Executor)this.f);
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
            ttr.g(sb.toString());
            final long g = this.a.g();
            final argj i = this.i;
            final Object b = i.b;
            adhx adhx = null;
            Label_0255: {
                if (b == null) {
                    adhx = adhx.a;
                }
                else {
                    final int e = adkp.E(((audb)b).a);
                    final int e2 = adkp.E(((audb)i.b).b);
                    int j = 0;
                    int n = 0;
                    while (j < ((List)((audb)i.b).c).size()) {
                        final int intValue = ((List<Integer>)((audb)i.b).c).get(j);
                        n += intValue;
                        if (e < n) {
                            final Object b2 = i.b;
                            adhx = adhx.a(intValue / (float)((audb)b2).a, ((audb)b2).b * j + e2);
                            break Label_0255;
                        }
                        ++j;
                    }
                    adhx = adhx.a;
                }
            }
            Object g2;
            if (adhx == adhx.a) {
                g2 = afwm.m((Object)aoqf.a);
            }
            else {
                g2 = this.f.f((Callable)new zuh(this, adhx, g, 2), (long)adhx.c, TimeUnit.MILLISECONDS);
            }
            this.g = (ListenableFuture)g2;
            final ahaz builder = ((ahbh)aoqg.a).createBuilder();
            final ajfj c = this.c;
            builder.copyOnWrite();
            final aoqg aoqg = (aoqg)builder.instance;
            aoqg.c = c.d;
            aoqg.b |= 0x1;
            final float n2 = (float)this.i.a;
            builder.copyOnWrite();
            final aoqg aoqg2 = (aoqg)builder.instance;
            aoqg2.b |= 0x2;
            aoqg2.d = n2 / 1000.0f;
            builder.copyOnWrite();
            final aoqg aoqg3 = (aoqg)builder.instance;
            aoqg3.b |= 0x4;
            aoqg3.e = g;
            this.h = builder;
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
