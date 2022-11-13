import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afew implements Serializable
{
    private static final long serialVersionUID = 0L;
    final afev a;
    
    public afew(final afev a) {
        this.a = a;
    }
    
    Object readResolve() {
        return this.a.r();
    }
}
