import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class azu
{
    public static final azu a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    
    static {
        a = new azu(-1, -1, -1);
    }
    
    public azu(int m, final int c, final int d) {
        this.b = m;
        this.c = c;
        this.d = d;
        if (baz.ae(d)) {
            m = baz.m(d, c);
        }
        else {
            m = -1;
        }
        this.e = m;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof azu)) {
            return false;
        }
        final azu azu = (azu)o;
        return this.b == azu.b && this.c == azu.c && this.d == azu.d;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.c, this.d });
    }
    
    @Override
    public final String toString() {
        final int b = this.b;
        final int c = this.c;
        final int d = this.d;
        final StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(b);
        sb.append(", channelCount=");
        sb.append(c);
        sb.append(", encoding=");
        sb.append(d);
        sb.append("]");
        return sb.toString();
    }
}
