import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aryx
{
    public String a;
    public arrg b;
    public String c;
    public arsr d;
    
    public aryx() {
        this.a = "unknown-authority";
        this.b = arrg.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof aryx)) {
            return false;
        }
        final aryx aryx = (aryx)o;
        return this.a.equals(aryx.a) && this.b.equals((Object)aryx.b) && aeda.v((Object)this.c, (Object)aryx.c) && aeda.v((Object)this.d, (Object)aryx.d);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d });
    }
}
