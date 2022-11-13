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

public final class gev implements AccessibilityManager$AccessibilityStateChangeListener, geu, fxu, xnr, fnu, fxv, tgg
{
    public final Set a;
    private final Context b;
    private final tgd c;
    private final get d;
    private final fxw e;
    private final xnt f;
    private final AccessibilityStateReceiver g;
    private final fnv h;
    private final Set i;
    private boolean j;
    private boolean k;
    private Boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    
    public gev(final Context b, final xnt f, final AccessibilityStateReceiver g, final fxw e, final tgd c, final get d, final fnv h) {
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
        this.f.k((xnr)this);
        this.n();
        this.c.m((Object)this);
    }
    
    public final void b(final boolean b) {
    }
    
    public final void c() {
        boolean o = true;
        this.m = true;
        this.f.i((xnr)this);
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
    
    public final void h(final atke atke) {
        this.a.add(atke.a());
    }
    
    public final void i() {
        final AccessibilityStateReceiver g = this.g;
        g.l();
        g.a.add(this);
        this.e.g(this);
        this.h.c((fnu)this);
        this.e.f(this);
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
        Label_0101: {
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
                                        break Label_0101;
                                    }
                                    b2 = b;
                                    if (!this.d.e()) {
                                        break Label_0101;
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
            final ges ges = (ges)o;
            this.n();
            array = null;
        }
        else {
            array = new Class[] { ges.class };
        }
        return array;
    }
    
    public final void n() {
        tbi.f();
        this.l = null;
        final boolean m = this.m();
        if (this.q == m) {
            return;
        }
        this.q = m;
        for (final kbh kbh : this.a) {
            kbh.d.v();
            if (m && kbh.g != null) {
                final Handler f = kbh.f;
                final gjl e = kbh.e;
                e.getClass();
                f.post((Runnable)new jqb(e, 7));
            }
        }
    }
    
    public final void o(final xnm xnm) {
    }
    
    public final void onAccessibilityStateChanged(final boolean p) {
        if (this.p == p) {
            return;
        }
        this.p = p;
        this.n();
    }
    
    public final void p(final xnm xnm) {
        this.r(false);
    }
    
    public final void q(final xnm xnm) {
        this.r(true);
    }
}
