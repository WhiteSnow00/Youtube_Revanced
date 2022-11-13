// 
// Decompiled by Procyon v0.6.0
// 

final class aufw extends aufx
{
    private static final long serialVersionUID = 31156755687123L;
    private final byte n;
    
    public aufw(final String s, final byte n) {
        super(s);
        this.n = n;
    }
    
    private Object readResolve() {
        switch (this.n) {
            default: {
                return aufw.l;
            }
            case 11: {
                return aufw.k;
            }
            case 10: {
                return aufw.j;
            }
            case 9: {
                return aufw.i;
            }
            case 8: {
                return aufw.h;
            }
            case 7: {
                return aufw.g;
            }
            case 6: {
                return aufw.f;
            }
            case 5: {
                return aufw.e;
            }
            case 4: {
                return aufw.d;
            }
            case 3: {
                return aufw.c;
            }
            case 2: {
                return aufw.b;
            }
            case 1: {
                return aufw.a;
            }
        }
    }
    
    public final aufv a(aufl d) {
        d = aufq.d(d);
        switch (this.n) {
            default: {
                return d.F();
            }
            case 11: {
                return d.I();
            }
            case 10: {
                return d.G();
            }
            case 9: {
                return d.E();
            }
            case 8: {
                return d.D();
            }
            case 7: {
                return d.B();
            }
            case 6: {
                return d.J();
            }
            case 5: {
                return d.H();
            }
            case 4: {
                return d.L();
            }
            case 3: {
                return d.K();
            }
            case 2: {
                return d.A();
            }
            case 1: {
                return d.C();
            }
        }
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof aufw && this.n == ((aufw)o).n);
    }
    
    public final int hashCode() {
        return 1 << this.n;
    }
}
