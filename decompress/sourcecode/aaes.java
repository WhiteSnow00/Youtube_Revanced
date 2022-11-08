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

public final class aaes implements aadv
{
    public static final CountDownLatch a;
    private static final Pair k;
    protected volatile String b;
    public final Map c;
    public final Context d;
    public final atjj e;
    public final atjj f;
    public aaeb g;
    protected boolean h;
    public CountDownLatch i;
    public final auip j;
    private final Executor l;
    private final atjj m;
    private final SharedPreferences n;
    private final aaec o;
    private final zye p;
    private final aade q;
    private final Executor r;
    private final aaeq s;
    private final String t;
    private aaep u;
    private Set v;
    private Executor w;
    private asic x;
    private joz y;
    private final aamd z;
    
    static {
        a = new CountDownLatch(0);
        k = new Pair((Object)"", (Object)17);
    }
    
    public aaes(final Context d, final Executor l, final atjj m, final atjj e, final atjj f, final SharedPreferences n, final aaec o, final zye p18, final aade q, final Executor r, final aaeq s, final aamd z, final String t, final auip j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
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
    
    private final void q(final trb trb) {
        for (final aadi aadi : this.v) {
            if (aadi != null) {
                trb.a((Object)aadi);
            }
        }
    }
    
    private final void r() {
        final String d = ((zzu)this.e.a()).d();
        aadj.B(this.n, d, true);
        ((aacf)this.m.a()).C(d, true);
    }
    
    public final aadw a() {
        final aaec o = this.o;
        final zye p = this.p;
        final aade q = this.q;
        final Executor r = this.r;
        final aaeq s = this.s;
        final aamd z = this.z;
        final String t = this.t;
        if (this.g == null) {
            this.i = new CountDownLatch(1);
            final aaep u = new aaep((aadv)this, r);
            this.u = u;
            this.g = o.a((aadv)u, t, s);
            this.l.execute((Runnable)new zsh(this, 17));
            this.v = new CopyOnWriteArraySet();
            final joz y = new joz(this, 2);
            this.y = y;
            this.n.registerOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)y);
            this.x = z.A((asix)new zsv(this, 14));
            this.b();
            this.o((aadi)p);
            this.o((aadi)q);
            this.w = r;
            final aaep u2 = this.u;
            if (u2 != null) {
                u2.b = r;
            }
        }
        final aaeb g = this.g;
        g.getClass();
        return (aadw)g;
    }
    
    public final void b() {
        final aaeb g = this.g;
        if (g != null) {
            g.j(((aacf)this.m.a()).w());
        }
    }
    
    public final void c(final boolean b, final boolean b2) {
        final aaeb g = this.g;
        if (g == null) {
            return;
        }
        if (g.e() > 0) {
            return;
        }
        this.q((trb)xnz.h);
        final auip j = this.j;
        final Object a = j.a;
        monitorenter(a);
        try {
            for (final Pair pair : j.T()) {
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
                ((NotificationManager)j.b).cancel((String)pair.first, (int)pair.second);
            }
            ((Set)j.a).clear();
            monitorexit(a);
            try {
                final Class<?> forName = Class.forName(this.t);
                final Context d = this.d;
                d.stopService(new Intent(d, (Class)forName));
                final aaeb g2 = this.g;
                if (g2 != null) {
                    g2.g();
                }
                final CountDownLatch i = this.i;
                if (i != null) {
                    i.countDown();
                }
                this.g = null;
                final joz y = this.y;
                if (y != null) {
                    this.n.unregisterOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)y);
                }
                final String d2 = ((zzu)this.e.a()).d();
                if (b) {
                    aadj.B(this.n, d2, false);
                }
                if (b2) {
                    ((aacf)this.m.a()).C(d2, false);
                }
                final asic x = this.x;
                if (x != null) {
                    athh.f((AtomicReference)x);
                    this.x = null;
                }
            }
            catch (final ClassNotFoundException a) {
                trn.b("[Offline] Cannot find class: ".concat(this.t));
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void d(final Map map) {
        this.c.putAll(map);
        this.h = true;
        this.q((trb)xnz.i);
        final Iterator iterator = map.values().iterator();
        while (iterator.hasNext()) {
            if (((zzo)iterator.next()).c()) {
                this.r();
                break;
            }
        }
    }
    
    public final void e(final zzo zzo) {
        this.c.put(zzo.a, zzo);
        this.q((trb)new zfo(zzo, 6));
        this.r();
    }
    
    public final void f(final zzo zzo) {
        this.c.put(zzo.a, zzo);
        this.q((trb)new zfo(zzo, 9));
    }
    
    public final void g(final zzo zzo, final boolean b) {
        this.c.put(zzo.a, zzo);
        this.q((trb)new zfo(zzo, 7));
        this.w.execute((Runnable)new hrw(this, zzo, b, 15));
    }
    
    public final void h(final zzo zzo) {
        this.c.remove(zzo.a);
        this.q((trb)new zfo(zzo, 5));
        if (aadj.ae(zzo) && zzo.a.equals(this.b)) {
            this.b = null;
        }
        this.w.execute((Runnable)new aaer(this, zzo, 0));
    }
    
    public final void i(final zzo zzo) {
        this.c.put(zzo.a, zzo);
        this.q((trb)new zfo(zzo, 8));
    }
    
    public final void j(final zzo zzo) {
        this.c.put(zzo.a, zzo);
        this.q((trb)new zfo(zzo, 4));
    }
    
    public final void k(final zzo zzo) {
        this.c.put(zzo.a, zzo);
        this.q((trb)new zfo(zzo, 10));
    }
    
    public final void l(final zzo zzo, final amtj amtj, final zyw zyw) {
        this.c.put(zzo.a, zzo);
        this.q((trb)new swl(zzo, amtj, zyw, 8));
        if (aadj.ae(zzo)) {
            final aouv b = zzo.b;
            if (b == aouv.g) {
                if (zzo.a.equals(this.b)) {
                    this.b = null;
                }
            }
            else if (b == aouv.d) {
                this.b = zzo.a;
            }
        }
        this.w.execute((Runnable)new aaer(this, zzo, 2));
    }
    
    public final void m(final zzo zzo) {
        this.c.put(zzo.a, zzo);
        this.q((trb)new zfo(zzo, 11));
    }
    
    public final void n(final zzo zzo, final boolean b) {
        ((aaab)this.f.a()).C(zzo, b);
    }
    
    public final void o(final aadi aadi) {
        final Set v = this.v;
        aadi.getClass();
        if (v.add(aadi) && this.h) {
            aadi.g();
        }
    }
    
    public final boolean p(final Notification notification) {
        if (this.j.T().contains(aaes.k)) {
            this.j.V((String)null, 17, notification);
            return true;
        }
        return false;
    }
}
