// 
// Decompiled by Procyon v0.6.0
// 

final class auff extends aufg
{
    private static final long serialVersionUID = 31156755687123L;
    private final byte n;
    
    public auff(final String s, final byte b) {
        super(s);
        this.n = b;
    }
    
    private Object readResolve() {
        switch (this.n) {
            default: {
                return auff.l;
            }
            case 11: {
                return auff.k;
            }
            case 10: {
                return auff.j;
            }
            case 9: {
                return auff.i;
            }
            case 8: {
                return auff.h;
            }
            case 7: {
                return auff.g;
            }
            case 6: {
                return auff.f;
            }
            case 5: {
                return auff.e;
            }
            case 4: {
                return auff.d;
            }
            case 3: {
                return auff.c;
            }
            case 2: {
                return auff.b;
            }
            case 1: {
                return auff.a;
            }
        }
    }
    
    public final aufe a(aueu d) {
        d = auez.d(d);
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
        return this == o || (o instanceof auff && this.n == ((auff)o).n);
    }
    
    public final int hashCode() {
        return 1 << this.n;
    }
}
