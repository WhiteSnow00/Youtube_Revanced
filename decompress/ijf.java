import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ijf implements ijj
{
    private final atke a;
    private final int b;
    
    public ijf(final atke a) {
        this.a = a;
        this.b = 2;
    }
    
    public final asht b() {
        return ((ashi)this.a.a()).ai();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof ijf) {
            final int b = ((ijf)o).b;
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { 2 });
    }
}
