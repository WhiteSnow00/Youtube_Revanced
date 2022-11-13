import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class augt extends aufl implements Serializable
{
    private static final long serialVersionUID = -7310865996721419676L;
    
    protected augt() {
    }
    
    public aufv A() {
        return auif.j(aufx.b);
    }
    
    public aufv B() {
        return auif.j(aufx.g);
    }
    
    public aufv C() {
        return auif.j(aufx.a);
    }
    
    public aufv D() {
        return auif.j(aufx.h);
    }
    
    public aufv E() {
        return auif.j(aufx.i);
    }
    
    public aufv F() {
        return auif.j(aufx.l);
    }
    
    public aufv G() {
        return auif.j(aufx.j);
    }
    
    public aufv H() {
        return auif.j(aufx.e);
    }
    
    public aufv I() {
        return auif.j(aufx.k);
    }
    
    public aufv J() {
        return auif.j(aufx.f);
    }
    
    public aufv K() {
        return auif.j(aufx.c);
    }
    
    public aufv L() {
        return auif.j(aufx.d);
    }
    
    public final int[] M(final augh augh, final long n) {
        final int c = augh.c();
        final int[] array = new int[c];
        long n2 = 0L;
        if (n != 0L) {
            long b;
            for (int i = 0; i < c; ++i, n2 = b) {
                final aufv a = augh.d(i).a((aufl)this);
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
    
    public aufn c() {
        return auie.v(aufp.d, this.A());
    }
    
    public aufn d() {
        return auie.v(aufp.q, this.E());
    }
    
    public aufn e() {
        return auie.v(aufp.p, this.E());
    }
    
    public aufn f() {
        return auie.v(aufp.i, this.B());
    }
    
    public aufn g() {
        return auie.v(aufp.m, this.B());
    }
    
    public aufn h() {
        return auie.v(aufp.g, this.B());
    }
    
    public aufn i() {
        return auie.v(aufp.b, this.C());
    }
    
    public aufn j() {
        return auie.v(aufp.n, this.D());
    }
    
    public aufn k() {
        return auie.v(aufp.r, this.E());
    }
    
    public aufn l() {
        return auie.v(aufp.o, this.E());
    }
    
    public aufn m() {
        return auie.v(aufp.w, this.F());
    }
    
    public aufn n() {
        return auie.v(aufp.x, this.F());
    }
    
    public aufn o() {
        return auie.v(aufp.s, this.G());
    }
    
    public aufn p() {
        return auie.v(aufp.t, this.G());
    }
    
    public aufn q() {
        return auie.v(aufp.h, this.H());
    }
    
    public aufn r() {
        return auie.v(aufp.u, this.I());
    }
    
    public aufn s() {
        return auie.v(aufp.v, this.I());
    }
    
    public aufn t() {
        return auie.v(aufp.l, this.J());
    }
    
    public aufn u() {
        return auie.v(aufp.k, this.K());
    }
    
    public aufn v() {
        return auie.v(aufp.j, this.K());
    }
    
    public aufn w() {
        return auie.v(aufp.f, this.L());
    }
    
    public aufn x() {
        return auie.v(aufp.e, this.L());
    }
    
    public aufn y() {
        return auie.v(aufp.c, this.L());
    }
}
