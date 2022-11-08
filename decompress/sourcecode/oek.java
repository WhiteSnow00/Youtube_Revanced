// 
// Decompiled by Procyon v0.6.0
// 

public final class oek
{
    public final int a;
    public final long b;
    private final String c;
    private final String d;
    
    public oek() {
    }
    
    public oek(final int a, final long b, final String c, final String d) {
        this.a = a;
        this.b = b;
        if (c != null) {
            this.c = c;
            this.d = d;
            return;
        }
        throw new NullPointerException("Null name");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof oek) {
            final oek oek = (oek)o;
            if (this.a == oek.a && this.b == oek.b && this.c.equals(oek.c) && this.d.equals(oek.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final long b = this.b;
        return (((a ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final long b = this.b;
        final String c = this.c;
        final String d = this.d;
        final StringBuilder sb = new StringBuilder("ThreadIdentifier{tid=");
        sb.append(a);
        sb.append(", id=");
        sb.append(b);
        sb.append(", name=");
        sb.append(c);
        sb.append(", threadPoolName=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
