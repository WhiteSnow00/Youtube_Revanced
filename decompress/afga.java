import java.util.EnumMap;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afga implements Serializable
{
    private static final long serialVersionUID = 0L;
    final EnumMap a;
    
    public afga(final EnumMap a) {
        this.a = a;
    }
    
    Object readResolve() {
        return new afgb(this.a);
    }
}
