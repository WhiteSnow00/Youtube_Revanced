import java.util.List;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afhg implements Serializable
{
    private final afgh a;
    
    public afhg(final afgh a) {
        this.a = a;
    }
    
    Object readResolve() {
        if (this.a.isEmpty()) {
            return afhh.a;
        }
        if (agpx.T(this.a, afgh.r(afjt.a))) {
            return afhh.b;
        }
        return new afhh(this.a);
    }
}
