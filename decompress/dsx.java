import java.lang.ref.WeakReference;
import android.util.Log;
import android.os.Looper;
import android.content.res.Resources;
import com.facebook.litho.ComponentTree;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class dsx
{
    public static final dva a;
    public final Context b;
    public final dws c;
    public String d;
    public dst e;
    public int f;
    public int g;
    public ComponentTree h;
    public pa i;
    public final eg j;
    public cya k;
    private final String l;
    private final bhv m;
    private final msr n;
    
    static {
        a = (dva)new dwd();
    }
    
    public dsx(final Context context) {
        this(context, null, null, null, null, null, null);
    }
    
    public dsx(final Context b, final String l, final msr n, final cya k, final byte[] array, final byte[] array2, final byte[] array3) {
        if (n != null && l == null) {
            throw new IllegalStateException("When a ComponentsLogger is set, a LogTag must be set");
        }
        this.b = b;
        this.m = bhv.u(b.getResources().getConfiguration());
        this.j = new eg(this);
        this.k = k;
        this.n = n;
        this.l = l;
        this.c = null;
    }
    
    public dsx(final dsx dsx, final dws dws, final cya cya, final pa i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = dsx.b;
        this.m = dsx.m;
        this.j = dsx.j;
        this.f = dsx.f;
        this.g = dsx.g;
        this.e = dsx.e;
        final ComponentTree h = dsx.h;
        this.h = h;
        this.i = i;
        this.n = dsx.n;
        String l;
        final String s = l = dsx.l;
        if (s == null) {
            l = s;
            if (h != null) {
                l = h.e();
            }
        }
        this.l = l;
        dws c;
        if ((c = dws) == null) {
            c = dsx.c;
        }
        this.c = c;
        cya k;
        if ((k = cya) == null) {
            k = dsx.k;
        }
        this.k = k;
    }
    
    public static dsx c(final dsx dsx) {
        return new dsx(dsx.b, dsx.i(), dsx.q(), dsx.p(), null, null, null);
    }
    
    private final void t() {
        final String d = this.d;
        if (d == null) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Updating the state of a component during ");
        sb.append(d);
        sb.append(" leads to unexpected behaviour, consider using lazy state updates.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final Context a() {
        return this.b.getApplicationContext();
    }
    
    public final Resources b() {
        return this.b.getResources();
    }
    
    final dsx d() {
        return new dsx(this, this.c, this.k, this.i, null, null, null, null);
    }
    
    public final dun e() {
        final dst e = this.e;
        if (e != null) {
            final dun q = e.q;
            if (q != null) {
                return q;
            }
        }
        final ComponentTree h = this.h;
        if (h != null) {
            return (dun)h.x;
        }
        return (dun)dtx.a;
    }
    
    final dvf f() {
        final pa i = this.i;
        if (i == null) {
            return null;
        }
        return (dvf)i.c;
    }
    
    public final Object g(final Class clazz) {
        final cya k = this.k;
        if (k == null) {
            return null;
        }
        return k.u(clazz);
    }
    
    public String h() {
        final boolean a = dyp.a;
        final dst e = this.e;
        if (e != null) {
            return dst.D(e);
        }
        throw new RuntimeException("getGlobalKey cannot be accessed from a ComponentContext without a scope");
    }
    
    public final String i() {
        final ComponentTree h = this.h;
        if (h != null) {
            final String a = h.A;
            if (a != null) {
                return a;
            }
        }
        return this.l;
    }
    
    final void j() {
        this.d = null;
    }
    
    final boolean k() {
        final pa i = this.i;
        if (i != null) {
            final Object c = i.c;
            if (c != null) {
                return ((dvf)c).v;
            }
        }
        return false;
    }
    
    public final boolean l() {
        final ComponentTree h = this.h;
        if (h != null) {
            return h.y;
        }
        return dyp.j;
    }
    
    public final boolean m() {
        final pa i = this.i;
        if (i == null) {
            return false;
        }
        final Object b = i.b;
        return b != null && ((dti)b).k;
    }
    
    final boolean n() {
        final pa i = this.i;
        return i != null && i.h();
    }
    
    public final bhv o(final String s, final int n) {
        String h;
        if (this.e == null) {
            h = "";
        }
        else {
            h = this.h();
        }
        return new bhv(h, n, s);
    }
    
    public final cya p() {
        return cya.x(this.k);
    }
    
    public final msr q() {
        final ComponentTree h = this.h;
        if (h != null) {
            final msr f = h.F;
            if (f != null) {
                return f;
            }
        }
        return this.n;
    }
    
    public void r(final argj argj, final String s) {
        this.t();
        final ComponentTree h = this.h;
        if (h == null) {
            return;
        }
        final String h2 = this.h();
        final boolean k = this.k();
        if (h.l) {
            synchronized (h) {
                if (h.s == null) {
                    return;
                }
                h.v.n(h2, argj, false);
                monitorexit(h);
                ebe.c.addAndGet(1L);
                h.p(true, s, k);
                return;
            }
        }
        throw new RuntimeException("Triggering async state updates on this component tree is disabled, use sync state updates.");
    }
    
    public void s(final argj argj, final String s) {
        this.t();
        final ComponentTree h = this.h;
        if (h == null) {
            return;
        }
        final String h2 = this.h();
        final boolean k = this.k();
        synchronized (h) {
            if (h.s == null) {
                return;
            }
            h.v.n(h2, argj, false);
            monitorexit(h);
            ebe.b.addAndGet(1L);
            final Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                Log.w(ComponentTree.a, "You cannot update state synchronously from a thread without a looper, using the default background layout thread instead");
                synchronized (h.e) {
                    final dtk f = h.f;
                    if (f != null) {
                        h.n.a((Runnable)f);
                    }
                    h.f = new dtk(h, s, k);
                    h.n.b();
                    h.n.c((Runnable)h.f);
                    return;
                }
            }
            final WeakReference weakReference = ComponentTree.b.get();
            dvk dvk;
            if (weakReference != null) {
                dvk = (dvk)weakReference.get();
            }
            else {
                dvk = null;
            }
            Object o = dvk;
            if (dvk == null) {
                o = new dvj(myLooper);
                ComponentTree.b.set(new WeakReference(o));
            }
            synchronized (h.e) {
                final dtk f2 = h.f;
                if (f2 != null) {
                    ((dvk)o).a((Runnable)f2);
                }
                ((dvk)o).c((Runnable)(h.f = new dtk(h, s, k)));
            }
        }
    }
}
