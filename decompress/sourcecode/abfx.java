import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public class abfx implements abnq, tec
{
    private final abfr a;
    private boolean b;
    private abim c;
    public final abft e;
    
    public abfx(final abft e, final abfr a) {
        e.getClass();
        this.e = e;
        a.getClass();
        this.a = a;
    }
    
    private final void a(final anen anen) {
        final abfr a = this.a;
        ((acib)a.a).t();
        if (anen != null) {
            final RecyclerView g = a.g;
            if (g != null) {
                g.aa(0);
            }
            a.b(anen);
        }
        this.e.o(0, false, 0);
        final abft e = this.e;
        byte[] i;
        if (anen != null) {
            i = anen.g.I();
        }
        else {
            i = null;
        }
        e.e = i;
    }
    
    protected int b(final abim abim) {
        if (abim == abim.i) {
            return 1;
        }
        if (abim == abim.j) {
            return 2;
        }
        return 0;
    }
    
    protected boolean c() {
        return !this.a.a.isEmpty() && this.b;
    }
    
    public final void d(final aakn aakn) {
        final boolean b = this.b;
        int b2;
        if (aakn.d() == abid.c) {
            b2 = 1;
        }
        else {
            b2 = 0;
        }
        this.b = (b2 != 0);
        if ((b ? 1 : 0) != b2) {
            this.k();
        }
    }
    
    public final void f(final aalo aalo) {
        if (aalo.a() != null) {
            final aneh i = aalo.a().i;
            if (i != null) {
                anee anee;
                if ((anee = i.h) == null) {
                    anee = anee.a;
                }
                if ((anee.b & 0x1) != 0x0) {
                    anee anee2;
                    if ((anee2 = i.h) == null) {
                        anee2 = anee.a;
                    }
                    anen anen;
                    if ((anen = anee2.c) == null) {
                        anen = anen.a;
                    }
                    this.a(anen);
                }
                else {
                    this.i();
                }
            }
        }
        this.k();
    }
    
    public final void g(final aaly aaly) {
        if (this.c != aaly.c()) {
            this.c = aaly.c();
            this.k();
        }
    }
    
    protected final void i() {
        this.a(null);
    }
    
    public final void k() {
        final abft e = this.e;
        int b;
        if (this.c()) {
            b = this.b(this.c);
        }
        else {
            b = 0;
        }
        e.m(b);
    }
    
    public final asic[] lX(final abns abns) {
        final asic am = ((asgt)abns.q().a).j(aajj.t(abns.bN(), 134217728L)).j(aajj.r(1)).am((asix)new abbr(this, 19), (asix)abdi.e);
        asic asic;
        if (((uyi)abns.cd().h).bx()) {
            asic = abns.R().am((asix)new abbr(this, 20), (asix)abdi.e);
        }
        else {
            asic = abns.Q().j(aajj.t(abns.bN(), 134217728L)).j(aajj.r(1)).am((asix)new abbr(this, 20), (asix)abdi.e);
        }
        asic asic2;
        if (((uyi)abns.cd().h).bw()) {
            asic2 = ((asgt)abns.f().f).am((asix)new abfy(this, 1), (asix)abdi.e);
        }
        else {
            asic2 = abns.f().b().j(aajj.t(abns.bN(), 134217728L)).j(aajj.r(0)).am((asix)new abfy(this, 1), (asix)abdi.e);
        }
        return new asic[] { am, asic, asic2 };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        final StringBuilder sb = new StringBuilder("unsupported op code: ");
                        sb.append(n);
                        throw new IllegalStateException(sb.toString());
                    }
                    this.g((aaly)o);
                }
                else {
                    this.f((aalo)o);
                }
            }
            else {
                this.d((aakn)o);
            }
        }
        else {
            array = new Class[] { aakn.class, aalo.class, aaly.class };
        }
        return array;
    }
}
