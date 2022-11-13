import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class affs implements Serializable
{
    private static final long serialVersionUID = 0L;
    final Object[] a;
    
    public affs(final Object[] a) {
        this.a = a;
    }
    
    Object readResolve() {
        return afft.q(this.a);
    }
}
