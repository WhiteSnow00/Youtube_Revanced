import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afhj implements Serializable
{
    private static final long serialVersionUID = 0L;
    final Object[] a;
    
    public afhj(final Object[] a) {
        this.a = a;
    }
    
    Object readResolve() {
        return afhk.q(this.a);
    }
}
