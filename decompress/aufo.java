// 
// Decompiled by Procyon v0.6.0
// 

public final class aufo extends aufp
{
    private static final long serialVersionUID = -9937958251642L;
    public final transient aufx a;
    private final byte z;
    
    public aufo(final String s, final byte z, final aufx a) {
        super(s);
        this.z = z;
        this.a = a;
    }
    
    private Object readResolve() {
        switch (this.z) {
            default: {
                return aufp.x;
            }
            case 22: {
                return aufp.w;
            }
            case 21: {
                return aufp.v;
            }
            case 20: {
                return aufp.u;
            }
            case 19: {
                return aufp.t;
            }
            case 18: {
                return aufp.s;
            }
            case 17: {
                return aufp.r;
            }
            case 16: {
                return aufp.q;
            }
            case 15: {
                return aufp.p;
            }
            case 14: {
                return aufp.o;
            }
            case 13: {
                return aufp.n;
            }
            case 12: {
                return aufp.m;
            }
            case 11: {
                return aufp.l;
            }
            case 10: {
                return aufp.k;
            }
            case 9: {
                return aufp.j;
            }
            case 8: {
                return aufp.i;
            }
            case 7: {
                return aufp.h;
            }
            case 6: {
                return aufp.g;
            }
            case 5: {
                return aufp.f;
            }
            case 4: {
                return aufp.e;
            }
            case 3: {
                return aufp.d;
            }
            case 2: {
                return aufp.c;
            }
            case 1: {
                return aufp.b;
            }
        }
    }
    
    public final aufn a(aufl d) {
        d = aufq.d(d);
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
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof aufo && this.z == ((aufo)o).z);
    }
    
    public final int hashCode() {
        return 1 << this.z;
    }
}
