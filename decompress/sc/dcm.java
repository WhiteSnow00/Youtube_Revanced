import android.content.res.Configuration;
import java.util.Iterator;
import android.view.View;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import android.graphics.Bitmap;
import java.util.concurrent.CopyOnWriteArrayList;
import android.content.Context;
import android.content.ComponentCallbacks2;

// 
// Decompiled by Procyon v0.6.0
// 

public class dcm implements ComponentCallbacks2, dmi
{
    private static final dnq e;
    protected final dbp a;
    protected final Context b;
    public final dmh c;
    public final CopyOnWriteArrayList d;
    private final dms f;
    private final dmr g;
    private final dna h;
    private final Runnable i;
    private final dlz j;
    private dnq k;
    
    static {
        final dnq a = dnq.a((Class)Bitmap.class);
        ((dnh)a).W();
        e = a;
        ((dnh)dnq.a((Class)dlj.class)).W();
        final dnq dnq = (dnq)((dnh)((dnh)dnq.b(dfi.b)).J(dca.d)).V();
    }
    
    public dcm(final dbp a, final dmh c, final dmr g, final Context b) {
        final dms f = new dms();
        final cll f2 = a.f;
        this.h = new dna();
        final cdj i = new cdj(this, 18);
        this.i = i;
        this.a = a;
        this.c = c;
        this.g = g;
        this.f = f;
        this.b = b;
        final Context applicationContext = b.getApplicationContext();
        final dcl dcl = new dcl(this, f);
        Object j;
        if (td.c(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            j = new dma(applicationContext, (dly)dcl);
        }
        else {
            j = new dmm();
        }
        this.j = (dlz)j;
        if (dph.n()) {
            dph.k((Runnable)i);
        }
        else {
            c.a((dmi)this);
        }
        c.a((dmi)j);
        this.d = new CopyOnWriteArrayList(a.b.c);
        this.p(a.b.b());
        synchronized (a.e) {
            if (!a.e.contains(this)) {
                a.e.add(this);
                return;
            }
            throw new IllegalStateException("Cannot register already registered manager");
        }
    }
    
    public dcj a(final Class clazz) {
        return new dcj(this.a, this, clazz, this.b);
    }
    
    public dcj b() {
        return this.a(Bitmap.class).b((dnh)dcm.e);
    }
    
    public dcj c() {
        return this.a(Drawable.class);
    }
    
    public dcj d(final Drawable drawable) {
        return this.c().e(drawable);
    }
    
    public dcj e(final Integer n) {
        return this.c().g(n);
    }
    
    public dcj f(final Object o) {
        return this.c().h(o);
    }
    
    public dcj g(final byte[] array) {
        return this.c().j(array);
    }
    
    final dnq h() {
        synchronized (this) {
            return this.k;
        }
    }
    
    public final void i(final View view) {
        this.j((dod)new dck(view));
    }
    
    public final void j(final dod dod) {
        if (dod == null) {
            return;
        }
        final boolean r = this.r(dod);
        final dnl d = dod.d();
        if (!r) {
            final dbp a = this.a;
            synchronized (a.e) {
                final Iterator iterator = a.e.iterator();
                while (iterator.hasNext()) {
                    if (((dcm)iterator.next()).r(dod)) {
                        return;
                    }
                }
                monitorexit(a.e);
                if (d != null) {
                    dod.h((dnl)null);
                    d.c();
                }
            }
        }
    }
    
    public final void k() {
        monitorenter(this);
        try {
            this.h.k();
            final Iterator iterator = dph.h((Collection)this.h.a).iterator();
            while (iterator.hasNext()) {
                this.j((dod)iterator.next());
            }
            this.h.a.clear();
            final dms f = this.f;
            final Iterator iterator2 = dph.h((Collection)f.a).iterator();
            while (iterator2.hasNext()) {
                f.a((dnl)iterator2.next());
            }
            f.b.clear();
            this.c.e((dmi)this);
            this.c.e((dmi)this.j);
            dph.g().removeCallbacks(this.i);
            final dbp a = this.a;
            synchronized (a.e) {
                if (a.e.contains(this)) {
                    a.e.remove(this);
                    monitorexit(a.e);
                    return;
                }
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void l() {
        synchronized (this) {
            this.o();
            this.h.l();
        }
    }
    
    public final void m() {
        synchronized (this) {
            this.n();
            this.h.m();
        }
    }
    
    public final void n() {
        monitorenter(this);
        try {
            final dms f = this.f;
            f.c = true;
            for (final dnl dnl : dph.h((Collection)f.a)) {
                if (dnl.n()) {
                    dnl.f();
                    f.b.add(dnl);
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void o() {
        monitorenter(this);
        try {
            final dms f = this.f;
            f.c = false;
            for (final dnl dnl : dph.h((Collection)f.a)) {
                if (!dnl.l() && !dnl.n()) {
                    dnl.b();
                }
            }
            f.b.clear();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
    }
    
    public final void onLowMemory() {
    }
    
    public final void onTrimMemory(final int n) {
    }
    
    protected void p(final dnq dnq) {
        synchronized (this) {
            this.k = (dnq)((dnh)((dnh)dnq).n()).s();
        }
    }
    
    final void q(final dod dod, final dnl dnl) {
        synchronized (this) {
            this.h.a.add(dod);
            final dms f = this.f;
            f.a.add(dnl);
            if (!f.c) {
                dnl.b();
                return;
            }
            dnl.c();
            f.b.add(dnl);
        }
    }
    
    final boolean r(final dod dod) {
        synchronized (this) {
            final dnl d = dod.d();
            if (d == null) {
                return true;
            }
            if (this.f.a(d)) {
                this.h.a.remove(dod);
                dod.h((dnl)null);
                return true;
            }
            return false;
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this) {
            final String string = super.toString();
            final String value = String.valueOf(this.f);
            final String value2 = String.valueOf(this.g);
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append("{tracker=");
            sb.append(value);
            sb.append(", treeNode=");
            sb.append(value2);
            sb.append("}");
            return sb.toString();
        }
    }
}
