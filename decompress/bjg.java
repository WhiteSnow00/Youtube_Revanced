import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bjg
{
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    
    public bjg(final String a, final String b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof bjg)) {
            return false;
        }
        final bjg bjg = (bjg)o;
        return this.c == bjg.c && this.d == bjg.d && adkp.ae(this.a, bjg.a) && adkp.ae(this.b, bjg.b);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d });
    }
}
