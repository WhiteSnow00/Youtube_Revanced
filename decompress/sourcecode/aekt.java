import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aekt
{
    public final long a;
    public final TimeUnit b;
    
    public aekt() {
    }
    
    public aekt(final long a, final TimeUnit b) {
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null timeUnit");
    }
    
    public static aekt a(final long n, final TimeUnit timeUnit) {
        return new aekt(n, timeUnit);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aekt) {
            final aekt aekt = (aekt)o;
            if (this.a == aekt.a && this.b.equals(aekt.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return this.b.hashCode() ^ ((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String string = this.b.toString();
        final StringBuilder sb = new StringBuilder("TimeUnitPair{duration=");
        sb.append(a);
        sb.append(", timeUnit=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
