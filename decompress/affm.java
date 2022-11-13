import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class affm implements Serializable
{
    final affn a;
    
    public affm(final affn a) {
        this.a = a;
    }
    
    Object readResolve() {
        return this.a.p();
    }
}
