// 
// Decompiled by Procyon v0.6.0
// 

public final class acjn
{
    public final acil a;
    public final long b;
    public final Runnable c;
    public final Runnable d;
    
    public acjn() {
    }
    
    public acjn(final acil a, final long b, final Runnable c, final Runnable d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static aqsu a() {
        return new aqsu();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof acjn) {
            final acjn acjn = (acjn)o;
            if (this.a.equals(acjn.a) && this.b == acjn.b && this.c.equals(acjn.c) && this.d.equals(acjn.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ (int)this.b) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final long b = this.b;
        final String value2 = String.valueOf(this.c);
        final String value3 = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder("RemoveParameters{presenter=");
        sb.append(value);
        sb.append(", duration=");
        sb.append(b);
        sb.append(", onStart=");
        sb.append(value2);
        sb.append(", onEnd=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
