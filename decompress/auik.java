// 
// Decompiled by Procyon v0.6.0
// 

public final class auik extends auil
{
    private static final long serialVersionUID = -9937958251642L;
    public final transient auit a;
    private final byte z;
    
    public auik(final String s, final byte z, final auit a) {
        super(s);
        this.z = z;
        this.a = a;
    }
    
    private Object readResolve() {
        switch (this.z) {
            default: {
                return auil.x;
            }
            case 22: {
                return auil.w;
            }
            case 21: {
                return auil.v;
            }
            case 20: {
                return auil.u;
            }
            case 19: {
                return auil.t;
            }
            case 18: {
                return auil.s;
            }
            case 17: {
                return auil.r;
            }
            case 16: {
                return auil.q;
            }
            case 15: {
                return auil.p;
            }
            case 14: {
                return auil.o;
            }
            case 13: {
                return auil.n;
            }
            case 12: {
                return auil.m;
            }
            case 11: {
                return auil.l;
            }
            case 10: {
                return auil.k;
            }
            case 9: {
                return auil.j;
            }
            case 8: {
                return auil.i;
            }
            case 7: {
                return auil.h;
            }
            case 6: {
                return auil.g;
            }
            case 5: {
                return auil.f;
            }
            case 4: {
                return auil.e;
            }
            case 3: {
                return auil.d;
            }
            case 2: {
                return auil.c;
            }
            case 1: {
                return auil.b;
            }
        }
    }
    
    @Override
    public final auij a(auih d) {
        d = auim.d(d);
        switch (this.z) {
            default: {
                return d.n();
            }
            case 22: {
                return d.m();
            }
            case 21: {
                return d.s();
            }
            case 20: {
                return d.r();
            }
            case 19: {
                return d.p();
            }
            case 18: {
                return d.o();
            }
            case 17: {
                return d.k();
            }
            case 16: {
                return d.d();
            }
            case 15: {
                return d.e();
            }
            case 14: {
                return d.l();
            }
            case 13: {
                return d.j();
            }
            case 12: {
                return d.g();
            }
            case 11: {
                return d.t();
            }
            case 10: {
                return d.u();
            }
            case 9: {
                return d.v();
            }
            case 8: {
                return d.f();
            }
            case 7: {
                return d.q();
            }
            case 6: {
                return d.h();
            }
            case 5: {
                return d.w();
            }
            case 4: {
                return d.x();
            }
            case 3: {
                return d.c();
            }
            case 2: {
                return d.y();
            }
            case 1: {
                return d.i();
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof auik && this.z == ((auik)o).z);
    }
    
    @Override
    public final int hashCode() {
        return 1 << this.z;
    }
}
