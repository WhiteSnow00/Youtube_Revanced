import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ijg implements ijj
{
    private final fmj a;
    
    public ijg(final fmj a) {
        this.a = a;
    }
    
    public final asht b() {
        return ((ashi)this.a.b).R().ai();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ijg;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
}
