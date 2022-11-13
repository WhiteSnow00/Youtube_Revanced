import android.util.Log;
import java.util.List;
import android.graphics.drawable.Drawable;
import com.facebook.litho.ComponentHost;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsv extends aqg
{
    private static final Rect g;
    public dtz f;
    private final View h;
    private final akw i;
    
    static {
        g = new Rect(0, 0, 1, 1);
    }
    
    public dsv(final View h, final dtz f, final boolean focusable, final int n) {
        super(h);
        this.h = h;
        this.f = f;
        this.i = new dsu(this);
        h.setFocusable(focusable);
        anb.X(h, n);
    }
    
    static void A(final dsv dsv, final View view, final AccessibilityEvent accessibilityEvent) {
        dsv.f(view, accessibilityEvent);
    }
    
    static boolean B(final dsv dsv, final View view, final AccessibilityEvent accessibilityEvent) {
        return dsv.g(view, accessibilityEvent);
    }
    
    static boolean C(final dsv dsv, final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        return dsv.h(viewGroup, view, accessibilityEvent);
    }
    
    static boolean D(final dsv dsv, final View view, final int n, final Bundle bundle) {
        return dsv.i(view, n, bundle);
    }
    
    private static ega E(final View view) {
        final boolean b = view instanceof ComponentHost;
        final ega ega = null;
        if (!b) {
            return null;
        }
        final ComponentHost componentHost = (ComponentHost)view;
        int n = 0;
        ega b2;
        while (true) {
            b2 = ega;
            if (n >= componentHost.a()) {
                break;
            }
            b2 = componentHost.b(n);
            if (b2 != null && dvd.b(b2).d()) {
                break;
            }
            ++n;
        }
        return b2;
    }
    
    static void w(final dsv dsv, final View view, final AccessibilityEvent accessibilityEvent) {
        dsv.b(view, accessibilityEvent);
    }
    
    static void x(final dsv dsv, final View view, final aom aom) {
        dsv.c(view, aom);
    }
    
    static void y(final dsv dsv, final View view, final AccessibilityEvent accessibilityEvent) {
        dsv.d(view, accessibilityEvent);
    }
    
    static void z(final dsv dsv, final View view, final int n) {
        dsv.e(view, n);
    }
    
    public final aoq a(final View view) {
        final ega e = E(this.h);
        if (e != null && ((dtd)dvd.b(e).c).ak()) {
            return super.a(view);
        }
        return null;
    }
    
    public final void c(final View a, final aom b) {
        final ega e = E(this.h);
        final dtz f = this.f;
        Label_0157: {
            if (f != null) {
                final dun p2 = f.p;
                if (p2 != null) {
                    final akw i = this.i;
                    bkw.e();
                    if (bku.g == null) {
                        bku.g = new dwi();
                    }
                    final dwi g = bku.g;
                    g.a = a;
                    g.b = b;
                    g.c = i;
                    p2.b.l().P(p2, bku.g);
                    final dwi g2 = bku.g;
                    g2.a = null;
                    g2.b = null;
                    g2.c = null;
                    break Label_0157;
                }
            }
            if (e != null) {
                super.c(a, b);
                ((dtd)dvd.b(e).c).au(a, b);
            }
            else {
                super.c(a, b);
            }
        }
        final dtz f2 = this.f;
        if (f2 != null) {
            final String o = f2.o;
            if (o != null) {
                b.q((CharSequence)o);
            }
        }
        final dtz f3 = this.f;
        if (f3 != null) {
            final int u = f3.u;
            if (u != 0) {
                boolean b2 = true;
                if (u != 1) {
                    b2 = false;
                }
                b.z(b2);
            }
        }
    }
    
    protected final int j(final float n, final float n2) {
        final ega e = E(this.h);
        if (e == null) {
            return Integer.MIN_VALUE;
        }
        final dst c = dvd.b(e).c;
        if (((dtd)c).ar() != 0) {
            final Rect bounds = ((Drawable)e.a).getBounds();
            final int aq = ((dtd)c).aq((int)n - bounds.left, (int)n2 - bounds.top);
            if (aq >= 0) {
                return aq;
            }
        }
        return Integer.MIN_VALUE;
    }
    
    protected final void m(final List list) {
        final ega e = E(this.h);
        if (e == null) {
            return;
        }
        for (int ar = ((dtd)dvd.b(e).c).ar(), i = 0; i < ar; ++i) {
            list.add(i);
        }
    }
    
    protected final void p(final int n, final aom aom) {
        final ega e = E(this.h);
        if (e == null) {
            Log.e("ComponentAccessibility", "No accessible mount item found for view: ".concat(String.valueOf(String.valueOf(this.h))));
            aom.u((CharSequence)"");
            aom.m(dsv.g);
            return;
        }
        final Rect bounds = ((Drawable)e.a).getBounds();
        final dst c = dvd.b(e).c;
        aom.q((CharSequence)c.getClass().getName());
        if (n >= ((dtd)c).ar()) {
            final StringBuilder sb = new StringBuilder("Received unrecognized virtual view id: ");
            sb.append(n);
            Log.e("ComponentAccessibility", sb.toString());
            aom.u((CharSequence)"");
            aom.m(dsv.g);
            return;
        }
        ((dtd)c).av(aom, n, bounds.left, bounds.top);
    }
    
    protected final boolean t(final int n, final int n2) {
        return false;
    }
    
    protected final void u(final AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setContentDescription((CharSequence)"");
    }
}
