import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adft
{
    public final oas a;
    public final atjj b;
    public final ajdf c;
    public final boolean d;
    public final ardu e;
    private final afts f;
    private ListenableFuture g;
    private agza h;
    private final ardu i;
    
    public adft(final oas a, final ardu e, final atjj b, final afts f, final ajdf c, final ardu i, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.e = e;
        this.b = b;
        this.f = f;
        this.c = c;
        this.i = i;
        final int a2 = i.a;
        boolean d = false;
        if (a2 != 0) {
            if (adio.G(1000) < i.a) {
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
            trn.g(sb.toString());
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
                trn.g(sb.toString());
                final long g = this.a.g();
                final agza h = this.h;
                final long e = ((aood)h.instance).e;
                h.copyOnWrite();
                final aood aood = (aood)h.instance;
                aood.b |= 0x4;
                aood.e = g - e;
                final ListenableFuture m = afva.m((Object)this.h);
                final ListenableFuture g2 = this.g;
                if (g2 instanceof aftq) {
                    final aftq aftq = (aftq)g2;
                    if (aftq.getDelay(TimeUnit.MILLISECONDS) > 0L) {
                        aftq.cancel(false);
                    }
                }
                final ListenableFuture g3 = this.g;
                afva.w(afva.E(new ListenableFuture[] { m, g3 }).j((Callable)new vbt(m, g3, 19), (Executor)this.f), (afsz)new nol(this, 15), (Executor)this.f);
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
            trn.g(sb.toString());
            final long g = this.a.g();
            final ardu i = this.i;
            final Object b = i.b;
            adfu adfu = null;
            Label_0239: {
                if (b == null) {
                    adfu = adfu.a;
                }
                else {
                    final int g2 = adio.G(((auck)b).a);
                    final int g3 = adio.G(((auck)i.b).b);
                    int j = 0;
                    int n = 0;
                    while (j < ((List)((auck)i.b).c).size()) {
                        final int intValue = ((List<Integer>)((auck)i.b).c).get(j);
                        n += intValue;
                        if (g2 < n) {
                            final Object b2 = i.b;
                            adfu = adfu.a(intValue / (float)((auck)b2).a, ((auck)b2).b * j + g3);
                            break Label_0239;
                        }
                        ++j;
                    }
                    adfu = adfu.a;
                }
            }
            Object g4;
            if (adfu == adfu.a) {
                g4 = afva.m((Object)aooc.a);
            }
            else {
                g4 = this.f.f((Callable)new zso(this, adfu, g, 2), (long)adfu.c, TimeUnit.MILLISECONDS);
            }
            this.g = (ListenableFuture)g4;
            final agza builder = aood.a.createBuilder();
            final ajdf c = this.c;
            builder.copyOnWrite();
            final aood aood = (aood)builder.instance;
            aood.c = c.d;
            aood.b |= 0x1;
            final int a = this.i.a;
            builder.copyOnWrite();
            final aood aood2 = (aood)builder.instance;
            aood2.b |= 0x2;
            aood2.d = a / 1000.0f;
            builder.copyOnWrite();
            final aood aood3 = (aood)builder.instance;
            aood3.b |= 0x4;
            aood3.e = g;
            this.h = builder;
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
