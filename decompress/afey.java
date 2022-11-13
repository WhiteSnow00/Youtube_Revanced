import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afey implements Serializable
{
    private static final long serialVersionUID = 0L;
    final afev a;
    
    public afey(final afev a) {
        this.a = a;
    }
    
    Object readResolve() {
        return this.a.s();
    }
}
