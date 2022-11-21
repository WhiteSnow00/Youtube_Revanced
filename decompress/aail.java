import android.app.Notification;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Intent;
import android.app.NotificationManager;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.HashMap;
import java.util.Set;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;
import android.content.Context;
import java.util.Map;
import android.util.Pair;
import java.util.concurrent.CountDownLatch;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aail implements aaho
{
    public static final CountDownLatch a;
    private static final Pair k;
    protected volatile String b;
    public final Map c;
    public final Context d;
    public final atnb e;
    public final atnb f;
    public aahu g;
    protected boolean h;
    public CountDownLatch i;
    public final aapu j;
    private final Executor l;
    private final atnb m;
    private final SharedPreferences n;
    private final aahv o;
    private final aabw p;
    private final aagx q;
    private final Executor r;
    private final aaik s;
    private final String t;
    private aaij u;
    private Set v;
    private Executor w;
    private asln x;
    private jqj y;
    private final abwe z;
    
    static {
        a = new CountDownLatch(0);
        k = new Pair((Object)"", (Object)17);
    }
    
    public aail(final Context d, final Executor l, final atnb m, final atnb e, final atnb f, final SharedPreferences n, final aahv o, final aabw p18, final aagx q, final Executor r, final aaik s, final abwe z, final String t, final aapu j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = new HashMap();
        this.v = new CopyOnWriteArraySet();
        this.d = d;
        this.l = l;
        this.m = m;
        this.e = e;
        this.f = f;
        this.n = n;
        this.o = o;
        this.p = p18;
        this.q = q;
        this.r = r;
        this.s = s;
        this.z = z;
        this.t = t;
        this.j = j;
    }
    
    private final void q(final tui tui) {
        for (final aahb aahb : this.v) {
            if (aahb != null) {
                tui.a((Object)aahb);
            }
        }
    }
    
    private final void r() {
        final String d = ((aadl)this.e.a()).d();
        aahc.B(this.n, d, true);
        ((aafz)this.m.a()).C(d, true);
    }
    
    public final aahp a() {
        final aahv o = this.o;
        final aabw p = this.p;
        final aagx q = this.q;
        final Executor r = this.r;
        final aaik s = this.s;
        final abwe z = this.z;
        final String t = this.t;
        if (this.g == null) {
            this.i = new CountDownLatch(1);
            final aaij u = new aaij(this, r);
            this.u = u;
            this.g = o.a(u, t, s);
            this.l.execute((Runnable)new zvy(this, 18));
            this.v = new CopyOnWriteArraySet();
            final jqj y = new jqj(this, 2);
            this.y = y;
            this.n.registerOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)y);
            this.x = z.F((asmi)new aaid(this, 2));
            this.b();
            this.o(p);
            this.o(q);
            this.w = r;
            final aaij u2 = this.u;
            if (u2 != null) {
                u2.b = r;
            }
        }
        final aahu g = this.g;
        g.getClass();
        return (aahp)g;
    }
    
    public final void b() {
        final aahu g = this.g;
        if (g != null) {
            g.j(((aafz)this.m.a()).w());
        }
    }
    
    @Override
    public final void c(final boolean b, final boolean b2) {
        final aahu g = this.g;
        if (g == null) {
            return;
        }
        if (g.e() > 0) {
            return;
        }
        this.q((tui)xrh.g);
        final aapu j = this.j;
        final Object b3 = j.b;
        monitorenter(b3);
        try {
            for (final Pair pair : j.g()) {
                final String s = (String)pair.first;
                String.valueOf(pair.second);
                final int intValue = (int)pair.second;
                if (intValue != 15 && intValue != 17) {
                    switch (intValue) {
                        default: {
                            continue;
                        }
                        case 7:
                        case 8:
                        case 9:
                        case 10: {
                            break;
                        }
                    }
                }
                ((NotificationManager)j.c).cancel((String)pair.first, (int)pair.second);
            }
            ((Set)j.b).clear();
            monitorexit(b3);
            try {
                final Class<?> forName = Class.forName(this.t);
                final Context d = this.d;
                d.stopService(new Intent(d, (Class)forName));
                final aahu g2 = this.g;
                if (g2 != null) {
                    g2.g();
                }
                final CountDownLatch i = this.i;
                if (i != null) {
                    i.countDown();
                }
                this.g = null;
                final jqj y = this.y;
                if (y != null) {
                    this.n.unregisterOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)y);
                }
                final String d2 = ((aadl)this.e.a()).d();
                if (b) {
                    aahc.B(this.n, d2, false);
                }
                if (b2) {
                    ((aafz)this.m.a()).C(d2, false);
                }
                final asln x = this.x;
                if (x != null) {
                    atkw.f((AtomicReference)x);
                    this.x = null;
                }
            }
            catch (final ClassNotFoundException b3) {
                tut.b("[Offline] Cannot find class: ".concat(this.t));
            }
        }
        finally {
            monitorexit(b3);
            while (true) {}
        }
    }
    
    @Override
    public final void d(final Map map) {
        this.c.putAll(map);
        this.h = true;
        this.q((tui)xrh.h);
        final Iterator iterator = map.values().iterator();
        while (iterator.hasNext()) {
            if (((aadf)iterator.next()).c()) {
                this.r();
                break;
            }
        }
    }
    
    @Override
    public final void e(final aadf aadf) {
        this.c.put(aadf.a, aadf);
        this.q((tui)new xri(aadf, 10));
        this.r();
    }
    
    @Override
    public final void f(final aadf aadf) {
        this.c.put(aadf.a, aadf);
        this.q((tui)new xri(aadf, 13));
    }
    
    @Override
    public final void g(final aadf aadf, final boolean b) {
        this.c.put(aadf.a, aadf);
        this.q((tui)new xri(aadf, 11));
        this.w.execute((Runnable)new hta(this, aadf, b, 15));
    }
    
    @Override
    public final void h(final aadf aadf) {
        this.c.remove(aadf.a);
        this.q((tui)new xri(aadf, 9));
        if (aahc.ae(aadf) && aadf.a.equals(this.b)) {
            this.b = null;
        }
        this.w.execute(new aaii(this, aadf, 6));
    }
    
    @Override
    public final void i(final aadf aadf) {
        this.c.put(aadf.a, aadf);
        this.q((tui)new xri(aadf, 12));
    }
    
    @Override
    public final void j(final aadf aadf) {
        this.c.put(aadf.a, aadf);
        this.q((tui)new xri(aadf, 8));
    }
    
    @Override
    public final void k(final aadf aadf) {
        this.c.put(aadf.a, aadf);
        this.q((tui)new xri(aadf, 14));
    }
    
    @Override
    public final void l(final aadf aadf, final amxs amxs, final aacn aacn) {
        this.c.put(aadf.a, aadf);
        this.q((tui)new szu(aadf, amxs, aacn, 9));
        if (aahc.ae(aadf)) {
            final aozk b = aadf.b;
            if (b == aozk.g) {
                if (aadf.a.equals(this.b)) {
                    this.b = null;
                }
            }
            else if (b == aozk.d) {
                this.b = aadf.a;
            }
        }
        this.w.execute(new aaii(this, aadf, 7));
    }
    
    @Override
    public final void m(final aadf aadf) {
        this.c.put(aadf.a, aadf);
        this.q((tui)new xri(aadf, 15));
    }
    
    public final void n(final aadf aadf, final boolean b) {
        ((aads)this.f.a()).C(aadf, b);
    }
    
    public final void o(final aahb aahb) {
        final Set v = this.v;
        aahb.getClass();
        if (v.add(aahb) && this.h) {
            aahb.g();
        }
    }
    
    public final boolean p(final Notification notification) {
        if (this.j.g().contains(aail.k)) {
            this.j.i(null, 17, notification);
            return true;
        }
        return false;
    }
}
