import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public class abhs implements abps, tgg
{
    private final abhm a;
    private boolean b;
    private abke c;
    public final abho e;
    
    public abhs(final abho e, final abhm a) {
        e.getClass();
        this.e = e;
        a.getClass();
        this.a = a;
    }
    
    private final void a(final angr angr) {
        final abhm a = this.a;
        ((acke)a.a).t();
        if (angr != null) {
            final RecyclerView g = a.g;
            if (g != null) {
                g.aa(0);
            }
            a.b(angr);
        }
        this.e.o(0, false, 0);
        final abho e = this.e;
        byte[] i;
        if (angr != null) {
            i = angr.g.I();
        }
        else {
            i = null;
        }
        e.e = i;
    }
    
    protected int b(final abke abke) {
        if (abke == abke.i) {
            return 1;
        }
        if (abke == abke.j) {
            return 2;
        }
        return 0;
    }
    
    protected boolean c() {
        return !this.a.a.isEmpty() && this.b;
    }
    
    public final void d(final aamh aamh) {
        final boolean b = this.b;
        int b2;
        if (aamh.d() == abjv.c) {
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
    
    public final void f(final aani aani) {
        if (aani.a() != null) {
            final angl i = aani.a().i;
            if (i != null) {
                angi angi;
                if ((angi = i.h) == null) {
                    angi = angi.a;
                }
                if ((angi.b & 0x1) != 0x0) {
                    angi angi2;
                    if ((angi2 = i.h) == null) {
                        angi2 = angi.a;
                    }
                    angr angr;
                    if ((angr = angi2.c) == null) {
                        angr = angr.a;
                    }
                    this.a(angr);
                }
                else {
                    this.i();
                }
            }
        }
        this.k();
    }
    
    public final void g(final aans aans) {
        if (this.c != aans.c()) {
            this.c = aans.c();
            this.k();
        }
    }
    
    protected final void i() {
        this.a(null);
    }
    
    public final void k() {
        final abho e = this.e;
        int b;
        if (this.c()) {
            b = this.b(this.c);
        }
        else {
            b = 0;
        }
        e.m(b);
    }
    
    public final asir[] lX(final abpu abpu) {
        final asir an = ((ashi)abpu.p().a).j(aale.s(abpu.bM(), 134217728L)).j(aale.q(1)).an((asjm)new abgh(this, 3), (asjm)abfd.e);
        asir asir;
        if (((vai)abpu.ci().g).bx()) {
            asir = abpu.Q().an((asjm)new abgh(this, 4), (asjm)abfd.e);
        }
        else {
            asir = abpu.P().j(aale.s(abpu.bM(), 134217728L)).j(aale.q(1)).an((asjm)new abgh(this, 4), (asjm)abfd.e);
        }
        asir asir2;
        if (((vai)abpu.ci().g).bw()) {
            asir2 = ((ashi)abpu.cc().a).an((asjm)new abgh(this, 5), (asjm)abfd.e);
        }
        else {
            asir2 = abpu.cc().c().j(aale.s(abpu.bM(), 134217728L)).j(aale.q(0)).an((asjm)new abgh(this, 5), (asjm)abfd.e);
        }
        return new asir[] { an, asir, asir2 };
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
                    this.g((aans)o);
                }
                else {
                    this.f((aani)o);
                }
            }
            else {
                this.d((aamh)o);
            }
        }
        else {
            array = new Class[] { aamh.class, aani.class, aans.class };
        }
        return array;
    }
}
