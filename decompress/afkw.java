import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class afkw
{
    public final int a;
    public final TimeUnit b;
    public int c;
    
    public afkw(final int a, final TimeUnit b) {
        this.c = -1;
        this.a = a;
        aeuz.g((Object)b, "time unit");
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof afkw) {
            final afkw afkw = (afkw)o;
            if (this.a == afkw.a && this.b == afkw.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 37 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(' ');
        sb.append(this.b);
        if (this.c > 0) {
            sb.append(" [skipped: ");
            sb.append(this.c);
            sb.append(']');
        }
        return sb.toString();
    }
}
