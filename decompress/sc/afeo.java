import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afeo implements Serializable
{
    private static final long serialVersionUID = 0L;
    final Object[] a;
    
    public afeo(final Object[] a) {
        this.a = a;
    }
    
    Object readResolve() {
        return afeq.p(this.a);
    }
}
