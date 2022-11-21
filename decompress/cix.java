import android.view.View;
import android.view.ViewGroup;
import android.animation.TimeInterpolator;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cix extends ciq
{
    int p;
    boolean q;
    private ArrayList r;
    private boolean s;
    private int t;
    
    public cix() {
        this.r = new ArrayList();
        this.s = true;
        this.q = false;
        this.t = 0;
    }
    
    public cix(final byte[] array) {
        this();
        this.J(1);
        this.f((ciq)new cik(2));
        this.f(new cih());
        this.f((ciq)new cik(1));
    }
    
    private final void N(final ciq ciq) {
        this.r.add(ciq);
        ciq.f = this;
    }
    
    @Override
    public final /* bridge */ void B(final long n) {
        this.I(n);
    }
    
    @Override
    public final /* bridge */ void C(final TimeInterpolator timeInterpolator) {
        this.M(timeInterpolator);
    }
    
    @Override
    public final void D(final long a) {
        super.a = a;
    }
    
    @Override
    public final void E() {
        this.t |= 0x2;
        for (int size = this.r.size(), i = 0; i < size; ++i) {
            ((ciq)this.r.get(i)).E();
        }
    }
    
    @Override
    public final void F(final ciy ciy) {
        super.l = null;
        this.t |= 0x8;
        for (int size = this.r.size(), i = 0; i < size; ++i) {
            ((ciq)this.r.get(i)).F(null);
        }
    }
    
    @Override
    public final void G(final chw chw) {
        super.G(chw);
        this.t |= 0x4;
        if (this.r != null) {
            for (int i = 0; i < this.r.size(); ++i) {
                ((ciq)this.r.get(i)).G(chw);
            }
        }
    }
    
    @Override
    public final void H(final ViewGroup viewGroup, final dev dev, final dev dev2, final ArrayList list, final ArrayList list2) {
        final long a = super.a;
        int n;
        for (int size = this.r.size(), i = 0; i < size; i = n + 1) {
            final ciq ciq = this.r.get(i);
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
                    final long a2 = ciq.a;
                    if (a2 > 0L) {
                        ciq.D(a2 + a);
                    }
                    else {
                        ciq.D(a);
                    }
                }
            }
            ciq.H(viewGroup, dev, dev2, list, list2);
        }
    }
    
    public final void I(final long b) {
        super.b = b;
        if (this.b >= 0L) {
            final ArrayList r = this.r;
            if (r != null) {
                for (int size = r.size(), i = 0; i < size; ++i) {
                    ((ciq)this.r.get(i)).B(b);
                }
            }
        }
    }
    
    public final void J(final int n) {
        this.s = (n == 0);
    }
    
    public final void K() {
        for (int i = 0; i < this.r.size(); ++i) {
            ((ciq)this.r.get(i)).x(2131429411);
        }
        super.x(2131429411);
    }
    
    public final void L(final View view) {
        for (int i = 0; i < this.r.size(); ++i) {
            ((ciq)this.r.get(i)).y(view);
        }
        super.y(view);
    }
    
    public final void M(final TimeInterpolator c) {
        this.t |= 0x1;
        final ArrayList r = this.r;
        if (r != null) {
            for (int size = r.size(), i = 0; i < size; ++i) {
                ((ciq)this.r.get(i)).C(c);
            }
        }
        super.c = c;
    }
    
    @Override
    public final void b(final cjc cjc) {
        if (this.v(cjc.b)) {
            final ArrayList r = this.r;
            for (int size = r.size(), i = 0; i < size; ++i) {
                final ciq ciq = (ciq)r.get(i);
                if (ciq.v(cjc.b)) {
                    ciq.b(cjc);
                    cjc.c.add(ciq);
                }
            }
        }
    }
    
    @Override
    public final void c(final cjc cjc) {
        if (this.v(cjc.b)) {
            final ArrayList r = this.r;
            for (int size = r.size(), i = 0; i < size; ++i) {
                final ciq ciq = (ciq)r.get(i);
                if (ciq.v(cjc.b)) {
                    ciq.c(cjc);
                    cjc.c.add(ciq);
                }
            }
        }
    }
    
    public final /* bridge */ Object clone() {
        return this.h();
    }
    
    public final void e(final cip cip) {
        super.w(cip);
    }
    
    public final void f(final ciq ciq) {
        this.N(ciq);
        final long b = this.b;
        if (b >= 0L) {
            ciq.B(b);
        }
        if ((this.t & 0x1) != 0x0) {
            ciq.C(super.c);
        }
        if ((this.t & 0x2) != 0x0) {
            ciq.E();
        }
        if ((this.t & 0x4) != 0x0) {
            ciq.G(super.m);
        }
        if ((this.t & 0x8) != 0x0) {
            ciq.F(null);
        }
    }
    
    @Override
    public final ciq h() {
        final cix cix = (cix)super.h();
        cix.r = new ArrayList();
        for (int size = this.r.size(), i = 0; i < size; ++i) {
            cix.N(((ciq)this.r.get(i)).h());
        }
        return cix;
    }
    
    @Override
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
    
    @Override
    public final void l(final cjc cjc) {
        for (int size = this.r.size(), i = 0; i < size; ++i) {
            ((ciq)this.r.get(i)).l(cjc);
        }
    }
    
    @Override
    public final void p(final ViewGroup viewGroup) {
        super.p(viewGroup);
        for (int size = this.r.size(), i = 0; i < size; ++i) {
            ((ciq)this.r.get(i)).p(viewGroup);
        }
    }
    
    @Override
    public final void q(final View view) {
        super.q(view);
        for (int size = this.r.size(), i = 0; i < size; ++i) {
            ((ciq)this.r.get(i)).q(view);
        }
    }
    
    @Override
    public final void r(final View view) {
        super.r(view);
        for (int size = this.r.size(), i = 0; i < size; ++i) {
            ((ciq)this.r.get(i)).r(view);
        }
    }
    
    @Override
    protected final void s() {
        if (!this.r.isEmpty()) {
            final ciw ciw = new ciw(this);
            final ArrayList r = this.r;
            final int size = r.size();
            final int n = 0;
            for (int i = 0; i < size; ++i) {
                ((ciq)r.get(i)).w((cip)ciw);
            }
            this.p = this.r.size();
            if (!this.s) {
                for (int j = 1; j < this.r.size(); ++j) {
                    ((ciq)this.r.get(j - 1)).w((cip)new civ((ciq)this.r.get(j)));
                }
                final ciq ciq = this.r.get(0);
                if (ciq != null) {
                    ciq.s();
                }
            }
            else {
                final ArrayList r2 = this.r;
                for (int size2 = r2.size(), k = n; k < size2; ++k) {
                    ((ciq)r2.get(k)).s();
                }
            }
            return;
        }
        this.t();
        this.o();
    }
    
    @Override
    public final /* bridge */ void x(final int n) {
        this.K();
    }
    
    @Override
    public final /* bridge */ void y(final View view) {
        this.L(view);
    }
}
