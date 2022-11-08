import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public class fur
{
    public final amfe a;
    
    public fur(final amfe a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof fur && ((agzi)this.a).equals(((fur)o).a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
}
