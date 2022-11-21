import java.util.Map;
import com.google.common.util.concurrent.SettableFuture;
import java.util.function.Supplier;
import j$.util.stream.Collectors;
import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.Iterator;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import java.util.concurrent.atomic.AtomicReference;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import android.app.Application;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjj implements tic, tid
{
    public boolean a;
    public long b;
    public long c;
    public final atnb d;
    public final atnb e;
    public final atnb f;
    final Runnable g;
    final Runnable h;
    private thi i;
    private thi j;
    private thi k;
    private tij l;
    private adji m;
    private long n;
    private List o;
    private final Application p;
    private final thg q;
    private final oco r;
    private final ScheduledExecutorService s;
    private final afxk t;
    private final atnb u;
    private final Executor v;
    private final atnb w;
    private asln x;
    private ScheduledFuture y;
    private ListenableFuture z;
    
    public adjj(final Application p10, final thg q, final oco r, final ScheduledExecutorService s, final afxk t, final atnb d, final atnb e, final atnb f, final atnb u, final atnb w) {
        this.a = false;
        this.n = -1L;
        this.b = -1L;
        this.o = agpx.M();
        this.c = -1L;
        this.p = p10;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.d = d;
        this.e = e;
        this.f = f;
        this.u = u;
        this.v = afxr.f(s);
        this.w = w;
        this.g = (Runnable)new acdb(this, r, e, 6);
        this.h = (Runnable)new acdb(this, r, e, 7);
    }
    
    private final void f() {
        synchronized (this) {
            this.e();
            if (this.a) {
                final thi i = this.i;
                if (i != null) {
                    this.q.l(new thi[] { i });
                    this.i = null;
                }
                final thi j = this.j;
                if (j != null) {
                    this.q.l(new thi[] { j });
                    this.j = null;
                }
                final thi k = this.k;
                if (k != null) {
                    this.q.l(new thi[] { k });
                    this.k = null;
                }
                final asln x = this.x;
                if (x != null) {
                    asmr.b((AtomicReference)x);
                    this.x = null;
                }
                final adji m = this.m;
                if (m != null) {
                    this.p.unregisterReceiver((BroadcastReceiver)m);
                    this.m = null;
                }
                final tij l = this.l;
                if (l != null) {
                    l.b(this.p);
                    this.l.d((tif)this);
                    this.l = null;
                }
                this.a = false;
            }
        }
    }
    
    private final void g(final aotm aotm) {
        synchronized (this) {
            if (!this.a) {
                this.i = this.q.a((Object)this, (Class)adja.class, (thh)new esi(this, 11));
                this.j = this.q.a((Object)this, (Class)adjb.class, (thh)new esi(this, 12));
                this.k = this.q.a((Object)this, (Class)adjc.class, (thh)new esi(this, 13));
                aotl aotl;
                if ((aotl = aotm.e) == null) {
                    aotl = aotl.a;
                }
                if (aotl.r) {
                    this.x = ((askp)((adiq)this.w.a()).c).aH((asmi)new acbf(this, 9));
                }
                (this.l = new tij()).a(this.p);
                this.l.c((tif)this);
                ((adiu)this.d.a()).a(this.p.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
                final IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                final adji m = new adji(this);
                this.m = m;
                this.p.registerReceiver((BroadcastReceiver)m, intentFilter);
                this.a = true;
            }
        }
    }
    
    public final void a(final aotm aotm) {
        monitorenter(this);
        try {
            if (!aotm.c) {
                this.f();
                monitorexit(this);
                return;
            }
            final adjk adjk = (adjk)this.e.a();
            Object defaultUncaughtExceptionHandler = adjk.a;
            synchronized (defaultUncaughtExceptionHandler) {
                for (final adim adim : ((Map<K, adim>)adjk.g).values()) {
                    adim.f(aotm);
                    if (adim instanceof adik && adim.g()) {
                        adjk.b = true;
                    }
                }
                monitorexit(defaultUncaughtExceptionHandler);
                final aapu aapu = (aapu)this.f.a();
                defaultUncaughtExceptionHandler = aapu.c;
                synchronized (defaultUncaughtExceptionHandler) {
                    final Iterator<Object> iterator2 = (Iterator<Object>)((Map<K, adku>)aapu.b).values().iterator();
                    while (iterator2.hasNext()) {
                        iterator2.next().a(aotm);
                    }
                    monitorexit(defaultUncaughtExceptionHandler);
                    this.g(aotm);
                    Label_0235: {
                        if ((aotm.b & 0x40) != 0x0) {
                            if ((defaultUncaughtExceptionHandler = aotm.f) == null) {
                                defaultUncaughtExceptionHandler = aotf.a;
                            }
                            if (!((aotf)defaultUncaughtExceptionHandler).c) {
                                break Label_0235;
                            }
                        }
                        defaultUncaughtExceptionHandler = this.u.a();
                        ((adkw)defaultUncaughtExceptionHandler).b = Thread.getDefaultUncaughtExceptionHandler();
                        Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)defaultUncaughtExceptionHandler);
                    }
                    if ((aotm.b & 0x2) != 0x0) {
                        if ((defaultUncaughtExceptionHandler = aotm.d) == null) {
                            defaultUncaughtExceptionHandler = aoth.a;
                        }
                        this.n = ((aoth)defaultUncaughtExceptionHandler).b;
                    }
                    if ((defaultUncaughtExceptionHandler = aotm.i) == null) {
                        defaultUncaughtExceptionHandler = aotj.a;
                    }
                    if (((aotj)defaultUncaughtExceptionHandler).c.size() > 0) {
                        defaultUncaughtExceptionHandler = aotm.i;
                        if (defaultUncaughtExceptionHandler == null) {
                            final aotj a = aotj.a;
                        }
                        this.o = (List)((aotj)defaultUncaughtExceptionHandler).c;
                    }
                    if (qct.c(this.p.getApplicationContext())) {
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
    
    public final void b(final adjc adjc) {
        final adjk adjk = (adjk)this.e.a();
        final aosw a = ((adiz)adjc).a();
        final aubz b = adjc.b();
        final boolean c = adjc.c();
        final String a2 = ((adkw)this.u.a()).a;
        final ahcr builder = ((ahcz)aosv.a).createBuilder();
        if (a != null) {
            builder.copyOnWrite();
            final aosv aosv = (aosv)builder.instance;
            aosv.c = a.d;
            aosv.b |= 0x1;
        }
        Label_0345: {
            if ((b.b & 0x40) != 0x0) {
                aubl aubl;
                if ((aubl = b.h) == null) {
                    aubl = aubl.a;
                }
                if (aubl.c) {
                    final ahcr builder2 = ((ahcz)aoso.a).createBuilder();
                    if (a2 != null) {
                        builder2.copyOnWrite();
                        final aoso aoso = (aoso)builder2.instance;
                        aoso.b |= 0x1;
                        aoso.c = a2;
                    }
                    aosy aosy;
                    if ((aosy = ((vbo)((atnb)adjk.f).a()).b().s) == null) {
                        aosy = aosy.a;
                    }
                    if (aosy.p) {
                        final InteractionLoggingScreen a3 = ((xax)((atnb)adjk.e).a()).a();
                        if (a3 != null) {
                            final int f = a3.f;
                            builder2.copyOnWrite();
                            final aoso aoso2 = (aoso)builder2.instance;
                            aoso2.b |= 0x2;
                            aoso2.d = f;
                        }
                    }
                    final int b2 = ((aoso)builder2.instance).b;
                    if ((b2 & 0x1) == 0x0) {
                        if ((b2 & 0x2) == 0x0) {
                            break Label_0345;
                        }
                    }
                    builder.copyOnWrite();
                    final aosv aosv2 = (aosv)builder.instance;
                    final aoso g = (aoso)builder2.build();
                    g.getClass();
                    aosv2.g = g;
                    aosv2.b |= 0x40;
                }
            }
        }
        final ahbt byteString = b.toByteString();
        builder.copyOnWrite();
        final aosv aosv3 = (aosv)builder.instance;
        aosv3.b |= 0x8;
        aosv3.f = byteString;
        adjk.c(builder, c, adjk.b);
    }
    
    public final void d() {
        monitorenter(this);
        try {
            if (!this.a) {
                monitorexit(this);
                return;
            }
            this.e();
            final long n = this.n;
            long max = 0L;
            if (n > 0L) {
                final long d = this.r.d();
                final long b = this.b;
                if (b >= 0L) {
                    max = Math.max(0L, b + this.n - d);
                }
                this.y = this.s.scheduleAtFixedRate(this.g, max, this.n, TimeUnit.MILLISECONDS);
            }
            if (!this.o.isEmpty()) {
                final LinkedList list = (LinkedList)Collection$_EL.stream((Collection)this.o).map((Function)acdy.t).collect(Collectors.toCollection((Supplier)achh.f));
                final Runnable h = this.h;
                final oco r = this.r;
                final afxk t = this.t;
                Object z = null;
                Label_0314: {
                    if (!list.isEmpty()) {
                        final long longValue = list.peek();
                        if (list.size() > 1) {
                            list.removeFirst();
                        }
                        final long d2 = r.d();
                        z = SettableFuture.create();
                        final AtomicReference<Object> atomicReference = new AtomicReference<Object>(null);
                        while (true) {
                            while (!atomicReference.compareAndSet(null, t.e(new adjh((SettableFuture)z, h, atomicReference, t, d2 + longValue, list, r), longValue, TimeUnit.MILLISECONDS))) {
                                if (atomicReference.get() != null) {
                                    ((SettableFuture)z).addListener((Runnable)new addt((AtomicReference)atomicReference, 6), (Executor)afwd.a);
                                    break Label_0314;
                                }
                            }
                            continue;
                        }
                    }
                    z = afxe.a;
                }
                this.z = (ListenableFuture)z;
                monitorexit(this);
                return;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void e() {
        synchronized (this) {
            final ScheduledFuture y = this.y;
            if (y != null && !y.isCancelled()) {
                this.y.cancel(true);
            }
            this.y = null;
            final ListenableFuture z = this.z;
            if (z != null && !z.isCancelled()) {
                this.z.cancel(false);
            }
            this.z = null;
        }
    }
    
    public final void l() {
        this.c = this.r.d();
        this.v.execute((Runnable)new addt(this, 7));
        final adjk adjk = (adjk)this.e.a();
        final Object a = adjk.a;
        monitorenter(a);
        try {
            for (final adim adim : ((Map<K, adim>)adjk.g).values()) {
                if (adim.g()) {
                    final Object c = adjk.c;
                    adim.d();
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
        this.v.execute((Runnable)new addt(this, 8));
        final adjk adjk = (adjk)this.e.a();
        final Object a = adjk.a;
        monitorenter(a);
        try {
            for (final adim adim : ((Map<K, adim>)adjk.g).values()) {
                if (adim.g()) {
                    final Object c = adjk.c;
                    adim.c();
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
