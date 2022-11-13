import android.graphics.drawable.Drawable;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dsr implements Cloneable
{
    private dsx a;
    public dst b;
    public eg c;
    
    protected static void n(final int n, final BitSet set, final String[] array) {
        int i = 0;
        if (set.nextClearBit(0) < n) {
            final ArrayList list = new ArrayList();
            while (i < n) {
                if (!set.get(i)) {
                    list.add(array[i]);
                }
                ++i;
            }
            throw new IllegalStateException("The following props are not marked as optional and were not supplied: ".concat(String.valueOf(Arrays.toString(list.toArray()))));
        }
    }
    
    public final void A(final Object o) {
        this.b.I().E().t(o);
    }
    
    public final dsr B(final int n, final float n2) {
        this.K(n, this.c.E(n2));
        return this;
    }
    
    public final void C(final int n, final float n2) {
        this.D(n, this.c.E(n2));
    }
    
    public final void D(final int n, final int n2) {
        final dso dso = (dso)this.b.I().D();
        dso.a |= 0x800000;
        if (dso.x == null) {
            dso.x = new dui();
        }
        dso.x.e(n, (float)n2);
    }
    
    public final void E(final Object e) {
        this.b.I().e = e;
    }
    
    public final void F(final float n) {
        final dso dso = (dso)this.b.I().D();
        dso.a |= 0x8000;
        dso.n = n;
    }
    
    public final void G(final float o) {
        final dso dso = (dso)this.b.I().D();
        dso.a |= 0x10000;
        dso.o = o;
    }
    
    public final void H(final float n) {
        final int e = this.c.E(n);
        final dso dso = (dso)this.b.I().D();
        dso.a |= 0x40;
        dso.h = e;
    }
    
    public final void I(final float i) {
        final dso dso = (dso)this.b.I().D();
        dso.a |= 0x80;
        dso.i = i;
    }
    
    public final void J(final dun d) {
        final dsp d2 = this.b.I().d();
        d2.a |= 0x40;
        d2.d = d;
    }
    
    public final void K(final int n, final int n2) {
        final dso dso = (dso)this.b.I().D();
        dso.a |= 0x2000000;
        if (dso.v == null) {
            dso.v = new dui();
        }
        dso.v.e(n, (float)n2);
    }
    
    public final void L(final int j) {
        final dso dso = (dso)this.b.I().D();
        dso.a |= 0x100;
        dso.j = j;
    }
    
    public final void M(final int n, final int n2) {
        final dso dso = (dso)this.b.I().D();
        dso.a |= 0x200000;
        if (dso.u == null) {
            dso.u = new dui();
        }
        dso.u.e(n, (float)n2);
    }
    
    public final void N(final int a) {
        final dso dso = (dso)this.b.I().D();
        dso.a |= 0x100000;
        dso.A = a;
    }
    
    public final void O(final int n, final float n2) {
        final int e = this.c.E(n2);
        final dsp d = this.b.I().d();
        d.a |= 0x100;
        if (d.f == null) {
            d.f = new dui();
        }
        d.f.e(n, (float)e);
    }
    
    public final void P(final dun dun) {
        this.b.I().E().s(dun);
    }
    
    public final void Q(final dun b) {
        final dsp d = this.b.I().d();
        d.a |= 0x8;
        d.b = b;
    }
    
    public final void R(final float n) {
        final int e = this.c.E(n);
        final dso dso = (dso)this.b.I().D();
        dso.a |= 0x1;
        dso.b = e;
    }
    
    public final void S(final float c) {
        final dso dso = (dso)this.b.I().D();
        dso.a |= 0x2;
        dso.c = c;
    }
    
    public final void T() {
        this.b.I().f = true;
    }
    
    public final void U(final hzm hzm) {
        this.b.h().put(1, (Object)hzm);
    }
    
    public final void V(final hzm hzm) {
        this.b.h().put(8, (Object)hzm);
    }
    
    public final void W(final hzm hzm) {
        this.b.h().put(4, (Object)hzm);
    }
    
    public final void X(final hzm hzm) {
        this.b.h().put(5, (Object)hzm);
    }
    
    public final void Y(final hzm hzm) {
        this.b.h().put(2, (Object)hzm);
    }
    
    public final void Z(final hzm hzm) {
        this.b.h().put(3, (Object)hzm);
    }
    
    public abstract dst a();
    
    protected abstract void b(final dst p0);
    
    public final /* bridge */ Object clone() {
        return this.m();
    }
    
    public final dsr m() {
        try {
            final dsr dsr = (dsr)super.clone();
            dsr.b(dsr.b = this.b.j());
            return dsr;
        }
        catch (final CloneNotSupportedException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
    
    public void o(final float n) {
        final dsq i = this.b.I();
        i.E().d(n);
        int n2;
        if (n == 1.0f) {
            n2 = (i.a & 0xFFFFFFF7);
        }
        else {
            n2 = (i.a | 0x8);
        }
        i.a = (byte)n2;
    }
    
    public final void p(final Drawable c) {
        final dsq i = this.b.I();
        i.a |= 0x1;
        i.c = c;
    }
    
    public final void q(final dun dun) {
        this.b.I().E().e(dun);
    }
    
    public void r(final boolean b) {
        this.b.I().E().g(b);
    }
    
    public void s(final CharSequence charSequence) {
        this.b.I().E().i(charSequence);
    }
    
    public final void t(final boolean b) {
        this.b.I().E().m(b);
    }
    
    public final void u(final int e) {
        final dsp d = this.b.I().d();
        d.a |= 0x1;
        d.e = e;
    }
    
    protected final void v(final dsx a, dst e) {
        this.c = a.j;
        this.b = e;
        this.a = a;
        e = a.e;
        if (e != null) {
            this.b.k = dst.D(e);
        }
        this.b.r = a.b;
    }
    
    public final void w(String q) {
        String m = q;
        if (q == null) {
            final dst e = this.a.e;
            if (e != null) {
                q = e.q();
            }
            else {
                q = "unknown component";
            }
            final StringBuilder sb = new StringBuilder("Setting a null key from ");
            sb.append(q);
            sb.append(" which is usually a mistake! If it is not, explicitly set the String 'null'");
            coz.d(2, "Component:NullKeySet", sb.toString());
            m = "null";
        }
        final dst b = this.b;
        b.n = true;
        b.m = m;
    }
    
    public final void x(final egx s) {
        final dso dso = (dso)this.b.I().D();
        dso.a |= 0x1000;
        dso.s = s;
    }
    
    public final void y(final String d) {
        final dsq i = this.b.I();
        i.a |= 0x2;
        i.d = d;
    }
    
    public final void z(final dxe i) {
        if (i != null) {
            final dsp d = this.b.I().d();
            d.a |= 0x20000;
            d.i = i;
            return;
        }
        throw new IllegalArgumentException("TransitionKeyType must not be null");
    }
}
