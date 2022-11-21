import java.util.Comparator;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afhp implements Serializable
{
    private static final long serialVersionUID = 0L;
    final Comparator a;
    final Object[] b;
    
    public afhp(final Comparator a, final Object[] b) {
        this.a = a;
        this.b = b;
    }
    
    Object readResolve() {
        final afho afho = new afho(this.a);
        afho.n(this.b);
        return afho.m();
    }
}
