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

public final class adfq implements tev, tew
{
    public boolean a;
    public long b;
    public final atjj c;
    public final atjj d;
    public final atjj e;
    final Runnable f;
    private teb g;
    private teb h;
    private teb i;
    private tfc j;
    private adfp k;
    private long l;
    private final Application m;
    private final tdz n;
    private final oas o;
    private final ScheduledExecutorService p;
    private final atjj q;
    private final Executor r;
    private final atjj s;
    private asic t;
    private ScheduledFuture u;
    
    public adfq(final Application m, final tdz n, final oas o, final ScheduledExecutorService p9, final atjj c, final atjj d, final atjj e, final atjj q, final atjj s) {
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
        this.r = afva.g((Executor)p9);
        this.s = s;
        this.f = (Runnable)new abzn(this, o, d, 7);
    }
    
    private final void f() {
        synchronized (this) {
            this.e();
            if (this.a) {
                final teb g = this.g;
                if (g != null) {
                    this.n.l(new teb[] { g });
                    this.g = null;
                }
                final teb h = this.h;
                if (h != null) {
                    this.n.l(new teb[] { h });
                    this.h = null;
                }
                final teb i = this.i;
                if (i != null) {
                    this.n.l(new teb[] { i });
                    this.i = null;
                }
                final asic t = this.t;
                if (t != null) {
                    asjg.b((AtomicReference)t);
                    this.t = null;
                }
                final adfp k = this.k;
                if (k != null) {
                    this.m.unregisterReceiver((BroadcastReceiver)k);
                    this.k = null;
                }
                final tfc j = this.j;
                if (j != null) {
                    j.b(this.m);
                    this.j.d((tey)this);
                    this.j.d((tey)this);
                    this.j = null;
                }
                this.a = false;
            }
        }
    }
    
    private final void g(final aoox aoox) {
        synchronized (this) {
            if (!this.a) {
                this.g = this.n.a((Object)this, (Class)adfi.class, (tea)new esf(this, 11));
                this.h = this.n.a((Object)this, (Class)adfj.class, (tea)new esf(this, 12));
                this.i = this.n.a((Object)this, (Class)adfk.class, (tea)new esf(this, 13));
                aoow aoow;
                if ((aoow = aoox.e) == null) {
                    aoow = aoow.a;
                }
                if (aoow.r) {
                    this.t = ((ashe)((adey)this.s.a()).c).aB((asix)new abtm(this, 19));
                }
                (this.j = new tfc()).a(this.m);
                this.j.c((tey)this);
                this.j.c((tey)this);
                ((adfc)this.c.a()).a(this.m.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
                final IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                final adfp k = new adfp(this);
                this.k = k;
                this.m.registerReceiver((BroadcastReceiver)k, intentFilter);
                this.a = true;
            }
        }
    }
    
    public final void a(final aoox aoox) {
        monitorenter(this);
        try {
            if (!aoox.c) {
                this.f();
                monitorexit(this);
                return;
            }
            final adfr adfr = (adfr)this.d.a();
            Object defaultUncaughtExceptionHandler = adfr.a;
            synchronized (defaultUncaughtExceptionHandler) {
                for (final adex adex : ((Map<K, adex>)adfr.f).values()) {
                    adex.d(aoox);
                    if (adex instanceof adev && adex.e()) {
                        adfr.b = true;
                    }
                }
                monitorexit(defaultUncaughtExceptionHandler);
                final auip auip = (auip)this.e.a();
                defaultUncaughtExceptionHandler = auip.b;
                synchronized (defaultUncaughtExceptionHandler) {
                    final Iterator<Object> iterator2 = (Iterator<Object>)((Map<K, adhb>)auip.c).values().iterator();
                    while (iterator2.hasNext()) {
                        iterator2.next().a(aoox);
                    }
                    monitorexit(defaultUncaughtExceptionHandler);
                    this.g(aoox);
                    Label_0235: {
                        if ((aoox.b & 0x40) != 0x0) {
                            if ((defaultUncaughtExceptionHandler = aoox.f) == null) {
                                defaultUncaughtExceptionHandler = aoor.a;
                            }
                            if (!((aoor)defaultUncaughtExceptionHandler).c) {
                                break Label_0235;
                            }
                        }
                        defaultUncaughtExceptionHandler = this.q.a();
                        ((adhd)defaultUncaughtExceptionHandler).b = Thread.getDefaultUncaughtExceptionHandler();
                        Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)defaultUncaughtExceptionHandler);
                    }
                    if ((aoox.b & 0x2) != 0x0) {
                        defaultUncaughtExceptionHandler = aoox.d;
                        if (defaultUncaughtExceptionHandler == null) {
                            final aoot a = aoot.a;
                        }
                        this.l = ((aoot)defaultUncaughtExceptionHandler).b;
                    }
                    if (qaq.c(this.m.getApplicationContext())) {
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
    
    public final void b(final adfk adfk) {
        final adfr adfr = (adfr)this.d.a();
        final aooi a = ((adfh)adfk).a();
        final atyg b = adfk.b();
        final boolean c = adfk.c();
        final String a2 = ((adhd)this.q.a()).a;
        final agza builder = aooh.a.createBuilder();
        if (a != null) {
            builder.copyOnWrite();
            final aooh aooh = (aooh)builder.instance;
            aooh.c = a.c;
            aooh.b |= 0x1;
        }
        Label_0336: {
            if ((b.b & 0x40) != 0x0) {
                atxr atxr;
                if ((atxr = b.h) == null) {
                    atxr = atxr.a;
                }
                if (atxr.c) {
                    final agza builder2 = aoob.a.createBuilder();
                    if (a2 != null) {
                        builder2.copyOnWrite();
                        final aoob aoob = (aoob)builder2.instance;
                        aoob.b |= 0x1;
                        aoob.c = a2;
                    }
                    aook aook;
                    if ((aook = ((uyf)((atjj)adfr.e).a()).b().s) == null) {
                        aook = aook.a;
                    }
                    if (aook.p) {
                        final InteractionLoggingScreen a3 = ((wxs)((atjj)adfr.d).a()).a();
                        if (a3 != null) {
                            final int f = a3.f;
                            builder2.copyOnWrite();
                            final aoob aoob2 = (aoob)builder2.instance;
                            aoob2.b |= 0x2;
                            aoob2.d = f;
                        }
                    }
                    final int b2 = ((aoob)builder2.instance).b;
                    if ((b2 & 0x1) == 0x0) {
                        if ((b2 & 0x2) == 0x0) {
                            break Label_0336;
                        }
                    }
                    builder.copyOnWrite();
                    final aooh aooh2 = (aooh)builder.instance;
                    final aoob g = (aoob)builder2.build();
                    g.getClass();
                    aooh2.g = g;
                    aooh2.b |= 0x40;
                }
            }
        }
        final agyc byteString = ((agxl)b).toByteString();
        builder.copyOnWrite();
        final aooh aooh3 = (aooh)builder.instance;
        aooh3.b |= 0x8;
        aooh3.f = byteString;
        adfr.c(builder, c, adfr.b);
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
        this.r.execute((Runnable)new adaj(this, 5));
        final adfr adfr = (adfr)this.d.a();
        final Object a = adfr.a;
        monitorenter(a);
        try {
            for (final adex adex : ((Map<K, adex>)adfr.f).values()) {
                if (adex.e()) {
                    final Object c = adfr.c;
                    adex.c();
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
        this.r.execute((Runnable)new adaj(this, 6));
        final adfr adfr = (adfr)this.d.a();
        final Object a = adfr.a;
        monitorenter(a);
        try {
            for (final adex adex : ((Map<K, adex>)adfr.f).values()) {
                if (adex.e()) {
                    final Object c = adfr.c;
                    adex.b();
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
