// 
// Decompiled by Procyon v0.6.0
// 

public final class adfu
{
    public static final adfu a;
    public final float b;
    public final int c;
    
    static {
        a = a(0.0f, 0);
    }
    
    public adfu() {
    }
    
    public adfu(final float b, final int c) {
        this.b = b;
        this.c = c;
    }
    
    public static adfu a(final float n, final int n2) {
        return new adfu(n, n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adfu) {
            final adfu adfu = (adfu)o;
            if (Float.floatToIntBits(this.b) == Float.floatToIntBits(adfu.b) && this.c == adfu.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (Float.floatToIntBits(this.b) ^ 0xF4243) * 1000003 ^ this.c;
    }
    
    @Override
    public final String toString() {
        final float b = this.b;
        final int c = this.c;
        final StringBuilder sb = new StringBuilder("PollingTime{pollingWeight=");
        sb.append(b);
        sb.append(", pollingTimeMs=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
