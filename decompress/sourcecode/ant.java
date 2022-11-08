import j$.util.Objects;
import android.graphics.Rect;
import android.util.Log;
import android.os.Build$VERSION;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

class ant extends any
{
    private static boolean c;
    private static Method f;
    private static Class g;
    private static Field h;
    private static Field i;
    final WindowInsets a;
    aia b;
    private aia[] j;
    private aia k;
    private aoa l;
    
    public ant(final aoa aoa, final WindowInsets a) {
        super(aoa);
        this.k = null;
        this.a = a;
    }
    
    private aia w(final int n, final boolean b) {
        aia a = aia.a;
        aia b2;
        for (int i = 1; i <= 256; i += i, a = b2) {
            b2 = a;
            if ((n & i) != 0x0) {
                b2 = aia.b(a, this.b(i, b));
            }
        }
        return a;
    }
    
    private aia x() {
        final aoa l = this.l;
        if (l != null) {
            return l.g();
        }
        return aia.a;
    }
    
    private aia y(final View view) {
        if (Build$VERSION.SDK_INT < 30) {
            if (!ant.c) {
                z();
            }
            final Method f = ant.f;
            final aia aia = null;
            if (f != null && ant.g != null) {
                if (ant.h != null) {
                    try {
                        final Object invoke = f.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", (Throwable)new NullPointerException());
                            return null;
                        }
                        final Rect rect = (Rect)ant.h.get(ant.i.get(invoke));
                        aia c = aia;
                        if (rect != null) {
                            c = aia.c(rect);
                        }
                        return c;
                    }
                    catch (final ReflectiveOperationException ex) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(ex.getMessage())), (Throwable)ex);
                    }
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }
    
    private static void z() {
        try {
            ant.f = View.class.getDeclaredMethod("getViewRootImpl", (Class<?>[])new Class[0]);
            ant.h = (ant.g = Class.forName("android.view.View$AttachInfo")).getDeclaredField("mVisibleInsets");
            ant.i = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            ant.h.setAccessible(true);
            ant.i.setAccessible(true);
        }
        catch (final ReflectiveOperationException ex) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(ex.getMessage())), (Throwable)ex);
        }
        ant.c = true;
    }
    
    public aia a(final int n) {
        return this.w(n, false);
    }
    
    protected aia b(int n, final boolean b) {
        int d = 0;
        if (n != 1) {
            aia g = null;
            final aia aia = null;
            if (n != 2) {
                if (n != 8) {
                    if (n == 16) {
                        return this.u();
                    }
                    if (n == 32) {
                        return this.t();
                    }
                    if (n == 64) {
                        return this.v();
                    }
                    if (n != 128) {
                        return aia.a;
                    }
                    final aoa l = this.l;
                    alf alf;
                    if (l != null) {
                        alf = l.i();
                    }
                    else {
                        alf = this.r();
                    }
                    if (alf != null) {
                        if (Build$VERSION.SDK_INT >= 28) {
                            n = ale.b(alf.a);
                        }
                        else {
                            n = 0;
                        }
                        if (Build$VERSION.SDK_INT >= 28) {
                            d = ale.d(alf.a);
                        }
                        return aia.d(n, d, alf.b(), alf.a());
                    }
                    return aia.a;
                }
                else {
                    final aia[] j = this.j;
                    aia aia2 = aia;
                    if (j != null) {
                        aia2 = j[afq.b(8)];
                    }
                    if (aia2 != null) {
                        return aia2;
                    }
                    final aia d2 = this.d();
                    final aia x = this.x();
                    n = d2.e;
                    if (n > x.e) {
                        return aia.d(0, 0, 0, n);
                    }
                    final aia b2 = this.b;
                    if (b2 != null && !b2.equals((Object)aia.a)) {
                        n = this.b.e;
                        if (n > x.e) {
                            return aia.d(0, 0, 0, n);
                        }
                    }
                    return aia.a;
                }
            }
            else {
                if (b) {
                    final aia x2 = this.x();
                    final aia m = this.m();
                    return aia.d(Math.max(x2.b, m.b), 0, Math.max(x2.d, m.d), Math.max(x2.e, m.e));
                }
                final aia d3 = this.d();
                final aoa i = this.l;
                if (i != null) {
                    g = i.g();
                }
                final int n2 = n = d3.e;
                if (g != null) {
                    n = Math.min(n2, g.e);
                }
                return aia.d(d3.b, 0, d3.d, n);
            }
        }
        else {
            if (b) {
                return aia.d(0, Math.max(this.x().c, this.d().c), 0, 0);
            }
            return aia.d(0, this.d().c, 0, 0);
        }
    }
    
    public aia c(final int n) {
        return this.w(7, true);
    }
    
    public final aia d() {
        if (this.k == null) {
            this.k = aia.d(this.a.getSystemWindowInsetLeft(), this.a.getSystemWindowInsetTop(), this.a.getSystemWindowInsetRight(), this.a.getSystemWindowInsetBottom());
        }
        return this.k;
    }
    
    public aoa e(final int n, final int n2, final int n3, final int n4) {
        final aoa o = aoa.o(this.a);
        Object o2;
        if (Build$VERSION.SDK_INT >= 30) {
            o2 = new anr(o);
        }
        else if (Build$VERSION.SDK_INT >= 29) {
            o2 = new anq(o);
        }
        else {
            o2 = new anp(o);
        }
        ((ans)o2).c(aoa.h(this.d(), n, n2, n3, n4));
        ((ans)o2).b(aoa.h(this.m(), n, n2, n3, n4));
        return ((ans)o2).a();
    }
    
    public boolean equals(final Object o) {
        return super.equals(o) && Objects.equals((Object)this.b, (Object)((ant)o).b);
    }
    
    public void f(final View view) {
        aia aia;
        if ((aia = this.y(view)) == null) {
            aia = aia.a;
        }
        this.h(aia);
    }
    
    public void g(final aia[] j) {
        this.j = j;
    }
    
    public void h(final aia b) {
        this.b = b;
    }
    
    public void i(final aoa l) {
        this.l = l;
    }
    
    public boolean j() {
        return this.a.isRound();
    }
    
    protected boolean k(final int n) {
        if (n != 1 && n != 2) {
            if (n == 4) {
                return false;
            }
            if (n != 8 && n != 128) {
                return true;
            }
        }
        return !this.b(n, false).equals((Object)aia.a);
    }
    
    public boolean l(int i) {
        for (i = 1; i <= 256; i += i) {
            if ((i & 0x8) != 0x0) {
                if (!this.k(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
