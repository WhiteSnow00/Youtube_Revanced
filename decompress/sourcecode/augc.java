import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class augc extends aueu implements Serializable
{
    private static final long serialVersionUID = -7310865996721419676L;
    
    protected augc() {
    }
    
    public aufe A() {
        return auho.j(aufg.b);
    }
    
    public aufe B() {
        return auho.j(aufg.g);
    }
    
    public aufe C() {
        return auho.j(aufg.a);
    }
    
    public aufe D() {
        return auho.j(aufg.h);
    }
    
    public aufe E() {
        return auho.j(aufg.i);
    }
    
    public aufe F() {
        return auho.j(aufg.l);
    }
    
    public aufe G() {
        return auho.j(aufg.j);
    }
    
    public aufe H() {
        return auho.j(aufg.e);
    }
    
    public aufe I() {
        return auho.j(aufg.k);
    }
    
    public aufe J() {
        return auho.j(aufg.f);
    }
    
    public aufe K() {
        return auho.j(aufg.c);
    }
    
    public aufe L() {
        return auho.j(aufg.d);
    }
    
    public final int[] M(final aufq aufq, final long n) {
        final int c = aufq.c();
        final int[] array = new int[c];
        long n2 = 0L;
        if (n != 0L) {
            long b;
            for (int i = 0; i < c; ++i, n2 = b) {
                final aufe a = aufq.d(i).a((aueu)this);
                b = n2;
                if (a.g()) {
                    final int a2 = a.a(n, n2);
                    b = a.b(n2, a2);
                    array[i] = a2;
                }
            }
        }
        return array;
    }
    
    public auew c() {
        return auhn.v(auey.d, this.A());
    }
    
    public auew d() {
        return auhn.v(auey.q, this.E());
    }
    
    public auew e() {
        return auhn.v(auey.p, this.E());
    }
    
    public auew f() {
        return auhn.v(auey.i, this.B());
    }
    
    public auew g() {
        return auhn.v(auey.m, this.B());
    }
    
    public auew h() {
        return auhn.v(auey.g, this.B());
    }
    
    public auew i() {
        return auhn.v(auey.b, this.C());
    }
    
    public auew j() {
        return auhn.v(auey.n, this.D());
    }
    
    public auew k() {
        return auhn.v(auey.r, this.E());
    }
    
    public auew l() {
        return auhn.v(auey.o, this.E());
    }
    
    public auew m() {
        return auhn.v(auey.w, this.F());
    }
    
    public auew n() {
        return auhn.v(auey.x, this.F());
    }
    
    public auew o() {
        return auhn.v(auey.s, this.G());
    }
    
    public auew p() {
        return auhn.v(auey.t, this.G());
    }
    
    public auew q() {
        return auhn.v(auey.h, this.H());
    }
    
    public auew r() {
        return auhn.v(auey.u, this.I());
    }
    
    public auew s() {
        return auhn.v(auey.v, this.I());
    }
    
    public auew t() {
        return auhn.v(auey.l, this.J());
    }
    
    public auew u() {
        return auhn.v(auey.k, this.K());
    }
    
    public auew v() {
        return auhn.v(auey.j, this.K());
    }
    
    public auew w() {
        return auhn.v(auey.f, this.L());
    }
    
    public auew x() {
        return auhn.v(auey.e, this.L());
    }
    
    public auew y() {
        return auhn.v(auey.c, this.L());
    }
}
