import java.util.Map;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.Iterator;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import android.app.Application;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adht implements tgz, tha
{
    public boolean a;
    public long b;
    public final atke c;
    public final atke d;
    public final atke e;
    final Runnable f;
    private tgf g;
    private tgf h;
    private tgf i;
    private thg j;
    private adhs k;
    private long l;
    private final Application m;
    private final tgd n;
    private final oby o;
    private final ScheduledExecutorService p;
    private final atke q;
    private final Executor r;
    private final atke s;
    private asir t;
    private ScheduledFuture u;
    
    public adht(final Application m, final tgd n, final oby o, final ScheduledExecutorService p9, final atke c, final atke d, final atke e, final atke q, final atke s) {
        this.a = false;
        this.l = -1L;
        this.b = -1L;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p9;
        this.c = c;
        this.d = d;
        this.e = e;
        this.q = q;
        this.r = afwm.g((Executor)p9);
        this.s = s;
        this.f = (Runnable)new acbp(this, o, d, 7);
    }
    
    private final void f() {
        synchronized (this) {
            this.e();
            if (this.a) {
                final tgf g = this.g;
                if (g != null) {
                    this.n.l(new tgf[] { g });
                    this.g = null;
                }
                final tgf h = this.h;
                if (h != null) {
                    this.n.l(new tgf[] { h });
                    this.h = null;
                }
                final tgf i = this.i;
                if (i != null) {
                    this.n.l(new tgf[] { i });
                    this.i = null;
                }
                final asir t = this.t;
                if (t != null) {
                    asjv.b((AtomicReference)t);
                    this.t = null;
                }
                final adhs k = this.k;
                if (k != null) {
                    this.m.unregisterReceiver((BroadcastReceiver)k);
                    this.k = null;
                }
                final thg j = this.j;
                if (j != null) {
                    j.b(this.m);
                    this.j.d((thc)this);
                    this.j = null;
                }
                this.a = false;
            }
        }
    }
    
    private final void g(final aora aora) {
        synchronized (this) {
            if (!this.a) {
                this.g = this.n.a((Object)this, (Class)adhl.class, (tge)new esi(this, 11));
                this.h = this.n.a((Object)this, (Class)adhm.class, (tge)new esi(this, 12));
                this.i = this.n.a((Object)this, (Class)adhn.class, (tge)new esi(this, 13));
                aoqz aoqz;
                if ((aoqz = aora.e) == null) {
                    aoqz = aoqz.a;
                }
                if (aoqz.r) {
                    this.t = ((asht)((adhb)this.s.a()).c).aH((asjm)new acpc(this, 4));
                }
                (this.j = new thg()).a(this.m);
                this.j.c((thc)this);
                ((adhf)this.c.a()).a(this.m.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
                final IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                final adhs k = new adhs(this);
                this.k = k;
                this.m.registerReceiver((BroadcastReceiver)k, intentFilter);
                this.a = true;
            }
        }
    }
    
    public final void a(final aora aora) {
        monitorenter(this);
        try {
            if (!aora.c) {
                this.f();
                monitorexit(this);
                return;
            }
            final adhu adhu = (adhu)this.d.a();
            Object defaultUncaughtExceptionHandler = adhu.a;
            synchronized (defaultUncaughtExceptionHandler) {
                for (final adha adha : ((Map<K, adha>)adhu.f).values()) {
                    adha.d(aora);
                    if (adha instanceof adgy && adha.e()) {
                        adhu.b = true;
                    }
                }
                monitorexit(defaultUncaughtExceptionHandler);
                final aujg aujg = (aujg)this.e.a();
                defaultUncaughtExceptionHandler = aujg.a;
                synchronized (defaultUncaughtExceptionHandler) {
                    final Iterator<Object> iterator2 = (Iterator<Object>)((Map<K, adje>)aujg.b).values().iterator();
                    while (iterator2.hasNext()) {
                        iterator2.next().a(aora);
                    }
                    monitorexit(defaultUncaughtExceptionHandler);
                    this.g(aora);
                    Label_0235: {
                        if ((aora.b & 0x40) != 0x0) {
                            if ((defaultUncaughtExceptionHandler = aora.f) == null) {
                                defaultUncaughtExceptionHandler = aoqu.a;
                            }
                            if (!((aoqu)defaultUncaughtExceptionHandler).c) {
                                break Label_0235;
                            }
                        }
                        defaultUncaughtExceptionHandler = this.q.a();
                        ((adjg)defaultUncaughtExceptionHandler).b = Thread.getDefaultUncaughtExceptionHandler();
                        Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)defaultUncaughtExceptionHandler);
                    }
                    if ((aora.b & 0x2) != 0x0) {
                        defaultUncaughtExceptionHandler = aora.d;
                        if (defaultUncaughtExceptionHandler == null) {
                            final aoqw a = aoqw.a;
                        }
                        this.l = ((aoqw)defaultUncaughtExceptionHandler).b;
                    }
                    if (qca.c(this.m.getApplicationContext())) {
                        this.l();
                        return;
                    }
                    this.lD();
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void b(final adhn adhn) {
        final adhu adhu = (adhu)this.d.a();
        final aoql a = adhn.a();
        final atzd b = adhn.b();
        final boolean c = adhn.c();
        final String a2 = ((adjg)this.q.a()).a;
        final ahaz builder = ((ahbh)aoqk.a).createBuilder();
        if (a != null) {
            builder.copyOnWrite();
            final aoqk aoqk = (aoqk)builder.instance;
            aoqk.c = a.c;
            aoqk.b |= 0x1;
        }
        Label_0345: {
            if ((b.b & 0x40) != 0x0) {
                atyo atyo;
                if ((atyo = b.h) == null) {
                    atyo = atyo.a;
                }
                if (atyo.c) {
                    final ahaz builder2 = ((ahbh)aoqe.a).createBuilder();
                    if (a2 != null) {
                        builder2.copyOnWrite();
                        final aoqe aoqe = (aoqe)builder2.instance;
                        aoqe.b |= 0x1;
                        aoqe.c = a2;
                    }
                    aoqn aoqn;
                    if ((aoqn = ((vaf)((atke)adhu.e).a()).b().s) == null) {
                        aoqn = aoqn.a;
                    }
                    if (aoqn.p) {
                        final InteractionLoggingScreen a3 = ((wzs)((atke)adhu.d).a()).a();
                        if (a3 != null) {
                            final int f = a3.f;
                            builder2.copyOnWrite();
                            final aoqe aoqe2 = (aoqe)builder2.instance;
                            aoqe2.b |= 0x2;
                            aoqe2.d = f;
                        }
                    }
                    final int b2 = ((aoqe)builder2.instance).b;
                    if ((b2 & 0x1) == 0x0) {
                        if ((b2 & 0x2) == 0x0) {
                            break Label_0345;
                        }
                    }
                    builder.copyOnWrite();
                    final aoqk aoqk2 = (aoqk)builder.instance;
                    final aoqe g = (aoqe)builder2.build();
                    g.getClass();
                    aoqk2.g = g;
                    aoqk2.b |= 0x40;
                }
            }
        }
        final ahab byteString = ((agzk)b).toByteString();
        builder.copyOnWrite();
        final aoqk aoqk3 = (aoqk)builder.instance;
        aoqk3.b |= 0x8;
        aoqk3.f = byteString;
        adhu.c(builder, c, adhu.b);
    }
    
    public final void d() {
        synchronized (this) {
            if (this.a) {
                final long l = this.l;
                long max = 0L;
                if (l >= 0L) {
                    this.e();
                    final long d = this.o.d();
                    final long b = this.b;
                    if (b >= 0L) {
                        max = Math.max(0L, b + this.l - d);
                    }
                    this.u = this.p.scheduleAtFixedRate(this.f, max, this.l, TimeUnit.MILLISECONDS);
                }
            }
        }
    }
    
    public final void e() {
        synchronized (this) {
            final ScheduledFuture u = this.u;
            if (u != null && !u.isCancelled()) {
                this.u.cancel(true);
            }
            this.u = null;
        }
    }
    
    public final void l() {
        this.r.execute((Runnable)new adap(this, 7));
        final adhu adhu = (adhu)this.d.a();
        final Object a = adhu.a;
        monitorenter(a);
        try {
            for (final adha adha : ((Map<K, adha>)adhu.f).values()) {
                if (adha.e()) {
                    final Object c = adhu.c;
                    adha.c();
                }
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void lD() {
        this.r.execute((Runnable)new adap(this, 8));
        final adhu adhu = (adhu)this.d.a();
        final Object a = adhu.a;
        monitorenter(a);
        try {
            for (final adha adha : ((Map<K, adha>)adhu.f).values()) {
                if (adha.e()) {
                    final Object c = adhu.c;
                    adha.b();
                }
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
}
