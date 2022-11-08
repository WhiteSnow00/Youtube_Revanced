import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqq
{
    public aibb a;
    
    public kqq(final aibb a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof kqq && aeda.v(((kqq)o).a, this.a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
}
