import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afgf implements Serializable
{
    private static final long serialVersionUID = 0L;
    final Object[] a;
    
    public afgf(final Object[] a) {
        this.a = a;
    }
    
    Object readResolve() {
        return afgh.p(this.a);
    }
}
