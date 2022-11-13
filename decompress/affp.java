import java.util.List;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class affp implements Serializable
{
    private final afeq a;
    
    public affp(final afeq a) {
        this.a = a;
    }
    
    Object readResolve() {
        if (this.a.isEmpty()) {
            return affq.a;
        }
        if (agpi.V((List)this.a, (Object)afeq.r((Object)afid.a))) {
            return affq.b;
        }
        return new affq(this.a);
    }
}
