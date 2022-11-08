// 
// Decompiled by Procyon v0.6.0
// 

public final class auex extends auey
{
    private static final long serialVersionUID = -9937958251642L;
    public final transient aufg a;
    private final byte z;
    
    public auex(final String s, final byte b, final aufg a) {
        super(s);
        this.z = b;
        this.a = a;
    }
    
    private Object readResolve() {
        switch (this.z) {
            default: {
                return auey.x;
            }
            case 22: {
                return auey.w;
            }
            case 21: {
                return auey.v;
            }
            case 20: {
                return auey.u;
            }
            case 19: {
                return auey.t;
            }
            case 18: {
                return auey.s;
            }
            case 17: {
                return auey.r;
            }
            case 16: {
                return auey.q;
            }
            case 15: {
                return auey.p;
            }
            case 14: {
                return auey.o;
            }
            case 13: {
                return auey.n;
            }
            case 12: {
                return auey.m;
            }
            case 11: {
                return auey.l;
            }
            case 10: {
                return auey.k;
            }
            case 9: {
                return auey.j;
            }
            case 8: {
                return auey.i;
            }
            case 7: {
                return auey.h;
            }
            case 6: {
                return auey.g;
            }
            case 5: {
                return auey.f;
            }
            case 4: {
                return auey.e;
            }
            case 3: {
                return auey.d;
            }
            case 2: {
                return auey.c;
            }
            case 1: {
                return auey.b;
            }
        }
    }
    
    public final auew a(aueu d) {
        d = auez.d(d);
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
        return this == o || (o instanceof auex && this.z == ((auex)o).z);
    }
    
    public final int hashCode() {
        return 1 << this.z;
    }
}
