import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ozn
{
    public final agyr a;
    public final Object b;
    
    private ozn(final agyr a, final Object b) {
        final int a2 = a.a();
        boolean b2 = false;
        if (a2 >= 200000000) {
            b2 = b2;
            if (a.a() < 300000000) {
                b2 = true;
            }
        }
        agot.u(b2);
        this.a = a;
        this.b = b;
    }
    
    public static ozn a(final agyr agyr, final Object o) {
        return new ozn(agyr, o);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof ozn) {
            final ozn ozn = (ozn)o;
            if (this.a.equals(ozn.a) && this.b.equals(ozn.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b });
    }
}
