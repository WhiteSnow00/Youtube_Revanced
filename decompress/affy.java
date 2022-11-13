import java.util.Comparator;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class affy implements Serializable
{
    private static final long serialVersionUID = 0L;
    final Comparator a;
    final Object[] b;
    
    public affy(final Comparator a, final Object[] b) {
        this.a = a;
        this.b = b;
    }
    
    Object readResolve() {
        final affx affx = new affx(this.a);
        affx.n(this.b);
        return affx.m();
    }
}
