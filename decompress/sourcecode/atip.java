import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atip
{
    public final Object a;
    public final long b;
    final TimeUnit c;
    
    public atip(final Object a, final long b, final TimeUnit c) {
        this.a = a;
        this.b = b;
        asjv.b((Object)c, "unit is null");
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof atip) {
            final atip atip = (atip)o;
            if (asjv.a(this.a, atip.a) && this.b == atip.b && asjv.a((Object)this.c, (Object)atip.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        final long b = this.b;
        return (hashCode * 31 + (int)(b ^ b >>> 31)) * 31 + this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final long b = this.b;
        final String string = this.c.toString();
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("Timed[time=");
        sb.append(b);
        sb.append(", unit=");
        sb.append(string);
        sb.append(", value=");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
}
