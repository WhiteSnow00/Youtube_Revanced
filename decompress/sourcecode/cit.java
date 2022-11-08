import android.view.View;
import android.view.ViewGroup;
import android.animation.TimeInterpolator;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cit extends cim
{
    int p;
    boolean q;
    private ArrayList r;
    private boolean s;
    private int t;
    
    public cit() {
        this.r = new ArrayList();
        this.s = true;
        this.q = false;
        this.t = 0;
    }
    
    public cit(final byte[] array) {
        this();
        this.J(1);
        this.f((cim)new cig(2));
        this.f(new cid());
        this.f((cim)new cig(1));
    }
    
    private final void N(final cim cim) {
        this.r.add(cim);
        cim.f = this;
    }
    
    public final void E() {
        this.t |= 0x2;
        for (int size = this.r.size(), i = 0; i < size; ++i) {
            ((cim)this.r.get(i)).E();
        }
    }
    
    public final void F(final cii cii) {
        super.l = null;
        this.t |= 0x8;
        for (int size = this.r.size(), i = 0; i < size; ++i) {
            ((cim)this.r.get(i)).F((cii)null);
        }
    }
    
    public final void G(final chs chs) {
        super.G(chs);
        this.t |= 0x4;
        if (this.r != null) {
            for (int i = 0; i < this.r.size(); ++i) {
                ((cim)this.r.get(i)).G(chs);
            }
        }
    }
    
    public final void H(final ViewGroup viewGroup, final der der, final der der2, final ArrayList list, final ArrayList list2) {
        final long a = super.a;
        int n;
        for (int size = this.r.size(), i = 0; i < size; i = n + 1) {
            final cim cim = this.r.get(i);
            n = i;
            Label_0107: {
                if (a > 0L) {
                    n = i;
                    if (!this.s) {
                        if ((n = i) != 0) {
                            break Label_0107;
                        }
                        n = 0;
                    }
                    final long a2 = cim.a;
                    if (a2 > 0L) {
                        cim.D(a2 + a);
                    }
                    else {
                        cim.D(a);
                    }
                }
            }
            cim.H(viewGroup, der, der2, list, list2);
        }
    }
    
    public final void I(final long b) {
        super.b = b;
        if (this.b >= 0L) {
            final ArrayList r = this.r;
            if (r != null) {
                for (int size = r.size(), i = 0; i < size; ++i) {
                    ((cim)this.r.get(i)).B(b);
                }
            }
        }
    }
    
    public final void J(final int n) {
        this.s = (n == 0);
    }
    
    public final void K() {
        for (int i = 0; i < this.r.size(); ++i) {
            ((cim)this.r.get(i)).x(2131429411);
        }
        super.x(2131429411);
    }
    
    public final void L(final View view) {
        for (int i = 0; i < this.r.size(); ++i) {
            ((cim)this.r.get(i)).y(view);
        }
        super.y(view);
    }
    
    public final void M(final TimeInterpolator c) {
        this.t |= 0x1;
        final ArrayList r = this.r;
        if (r != null) {
            for (int size = r.size(), i = 0; i < size; ++i) {
                ((cim)this.r.get(i)).C(c);
            }
        }
        super.c = c;
    }
    
    public final void b(final ciy ciy) {
        if (this.v(ciy.b)) {
            final ArrayList r = this.r;
            for (int size = r.size(), i = 0; i < size; ++i) {
                final cim cim = (cim)r.get(i);
                if (cim.v(ciy.b)) {
                    cim.b(ciy);
                    ciy.c.add(cim);
                }
            }
        }
    }
    
    public final void c(final ciy ciy) {
        if (this.v(ciy.b)) {
            final ArrayList r = this.r;
            for (int size = r.size(), i = 0; i < size; ++i) {
                final cim cim = (cim)r.get(i);
                if (cim.v(ciy.b)) {
                    cim.c(ciy);
                    ciy.c.add(cim);
                }
            }
        }
    }
    
    public final void e(final cil cil) {
        super.w(cil);
    }
    
    public final void f(final cim cim) {
        this.N(cim);
        final long b = this.b;
        if (b >= 0L) {
            cim.B(b);
        }
        if ((this.t & 0x1) != 0x0) {
            cim.C(super.c);
        }
        if ((this.t & 0x2) != 0x0) {
            cim.E();
        }
        if ((this.t & 0x4) != 0x0) {
            cim.G(super.m);
        }
        if ((this.t & 0x8) != 0x0) {
            cim.F((cii)null);
        }
    }
    
    public final cim h() {
        final cit cit = (cit)super.h();
        cit.r = new ArrayList();
        for (int size = this.r.size(), i = 0; i < size; ++i) {
            cit.N(((cim)this.r.get(i)).h());
        }
        return cit;
    }
    
    public final String k(final String s) {
        String s2 = super.k(s);
        for (int i = 0; i < this.r.size(); ++i) {
            final StringBuilder sb = new StringBuilder();
            sb.append(s2);
            sb.append("\n");
            sb.append(this.r.get(i).k(s.concat("  ")));
            s2 = sb.toString();
        }
        return s2;
    }
    
    public final void l(final ciy ciy) {
        for (int size = this.r.size(), i = 0; i < size; ++i) {
            ((cim)this.r.get(i)).l(ciy);
        }
    }
    
    public final void p(final ViewGroup viewGroup) {
        super.p(viewGroup);
        for (int size = this.r.size(), i = 0; i < size; ++i) {
            ((cim)this.r.get(i)).p(viewGroup);
        }
    }
    
    public final void q(final View view) {
        super.q(view);
        for (int size = this.r.size(), i = 0; i < size; ++i) {
            ((cim)this.r.get(i)).q(view);
        }
    }
    
    public final void r(final View view) {
        super.r(view);
        for (int size = this.r.size(), i = 0; i < size; ++i) {
            ((cim)this.r.get(i)).r(view);
        }
    }
    
    protected final void s() {
        if (!this.r.isEmpty()) {
            final cis cis = new cis(this);
            final ArrayList r = this.r;
            final int size = r.size();
            final int n = 0;
            for (int i = 0; i < size; ++i) {
                ((cim)r.get(i)).w((cil)cis);
            }
            this.p = this.r.size();
            if (!this.s) {
                for (int j = 1; j < this.r.size(); ++j) {
                    ((cim)this.r.get(j - 1)).w((cil)new cir((cim)this.r.get(j)));
                }
                final cim cim = this.r.get(0);
                if (cim != null) {
                    cim.s();
                }
            }
            else {
                final ArrayList r2 = this.r;
                for (int size2 = r2.size(), k = n; k < size2; ++k) {
                    ((cim)r2.get(k)).s();
                }
            }
            return;
        }
        this.t();
        this.o();
    }
}
