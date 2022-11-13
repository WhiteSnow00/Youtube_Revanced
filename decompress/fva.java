import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public class fva
{
    public final amhi a;
    
    public fva(final amhi a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof fva && ((ahbh)this.a).equals((Object)((fva)o).a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
}
