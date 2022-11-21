import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afhd implements Serializable
{
    final afhe a;
    
    public afhd(final afhe a) {
        this.a = a;
    }
    
    Object readResolve() {
        return this.a.p();
    }
}
