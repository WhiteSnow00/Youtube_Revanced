// 
// Decompiled by Procyon v0.6.0
// 

public final class dqu
{
    public final long a;
    public final long b;
    final long c;
    
    public dqu(final long a, final long b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final dqu dqu = (dqu)o;
            return this.a == dqu.a && this.c == dqu.c && this.b == dqu.b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final long b = this.b;
        return ((int)(a ^ a >>> 32) * 31 + (int)(b ^ b >>> 32)) * 31 + (int)this.c;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final long b = this.b;
        final long c = this.c;
        final StringBuilder sb = new StringBuilder(121);
        sb.append("Entry{firstChunk=");
        sb.append(a);
        sb.append(", samplesPerChunk=");
        sb.append(b);
        sb.append(", sampleDescriptionIndex=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
