// 
// Decompiled by Procyon v0.6.0
// 

final class auis extends auit
{
    private static final long serialVersionUID = 31156755687123L;
    private final byte n;
    
    public auis(final String s, final byte n) {
        super(s);
        this.n = n;
    }
    
    private Object readResolve() {
        switch (this.n) {
            default: {
                return auis.l;
            }
            case 11: {
                return auis.k;
            }
            case 10: {
                return auis.j;
            }
            case 9: {
                return auis.i;
            }
            case 8: {
                return auis.h;
            }
            case 7: {
                return auis.g;
            }
            case 6: {
                return auis.f;
            }
            case 5: {
                return auis.e;
            }
            case 4: {
                return auis.d;
            }
            case 3: {
                return auis.c;
            }
            case 2: {
                return auis.b;
            }
            case 1: {
                return auis.a;
            }
        }
    }
    
    @Override
    public final auir a(auih d) {
        d = auim.d(d);
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
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof auis && this.n == ((auis)o).n);
    }
    
    @Override
    public final int hashCode() {
        return 1 << this.n;
    }
}
