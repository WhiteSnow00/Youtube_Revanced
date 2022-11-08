import android.os.Handler;
import java.util.Iterator;
import android.content.res.Configuration;
import java.util.HashSet;
import com.google.android.apps.youtube.app.common.util.AccessibilityStateReceiver;
import android.content.Context;
import java.util.Set;
import android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gen implements AccessibilityManager$AccessibilityStateChangeListener, gem, fxm, xlt, fnp, fxn, tec
{
    public final Set a;
    private final Context b;
    private final tdz c;
    private final gel d;
    private final fxo e;
    private final xlv f;
    private final AccessibilityStateReceiver g;
    private final fnq h;
    private final Set i;
    private boolean j;
    private boolean k;
    private Boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    
    public gen(final Context b, final xlv f, final AccessibilityStateReceiver g, final fxo e, final tdz c, final gel d, final fnq h) {
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
        this.f = f;
        this.g = g;
        this.h = h;
        this.a = new HashSet();
        this.i = new HashSet();
    }
    
    private final void r(final boolean o) {
        if (this.o == o) {
            return;
        }
        this.o = o;
        this.n();
    }
    
    public final void a() {
        this.m = false;
        this.f.k((xlt)this);
        this.n();
        this.c.m((Object)this);
    }
    
    public final void c() {
        boolean o = true;
        this.m = true;
        this.f.i((xlt)this);
        if (this.f.g() == null) {
            o = false;
        }
        this.o = o;
        this.n();
        this.j(this.b.getResources().getConfiguration());
        this.c.g((Object)this);
    }
    
    public final void d(final boolean b) {
        this.n = false;
        this.n();
    }
    
    public final void f(final boolean b) {
        this.n = true;
        this.n();
    }
    
    public final void g(final int n) {
        this.i.add(n);
        this.n();
    }
    
    public final void i() {
        final AccessibilityStateReceiver g = this.g;
        g.l();
        g.a.add(this);
        this.e.g((fxn)this);
        this.h.c((fnp)this);
        this.e.f((fxm)this);
        final int orientation = this.b.getResources().getConfiguration().orientation;
        boolean j = true;
        if (orientation != 1) {
            j = false;
        }
        this.j = j;
    }
    
    public final void j(final Configuration configuration) {
        final int orientation = configuration.orientation;
        boolean j = true;
        if (orientation != 1) {
            j = false;
        }
        if (this.j != j) {
            this.j = j;
            this.n();
        }
    }
    
    public final void k(final int n) {
        this.i.remove(n);
        this.n();
    }
    
    public final void l(final boolean k) {
        if (k != this.k) {
            this.k = k;
            this.n();
        }
    }
    
    public final boolean m() {
        final Boolean l = this.l;
        if (l != null) {
            return l;
        }
        final boolean m = this.m;
        boolean b2;
        final boolean b = b2 = false;
        Label_0106: {
            if (m) {
                b2 = b;
                if (this.n) {
                    b2 = b;
                    if (!this.o) {
                        b2 = b;
                        if (!this.p) {
                            b2 = b;
                            if (this.i.isEmpty()) {
                                if (this.k) {
                                    b2 = b;
                                    if (!this.j) {
                                        break Label_0106;
                                    }
                                    b2 = b;
                                    if (!this.d.e()) {
                                        break Label_0106;
                                    }
                                }
                                b2 = true;
                            }
                        }
                    }
                }
            }
        }
        final Boolean value = b2;
        this.l = value;
        return value;
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final gek gek = (gek)o;
            this.n();
            array = null;
        }
        else {
            array = new Class[] { gek.class };
        }
        return array;
    }
    
    public final void n() {
        szc.f();
        this.l = null;
        final boolean m = this.m();
        if (this.q == m) {
            return;
        }
        this.q = m;
        for (final kag kag : this.a) {
            kag.d.v();
            if (m && kag.g != null) {
                final Handler f = kag.f;
                final gjd e = kag.e;
                e.getClass();
                f.post((Runnable)new jnu(e, 9));
            }
        }
    }
    
    public final void o(final xlo xlo) {
    }
    
    public final void onAccessibilityStateChanged(final boolean p) {
        if (this.p == p) {
            return;
        }
        this.p = p;
        this.n();
    }
    
    public final void p(final xlo xlo) {
        this.r(false);
    }
    
    public final void q(final xlo xlo) {
        this.r(true);
    }
}
